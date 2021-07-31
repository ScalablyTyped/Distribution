package typings.reactNativeNavigation

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-lifecycles-compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def polyfill(component: ComponentClass[js.Any, ComponentState]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("polyfill")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
