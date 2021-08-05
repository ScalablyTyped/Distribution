package typings.restartHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useEventCallbackMod {
  
  @JSImport("@restart/hooks/cjs/useEventCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TCallback /* <: js.Function1[/* repeated */ js.Any, js.Any] */](): TCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[TCallback]
  inline def default[TCallback /* <: js.Function1[/* repeated */ js.Any, js.Any] */](fn: TCallback): TCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[TCallback]
}
