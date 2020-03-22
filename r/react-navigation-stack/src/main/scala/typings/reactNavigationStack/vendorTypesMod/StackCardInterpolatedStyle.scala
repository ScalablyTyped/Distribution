package typings.reactNavigationStack.vendorTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackCardInterpolatedStyle extends js.Object {
  /**
    * Interpolated style for the view representing the card.
    */
  var cardStyle: js.UndefOr[js.Any] = js.undefined
  /**
    * Interpolated style for the container view wrapping the card.
    */
  var containerStyle: js.UndefOr[js.Any] = js.undefined
  /**
    * Interpolated style for the view representing the semi-transparent overlay below the card.
    */
  var overlayStyle: js.UndefOr[js.Any] = js.undefined
  /**
    * Interpolated style representing the card shadow.
    */
  var shadowStyle: js.UndefOr[js.Any] = js.undefined
}

object StackCardInterpolatedStyle {
  @scala.inline
  def apply(
    cardStyle: js.Any = null,
    containerStyle: js.Any = null,
    overlayStyle: js.Any = null,
    shadowStyle: js.Any = null
  ): StackCardInterpolatedStyle = {
    val __obj = js.Dynamic.literal()
    if (cardStyle != null) __obj.updateDynamic("cardStyle")(cardStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (shadowStyle != null) __obj.updateDynamic("shadowStyle")(shadowStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackCardInterpolatedStyle]
  }
}

