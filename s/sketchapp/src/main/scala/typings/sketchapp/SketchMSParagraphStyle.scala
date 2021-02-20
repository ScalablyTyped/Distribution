package typings.sketchapp

import typings.sketchapp.sketchappStrings.paragraphStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSParagraphStyle extends StObject {
  
  var _class: paragraphStyle = js.native
  
  var alignment: Double = js.native
  
  var allowsDefaultTighteningForTruncation: Double = js.native
}
object SketchMSParagraphStyle {
  
  @scala.inline
  def apply(_class: paragraphStyle, alignment: Double, allowsDefaultTighteningForTruncation: Double): SketchMSParagraphStyle = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], alignment = alignment.asInstanceOf[js.Any], allowsDefaultTighteningForTruncation = allowsDefaultTighteningForTruncation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSParagraphStyle]
  }
  
  @scala.inline
  implicit class SketchMSParagraphStyleMutableBuilder[Self <: SketchMSParagraphStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: Double): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsDefaultTighteningForTruncation(value: Double): Self = StObject.set(x, "allowsDefaultTighteningForTruncation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: paragraphStyle): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
