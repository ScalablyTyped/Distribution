package typings.sketchHqSketchFileFormatTs.typesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.attributedString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributedString
  extends StObject
     with AnyObject {
  
  var _class: attributedString
  
  var attributes: js.Array[StringAttribute]
  
  var string: String
}
object AttributedString {
  
  inline def apply(attributes: js.Array[StringAttribute], string: String): AttributedString = {
    val __obj = js.Dynamic.literal(_class = "attributedString", attributes = attributes.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributedString]
  }
  
  extension [Self <: AttributedString](x: Self) {
    
    inline def setAttributes(value: js.Array[StringAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: StringAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def set_class(value: attributedString): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
