package typings.samchon

import typings.samchon.protocolInvokeInvokeMod.Invoke
import typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray
import typings.samchon.templatesParallelParallelSystemMod.ParallelSystem
import typings.samchon.templatesSlaveInvokeHistoryMod.InvokeHistory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesParallelParallelSystemArrayMod {
  
  /* note: abstract class */ @JSImport("samchon/templates/parallel/ParallelSystemArray", "ParallelSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelSystemArray[System /* <: ParallelSystem */] () extends ExternalSystemArray[System] {
    
    /**
      * @hidden
      */
    /* protected */ def _Complete_history(history: InvokeHistory): Boolean = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Normalize_performance(): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var history_sequence_ : Any = js.native
    
    /**
      * Send an {@link Invoke} message with range of pieces.
      *
      * Sends an {@link Invoke} message requesting a **parallel process** with its *range of pieces [first, last)*.
      * The {@link Invoke} will be delivered to children {@link ParallelSystem} objects with the newly computed
      * *range of sub-pieces*, which is divided from the *range of pieces (first to last)*, basis on their
      * {@link ParallelSystem.getPerformance performance indices}.
      *
      * - If indices of pieces are 0 to 50,
      * - The sub-pieces will be allocated such below:
      *
      * Name    | Performance index | Range of sub-pieces to be allocated | Formula
      * --------|-------------------|-------------------------------------|------------------------
      * Snail   |                 1 |                            ( 0,  5] | (50 - 0) / 10 * 1
      * Cheetah |                 4 |                            ( 5, 25] | (50 - 0) / 10 * 4 + 5
      * Rabbit  |                 3 |                            (25, 40] | (50 - 0) / 10 * 3 + 25
      * Turtle  |                 2 |                            (40, 50] | (50 - 0) / 10 * 2 + 40
      *
      * When the **parallel process** has completed, then this {@link ParallelSystemArraY} will estimate
      * {@link ParallelSystem.getPerformance performance indices} of {@link ParallelSystem} objects basis on their
      * execution time.
      *
      * @param invoke An {@link Invoke} message requesting parallel process.
      * @param first Initial piece's index in a section.
      * @param last Final piece's index in a section. The range used is [*first*, *last*), which contains
      *			   all the pieces' indices between *first* and *last*, including the piece pointed by index
      *			   *first*, but not the piece pointed by the index *last*.
      *
      * @return Number of {@link ParallelSystem slave systems} participating in the *Parallel Process*.
      *
      * @see {@link sendSegmentData}, {@link ParallelSystem.getPerformacen}
      */
    def sendPieceData(invoke: Invoke, first: Double, last: Double): Double = js.native
    
    /**
      * Send an {@link Invoke} message with segment size.
      *
      * Sends an {@link Invoke} message requesting a **parallel process** with its *segment size*. The {@link Invoke}
      * message will be delivered to children {@link ParallelSystem} objects with the *piece size*, which is divided
      * from the *segment size*, basis on their {@link ParallelSystem.getPerformance performance indices}.
      *
      * - If segment size is 100,
      * - The segment will be allocated such below:
      *
      * Name    | Performance index | Number of pieces to be allocated | Formula
      * --------|-------------------|----------------------------------|--------------
      * Snail   |                 1 |                               10 | 100 / 10 * 1
      * Cheetah |                 4 |                               40 | 100 / 10 * 4
      * Rabbit  |                 3 |                               30 | 100 / 10 * 3
      * Turtle  |                 2 |                               20 | 100 / 10 * 2
      *
      * When the **parallel process** has completed, then this {@link ParallelSystemArraY} will estimate
      * {@link ParallelSystem.getPerformance performance indices} of {@link ParallelSystem} objects basis on their
      * execution time.
      *
      * @param invoke An {@link Invoke} message requesting parallel process.
      * @param size Number of pieces to segment.
      *
      * @return Number of {@link ParallelSystem slave systems} participating in the *Parallel Process*.
      *
      * @see {@link sendPieceData}, {@link ParallelSystem.getPerformacen}
      */
    def sendSegmentData(invoke: Invoke, size: Double): Double = js.native
  }
}
