package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.anon.Data
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSFontData
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImageData
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSJSONOriginalDataReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRef
  extends StObject
     with AnyObject {
  
  var _class: MSJSONOriginalDataReference
  
  var _ref: String
  
  var _ref_class: MSImageData | MSFontData
  
  var data: Data
  
  var sha1: Data
}
object DataRef {
  
  inline def apply(_ref: String, _ref_class: MSImageData | MSFontData, data: Data, sha1: Data): DataRef = {
    val __obj = js.Dynamic.literal(_class = "MSJSONOriginalDataReference", _ref = _ref.asInstanceOf[js.Any], _ref_class = _ref_class.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataRef] (val x: Self) extends AnyVal {
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setSha1(value: Data): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def set_class(value: MSJSONOriginalDataReference): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
    
    inline def set_ref(value: String): Self = StObject.set(x, "_ref", value.asInstanceOf[js.Any])
    
    inline def set_ref_class(value: MSImageData | MSFontData): Self = StObject.set(x, "_ref_class", value.asInstanceOf[js.Any])
  }
}
