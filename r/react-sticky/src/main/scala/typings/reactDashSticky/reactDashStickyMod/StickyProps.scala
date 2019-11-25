package typings.reactDashSticky.reactDashStickyMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyProps extends js.Object {
  var bottomOffset: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disableCompensation: js.UndefOr[Boolean] = js.undefined
  var disableHardwareAcceleration: js.UndefOr[Boolean] = js.undefined
  var isActive: js.UndefOr[Boolean] = js.undefined
  var onStickyStateChange: js.UndefOr[js.Function1[/* isSticky */ Boolean, Unit]] = js.undefined
  var relative: js.UndefOr[Boolean] = js.undefined
  var stickyClassName: js.UndefOr[String] = js.undefined
  var stickyStyle: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var topOffset: js.UndefOr[Double] = js.undefined
  def children(args: StickyChildArgs): ReactElement
}

object StickyProps {
  @scala.inline
  def apply(
    children: StickyChildArgs => ReactElement,
    bottomOffset: Int | Double = null,
    className: String = null,
    disableCompensation: js.UndefOr[Boolean] = js.undefined,
    disableHardwareAcceleration: js.UndefOr[Boolean] = js.undefined,
    isActive: js.UndefOr[Boolean] = js.undefined,
    onStickyStateChange: /* isSticky */ Boolean => Unit = null,
    relative: js.UndefOr[Boolean] = js.undefined,
    stickyClassName: String = null,
    stickyStyle: js.Any = null,
    style: js.Any = null,
    topOffset: Int | Double = null
  ): StickyProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCompensation)) __obj.updateDynamic("disableCompensation")(disableCompensation.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHardwareAcceleration)) __obj.updateDynamic("disableHardwareAcceleration")(disableHardwareAcceleration.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (onStickyStateChange != null) __obj.updateDynamic("onStickyStateChange")(js.Any.fromFunction1(onStickyStateChange))
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    if (stickyClassName != null) __obj.updateDynamic("stickyClassName")(stickyClassName.asInstanceOf[js.Any])
    if (stickyStyle != null) __obj.updateDynamic("stickyStyle")(stickyStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyProps]
  }
}

