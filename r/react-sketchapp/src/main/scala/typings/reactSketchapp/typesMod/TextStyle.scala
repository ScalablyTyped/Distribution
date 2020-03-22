package typings.reactSketchapp.typesMod

import typings.reactSketchapp.AnonWidth
import typings.reactSketchapp.reactSketchappStrings.auto
import typings.reactSketchapp.reactSketchappStrings.center
import typings.reactSketchapp.reactSketchappStrings.italic
import typings.reactSketchapp.reactSketchappStrings.justify
import typings.reactSketchapp.reactSketchappStrings.left
import typings.reactSketchapp.reactSketchappStrings.lowercase
import typings.reactSketchapp.reactSketchappStrings.ltr
import typings.reactSketchapp.reactSketchappStrings.normal
import typings.reactSketchapp.reactSketchappStrings.right
import typings.reactSketchapp.reactSketchappStrings.rtl
import typings.reactSketchapp.reactSketchappStrings.uppercase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[normal | italic] = js.undefined
  var fontWeight: js.UndefOr[String] = js.undefined
  var letterSpacing: js.UndefOr[Double] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var paragraphSpacing: js.UndefOr[Double] = js.undefined
  var textAlign: js.UndefOr[auto | left | right | center | justify] = js.undefined
  var textDecoration: js.UndefOr[String] = js.undefined
  var textShadowColor: js.UndefOr[Color] = js.undefined
  var textShadowOffset: js.UndefOr[AnonWidth] = js.undefined
  var textShadowOpacity: js.UndefOr[Double] = js.undefined
  var textShadowRadius: js.UndefOr[Double] = js.undefined
  var textShadowSpread: js.UndefOr[Double] = js.undefined
  var textTransform: js.UndefOr[uppercase | lowercase] = js.undefined
  var writingDirection: js.UndefOr[auto | ltr | rtl] = js.undefined
}

object TextStyle {
  @scala.inline
  def apply(
    color: Color = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: normal | italic = null,
    fontWeight: String = null,
    letterSpacing: Int | Double = null,
    lineHeight: Int | Double = null,
    paragraphSpacing: Int | Double = null,
    textAlign: auto | left | right | center | justify = null,
    textDecoration: String = null,
    textShadowColor: Color = null,
    textShadowOffset: AnonWidth = null,
    textShadowOpacity: Int | Double = null,
    textShadowRadius: Int | Double = null,
    textShadowSpread: Int | Double = null,
    textTransform: uppercase | lowercase = null,
    writingDirection: auto | ltr | rtl = null
  ): TextStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (paragraphSpacing != null) __obj.updateDynamic("paragraphSpacing")(paragraphSpacing.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (textShadowColor != null) __obj.updateDynamic("textShadowColor")(textShadowColor.asInstanceOf[js.Any])
    if (textShadowOffset != null) __obj.updateDynamic("textShadowOffset")(textShadowOffset.asInstanceOf[js.Any])
    if (textShadowOpacity != null) __obj.updateDynamic("textShadowOpacity")(textShadowOpacity.asInstanceOf[js.Any])
    if (textShadowRadius != null) __obj.updateDynamic("textShadowRadius")(textShadowRadius.asInstanceOf[js.Any])
    if (textShadowSpread != null) __obj.updateDynamic("textShadowSpread")(textShadowSpread.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    if (writingDirection != null) __obj.updateDynamic("writingDirection")(writingDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
}

