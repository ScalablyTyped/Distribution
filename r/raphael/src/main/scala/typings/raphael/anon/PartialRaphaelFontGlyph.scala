package typings.raphael.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<raphael.raphael.RaphaelFontGlyph> */
trait PartialRaphaelFontGlyph extends js.Object {
  var d: js.UndefOr[String] = js.undefined
  var w: js.UndefOr[Double] = js.undefined
}

object PartialRaphaelFontGlyph {
  @scala.inline
  def apply(d: String = null, w: js.UndefOr[Double] = js.undefined): PartialRaphaelFontGlyph = {
    val __obj = js.Dynamic.literal()
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (!js.isUndefined(w)) __obj.updateDynamic("w")(w.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRaphaelFontGlyph]
  }
}

