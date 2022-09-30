package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeStyleEditorSetValueParams
  extends StObject
     with ElementAndRendererID {
  
  var name: String
  
  var value: String
}
object NativeStyleEditorSetValueParams {
  
  inline def apply(id: Double, name: String, rendererID: RendererID, value: String): NativeStyleEditorSetValueParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rendererID = rendererID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeStyleEditorSetValueParams]
  }
  
  extension [Self <: NativeStyleEditorSetValueParams](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
