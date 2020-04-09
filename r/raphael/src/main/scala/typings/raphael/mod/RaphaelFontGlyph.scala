package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelFontGlyph extends js.Object {
  /** An SVG path string for drawing this glyph. */
  var d: String
  /** The width of this glyph. */
  var w: Double
}

object RaphaelFontGlyph {
  @scala.inline
  def apply(d: String, w: Double): RaphaelFontGlyph = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RaphaelFontGlyph]
  }
}

