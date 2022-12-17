package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.anon.MSAttributedStringColorAttribute
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.stringAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringAttribute
  extends StObject
     with AnyObject {
  
  var _class: stringAttribute
  
  var attributes: MSAttributedStringColorAttribute
  
  var length: Double
  
  var location: Double
}
object StringAttribute {
  
  inline def apply(attributes: MSAttributedStringColorAttribute, length: Double, location: Double): StringAttribute = {
    val __obj = js.Dynamic.literal(_class = "stringAttribute", attributes = attributes.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringAttribute]
  }
  
  extension [Self <: StringAttribute](x: Self) {
    
    inline def setAttributes(value: MSAttributedStringColorAttribute): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def set_class(value: stringAttribute): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
