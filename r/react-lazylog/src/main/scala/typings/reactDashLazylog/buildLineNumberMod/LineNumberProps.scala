package typings.reactDashLazylog.buildLineNumberMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEventHandler
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
    onClick: MouseEventHandler[HTMLAnchorElement] = null,
    style: CSSProperties = null
  ): LineNumberProps = {
    val __obj = js.Dynamic.literal(number = number)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LineNumberProps]
  }
}

