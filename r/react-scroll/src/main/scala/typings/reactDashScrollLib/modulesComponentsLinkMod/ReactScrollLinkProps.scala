package typings
package reactDashScrollLib.modulesComponentsLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactScrollLinkProps extends js.Object {
  var absolute: js.UndefOr[scala.Boolean] = js.undefined
  var activeClass: js.UndefOr[java.lang.String] = js.undefined
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var hashSpy: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreCancelEvents: js.UndefOr[scala.Boolean] = js.undefined
  var isDynamic: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSetActive: js.UndefOr[js.Function1[/* to */ java.lang.String, scala.Unit]] = js.undefined
  var onSetInactive: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var smooth: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var spy: js.UndefOr[scala.Boolean] = js.undefined
  var to: java.lang.String
}

object ReactScrollLinkProps {
  @scala.inline
  def apply(
    to: java.lang.String,
    absolute: js.UndefOr[scala.Boolean] = js.undefined,
    activeClass: java.lang.String = null,
    containerId: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    duration: scala.Double | java.lang.String = null,
    hashSpy: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreCancelEvents: js.UndefOr[scala.Boolean] = js.undefined,
    isDynamic: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null,
    onClick: js.Function0[scala.Unit] = null,
    onSetActive: js.Function1[/* to */ java.lang.String, scala.Unit] = null,
    onSetInactive: js.Function0[scala.Unit] = null,
    smooth: scala.Boolean | java.lang.String = null,
    spy: js.UndefOr[scala.Boolean] = js.undefined
  ): ReactScrollLinkProps = {
    val __obj = js.Dynamic.literal(to = to)
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(hashSpy)) __obj.updateDynamic("hashSpy")(hashSpy)
    if (!js.isUndefined(ignoreCancelEvents)) __obj.updateDynamic("ignoreCancelEvents")(ignoreCancelEvents)
    if (!js.isUndefined(isDynamic)) __obj.updateDynamic("isDynamic")(isDynamic)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onSetActive != null) __obj.updateDynamic("onSetActive")(onSetActive)
    if (onSetInactive != null) __obj.updateDynamic("onSetInactive")(onSetInactive)
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (!js.isUndefined(spy)) __obj.updateDynamic("spy")(spy)
    __obj.asInstanceOf[ReactScrollLinkProps]
  }
}

