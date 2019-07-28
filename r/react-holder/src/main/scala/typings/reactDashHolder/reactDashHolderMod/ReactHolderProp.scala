package typings.reactDashHolder.reactDashHolderMod

import typings.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactHolderProp extends HTMLAttributes[ReactHolder] {
  var align: js.UndefOr[String] = js.undefined
  var bg: js.UndefOr[String] = js.undefined
  var fg: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var height: String | Double
  var lineWrap: js.UndefOr[Double] = js.undefined
  var outline: js.UndefOr[Boolean] = js.undefined
  var random: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  // config args
  var theme: js.UndefOr[String] = js.undefined
  var updateOnResize: Boolean
  var width: String | Double
}

object ReactHolderProp {
  @scala.inline
  def apply(
    height: String | Double,
    updateOnResize: Boolean,
    width: String | Double,
    HTMLAttributes: HTMLAttributes[ReactHolder] = null,
    align: String = null,
    bg: String = null,
    fg: String = null,
    font: String = null,
    lineWrap: Int | Double = null,
    outline: js.UndefOr[Boolean] = js.undefined,
    random: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    text: String = null,
    theme: String = null
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

