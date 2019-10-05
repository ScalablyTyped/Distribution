package typings.reactDashSelect

import typings.react.reactMod.ComponentType
import typings.reactDashSelect.srcAnimatedPlaceholderMod.AnimatedPlaceholderProps
import typings.reactDashSelect.srcComponentsPlaceholderMod.PlaceholderProps
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated/Placeholder", JSImport.Namespace)
@js.native
object srcAnimatedPlaceholderMod extends js.Object {
  def AnimatedPlaceholder[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[PlaceholderProps[OptionType]]): ComponentType[AnimatedPlaceholderProps[OptionType]] = js.native
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[PlaceholderProps[OptionType]]): ComponentType[AnimatedPlaceholderProps[OptionType]] = js.native
  type AnimatedPlaceholderProps[OptionType /* <: OptionTypeBase */] = PlaceholderProps[OptionType]
}

