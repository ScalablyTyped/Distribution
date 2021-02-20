package typings.samchon

import typings.samchon.invokeHistoryMod.InvokeHistory
import typings.samchon.invokeMod.Invoke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prinvokehistoryMod {
  
  @JSImport("samchon/templates/parallel/PRInvokeHistory", "PRInvokeHistory")
  @js.native
  /**
    * Default Constructor.
    */
  class PRInvokeHistory () extends InvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel process*.
      */
    def this(invoke: Invoke) = this()
    
    /**
      * Compute number of allocated pieces.
      */
    def computeSize(): Double = js.native
    
    /**
      * @hidden
      */
    var first: js.Any = js.native
    
    /**
      * Get initial piece's index.
      *
      * Returns initial piece's index in the section of requested *parallel process*.
      *
      * @return The initial index.
      */
    def getFirst(): Double = js.native
    
    /**
      * Get final piece's index.
      *
      * Returns initial piece's index in the section of requested *parallel process*. The range used is
      * [*first*, *last*), which contains all the pieces' indices between *first* and *last*, including the piece
      * pointed by index *first*, but not the piece pointed by the index *last*.
      *
      * @return The final index.
      */
    def getLast(): Double = js.native
    
    /**
      * @hidden
      */
    var last: js.Any = js.native
  }
}
