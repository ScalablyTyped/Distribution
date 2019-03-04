package typings
package reactDashStickyLib.reactDashStickyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyProps extends js.Object {
  var bottomOffset: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disableCompensation: js.UndefOr[scala.Boolean] = js.undefined
  var disableHardwareAcceleration: js.UndefOr[scala.Boolean] = js.undefined
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  var onStickyStateChange: js.UndefOr[js.Function1[/* isSticky */ scala.Boolean, scala.Unit]] = js.undefined
  var relative: js.UndefOr[scala.Boolean] = js.undefined
  var stickyClassName: js.UndefOr[java.lang.String] = js.undefined
  var stickyStyle: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var topOffset: js.UndefOr[scala.Double] = js.undefined
  def children(args: StickyChildArgs): reactLib.reactMod.ReactNs.ReactElement[_]
}

object StickyProps {
  @scala.inline
  def apply(
    children: js.Function1[StickyChildArgs, reactLib.reactMod.ReactNs.ReactElement[_]],
    bottomOffset: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    disableCompensation: js.UndefOr[scala.Boolean] = js.undefined,
    disableHardwareAcceleration: js.UndefOr[scala.Boolean] = js.undefined,
    isActive: js.UndefOr[scala.Boolean] = js.undefined,
    onStickyStateChange: js.Function1[/* isSticky */ scala.Boolean, scala.Unit] = null,
    relative: js.UndefOr[scala.Boolean] = js.undefined,
    stickyClassName: java.lang.String = null,
    stickyStyle: js.Any = null,
    style: js.Any = null,
    topOffset: scala.Int | scala.Double = null
  ): StickyProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disableCompensation)) __obj.updateDynamic("disableCompensation")(disableCompensation)
    if (!js.isUndefined(disableHardwareAcceleration)) __obj.updateDynamic("disableHardwareAcceleration")(disableHardwareAcceleration)
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (onStickyStateChange != null) __obj.updateDynamic("onStickyStateChange")(onStickyStateChange)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    if (stickyClassName != null) __obj.updateDynamic("stickyClassName")(stickyClassName)
    if (stickyStyle != null) __obj.updateDynamic("stickyStyle")(stickyStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyProps]
  }
}

