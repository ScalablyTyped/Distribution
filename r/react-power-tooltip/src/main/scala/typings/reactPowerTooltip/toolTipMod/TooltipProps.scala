package typings.reactPowerTooltip.toolTipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  var animation: js.UndefOr[AnimationType] = js.undefined
  var arrowAlign: js.UndefOr[ArrowAlignType] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var flat: js.UndefOr[Boolean] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[String] = js.undefined
  var hoverBackground: js.UndefOr[String] = js.undefined
  var lineSeparated: js.UndefOr[Boolean | String] = js.undefined
  var moveDown: js.UndefOr[String] = js.undefined
  var moveLeft: js.UndefOr[String] = js.undefined
  var moveRight: js.UndefOr[String] = js.undefined
  var moveUp: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[PositionType] = js.undefined
  var show: Boolean
  var static: js.UndefOr[Boolean] = js.undefined
  var textAlign: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[String] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    show: Boolean,
    animation: AnimationType = null,
    arrowAlign: ArrowAlignType = null,
    backgroundColor: String = null,
    color: String = null,
    flat: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontSize: String = null,
    fontWeight: String = null,
    hoverBackground: String = null,
    lineSeparated: Boolean | String = null,
    moveDown: String = null,
    moveLeft: String = null,
    moveRight: String = null,
    moveUp: String = null,
    position: PositionType = null,
    static: js.UndefOr[Boolean] = js.undefined,
    textAlign: String = null,
    zIndex: String = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (arrowAlign != null) __obj.updateDynamic("arrowAlign")(arrowAlign.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat.get.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (hoverBackground != null) __obj.updateDynamic("hoverBackground")(hoverBackground.asInstanceOf[js.Any])
    if (lineSeparated != null) __obj.updateDynamic("lineSeparated")(lineSeparated.asInstanceOf[js.Any])
    if (moveDown != null) __obj.updateDynamic("moveDown")(moveDown.asInstanceOf[js.Any])
    if (moveLeft != null) __obj.updateDynamic("moveLeft")(moveLeft.asInstanceOf[js.Any])
    if (moveRight != null) __obj.updateDynamic("moveRight")(moveRight.asInstanceOf[js.Any])
    if (moveUp != null) __obj.updateDynamic("moveUp")(moveUp.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.get.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

