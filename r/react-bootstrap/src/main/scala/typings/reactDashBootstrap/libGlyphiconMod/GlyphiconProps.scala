package typings.reactDashBootstrap.libGlyphiconMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlyphiconProps extends HTMLProps[Glyphicon] {
  // Optional
  var bsClass: js.UndefOr[String] = js.undefined
  // Required
  var glyph: String
}

object GlyphiconProps {
  @scala.inline
  def apply(glyph: String, HTMLProps: HTMLProps[Glyphicon] = null, bsClass: String = null): GlyphiconProps = {
    val __obj = js.Dynamic.literal(glyph = glyph)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[GlyphiconProps]
  }
}

