package typings.reactNavigationStack

import typings.reactNative.mod.Animated.AnimatedValue
import typings.reactNative.mod.Animated.AnimatedValueXY
import typings.reactNative.mod.Animated.CompositeAnimation
import typings.reactNative.mod.Animated.SpringAnimationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnConfig extends js.Object {
  def apply(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = js.native
  def apply(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = js.native
}

