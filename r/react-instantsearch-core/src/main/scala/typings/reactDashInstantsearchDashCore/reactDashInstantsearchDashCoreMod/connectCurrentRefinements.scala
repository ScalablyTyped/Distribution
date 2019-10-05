package typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectCurrentRefinements")
@js.native
object connectCurrentRefinements extends js.Object {
  def apply(stateless: StatelessComponent[CurrentRefinementsProvided]): ComponentClass[CurrentRefinementsExposed, ComponentState] = js.native
  def apply[TProps /* <: Partial[CurrentRefinementsProvided] */](Composed: ComponentType[TProps]): ConnectedComponentClass[TProps, CurrentRefinementsProvided, CurrentRefinementsExposed] = js.native
}

