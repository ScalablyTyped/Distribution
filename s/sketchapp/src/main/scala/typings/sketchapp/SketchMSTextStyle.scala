package typings.sketchapp

import typings.sketchapp.sketchappStrings.textStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSTextStyle extends StObject {
  
  var _class: textStyle = js.native
  
  var encodedAttributes: SketchMSAttributes = js.native
}
object SketchMSTextStyle {
  
  @scala.inline
  def apply(_class: textStyle, encodedAttributes: SketchMSAttributes): SketchMSTextStyle = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], encodedAttributes = encodedAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSTextStyle]
  }
  
  @scala.inline
  implicit class SketchMSTextStyleMutableBuilder[Self <: SketchMSTextStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncodedAttributes(value: SketchMSAttributes): Self = StObject.set(x, "encodedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: textStyle): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
