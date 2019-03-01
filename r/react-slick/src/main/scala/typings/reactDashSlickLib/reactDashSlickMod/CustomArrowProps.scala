package typings
package reactDashSlickLib.reactDashSlickMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomArrowProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var currentSlide: js.UndefOr[scala.Double] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[_]] = js.undefined
  var slideCount: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object CustomArrowProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    currentSlide: scala.Int | scala.Double = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[_] = null,
    slideCount: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): CustomArrowProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (currentSlide != null) __obj.updateDynamic("currentSlide")(currentSlide.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (slideCount != null) __obj.updateDynamic("slideCount")(slideCount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CustomArrowProps]
  }
}

