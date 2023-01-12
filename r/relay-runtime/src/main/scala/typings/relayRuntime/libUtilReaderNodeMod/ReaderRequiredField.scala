package typings.relayRuntime.libUtilReaderNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderRequiredField
  extends StObject
     with ReaderSelection {
  
  val action: RequiredFieldAction
  
  // 'RequiredField';
  val field: ReaderField
  
  val kind: String
  
  val path: String
}
object ReaderRequiredField {
  
  inline def apply(action: RequiredFieldAction, field: ReaderField, kind: String, path: String): ReaderRequiredField = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderRequiredField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReaderRequiredField] (val x: Self) extends AnyVal {
    
    inline def setAction(value: RequiredFieldAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setField(value: ReaderField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
