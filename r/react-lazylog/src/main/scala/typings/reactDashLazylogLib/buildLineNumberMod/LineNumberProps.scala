package typings
package reactDashLazylogLib.buildLineNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineNumberProps extends js.Object {
  var highlight: js.UndefOr[scala.Boolean] = js.undefined
  var number: scala.Double
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLAnchorElement]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object LineNumberProps {
  @scala.inline
  def apply(
    number: scala.Double,
    highlight: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLAnchorElement] = null,
    style: reactLib.reactMod.CSSProperties = null
  ): LineNumberProps = {
    val __obj = js.Dynamic.literal(number = number)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LineNumberProps]
  }
}

