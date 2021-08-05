package typings.sketchapp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSAttributes extends StObject {
  
  var MSAttributedStringColorAttribute: SketchMSColor
  
  var MSAttributedStringFontAttribute: SketchMSFontAttribute
  
  var kerning: Double
  
  var paragraphStyle: SketchMSParagraphStyle
}
object SketchMSAttributes {
  
  inline def apply(
    MSAttributedStringColorAttribute: SketchMSColor,
    MSAttributedStringFontAttribute: SketchMSFontAttribute,
    kerning: Double,
    paragraphStyle: SketchMSParagraphStyle
  ): SketchMSAttributes = {
    val __obj = js.Dynamic.literal(MSAttributedStringColorAttribute = MSAttributedStringColorAttribute.asInstanceOf[js.Any], MSAttributedStringFontAttribute = MSAttributedStringFontAttribute.asInstanceOf[js.Any], kerning = kerning.asInstanceOf[js.Any], paragraphStyle = paragraphStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSAttributes]
  }
  
  extension [Self <: SketchMSAttributes](x: Self) {
    
    inline def setKerning(value: Double): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    inline def setMSAttributedStringColorAttribute(value: SketchMSColor): Self = StObject.set(x, "MSAttributedStringColorAttribute", value.asInstanceOf[js.Any])
    
    inline def setMSAttributedStringFontAttribute(value: SketchMSFontAttribute): Self = StObject.set(x, "MSAttributedStringFontAttribute", value.asInstanceOf[js.Any])
    
    inline def setParagraphStyle(value: SketchMSParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
  }
}
