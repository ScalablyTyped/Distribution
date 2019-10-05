package typings.reactDashSelect

import typings.react.reactMod.ComponentType
import typings.reactDashSelect.srcAnimatedInputMod.AnimatedInputProps
import typings.reactDashSelect.srcAnimatedTransitionsMod.BaseTransition
import typings.reactDashSelect.srcComponentsInputMod.InputProps
import typings.reactDashSelect.srcTypesMod.PropsWithInnerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated/Input", JSImport.Namespace)
@js.native
object srcAnimatedInputMod extends js.Object {
  def AnimatedInput(WrappedComponent: ComponentType[InputProps]): ComponentType[AnimatedInputProps] = js.native
  def default(WrappedComponent: ComponentType[InputProps]): ComponentType[AnimatedInputProps] = js.native
  type AnimatedInputProps = BaseTransition with PropsWithInnerRef with InputProps
}

