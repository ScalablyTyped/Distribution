package typings
package reactDashNativeDashSvgLib.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontObject extends js.Object {
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[NumberProp] = js.undefined
  var fontStretch: js.UndefOr[FontStretch] = js.undefined
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
  var fontVariant: js.UndefOr[FontVariant] = js.undefined
  var fontVariantLigatures: js.UndefOr[FontVariantLigatures] = js.undefined
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
  var kerning: js.UndefOr[NumberProp] = js.undefined
  var letterSpacing: js.UndefOr[NumberProp] = js.undefined
  var textAnchor: js.UndefOr[TextAnchor] = js.undefined
  var textDecoration: js.UndefOr[TextDecoration] = js.undefined
  var wordSpacing: js.UndefOr[NumberProp] = js.undefined
}

object FontObject {
  @scala.inline
  def apply(
    fontFamily: java.lang.String = null,
    fontSize: NumberProp = null,
    fontStretch: FontStretch = null,
    fontStyle: FontStyle = null,
    fontVariant: FontVariant = null,
    fontVariantLigatures: FontVariantLigatures = null,
    fontWeight: FontWeight = null,
    kerning: NumberProp = null,
    letterSpacing: NumberProp = null,
    textAnchor: TextAnchor = null,
    textDecoration: TextDecoration = null,
    wordSpacing: NumberProp = null
  ): FontObject = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant)
    if (fontVariantLigatures != null) __obj.updateDynamic("fontVariantLigatures")(fontVariantLigatures)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (kerning != null) __obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor)
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    if (wordSpacing != null) __obj.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontObject]
  }
}

