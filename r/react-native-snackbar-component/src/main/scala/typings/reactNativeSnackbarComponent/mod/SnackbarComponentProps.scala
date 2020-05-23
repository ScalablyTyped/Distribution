package typings.reactNativeSnackbarComponent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarComponentProps extends js.Object {
  var accentColor: js.UndefOr[String] = js.undefined
  var actionHandler: js.UndefOr[js.Function0[Unit]] = js.undefined
  var actionText: js.UndefOr[String] = js.undefined
  var autoHidingTime: js.UndefOr[Double] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var bottom: js.UndefOr[Double] = js.undefined
  var distanceCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var messageColor: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var right: js.UndefOr[Double] = js.undefined
  var textMessage: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SnackbarComponentProps {
  @scala.inline
  def apply(
    accentColor: String = null,
    actionHandler: () => Unit = null,
    actionText: String = null,
    autoHidingTime: js.UndefOr[Double] = js.undefined,
    backgroundColor: String = null,
    bottom: js.UndefOr[Double] = js.undefined,
    distanceCallback: () => Unit = null,
    left: js.UndefOr[Double] = js.undefined,
    messageColor: String = null,
    position: String = null,
    right: js.UndefOr[Double] = js.undefined,
    textMessage: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SnackbarComponentProps = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor.asInstanceOf[js.Any])
    if (actionHandler != null) __obj.updateDynamic("actionHandler")(js.Any.fromFunction0(actionHandler))
    if (actionText != null) __obj.updateDynamic("actionText")(actionText.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHidingTime)) __obj.updateDynamic("autoHidingTime")(autoHidingTime.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (distanceCallback != null) __obj.updateDynamic("distanceCallback")(js.Any.fromFunction0(distanceCallback))
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (messageColor != null) __obj.updateDynamic("messageColor")(messageColor.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (textMessage != null) __obj.updateDynamic("textMessage")(textMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarComponentProps]
  }
}

