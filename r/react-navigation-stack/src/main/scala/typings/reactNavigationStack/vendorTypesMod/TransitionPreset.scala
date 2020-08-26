package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigationStack.anon.Close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionPreset extends js.Object {
  /**
    * Function which specifies interpolated styles for various parts of the card, e.g. the overlay, shadow etc.
    */
  var cardStyleInterpolator: StackCardStyleInterpolator = js.native
  /**
    * The direction of swipe gestures, `horizontal` or `vertical`.
    */
  var gestureDirection: GestureDirection = js.native
  /**
    * Function which specifies interpolated styles for various parts of the header, e.g. the title, left button etc.
    */
  var headerStyleInterpolator: StackHeaderStyleInterpolator = js.native
  /**
    * Object which specifies the animation type (timing or spring) and their options (such as duration for timing).
    */
  var transitionSpec: Close = js.native
}

object TransitionPreset {
  @scala.inline
  def apply(
    cardStyleInterpolator: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle,
    gestureDirection: GestureDirection,
    headerStyleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle,
    transitionSpec: Close
  ): TransitionPreset = {
    val __obj = js.Dynamic.literal(cardStyleInterpolator = js.Any.fromFunction1(cardStyleInterpolator), gestureDirection = gestureDirection.asInstanceOf[js.Any], headerStyleInterpolator = js.Any.fromFunction1(headerStyleInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionPreset]
  }
  @scala.inline
  implicit class TransitionPresetOps[Self <: TransitionPreset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCardStyleInterpolator(value: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle): Self = this.set("cardStyleInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def setGestureDirection(value: GestureDirection): Self = this.set("gestureDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = this.set("headerStyleInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def setTransitionSpec(value: Close): Self = this.set("transitionSpec", value.asInstanceOf[js.Any])
  }
  
}

