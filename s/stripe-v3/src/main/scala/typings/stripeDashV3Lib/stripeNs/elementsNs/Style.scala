package typings
package stripeDashV3Lib.stripeNs.elementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends StyleOptions {
  var `:-webkit-autofill`: js.UndefOr[StyleOptions] = js.undefined
  var `::-ms-clear`: js.UndefOr[StyleOptions] = js.undefined
  var `::placeholder`: js.UndefOr[StyleOptions] = js.undefined
  var `::selection`: js.UndefOr[StyleOptions] = js.undefined
  var `:focus`: js.UndefOr[StyleOptions] = js.undefined
  var `:hover`: js.UndefOr[StyleOptions] = js.undefined
}

object Style {
  @scala.inline
  def apply(
    `:-webkit-autofill`: StyleOptions = null,
    `::-ms-clear`: StyleOptions = null,
    `::placeholder`: StyleOptions = null,
    `::selection`: StyleOptions = null,
    `:focus`: StyleOptions = null,
    `:hover`: StyleOptions = null,
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
  ): Style = {
    val __obj = js.Dynamic.literal()
    if (`:-webkit-autofill` != null) __obj.updateDynamic(":-webkit-autofill")(`:-webkit-autofill`)
    if (`::-ms-clear` != null) __obj.updateDynamic("::-ms-clear")(`::-ms-clear`)
    if (`::placeholder` != null) __obj.updateDynamic("::placeholder")(`::placeholder`)
    if (`::selection` != null) __obj.updateDynamic("::selection")(`::selection`)
    if (`:focus` != null) __obj.updateDynamic(":focus")(`:focus`)
    if (`:hover` != null) __obj.updateDynamic(":hover")(`:hover`)
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
    __obj.asInstanceOf[Style]
  }
}

