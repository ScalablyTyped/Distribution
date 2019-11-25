package typings.reactDashBootstrap.libGlyphiconMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlyphiconProps
  extends AllHTMLAttributes[Glyphicon]
     with ClassAttributes[Glyphicon] {
  // Optional
  var bsClass: js.UndefOr[String] = js.undefined
  // Required
  var glyph: String
}

object GlyphiconProps {
  @scala.inline
  def apply(
    glyph: String,
    AllHTMLAttributes: AllHTMLAttributes[Glyphicon] = null,
    ClassAttributes: ClassAttributes[Glyphicon] = null,
    bsClass: String = null
  ): GlyphiconProps = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphiconProps]
  }
}

