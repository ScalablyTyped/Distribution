package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigationStack.AnonClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionPreset extends js.Object {
  /**
    * Function which specifies interpolated styles for various parts of the card, e.g. the overlay, shadow etc.
    */
  var cardStyleInterpolator: StackCardStyleInterpolator
  /**
    * The direction of swipe gestures, `horizontal` or `vertical`.
    */
  var gestureDirection: GestureDirection
  /**
    * Function which specifies interpolated styles for various parts of the header, e.g. the title, left button etc.
    */
  var headerStyleInterpolator: StackHeaderStyleInterpolator
  /**
    * Object which specifies the animation type (timing or spring) and their options (such as duration for timing).
    */
  var transitionSpec: AnonClose
}

object TransitionPreset {
  @scala.inline
  def apply(
    cardStyleInterpolator: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle,
    gestureDirection: GestureDirection,
    headerStyleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle,
    transitionSpec: AnonClose
  ): TransitionPreset = {
    val __obj = js.Dynamic.literal(cardStyleInterpolator = js.Any.fromFunction1(cardStyleInterpolator), gestureDirection = gestureDirection.asInstanceOf[js.Any], headerStyleInterpolator = js.Any.fromFunction1(headerStyleInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransitionPreset]
  }
}

