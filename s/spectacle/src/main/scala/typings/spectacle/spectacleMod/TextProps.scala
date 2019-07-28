package typings.spectacle.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends BaseProps {
  var fit: js.UndefOr[Boolean] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    bgColor: String = null,
    bgDarken: Int | Double = null,
    bgImage: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    caps: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    fit: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    lineHeight: Int | Double = null,
    margin: Double | String = null,
    padding: Double | String = null,
    style: CSSProperties = null,
    textAlign: String = null,
    textColor: String = null,
    textFont: String = null,
    textSize: String = null
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (bgDarken != null) __obj.updateDynamic("bgDarken")(bgDarken.asInstanceOf[js.Any])
    if (bgImage != null) __obj.updateDynamic("bgImage")(bgImage)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (!js.isUndefined(caps)) __obj.updateDynamic("caps")(caps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (textFont != null) __obj.updateDynamic("textFont")(textFont)
    if (textSize != null) __obj.updateDynamic("textSize")(textSize)
    __obj.asInstanceOf[TextProps]
  }
}

