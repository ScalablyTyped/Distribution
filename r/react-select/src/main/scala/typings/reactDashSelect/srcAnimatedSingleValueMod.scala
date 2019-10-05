package typings.reactDashSelect

import typings.react.reactMod.ComponentType
import typings.reactDashSelect.srcAnimatedSingleValueMod.AnimatedSingleValueProps
import typings.reactDashSelect.srcComponentsSingleValueMod.SingleValueProps
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated/SingleValue", JSImport.Namespace)
@js.native
object srcAnimatedSingleValueMod extends js.Object {
  def AnimatedSingleValue[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[SingleValueProps[OptionType]]): ComponentType[AnimatedSingleValueProps[OptionType]] = js.native
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[SingleValueProps[OptionType]]): ComponentType[AnimatedSingleValueProps[OptionType]] = js.native
  type AnimatedSingleValueProps[OptionType /* <: OptionTypeBase */] = SingleValueProps[OptionType]
}

