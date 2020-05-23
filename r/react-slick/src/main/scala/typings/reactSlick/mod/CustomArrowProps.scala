package typings.reactSlick.mod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomArrowProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var currentSlide: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var slideCount: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CustomArrowProps {
  @scala.inline
  def apply(
    className: String = null,
    currentSlide: js.UndefOr[Double] = js.undefined,
    onClick: MouseEvent[_, NativeMouseEvent] => Unit = null,
    slideCount: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null
  ): CustomArrowProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(currentSlide)) __obj.updateDynamic("currentSlide")(currentSlide.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(slideCount)) __obj.updateDynamic("slideCount")(slideCount.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomArrowProps]
  }
}

