package typings.reactDashSketchapp.libComponentsSvgPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontProps extends js.Object {
  var font: js.UndefOr[Font] = js.undefined
  var fontFamily: js.UndefOr[FontFamily] = js.undefined
  var fontSize: js.UndefOr[typings.reactDashSketchapp.libComponentsSvgPropsMod.fontSize] = js.undefined
  var fontStretch: js.UndefOr[FontStretch] = js.undefined
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
  var fontVariant: js.UndefOr[FontVariant] = js.undefined
  var fontVariantLigatures: js.UndefOr[FontVariantLigatures] = js.undefined
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
  var kerning: js.UndefOr[Kerning] = js.undefined
  var letterSpacing: js.UndefOr[LetterSpacing] = js.undefined
  var textAnchor: js.UndefOr[TextAnchor] = js.undefined
  var textDecoration: js.UndefOr[TextDecoration] = js.undefined
  var wordSpacing: js.UndefOr[WordSpacing] = js.undefined
}

object FontProps {
  @scala.inline
  def apply(
    font: Font = null,
    fontFamily: FontFamily = null,
    fontSize: fontSize = null,
    fontStretch: FontStretch = null,
    fontStyle: FontStyle = null,
    fontVariant: FontVariant = null,
    fontVariantLigatures: FontVariantLigatures = null,
    fontWeight: FontWeight = null,
    kerning: Kerning = null,
    letterSpacing: LetterSpacing = null,
    textAnchor: TextAnchor = null,
    textDecoration: TextDecoration = null,
    wordSpacing: WordSpacing = null
  ): FontProps = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
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
    __obj.asInstanceOf[FontProps]
  }
}

