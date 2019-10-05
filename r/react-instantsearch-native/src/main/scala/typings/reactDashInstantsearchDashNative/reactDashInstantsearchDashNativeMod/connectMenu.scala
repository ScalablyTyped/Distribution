package typings.reactDashInstantsearchDashNative.reactDashInstantsearchDashNativeMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectedComponentClass
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.MenuExposed
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.MenuProvided
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectMenu")
@js.native
object connectMenu extends js.Object {
  def apply(stateless: StatelessComponent[MenuProvided]): ComponentClass[MenuExposed, ComponentState] = js.native
  def apply[TProps /* <: Partial[MenuProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, MenuProvided, MenuExposed] = js.native
}

