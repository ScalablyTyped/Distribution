package typings.reactDashInstantsearchDashDom.reactDashInstantsearchDashDomMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectedComponentClass
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.NumericMenuExposed
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.NumericMenuProvided
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "connectNumericMenu")
@js.native
object connectNumericMenu extends js.Object {
  def apply(stateless: StatelessComponent[NumericMenuProvided]): ComponentClass[NumericMenuExposed, ComponentState] = js.native
  def apply[TProps /* <: Partial[NumericMenuProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, NumericMenuProvided, NumericMenuExposed] = js.native
}

