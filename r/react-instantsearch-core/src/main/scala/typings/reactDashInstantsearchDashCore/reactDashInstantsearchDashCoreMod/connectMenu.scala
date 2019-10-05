package typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectMenu")
@js.native
object connectMenu extends js.Object {
  def apply(stateless: StatelessComponent[MenuProvided]): ComponentClass[MenuExposed, ComponentState] = js.native
  def apply[TProps /* <: Partial[MenuProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, MenuProvided, MenuExposed] = js.native
}

