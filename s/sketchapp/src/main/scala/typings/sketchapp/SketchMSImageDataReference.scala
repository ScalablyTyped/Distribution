package typings.sketchapp

import typings.sketchapp.anon.Data
import typings.sketchapp.sketchappStrings.imageData
import typings.sketchapp.sketchappStrings.jSONOriginalDataReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSImageDataReference extends StObject {
  
  var _class: jSONOriginalDataReference
  
  var _ref: String
  
  var _ref_class: imageData
  
  var data: Data
  
  var sha1: Data
}
object SketchMSImageDataReference {
  
  inline def apply(_ref: String, data: Data, sha1: Data): SketchMSImageDataReference = {
    val __obj = js.Dynamic.literal(_class = "jSONOriginalDataReference", _ref = _ref.asInstanceOf[js.Any], _ref_class = "imageData", data = data.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSImageDataReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchMSImageDataReference] (val x: Self) extends AnyVal {
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setSha1(value: Data): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def set_class(value: jSONOriginalDataReference): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
    
    inline def set_ref(value: String): Self = StObject.set(x, "_ref", value.asInstanceOf[js.Any])
    
    inline def set_ref_class(value: imageData): Self = StObject.set(x, "_ref_class", value.asInstanceOf[js.Any])
  }
}
