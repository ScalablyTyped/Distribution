package typings.reactDashSelect.animatedMod

import typings.react.reactMod.ComponentType
import typings.reactDashSelect.srcAnimatedInputMod.AnimatedInputProps
import typings.reactDashSelect.srcAnimatedMultiValueMod.AnimatedMultiValueProps
import typings.reactDashSelect.srcAnimatedPlaceholderMod.AnimatedPlaceholderProps
import typings.reactDashSelect.srcAnimatedSingleValueMod.AnimatedSingleValueProps
import typings.reactDashSelect.srcAnimatedValueContainerMod.AnimatedValueContainerProps
import typings.reactDashSelect.srcComponentsMod.SelectComponents
import typings.reactDashSelect.srcComponentsMod.SelectComponentsConfig
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/animated", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Input: ComponentType[AnimatedInputProps] = js.native
  val MultiValue: ComponentType[AnimatedMultiValueProps[js.Any]] = js.native
  val Placeholder: ComponentType[AnimatedPlaceholderProps[js.Any]] = js.native
  val SingleValue: ComponentType[AnimatedSingleValueProps[js.Any]] = js.native
  val ValueContainer: ComponentType[AnimatedValueContainerProps[js.Any]] = js.native
  def default[OptionType /* <: OptionTypeBase */](): SelectComponents[OptionType] = js.native
  def default[OptionType /* <: OptionTypeBase */](externalComponents: SelectComponentsConfig[OptionType]): SelectComponents[OptionType] = js.native
  def makeAnimated[OptionType /* <: OptionTypeBase */](): SelectComponents[OptionType] = js.native
  def makeAnimated[OptionType /* <: OptionTypeBase */](externalComponents: SelectComponentsConfig[OptionType]): SelectComponents[OptionType] = js.native
}

