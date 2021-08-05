package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaphaelFontGlyph extends StObject {
  
  /** An SVG path string for drawing this glyph. */
  var d: String
  
  /** The width of this glyph. */
  var w: Double
}
object RaphaelFontGlyph {
  
  inline def apply(d: String, w: Double): RaphaelFontGlyph = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelFontGlyph]
  }
  
  extension [Self <: RaphaelFontGlyph](x: Self) {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
