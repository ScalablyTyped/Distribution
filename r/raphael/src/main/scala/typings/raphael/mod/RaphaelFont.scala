package typings.raphael.mod

import typings.raphael.anon.PartialRaphaelFontFace
import typings.raphael.anon.PartialRaphaelFontGlyph
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaphaelFont extends StObject {
  
  /** The font faces that are available in this font. */
  var face: PartialRaphaelFontFace
  
  /** The glyphs that are available in this font. */
  var glyphs: Record[String, PartialRaphaelFontGlyph]
  
  /** The width of this font. */
  var w: Double
}
object RaphaelFont {
  
  inline def apply(face: PartialRaphaelFontFace, glyphs: Record[String, PartialRaphaelFontGlyph], w: Double): RaphaelFont = {
    val __obj = js.Dynamic.literal(face = face.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelFont]
  }
  
  extension [Self <: RaphaelFont](x: Self) {
    
    inline def setFace(value: PartialRaphaelFontFace): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    inline def setGlyphs(value: Record[String, PartialRaphaelFontGlyph]): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
