package typings.sketchapp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSAttributes extends StObject {
  
  var MSAttributedStringColorAttribute: SketchMSColor = js.native
  
  var MSAttributedStringFontAttribute: SketchMSFontAttribute = js.native
  
  var kerning: Double = js.native
  
  var paragraphStyle: SketchMSParagraphStyle = js.native
}
object SketchMSAttributes {
  
  @scala.inline
  def apply(
    MSAttributedStringColorAttribute: SketchMSColor,
    MSAttributedStringFontAttribute: SketchMSFontAttribute,
    kerning: Double,
    paragraphStyle: SketchMSParagraphStyle
  ): SketchMSAttributes = {
    val __obj = js.Dynamic.literal(MSAttributedStringColorAttribute = MSAttributedStringColorAttribute.asInstanceOf[js.Any], MSAttributedStringFontAttribute = MSAttributedStringFontAttribute.asInstanceOf[js.Any], kerning = kerning.asInstanceOf[js.Any], paragraphStyle = paragraphStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSAttributes]
  }
  
  @scala.inline
  implicit class SketchMSAttributesMutableBuilder[Self <: SketchMSAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKerning(value: Double): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSAttributedStringColorAttribute(value: SketchMSColor): Self = StObject.set(x, "MSAttributedStringColorAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSAttributedStringFontAttribute(value: SketchMSFontAttribute): Self = StObject.set(x, "MSAttributedStringFontAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphStyle(value: SketchMSParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
  }
}
