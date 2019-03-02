package typings
package reactDashNativeDashSnackbarDashComponentLib.reactDashNativeDashSnackbarDashComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarComponentProps extends js.Object {
  var accentColor: js.UndefOr[java.lang.String] = js.undefined
  var actionHandler: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var actionText: js.UndefOr[java.lang.String] = js.undefined
  var autoHidingTime: js.UndefOr[scala.Double] = js.undefined
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var bottom: js.UndefOr[scala.Double] = js.undefined
  var distanceCallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var left: js.UndefOr[scala.Double] = js.undefined
  var messageColor: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var right: js.UndefOr[scala.Double] = js.undefined
  var textMessage: js.UndefOr[java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object SnackbarComponentProps {
  @scala.inline
  def apply(
    accentColor: java.lang.String = null,
    actionHandler: js.Function0[scala.Unit] = null,
    actionText: java.lang.String = null,
    autoHidingTime: scala.Int | scala.Double = null,
    backgroundColor: java.lang.String = null,
    bottom: scala.Int | scala.Double = null,
    distanceCallback: js.Function0[scala.Unit] = null,
    left: scala.Int | scala.Double = null,
    messageColor: java.lang.String = null,
    position: java.lang.String = null,
    right: scala.Int | scala.Double = null,
    textMessage: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): SnackbarComponentProps = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor)
    if (actionHandler != null) __obj.updateDynamic("actionHandler")(actionHandler)
    if (actionText != null) __obj.updateDynamic("actionText")(actionText)
    if (autoHidingTime != null) __obj.updateDynamic("autoHidingTime")(autoHidingTime.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (distanceCallback != null) __obj.updateDynamic("distanceCallback")(distanceCallback)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (messageColor != null) __obj.updateDynamic("messageColor")(messageColor)
    if (position != null) __obj.updateDynamic("position")(position)
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (textMessage != null) __obj.updateDynamic("textMessage")(textMessage)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SnackbarComponentProps]
  }
}

