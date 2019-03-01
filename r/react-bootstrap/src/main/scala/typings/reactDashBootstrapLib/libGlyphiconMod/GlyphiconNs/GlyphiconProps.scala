package typings
package reactDashBootstrapLib.libGlyphiconMod.GlyphiconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlyphiconProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libGlyphiconMod.Glyphicon] {
  // Optional
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  // Required
  var glyph: java.lang.String
}

object GlyphiconProps {
  @scala.inline
  def apply(
    glyph: java.lang.String,
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libGlyphiconMod.Glyphicon] = null,
    bsClass: java.lang.String = null
  ): GlyphiconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("glyph")(glyph)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[GlyphiconProps]
  }
}

