package typings.reactDashInstantsearchDashNative.reactDashInstantsearchDashNativeMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectedComponentClass
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.RefinementListExposed
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.RefinementListProvided
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectRefinementList")
@js.native
object connectRefinementList extends js.Object {
  def apply(stateless: StatelessComponent[RefinementListProvided]): ComponentClass[RefinementListExposed, ComponentState] = js.native
  def apply[TProps /* <: Partial[RefinementListProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, RefinementListProvided, RefinementListExposed] = js.native
}

