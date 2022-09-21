package typings.sketchHqSketchFileFormatTs.typesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImageData
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImmutablePage
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSJSONFileReference
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileRef
  extends StObject
     with AnyObject {
  
  var _class: MSJSONFileReference
  
  var _ref: String
  
  var _ref_class: MSImageData | MSImmutablePage | MSPatch
}
object FileRef {
  
  inline def apply(_ref: String, _ref_class: MSImageData | MSImmutablePage | MSPatch): FileRef = {
    val __obj = js.Dynamic.literal(_class = "MSJSONFileReference", _ref = _ref.asInstanceOf[js.Any], _ref_class = _ref_class.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileRef]
  }
  
  extension [Self <: FileRef](x: Self) {
    
    inline def set_class(value: MSJSONFileReference): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
    
    inline def set_ref(value: String): Self = StObject.set(x, "_ref", value.asInstanceOf[js.Any])
    
    inline def set_ref_class(value: MSImageData | MSImmutablePage | MSPatch): Self = StObject.set(x, "_ref_class", value.asInstanceOf[js.Any])
  }
}
