package typings.slate.distInterfacesEditorMod

import typings.slate.distInterfacesOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorNormalizeOptions extends StObject {
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var operation: js.UndefOr[Operation] = js.undefined
}
object EditorNormalizeOptions {
  
  inline def apply(): EditorNormalizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorNormalizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorNormalizeOptions] (val x: Self) extends AnyVal {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
