package typings.reactDashSelect

import typings.react.reactMod.ComponentType
import typings.reactDashSelect.srcAnimatedMultiValueMod.AnimatedMultiValueProps
import typings.reactDashSelect.srcComponentsMultiValueMod.MultiValueProps
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated/MultiValue", JSImport.Namespace)
@js.native
object srcAnimatedMultiValueMod extends js.Object {
  def AnimatedMultiValue[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[MultiValueProps[OptionType]]): ComponentType[AnimatedMultiValueProps[OptionType]] = js.native
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[MultiValueProps[OptionType]]): ComponentType[AnimatedMultiValueProps[OptionType]] = js.native
  type AnimatedMultiValueProps[OptionType /* <: OptionTypeBase */] = Anon_In with MultiValueProps[OptionType]
}

