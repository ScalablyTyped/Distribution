package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, 'remoteValues'> */
trait PickImplremoteValues extends StObject {
  
  var remoteValues: String
}
object PickImplremoteValues {
  
  inline def apply(remoteValues: String): PickImplremoteValues = {
    val __obj = js.Dynamic.literal(remoteValues = remoteValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplremoteValues]
  }
  
  extension [Self <: PickImplremoteValues](x: Self) {
    
    inline def setRemoteValues(value: String): Self = StObject.set(x, "remoteValues", value.asInstanceOf[js.Any])
  }
}
