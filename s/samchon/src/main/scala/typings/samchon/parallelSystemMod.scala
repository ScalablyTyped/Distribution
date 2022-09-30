package typings.samchon

import typings.samchon.externalSystemMod.ExternalSystem
import typings.samchon.iclientdriverMod.IClientDriver
import typings.samchon.invokeHistoryMod.InvokeHistory
import typings.samchon.invokeMod.Invoke
import typings.samchon.parallelSystemArrayMod.ParallelSystemArray
import typings.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parallelSystemMod {
  
  @JSImport("samchon/templates/parallel/ParallelSystem", "ParallelSystem")
  @js.native
  abstract class ParallelSystem protected () extends ExternalSystem {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: ParallelSystemArray[ParallelSystem]) = this()
    /**
      * Construct from parent {@link ParallelSystemArray} and communicator.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      * @param communicator A communicator communicates with remote, the external system.
      */
    def this(systemArray: ParallelSystemArray[ParallelSystem], communicator: IClientDriver) = this()
    
    /**
      * @hidden
      */
    /* private */ var _Reply_data: Any = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Report_history(xml: XML): Unit = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Send_back_history(invoke: Invoke, history: InvokeHistory): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var _Send_piece_data: Any = js.native
    
    /**
      * Enforce performance index.
      *
      * Enforce *performance index* that indicates how much fast the remote system is. The *performance index* will be
      * fixed, never be **revaluated**.
      *
      * Note that, initial and average *performance index* of {@link ParallelSystem} objects are ```1.0```. If the
      * *performance index* is higher than other {@link ParallelSystem} objects, then this {@link ParallelSystem} will
      * be ordered to handle more processes than other {@link ParallelSystem} objects. Otherwise, the
      * *performance index* is lower than others, of course, less processes will be delivered.
      *
      * The difference between {@link setPerformance} and this {@link enforcePerformance} is allowing **revaluation**
      * or not. This {@link enforcePerformance} does not allow the **revaluation**. The *performance index* is clearly
      * fixed and never be changed by the **revaluation**. But you've to keep in mind that, you can't avoid the
      * **mis-valuation** with this {@link enforcePerformance}.
      *
      * For example, there's a remote system much faster than any other, but you **mis-estimated** it to the slowest.
      * In that case, there's no way. The {@link ParallelSystemArray entire parallel systems} will be slower by the
      * **mis-valuation**. By the reason, using {@link enforcePerformance}, it's recommended only when you can clearly
      * certain the *performance index*. If you can't certain the *performance index* but want to recommend, then use
      * {@link setPerformance} instead.
      *
      * @param val New performance index to be fixed.
      */
    def enforcePerformance(`val`: Double): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var enforced_ : Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var exclude_ : Any = js.native
    
    /**
      * Get performance index.
      *
      * Get *performance index* that indicates how much fast the remote system is.
      *
      * If this {@link ParallelSystem parallel system} does not have any {@link Invoke} message had handled, then the
      * *performance index* will be ```1.0```, which means default and average value between all {@link ParallelSystem}
      * instances (that are belonged to a same {@link ParallelSystemArray} object).
      *
      * You can specify this *performance index* by yourself but notice that, if the *performance index* is higher
      * than other {@link ParallelSystem} objects, then this {@link ParallelSystem parallel system} will be ordered to
      * handle more processes than other {@link ParallelSystem} objects. Otherwise, the *performance index* is lower
      * than others, of course, less processes will be delivered.
      *
      * - {@link setPerformance setPerformance()}
      * - {@link enforcePerformance enforcePerformance()}
      *
      * Unless {@link enforcePerformance enforcePerformance()} is called, This *performance index* is **revaluated**
      * whenever user calls one of them below.
      *
      * - {@link ParallelSystemArray.sendSegmentData ParallelSystemArray.sendSegmentData()}
      * - {@link ParallelSystemArray.sendPieceData ParallelSystemArray.sendPieceData()}
      * - {@link DistributedProcess.sendData DistributedProcess.sendData()}.
      *
      * @return Performance index.
      */
    def getPerformance(): Double = js.native
    
    /**
      * @hidden
      */
    /* private */ var history_list_ : Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var performance: Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var progress_list_ : Any = js.native
    
    /**
      * Set performance index.
      *
      * Set *performance index* that indicates how much fast the remote system is. This *performance index* can be
      * **revaulated**.
      *
      * Note that, initial and average *performance index* of {@link ParallelSystem} objects are ```1.0```. If the
      * *performance index* is higher than other {@link ParallelSystem} objects, then this {@link ParallelSystem} will
      * be ordered to handle more processes than other {@link ParallelSystem} objects. Otherwise, the
      * *performance index* is lower than others, of course, less processes will be delivered.
      *
      * Unlike {@link enforcePerformance}, configuring *performance index* by this {@link setPerformance} allows
      * **revaluation**. This **revaluation** prevents wrong valuation from user. For example, you *mis-valuated* the
      * *performance index*. The remote system is much faster than any other, but you estimated it to the slowest one.
      * It looks like a terrible case that causes {@link ParallelSystemArray entire parallel systems} to be slower,
      * however, don't mind. The system will direct to the *propriate performance index* eventually with the
      * **revaluation** by following methods.
      *
      * - {@link ParallelSystemArray.sendSegmentData ParallelSystemArray.sendSegmentData()}
      * - {@link ParallelSystemArray.sendPieceData ParallelSystemArray.sendPieceData()}
      * - {@link DistributedProcess.sendData DistributedProcess.sendData()}.
      *
      * @param val New performance index, but can be revaluated.
      */
    def setPerformance(`val`: Double): Unit = js.native
  }
}
