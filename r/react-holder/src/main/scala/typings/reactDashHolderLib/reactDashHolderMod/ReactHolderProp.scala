package typings
package reactDashHolderLib.reactDashHolderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactHolderProp
  extends reactLib.reactMod.HTMLAttributes[ReactHolder] {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var bg: js.UndefOr[java.lang.String] = js.undefined
  var fg: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var height: java.lang.String | scala.Double
  var lineWrap: js.UndefOr[scala.Double] = js.undefined
  var outline: js.UndefOr[scala.Boolean] = js.undefined
  var random: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  // config args
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var updateOnResize: scala.Boolean
  var width: java.lang.String | scala.Double
}

object ReactHolderProp {
  @scala.inline
  def apply(
    height: java.lang.String | scala.Double,
    updateOnResize: scala.Boolean,
    width: java.lang.String | scala.Double,
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[ReactHolder] = null,
    align: java.lang.String = null,
    bg: java.lang.String = null,
    fg: java.lang.String = null,
    font: java.lang.String = null,
    lineWrap: scala.Int | scala.Double = null,
    outline: js.UndefOr[scala.Boolean] = js.undefined,
    random: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    text: java.lang.String = null,
    theme: java.lang.String = null
  ): ReactHolderProp = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], updateOnResize = updateOnResize, width = width.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (align != null) __obj.updateDynamic("align")(align)
    if (bg != null) __obj.updateDynamic("bg")(bg)
    if (fg != null) __obj.updateDynamic("fg")(fg)
    if (font != null) __obj.updateDynamic("font")(font)
    if (lineWrap != null) __obj.updateDynamic("lineWrap")(lineWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (!js.isUndefined(random)) __obj.updateDynamic("random")(random)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ReactHolderProp]
  }
}

