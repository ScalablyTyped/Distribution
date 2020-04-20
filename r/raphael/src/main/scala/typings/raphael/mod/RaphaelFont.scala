package typings.raphael.mod

import typings.raphael.PartialRaphaelFontFace
import typings.raphael.PartialRaphaelFontGlyph
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelFont extends js.Object {
  /** The font faces that are available in this font. */
  var face: PartialRaphaelFontFace
  /** The glyphs that are available in this font. */
  var glyphs: Record[String, PartialRaphaelFontGlyph]
  /** The width of this font. */
  var w: Double
}

object RaphaelFont {
  @scala.inline
  def apply(face: PartialRaphaelFontFace, glyphs: Record[String, PartialRaphaelFontGlyph], w: Double): RaphaelFont = {
    val __obj = js.Dynamic.literal(face = face.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelFont]
  }
}

