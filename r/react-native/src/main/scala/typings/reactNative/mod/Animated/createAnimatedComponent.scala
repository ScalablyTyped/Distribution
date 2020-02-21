package typings.reactNative.mod.Animated

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "Animated.createAnimatedComponent")
@js.native
object createAnimatedComponent extends js.Object {
  def apply(component: ComponentClass[ComponentProps[_], ComponentState]): AnimatedComponent[
    (ComponentClass[ComponentProps[_], ComponentState]) | (InstanceType[ComponentClass[ComponentProps[_], ComponentState]])
  ] = js.native
  def apply(component: FunctionComponent[ComponentProps[_]]): AnimatedComponent[
    FunctionComponent[ComponentProps[_]] | InstanceType[FunctionComponent[ComponentProps[_]]]
  ] = js.native
  def apply[T /* <: Component[ComponentProps[T], js.Object, _] */](component: T): AnimatedComponent[T | InstanceType[T]] = js.native
}

