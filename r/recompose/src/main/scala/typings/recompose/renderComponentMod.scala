package typings.recompose

import typings.react.mod.ComponentType
import typings.recompose.mod.ComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#rendercomponent
object renderComponentMod {
  
  @JSImport("recompose/renderComponent", JSImport.Default)
  @js.native
  def default[TProps](component: String): ComponentEnhancer[_, _] = js.native
  @JSImport("recompose/renderComponent", JSImport.Default)
  @js.native
  def default[TProps](component: ComponentType[TProps]): ComponentEnhancer[_, _] = js.native
}
