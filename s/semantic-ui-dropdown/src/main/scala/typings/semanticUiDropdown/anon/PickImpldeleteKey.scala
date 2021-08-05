package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'deleteKey'> */
trait PickImpldeleteKey extends StObject {
  
  var deleteKey: Double
}
object PickImpldeleteKey {
  
  inline def apply(deleteKey: Double): PickImpldeleteKey = {
    val __obj = js.Dynamic.literal(deleteKey = deleteKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldeleteKey]
  }
  
  extension [Self <: PickImpldeleteKey](x: Self) {
    
    inline def setDeleteKey(value: Double): Self = StObject.set(x, "deleteKey", value.asInstanceOf[js.Any])
  }
}
