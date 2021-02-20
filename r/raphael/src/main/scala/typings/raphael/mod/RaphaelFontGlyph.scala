package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelFontGlyph extends StObject {
  
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
  implicit class RaphaelFontGlyphMutableBuilder[Self <: RaphaelFontGlyph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
