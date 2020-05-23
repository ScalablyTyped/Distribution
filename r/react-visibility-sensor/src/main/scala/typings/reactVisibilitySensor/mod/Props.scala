package typings.reactVisibilitySensor.mod

import typings.react.mod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactElement | ChildFunction] = js.undefined
  var containment: js.UndefOr[HTMLElement] = js.undefined
  var delayedCall: js.UndefOr[Boolean] = js.undefined
  var intervalCheck: js.UndefOr[Boolean] = js.undefined
  var intervalDelay: js.UndefOr[Double] = js.undefined
  var minTopValue: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Shape] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* isVisible */ Boolean, Unit]] = js.undefined
  var partialVisibility: js.UndefOr[Boolean] = js.undefined
  var resizeCheck: js.UndefOr[Boolean] = js.undefined
  var resizeDelay: js.UndefOr[Double] = js.undefined
  var resizeThrottle: js.UndefOr[Double] = js.undefined
  var scrollCheck: js.UndefOr[Boolean] = js.undefined
  var scrollDelay: js.UndefOr[Double] = js.undefined
  var scrollThrottle: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    children: ReactElement | ChildFunction = null,
    containment: HTMLElement = null,
    delayedCall: js.UndefOr[Boolean] = js.undefined,
    intervalCheck: js.UndefOr[Boolean] = js.undefined,
    intervalDelay: js.UndefOr[Double] = js.undefined,
    minTopValue: js.UndefOr[Double] = js.undefined,
    offset: Shape = null,
    onChange: /* isVisible */ Boolean => Unit = null,
    partialVisibility: js.UndefOr[Boolean] = js.undefined,
    resizeCheck: js.UndefOr[Boolean] = js.undefined,
    resizeDelay: js.UndefOr[Double] = js.undefined,
    resizeThrottle: js.UndefOr[Double] = js.undefined,
    scrollCheck: js.UndefOr[Boolean] = js.undefined,
    scrollDelay: js.UndefOr[Double] = js.undefined,
    scrollThrottle: js.UndefOr[Double] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (!js.isUndefined(delayedCall)) __obj.updateDynamic("delayedCall")(delayedCall.get.asInstanceOf[js.Any])
    if (!js.isUndefined(intervalCheck)) __obj.updateDynamic("intervalCheck")(intervalCheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(intervalDelay)) __obj.updateDynamic("intervalDelay")(intervalDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTopValue)) __obj.updateDynamic("minTopValue")(minTopValue.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(partialVisibility)) __obj.updateDynamic("partialVisibility")(partialVisibility.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeCheck)) __obj.updateDynamic("resizeCheck")(resizeCheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeDelay)) __obj.updateDynamic("resizeDelay")(resizeDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeThrottle)) __obj.updateDynamic("resizeThrottle")(resizeThrottle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollCheck)) __obj.updateDynamic("scrollCheck")(scrollCheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollDelay)) __obj.updateDynamic("scrollDelay")(scrollDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollThrottle)) __obj.updateDynamic("scrollThrottle")(scrollThrottle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

