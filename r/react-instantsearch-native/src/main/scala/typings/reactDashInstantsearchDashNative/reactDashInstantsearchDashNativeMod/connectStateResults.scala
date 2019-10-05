package typings.reactDashInstantsearchDashNative.reactDashInstantsearchDashNativeMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.BasicDoc
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectedComponentClass
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.StateResultsProvided
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectStateResults")
@js.native
object connectStateResults extends js.Object {
  def apply(stateless: StatelessComponent[StateResultsProvided[BasicDoc]]): ComponentClass[js.Object, ComponentState] = js.native
  def apply[TProps /* <: Partial[StateResultsProvided[_]] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StateResultsProvided[BasicDoc], js.Object] = js.native
}

