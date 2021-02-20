package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, 'remoteValues'> */
@js.native
trait PickImplremoteValues extends StObject {
  
  var remoteValues: String = js.native
}
object PickImplremoteValues {
  
  @scala.inline
  def apply(remoteValues: String): PickImplremoteValues = {
    val __obj = js.Dynamic.literal(remoteValues = remoteValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplremoteValues]
  }
  
  @scala.inline
  implicit class PickImplremoteValuesMutableBuilder[Self <: PickImplremoteValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoteValues(value: String): Self = StObject.set(x, "remoteValues", value.asInstanceOf[js.Any])
  }
}
