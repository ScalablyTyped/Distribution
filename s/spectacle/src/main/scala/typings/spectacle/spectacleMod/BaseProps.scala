package typings.spectacle.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base props for many Spectacle components
  */
trait BaseProps extends js.Object {
  var bgColor: js.UndefOr[String] = js.undefined
  var bgDarken: js.UndefOr[Double] = js.undefined
  var bgImage: js.UndefOr[String] = js.undefined
  var bold: js.UndefOr[Boolean] = js.undefined
  var caps: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[Double | String] = js.undefined
  var padding: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var textAlign: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var textFont: js.UndefOr[String] = js.undefined
  var textSize: js.UndefOr[String] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(
    bgColor: String = null,
    bgDarken: Int | Double = null,
    bgImage: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    caps: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    margin: Double | String = null,
    padding: Double | String = null,
    style: CSSProperties = null,
    textAlign: String = null,
    textColor: String = null,
    textFont: String = null,
    textSize: String = null
  ): BaseProps = {
    val __obj = js.Dynamic.literal()
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (bgDarken != null) __obj.updateDynamic("bgDarken")(bgDarken.asInstanceOf[js.Any])
    if (bgImage != null) __obj.updateDynamic("bgImage")(bgImage)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (!js.isUndefined(caps)) __obj.updateDynamic("caps")(caps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (textFont != null) __obj.updateDynamic("textFont")(textFont)
    if (textSize != null) __obj.updateDynamic("textSize")(textSize)
    __obj.asInstanceOf[BaseProps]
  }
}

