package typings.reactImageMagnifiers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MagnifierContainerProps extends js.Object {
  var autoInPlace: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var inPlaceMinBreakpoint: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[String] = js.undefined
}

object MagnifierContainerProps {
  @scala.inline
  def apply(
    autoInPlace: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    inPlaceMinBreakpoint: js.UndefOr[Double] = js.undefined,
    style: String = null
  ): MagnifierContainerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoInPlace)) __obj.updateDynamic("autoInPlace")(autoInPlace.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(inPlaceMinBreakpoint)) __obj.updateDynamic("inPlaceMinBreakpoint")(inPlaceMinBreakpoint.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagnifierContainerProps]
  }
}

