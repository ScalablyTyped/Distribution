package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'deleteKey'> */
@js.native
trait PickImpldeleteKey extends StObject {
  
  var deleteKey: Double = js.native
}
object PickImpldeleteKey {
  
  @scala.inline
  def apply(deleteKey: Double): PickImpldeleteKey = {
    val __obj = js.Dynamic.literal(deleteKey = deleteKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldeleteKey]
  }
  
  @scala.inline
  implicit class PickImpldeleteKeyMutableBuilder[Self <: PickImpldeleteKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteKey(value: Double): Self = StObject.set(x, "deleteKey", value.asInstanceOf[js.Any])
  }
}
