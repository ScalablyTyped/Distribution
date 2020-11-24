package typings.setimmediate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * Aborts the specified macrotask before it's run.
    *
    * @param handle The ID of the macrotask to remove from the macrotask queue.
    */
  def clearImmediate(handle: Double): Unit = js.native
  
  def setImmediate[T /* <: js.Array[_] */](
    callback: js.Function1[/* args */ T, Unit],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Double = js.native
}
