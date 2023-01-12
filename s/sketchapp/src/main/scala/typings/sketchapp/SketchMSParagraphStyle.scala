package typings.sketchapp

import typings.sketchapp.sketchappStrings.paragraphStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSParagraphStyle extends StObject {
  
  var _class: paragraphStyle
  
  var alignment: Double
  
  var allowsDefaultTighteningForTruncation: Double
}
object SketchMSParagraphStyle {
  
  inline def apply(alignment: Double, allowsDefaultTighteningForTruncation: Double): SketchMSParagraphStyle = {
    val __obj = js.Dynamic.literal(_class = "paragraphStyle", alignment = alignment.asInstanceOf[js.Any], allowsDefaultTighteningForTruncation = allowsDefaultTighteningForTruncation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSParagraphStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchMSParagraphStyle] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: Double): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAllowsDefaultTighteningForTruncation(value: Double): Self = StObject.set(x, "allowsDefaultTighteningForTruncation", value.asInstanceOf[js.Any])
    
    inline def set_class(value: paragraphStyle): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
