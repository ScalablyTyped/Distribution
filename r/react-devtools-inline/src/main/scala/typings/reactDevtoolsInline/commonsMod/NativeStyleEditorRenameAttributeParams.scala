package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeStyleEditorRenameAttributeParams
  extends StObject
     with ElementAndRendererID {
  
  var newName: String
  
  var oldName: String
  
  var value: String
}
object NativeStyleEditorRenameAttributeParams {
  
  inline def apply(id: Double, newName: String, oldName: String, rendererID: RendererID, value: String): NativeStyleEditorRenameAttributeParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any], rendererID = rendererID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeStyleEditorRenameAttributeParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeStyleEditorRenameAttributeParams] (val x: Self) extends AnyVal {
    
    inline def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
    
    inline def setOldName(value: String): Self = StObject.set(x, "oldName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
