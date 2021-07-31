package typings.recompose

import typings.react.mod.ComponentType
import typings.recompose.mod.ComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#rendercomponent
object renderComponentMod {
  
  @JSImport("recompose/renderComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[TProps](component: String): ComponentEnhancer[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentEnhancer[js.Any, js.Any]]
  @scala.inline
  def default[TProps](component: ComponentType[TProps]): ComponentEnhancer[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentEnhancer[js.Any, js.Any]]
}
