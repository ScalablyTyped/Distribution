package typings.reactPortalTooltip.cardMod.Card

import typings.reactPortalTooltip.anon.ArrowStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps extends js.Object {
  var align: js.UndefOr[Align] = js.undefined
  var arrow: js.UndefOr[Arrow] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
  var style: js.UndefOr[ArrowStyle] = js.undefined
  var useHover: js.UndefOr[Boolean] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(
    align: js.UndefOr[Null | Align] = js.undefined,
    arrow: js.UndefOr[Null | Arrow] = js.undefined,
    position: Position = null,
    style: ArrowStyle = null,
    useHover: js.UndefOr[Boolean] = js.undefined
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(align)) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(arrow)) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useHover)) __obj.updateDynamic("useHover")(useHover.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardProps]
  }
}

