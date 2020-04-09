package typings.raphael

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
  def apply(d: String = null, w: Int | Double = null): PartialRaphaelFontGlyph = {
    val __obj = js.Dynamic.literal()
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRaphaelFontGlyph]
  }
}

