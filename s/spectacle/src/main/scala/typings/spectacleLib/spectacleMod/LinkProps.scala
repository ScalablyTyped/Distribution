package typings
package spectacleLib.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends BaseProps {
  var href: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[targetType] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    bgColor: java.lang.String = null,
    bgDarken: scala.Int | scala.Double = null,
    bgImage: java.lang.String = null,
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    caps: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    href: java.lang.String = null,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    margin: scala.Double | java.lang.String = null,
    padding: scala.Double | java.lang.String = null,
    style: CSSProperties = null,
    target: targetType = null,
    textAlign: java.lang.String = null,
    textColor: java.lang.String = null,
    textFont: java.lang.String = null,
    textSize: java.lang.String = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (bgDarken != null) __obj.updateDynamic("bgDarken")(bgDarken.asInstanceOf[js.Any])
    if (bgImage != null) __obj.updateDynamic("bgImage")(bgImage)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (!js.isUndefined(caps)) __obj.updateDynamic("caps")(caps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (href != null) __obj.updateDynamic("href")(href)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(target)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (textFont != null) __obj.updateDynamic("textFont")(textFont)
    if (textSize != null) __obj.updateDynamic("textSize")(textSize)
    __obj.asInstanceOf[LinkProps]
  }
}

