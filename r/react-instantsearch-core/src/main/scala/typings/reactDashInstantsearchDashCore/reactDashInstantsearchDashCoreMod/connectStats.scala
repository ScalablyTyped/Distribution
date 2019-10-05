package typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectStats")
@js.native
object connectStats extends js.Object {
  def apply(stateless: StatelessComponent[StatsProvided]): ComponentClass[js.Object, ComponentState] = js.native
  def apply[TProps /* <: Partial[StatsProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StatsProvided, js.Object] = js.native
}

