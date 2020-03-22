package typings.reactNavigationStack.vendorTypesMod

import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNavigationStack.AnonLeft
import typings.reactNavigationStack.AnonProgress
import typings.reactNavigationStack.AnonScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackCardInterpolationProps extends js.Object {
  /**
    * Animated node representing whether the card is closing (1 - closing, 0 - not closing).
    */
  var closing: AnimatedInterpolation
  /**
    * Values for the current screen.
    */
  var current: AnonProgress
  /**
    * The index of the card in the stack.
    */
  var index: Double
  /**
    * Safe area insets
    */
  var insets: AnonLeft
  /**
    * Animated node representing multiplier when direction is inverted (-1 - inverted, 1 - normal).
    */
  var inverted: AnimatedInterpolation
  /**
    * Layout measurements for various items we use for animation.
    */
  var layouts: AnonScreen
  /**
    * Values for the current screen the screen after this one in the stack.
    * This can be `undefined` in case the screen animating is the last one.
    */
  var next: js.UndefOr[AnonProgress] = js.undefined
  /**
    * Animated node representing whether the card is being swiped (1 - swiping, 0 - not swiping).
    */
  var swiping: AnimatedInterpolation
}

object StackCardInterpolationProps {
  @scala.inline
  def apply(
    closing: AnimatedInterpolation,
    current: AnonProgress,
    index: Double,
    insets: AnonLeft,
    inverted: AnimatedInterpolation,
    layouts: AnonScreen,
    swiping: AnimatedInterpolation,
    next: AnonProgress = null
  ): StackCardInterpolationProps = {
    val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], layouts = layouts.asInstanceOf[js.Any], swiping = swiping.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackCardInterpolationProps]
  }
}

