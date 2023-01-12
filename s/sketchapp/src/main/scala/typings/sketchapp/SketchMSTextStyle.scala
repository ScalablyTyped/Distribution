package typings.sketchapp

import typings.sketchapp.sketchappStrings.textStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSTextStyle extends StObject {
  
  var _class: textStyle
  
  var encodedAttributes: SketchMSAttributes
}
object SketchMSTextStyle {
  
  inline def apply(encodedAttributes: SketchMSAttributes): SketchMSTextStyle = {
    val __obj = js.Dynamic.literal(_class = "textStyle", encodedAttributes = encodedAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSTextStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchMSTextStyle] (val x: Self) extends AnyVal {
    
    inline def setEncodedAttributes(value: SketchMSAttributes): Self = StObject.set(x, "encodedAttributes", value.asInstanceOf[js.Any])
    
    inline def set_class(value: textStyle): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
