package typings
package stripeDashV3Lib.stripeNs.elementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleOptions extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  var fontSmoothing: js.UndefOr[java.lang.String] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var fontVariant: js.UndefOr[java.lang.String] = js.undefined
  var fontWeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var iconColor: js.UndefOr[java.lang.String] = js.undefined
  var letterSpacing: js.UndefOr[java.lang.String] = js.undefined
  var lineHeight: js.UndefOr[java.lang.String] = js.undefined
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  var textDecoration: js.UndefOr[java.lang.String] = js.undefined
  var textShadow: js.UndefOr[java.lang.String] = js.undefined
  var textTransform: js.UndefOr[java.lang.String] = js.undefined
}

object StyleOptions {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: java.lang.String = null,
    fontSmoothing: java.lang.String = null,
    fontStyle: java.lang.String = null,
    fontVariant: java.lang.String = null,
    fontWeight: java.lang.String | scala.Double = null,
    iconColor: java.lang.String = null,
    letterSpacing: java.lang.String = null,
    lineHeight: java.lang.String = null,
    textAlign: java.lang.String = null,
    textDecoration: java.lang.String = null,
    textShadow: java.lang.String = null,
    textTransform: java.lang.String = null
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

