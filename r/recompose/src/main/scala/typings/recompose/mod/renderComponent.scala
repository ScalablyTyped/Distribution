package typings.recompose.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "renderComponent")
@js.native
object renderComponent extends js.Object {
  def apply[TProps](component: String): ComponentEnhancer[_, _] = js.native
  def apply[TProps](component: ComponentType[TProps]): ComponentEnhancer[_, _] = js.native
}

