package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelFontGlyph extends js.Object {
  /** An SVG path string for drawing this glyph. */
  var d: String = js.native
  /** The width of this glyph. */
  var w: Double = js.native
}

object RaphaelFontGlyph {
  @scala.inline
  def apply(d: String, w: Double): RaphaelFontGlyph = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelFontGlyph]
  }
  @scala.inline
  implicit class RaphaelFontGlyphOps[Self <: RaphaelFontGlyph] (val x: Self) extends AnyVal {
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
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
  }
  
}

