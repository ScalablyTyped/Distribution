package typings.reactInstantsearchCore.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.StatelessComponent
import typings.reactInstantsearchCore.anon.PartialStatsProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectStats")
@js.native
object connectStats extends js.Object {
  def apply(stateless: StatelessComponent[StatsProvided]): ComponentClass[js.Object, ComponentState] = js.native
  def apply[TProps /* <: PartialStatsProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StatsProvided, js.Object] = js.native
}

