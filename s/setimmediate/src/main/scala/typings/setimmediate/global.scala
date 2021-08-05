package typings.setimmediate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Aborts the specified macrotask before it's run.
    *
    * @param handle The ID of the macrotask to remove from the macrotask queue.
    */
  inline def clearImmediate(handle: Double): Unit = js.Dynamic.global.applyDynamic("clearImmediate")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setImmediate[T /* <: js.Array[js.Any] */](
    callback: js.Function1[/* args */ T, Unit],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Double = (js.Dynamic.global.applyDynamic("setImmediate")(callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
}
