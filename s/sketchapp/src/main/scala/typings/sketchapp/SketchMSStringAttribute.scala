package typings.sketchapp

import typings.sketchapp.sketchappStrings.stringAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSStringAttribute extends StObject {
  
  var _class: stringAttribute
  
  var attributes: SketchMSAttributes
}
object SketchMSStringAttribute {
  
  inline def apply(attributes: SketchMSAttributes): SketchMSStringAttribute = {
    val __obj = js.Dynamic.literal(_class = "stringAttribute", attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStringAttribute]
  }
  
  extension [Self <: SketchMSStringAttribute](x: Self) {
    
    inline def setAttributes(value: SketchMSAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def set_class(value: stringAttribute): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
