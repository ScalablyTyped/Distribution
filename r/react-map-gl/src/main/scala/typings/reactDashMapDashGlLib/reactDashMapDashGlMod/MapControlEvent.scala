package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapControlEvent extends js.Object {
  var center: Center
  var delta: js.UndefOr[scala.Double] = js.undefined
  var key: js.UndefOr[scala.Double] = js.undefined
  var leftButton: js.UndefOr[scala.Boolean] = js.undefined
  var middleButton: js.UndefOr[scala.Boolean] = js.undefined
  var offsetCenter: Center
  var pointerType: js.UndefOr[java.lang.String] = js.undefined
  var rightButton: js.UndefOr[scala.Boolean] = js.undefined
  var srcEvent: js.Any
  var target: js.Any
  var `type`: java.lang.String
}

object MapControlEvent {
  @scala.inline
  def apply(
    center: Center,
    offsetCenter: Center,
    srcEvent: js.Any,
    target: js.Any,
    `type`: java.lang.String,
    delta: scala.Int | scala.Double = null,
    key: scala.Int | scala.Double = null,
    leftButton: js.UndefOr[scala.Boolean] = js.undefined,
    middleButton: js.UndefOr[scala.Boolean] = js.undefined,
    pointerType: java.lang.String = null,
    rightButton: js.UndefOr[scala.Boolean] = js.undefined
  ): MapControlEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("offsetCenter")(offsetCenter)
    __obj.updateDynamic("srcEvent")(srcEvent)
    __obj.updateDynamic("target")(target)
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(leftButton)) __obj.updateDynamic("leftButton")(leftButton)
    if (!js.isUndefined(middleButton)) __obj.updateDynamic("middleButton")(middleButton)
    if (pointerType != null) __obj.updateDynamic("pointerType")(pointerType)
    if (!js.isUndefined(rightButton)) __obj.updateDynamic("rightButton")(rightButton)
    __obj.asInstanceOf[MapControlEvent]
  }
}

