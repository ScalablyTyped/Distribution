package typings.reactPortalTooltip.statefulToolTipMod

import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactPortalTooltip.anon.ArrowStyle
import typings.reactPortalTooltip.cardMod.Card.Align
import typings.reactPortalTooltip.cardMod.Card.Arrow
import typings.reactPortalTooltip.cardMod.Card.Position
import typings.reactPortalTooltip.toolTipMod.TooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulToolTipProps extends TooltipProps {
  var className: js.UndefOr[String] = js.undefined
}

object StatefulToolTipProps {
  @scala.inline
  def apply(
    parent: String | Element | RefObject[_],
    active: js.UndefOr[Boolean] = js.undefined,
    align: js.UndefOr[Null | Align] = js.undefined,
    arrow: js.UndefOr[Null | Arrow] = js.undefined,
    className: String = null,
    group: String = null,
    position: Position = null,
    style: ArrowStyle = null,
    tooltipTimeout: js.UndefOr[Double] = js.undefined,
    useHover: js.UndefOr[Boolean] = js.undefined
  ): StatefulToolTipProps = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (!js.isUndefined(align)) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(arrow)) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipTimeout)) __obj.updateDynamic("tooltipTimeout")(tooltipTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useHover)) __obj.updateDynamic("useHover")(useHover.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulToolTipProps]
  }
}

