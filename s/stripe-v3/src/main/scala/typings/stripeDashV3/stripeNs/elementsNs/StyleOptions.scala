package typings.stripeDashV3.stripeNs.elementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[String] = js.undefined
  var fontSmoothing: js.UndefOr[String] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var fontVariant: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[String | Double] = js.undefined
  var iconColor: js.UndefOr[String] = js.undefined
  var letterSpacing: js.UndefOr[String] = js.undefined
  var lineHeight: js.UndefOr[String] = js.undefined
  var textAlign: js.UndefOr[String] = js.undefined
  var textDecoration: js.UndefOr[String] = js.undefined
  var textShadow: js.UndefOr[String] = js.undefined
  var textTransform: js.UndefOr[String] = js.undefined
}

object StyleOptions {
  @scala.inline
  def apply(
    color: String = null,
    fontFamily: String = null,
    fontSize: String = null,
    fontSmoothing: String = null,
    fontStyle: String = null,
    fontVariant: String = null,
    fontWeight: String | Double = null,
    iconColor: String = null,
    letterSpacing: String = null,
    lineHeight: String = null,
    textAlign: String = null,
    textDecoration: String = null,
    textShadow: String = null,
    textTransform: String = null
  ): StyleOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (fontSmoothing != null) __obj.updateDynamic("fontSmoothing")(fontSmoothing)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor)
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    if (textShadow != null) __obj.updateDynamic("textShadow")(textShadow)
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform)
    __obj.asInstanceOf[StyleOptions]
  }
}

