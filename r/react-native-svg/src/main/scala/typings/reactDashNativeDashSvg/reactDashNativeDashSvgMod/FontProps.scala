package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontProps extends FontObject {
  var font: js.UndefOr[FontObject] = js.undefined
}

object FontProps {
  @scala.inline
  def apply(
    font: FontObject = null,
    fontFamily: String = null,
    fontFeatureSettings: String = null,
    fontSize: NumberProp = null,
    fontStretch: FontStretch = null,
    fontStyle: FontStyle = null,
    fontVariant: FontVariant = null,
    fontVariantLigatures: FontVariantLigatures = null,
    fontVariationSettings: String = null,
    fontWeight: FontWeight = null,
    kerning: NumberProp = null,
    letterSpacing: NumberProp = null,
    textAnchor: TextAnchor = null,
    textDecoration: TextDecoration = null,
    wordSpacing: NumberProp = null
  ): FontProps = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontFeatureSettings != null) __obj.updateDynamic("fontFeatureSettings")(fontFeatureSettings)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant)
    if (fontVariantLigatures != null) __obj.updateDynamic("fontVariantLigatures")(fontVariantLigatures)
    if (fontVariationSettings != null) __obj.updateDynamic("fontVariationSettings")(fontVariationSettings)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (kerning != null) __obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor)
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    if (wordSpacing != null) __obj.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontProps]
  }
}

