package typings
package reactDashVisibilityDashSensorLib.reactDashVisibilityDashSensorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[
    reactLib.reactMod.ReactElement[_] | reactDashVisibilityDashSensorLib.ChildFunction
  ] = js.undefined
  var containment: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var delayedCall: js.UndefOr[scala.Boolean] = js.undefined
  var intervalCheck: js.UndefOr[scala.Boolean] = js.undefined
  var intervalDelay: js.UndefOr[scala.Double] = js.undefined
  var minTopValue: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[Shape] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* isVisible */ scala.Boolean, scala.Unit]] = js.undefined
  var partialVisibility: js.UndefOr[scala.Boolean] = js.undefined
  var resizeCheck: js.UndefOr[scala.Boolean] = js.undefined
  var resizeDelay: js.UndefOr[scala.Double] = js.undefined
  var resizeThrottle: js.UndefOr[scala.Double] = js.undefined
  var scrollCheck: js.UndefOr[scala.Boolean] = js.undefined
  var scrollDelay: js.UndefOr[scala.Double] = js.undefined
  var scrollThrottle: js.UndefOr[scala.Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactElement[_] | reactDashVisibilityDashSensorLib.ChildFunction = null,
    containment: stdLib.HTMLElement = null,
    delayedCall: js.UndefOr[scala.Boolean] = js.undefined,
    intervalCheck: js.UndefOr[scala.Boolean] = js.undefined,
    intervalDelay: scala.Int | scala.Double = null,
    minTopValue: scala.Int | scala.Double = null,
    offset: Shape = null,
    onChange: /* isVisible */ scala.Boolean => scala.Unit = null,
    partialVisibility: js.UndefOr[scala.Boolean] = js.undefined,
    resizeCheck: js.UndefOr[scala.Boolean] = js.undefined,
    resizeDelay: scala.Int | scala.Double = null,
    resizeThrottle: scala.Int | scala.Double = null,
    scrollCheck: js.UndefOr[scala.Boolean] = js.undefined,
    scrollDelay: scala.Int | scala.Double = null,
    scrollThrottle: scala.Int | scala.Double = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment)
    if (!js.isUndefined(delayedCall)) __obj.updateDynamic("delayedCall")(delayedCall)
    if (!js.isUndefined(intervalCheck)) __obj.updateDynamic("intervalCheck")(intervalCheck)
    if (intervalDelay != null) __obj.updateDynamic("intervalDelay")(intervalDelay.asInstanceOf[js.Any])
    if (minTopValue != null) __obj.updateDynamic("minTopValue")(minTopValue.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(partialVisibility)) __obj.updateDynamic("partialVisibility")(partialVisibility)
    if (!js.isUndefined(resizeCheck)) __obj.updateDynamic("resizeCheck")(resizeCheck)
    if (resizeDelay != null) __obj.updateDynamic("resizeDelay")(resizeDelay.asInstanceOf[js.Any])
    if (resizeThrottle != null) __obj.updateDynamic("resizeThrottle")(resizeThrottle.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollCheck)) __obj.updateDynamic("scrollCheck")(scrollCheck)
    if (scrollDelay != null) __obj.updateDynamic("scrollDelay")(scrollDelay.asInstanceOf[js.Any])
    if (scrollThrottle != null) __obj.updateDynamic("scrollThrottle")(scrollThrottle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

