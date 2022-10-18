package typings.reactStyleSingleton

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5HookMod {
  
  @JSImport("react-style-singleton/dist/es5/hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def styleHookSingleton(): StyleSingletonHook = ^.asInstanceOf[js.Dynamic].applyDynamic("styleHookSingleton")().asInstanceOf[StyleSingletonHook]
  
  type StyleSingletonHook = js.Function2[/* styles */ String, /* isDynamic */ js.UndefOr[Boolean], Unit]
}
