package typings
package spectacleLib.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadingProps extends BaseProps {
  var fit: js.UndefOr[scala.Boolean] = js.undefined
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object HeadingProps {
  @scala.inline
  def apply(
    bgColor: java.lang.String = null,
    bgDarken: scala.Int | scala.Double = null,
    bgImage: java.lang.String = null,
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    caps: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    fit: js.UndefOr[scala.Boolean] = js.undefined,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    lineHeight: scala.Int | scala.Double = null,
    margin: scala.Double | java.lang.String = null,
    padding: scala.Double | java.lang.String = null,
    size: scala.Int | scala.Double = null,
    style: CSSProperties = null,
    textAlign: java.lang.String = null,
    textColor: java.lang.String = null,
    textFont: java.lang.String = null,
    textSize: java.lang.String = null
  ): HeadingProps = {
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
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (textFont != null) __obj.updateDynamic("textFont")(textFont)
    if (textSize != null) __obj.updateDynamic("textSize")(textSize)
    __obj.asInstanceOf[HeadingProps]
  }
}

