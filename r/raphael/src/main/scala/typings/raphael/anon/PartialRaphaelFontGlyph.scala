package typings.raphael.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<raphael.raphael.RaphaelFontGlyph> */
@js.native
trait PartialRaphaelFontGlyph extends js.Object {
  var d: js.UndefOr[String] = js.native
  var w: js.UndefOr[Double] = js.native
}

object PartialRaphaelFontGlyph {
  @scala.inline
  def apply(): PartialRaphaelFontGlyph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRaphaelFontGlyph]
  }
  @scala.inline
  implicit class PartialRaphaelFontGlyphOps[Self <: PartialRaphaelFontGlyph] (val x: Self) extends AnyVal {
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
    def deleteD: Self = this.set("d", js.undefined)
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
  }
  
}

