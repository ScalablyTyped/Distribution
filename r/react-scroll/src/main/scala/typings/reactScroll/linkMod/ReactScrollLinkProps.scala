package typings.reactScroll.linkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactScrollLinkProps extends js.Object {
  var absolute: js.UndefOr[Boolean] = js.undefined
  var activeClass: js.UndefOr[String] = js.undefined
  var containerId: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double | String] = js.undefined
  var hashSpy: js.UndefOr[Boolean] = js.undefined
  var ignoreCancelEvents: js.UndefOr[Boolean] = js.undefined
  var isDynamic: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSetActive: js.UndefOr[js.Function1[/* to */ String, Unit]] = js.undefined
  var onSetInactive: js.UndefOr[js.Function0[Unit]] = js.undefined
  var smooth: js.UndefOr[Boolean | String] = js.undefined
  var spy: js.UndefOr[Boolean] = js.undefined
  var to: String
}

object ReactScrollLinkProps {
  @scala.inline
  def apply(
    to: String,
    absolute: js.UndefOr[Boolean] = js.undefined,
    activeClass: String = null,
    containerId: String = null,
    delay: Int | Double = null,
    duration: Double | String = null,
    hashSpy: js.UndefOr[Boolean] = js.undefined,
    ignoreCancelEvents: js.UndefOr[Boolean] = js.undefined,
    isDynamic: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    onClick: () => Unit = null,
    onSetActive: /* to */ String => Unit = null,
    onSetInactive: () => Unit = null,
    smooth: Boolean | String = null,
    spy: js.UndefOr[Boolean] = js.undefined
  ): ReactScrollLinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.asInstanceOf[js.Any])
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(hashSpy)) __obj.updateDynamic("hashSpy")(hashSpy.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCancelEvents)) __obj.updateDynamic("ignoreCancelEvents")(ignoreCancelEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(isDynamic)) __obj.updateDynamic("isDynamic")(isDynamic.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (onSetActive != null) __obj.updateDynamic("onSetActive")(js.Any.fromFunction1(onSetActive))
    if (onSetInactive != null) __obj.updateDynamic("onSetInactive")(js.Any.fromFunction0(onSetInactive))
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (!js.isUndefined(spy)) __obj.updateDynamic("spy")(spy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactScrollLinkProps]
  }
}

