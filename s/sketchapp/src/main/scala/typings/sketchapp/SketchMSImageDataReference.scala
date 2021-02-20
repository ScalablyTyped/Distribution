package typings.sketchapp

import typings.sketchapp.anon.Data
import typings.sketchapp.sketchappStrings.imageData
import typings.sketchapp.sketchappStrings.jSONOriginalDataReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSImageDataReference extends StObject {
  
  var _class: jSONOriginalDataReference = js.native
  
  var _ref: String = js.native
  
  var _ref_class: imageData = js.native
  
  var data: Data = js.native
  
  var sha1: Data = js.native
}
object SketchMSImageDataReference {
  
  @scala.inline
  def apply(_class: jSONOriginalDataReference, _ref: String, _ref_class: imageData, data: Data, sha1: Data): SketchMSImageDataReference = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], _ref = _ref.asInstanceOf[js.Any], _ref_class = _ref_class.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSImageDataReference]
  }
  
  @scala.inline
  implicit class SketchMSImageDataReferenceMutableBuilder[Self <: SketchMSImageDataReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1(value: Data): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: jSONOriginalDataReference): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ref(value: String): Self = StObject.set(x, "_ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ref_class(value: imageData): Self = StObject.set(x, "_ref_class", value.asInstanceOf[js.Any])
  }
}
