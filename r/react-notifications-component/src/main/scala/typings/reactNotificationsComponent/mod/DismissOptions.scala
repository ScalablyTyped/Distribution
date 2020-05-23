package typings.reactNotificationsComponent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DismissOptions extends js.Object {
  var click: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var onScreen: js.UndefOr[Boolean] = js.undefined
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var touch: js.UndefOr[Boolean] = js.undefined
  var waitForAnimation: js.UndefOr[Boolean] = js.undefined
}

object DismissOptions {
  @scala.inline
  def apply(
    click: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    onScreen: js.UndefOr[Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    touch: js.UndefOr[Boolean] = js.undefined,
    waitForAnimation: js.UndefOr[Boolean] = js.undefined
  ): DismissOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(click)) __obj.updateDynamic("click")(click.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onScreen)) __obj.updateDynamic("onScreen")(onScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForAnimation)) __obj.updateDynamic("waitForAnimation")(waitForAnimation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DismissOptions]
  }
}

