package typings.sketchapp

import typings.sketchapp.sketchappStrings.MSImmutablePage
import typings.sketchapp.sketchappStrings.MSJSONFileReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSPageReference extends StObject {
  
  var _class: MSJSONFileReference = js.native
  
  var _ref: String = js.native
  
  var _ref_class: MSImmutablePage = js.native
}
object SketchMSPageReference {
  
  @scala.inline
  def apply(_class: MSJSONFileReference, _ref: String, _ref_class: MSImmutablePage): SketchMSPageReference = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], _ref = _ref.asInstanceOf[js.Any], _ref_class = _ref_class.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSPageReference]
  }
  
  @scala.inline
  implicit class SketchMSPageReferenceMutableBuilder[Self <: SketchMSPageReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_class(value: MSJSONFileReference): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ref(value: String): Self = StObject.set(x, "_ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ref_class(value: MSImmutablePage): Self = StObject.set(x, "_ref_class", value.asInstanceOf[js.Any])
  }
}
