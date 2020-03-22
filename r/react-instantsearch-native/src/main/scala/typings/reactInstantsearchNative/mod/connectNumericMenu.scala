package typings.reactInstantsearchNative.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.StatelessComponent
import typings.reactInstantsearchCore.PartialNumericMenuProvide
import typings.reactInstantsearchCore.mod.ConnectedComponentClass
import typings.reactInstantsearchCore.mod.NumericMenuExposed
import typings.reactInstantsearchCore.mod.NumericMenuProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectNumericMenu")
@js.native
object connectNumericMenu extends js.Object {
  def apply(stateless: StatelessComponent[NumericMenuProvided]): ComponentClass[NumericMenuExposed, ComponentState] = js.native
  def apply[TProps /* <: PartialNumericMenuProvide */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, NumericMenuProvided, NumericMenuExposed] = js.native
}

