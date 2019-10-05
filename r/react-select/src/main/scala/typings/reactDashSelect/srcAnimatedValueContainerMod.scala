package typings.reactDashSelect

import typings.react.reactMod.ComponentType
import typings.reactDashSelect.srcAnimatedValueContainerMod.AnimatedValueContainerProps
import typings.reactDashSelect.srcComponentsContainersMod.ValueContainerProps
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated/ValueContainer", JSImport.Namespace)
@js.native
object srcAnimatedValueContainerMod extends js.Object {
  def AnimatedValueContainer[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[ValueContainerProps[OptionType]]): ComponentType[AnimatedValueContainerProps[OptionType]] = js.native
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[ValueContainerProps[OptionType]]): ComponentType[AnimatedValueContainerProps[OptionType]] = js.native
  type AnimatedValueContainerProps[OptionType /* <: OptionTypeBase */] = ValueContainerProps[OptionType]
}

