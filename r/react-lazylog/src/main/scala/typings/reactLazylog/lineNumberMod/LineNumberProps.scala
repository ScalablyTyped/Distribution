package typings.reactLazylog.lineNumberMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineNumberProps extends js.Object {
  var highlight: js.UndefOr[Boolean] = js.undefined
  var number: Double
  var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LineNumberProps {
  @scala.inline
  def apply(
    number: Double,
    highlight: js.UndefOr[Boolean] = js.undefined,
    onClick: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    style: CSSProperties = null
  ): LineNumberProps = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineNumberProps]
  }
}

