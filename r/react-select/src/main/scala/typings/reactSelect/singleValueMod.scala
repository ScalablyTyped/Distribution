package typings.reactSelect

import typings.react.mod.ComponentType
import typings.reactSelect.componentsSingleValueMod.SingleValueProps
import typings.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated/SingleValue", JSImport.Namespace)
@js.native
object singleValueMod extends js.Object {
  def AnimatedSingleValue[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[SingleValueProps[OptionType]]): ComponentType[AnimatedSingleValueProps[OptionType]] = js.native
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[SingleValueProps[OptionType]]): ComponentType[AnimatedSingleValueProps[OptionType]] = js.native
  type AnimatedSingleValueProps[OptionType /* <: OptionTypeBase */] = SingleValueProps[OptionType]
}

