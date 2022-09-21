package typings.sketchapp

import typings.sketchapp.anon.Archive
import typings.sketchapp.sketchappStrings.attributedString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSAttributedString extends StObject {
  
  var _class: attributedString
  
  var archivedAttributedString: js.UndefOr[Archive] = js.undefined
  
  var attributes: js.Array[SketchMSStringAttribute]
  
  var string: String
}
object SketchMSAttributedString {
  
  inline def apply(attributes: js.Array[SketchMSStringAttribute], string: String): SketchMSAttributedString = {
    val __obj = js.Dynamic.literal(_class = "attributedString", attributes = attributes.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSAttributedString]
  }
  
  extension [Self <: SketchMSAttributedString](x: Self) {
    
    inline def setArchivedAttributedString(value: Archive): Self = StObject.set(x, "archivedAttributedString", value.asInstanceOf[js.Any])
    
    inline def setArchivedAttributedStringUndefined: Self = StObject.set(x, "archivedAttributedString", js.undefined)
    
    inline def setAttributes(value: js.Array[SketchMSStringAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: SketchMSStringAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def set_class(value: attributedString): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
