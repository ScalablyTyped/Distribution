package typings.raphael.mod

import typings.raphael.anon.PartialRaphaelFontFace
import typings.raphael.anon.PartialRaphaelFontGlyph
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelFont extends js.Object {
  /** The font faces that are available in this font. */
  var face: PartialRaphaelFontFace = js.native
  /** The glyphs that are available in this font. */
  var glyphs: Record[String, PartialRaphaelFontGlyph] = js.native
  /** The width of this font. */
  var w: Double = js.native
}

object RaphaelFont {
  @scala.inline
  def apply(face: PartialRaphaelFontFace, glyphs: Record[String, PartialRaphaelFontGlyph], w: Double): RaphaelFont = {
    val __obj = js.Dynamic.literal(face = face.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelFont]
  }
  @scala.inline
  implicit class RaphaelFontOps[Self <: RaphaelFont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFace(value: PartialRaphaelFontFace): Self = this.set("face", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlyphs(value: Record[String, PartialRaphaelFontGlyph]): Self = this.set("glyphs", value.asInstanceOf[js.Any])
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
  }
  
}

