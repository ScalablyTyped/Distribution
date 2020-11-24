package typings.recompose

import typings.react.mod.ComponentType
import typings.recompose.mod.ComponentEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#rendercomponent
@JSImport("recompose/renderComponent", JSImport.Namespace)
@js.native
object renderComponentMod extends js.Object {
  
  def default[TProps](component: String): ComponentEnhancer[_, _] = js.native
  def default[TProps](component: ComponentType[TProps]): ComponentEnhancer[_, _] = js.native
}
