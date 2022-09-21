package typings.reactCountup

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useEventCallbackMod {
  
  @JSImport("react-countup/build/helpers/useEventCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useEventCallback[T /* <: js.Function1[/* repeated */ Any, Any] */](fn: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventCallback")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
}
