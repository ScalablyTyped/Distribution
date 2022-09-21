package typings.shakacodeRecompose

import typings.react.mod.ComponentType
import typings.shakacodeRecompose.mod.ComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#rendercomponent
object renderComponentMod {
  
  @JSImport("@shakacode/recompose/renderComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TProps](component: String): ComponentEnhancer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentEnhancer[Any, Any]]
  inline def default[TProps](component: ComponentType[TProps]): ComponentEnhancer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentEnhancer[Any, Any]]
}
