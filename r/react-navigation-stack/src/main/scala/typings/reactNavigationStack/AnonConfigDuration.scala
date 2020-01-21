package typings.reactNavigationStack

import typings.reactNative.mod.Animated.CompositeAnimation
import typings.reactNative.mod.Animated.TimingAnimationConfig
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.Animated.ValueXY
import typings.reactNative.mod.EasingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfigDuration extends js.Object {
  var duration: Double = js.native
  var easing: EasingFunction = js.native
  def timing(value: ValueXY, config: TimingAnimationConfig): CompositeAnimation = js.native
  def timing(value: Value, config: TimingAnimationConfig): CompositeAnimation = js.native
}

