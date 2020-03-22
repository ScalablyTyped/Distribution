package typings.reactNavigationStack.vendorTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackHeaderInterpolatedStyle extends js.Object {
  /**
    * Interpolated style for the header background.
    */
  var backgroundStyle: js.UndefOr[js.Any] = js.undefined
  /**
    * Interpolated style for the left button (usually the back button).
    */
  var leftButtonStyle: js.UndefOr[js.Any] = js.undefined
  /**
    * Interpolated style for the label of the left button (back button label).
    */
  var leftLabelStyle: js.UndefOr[js.Any] = js.undefined
  /**
    * Interpolated style for the right button.
    */
  var rightButtonStyle: js.UndefOr[js.Any] = js.undefined
  /**
    * Interpolated style for the header title text.
    */
  var titleStyle: js.UndefOr[js.Any] = js.undefined
}

object StackHeaderInterpolatedStyle {
  @scala.inline
  def apply(
    backgroundStyle: js.Any = null,
    leftButtonStyle: js.Any = null,
    leftLabelStyle: js.Any = null,
    rightButtonStyle: js.Any = null,
    titleStyle: js.Any = null
  ): StackHeaderInterpolatedStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundStyle != null) __obj.updateDynamic("backgroundStyle")(backgroundStyle.asInstanceOf[js.Any])
    if (leftButtonStyle != null) __obj.updateDynamic("leftButtonStyle")(leftButtonStyle.asInstanceOf[js.Any])
    if (leftLabelStyle != null) __obj.updateDynamic("leftLabelStyle")(leftLabelStyle.asInstanceOf[js.Any])
    if (rightButtonStyle != null) __obj.updateDynamic("rightButtonStyle")(rightButtonStyle.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackHeaderInterpolatedStyle]
  }
}

