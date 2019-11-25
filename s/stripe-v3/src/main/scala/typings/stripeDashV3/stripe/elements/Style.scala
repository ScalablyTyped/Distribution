package typings.stripeDashV3.stripe.elements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends StyleOptions {
  var `:-webkit-autofill`: js.UndefOr[StyleOptions] = js.undefined
  var `::-ms-clear`: js.UndefOr[StyleOptions] = js.undefined
  var `::placeholder`: js.UndefOr[StyleOptions] = js.undefined
  var `::selection`: js.UndefOr[StyleOptions] = js.undefined
  var `:disabled`: js.UndefOr[StyleOptions] = js.undefined
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
    `:disabled`: StyleOptions = null,
    `:focus`: StyleOptions = null,
    `:hover`: StyleOptions = null,
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
  ): Style = {
    val __obj = js.Dynamic.literal()
    if (`:-webkit-autofill` != null) __obj.updateDynamic(":-webkit-autofill")(`:-webkit-autofill`.asInstanceOf[js.Any])
    if (`::-ms-clear` != null) __obj.updateDynamic("::-ms-clear")(`::-ms-clear`.asInstanceOf[js.Any])
    if (`::placeholder` != null) __obj.updateDynamic("::placeholder")(`::placeholder`.asInstanceOf[js.Any])
    if (`::selection` != null) __obj.updateDynamic("::selection")(`::selection`.asInstanceOf[js.Any])
    if (`:disabled` != null) __obj.updateDynamic(":disabled")(`:disabled`.asInstanceOf[js.Any])
    if (`:focus` != null) __obj.updateDynamic(":focus")(`:focus`.asInstanceOf[js.Any])
    if (`:hover` != null) __obj.updateDynamic(":hover")(`:hover`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSmoothing != null) __obj.updateDynamic("fontSmoothing")(fontSmoothing.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (textShadow != null) __obj.updateDynamic("textShadow")(textShadow.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

