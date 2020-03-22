package typings.reactInstantsearchNative.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.StatelessComponent
import typings.reactInstantsearchCore.PartialCurrentRefinements
import typings.reactInstantsearchCore.mod.ConnectedComponentClass
import typings.reactInstantsearchCore.mod.CurrentRefinementsExposed
import typings.reactInstantsearchCore.mod.CurrentRefinementsProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectCurrentRefinements")
@js.native
object connectCurrentRefinements extends js.Object {
  def apply(stateless: StatelessComponent[CurrentRefinementsProvided]): ComponentClass[CurrentRefinementsExposed, ComponentState] = js.native
  def apply[TProps /* <: PartialCurrentRefinements */](Composed: ComponentType[TProps]): ConnectedComponentClass[TProps, CurrentRefinementsProvided, CurrentRefinementsExposed] = js.native
}

