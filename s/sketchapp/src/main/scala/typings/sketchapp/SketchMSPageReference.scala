package typings.sketchapp

import typings.sketchapp.sketchappStrings.MSImmutablePage
import typings.sketchapp.sketchappStrings.MSJSONFileReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSPageReference extends StObject {
  
  var _class: MSJSONFileReference
  
  var _ref: String
  
  var _ref_class: MSImmutablePage
}
object SketchMSPageReference {
  
  inline def apply(_ref: String): SketchMSPageReference = {
    val __obj = js.Dynamic.literal(_class = "MSJSONFileReference", _ref = _ref.asInstanceOf[js.Any], _ref_class = "MSImmutablePage")
    __obj.asInstanceOf[SketchMSPageReference]
  }
  
  extension [Self <: SketchMSPageReference](x: Self) {
    
    inline def set_class(value: MSJSONFileReference): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
    
    inline def set_ref(value: String): Self = StObject.set(x, "_ref", value.asInstanceOf[js.Any])
    
    inline def set_ref_class(value: MSImmutablePage): Self = StObject.set(x, "_ref_class", value.asInstanceOf[js.Any])
  }
}
