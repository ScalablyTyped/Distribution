package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.FieldsSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, 'remoteValues'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl>> */
trait PickImplremoteValuesParti
  extends StObject
     with Param {
  
  var name: js.UndefOr[String] = js.undefined
  
  var remoteValues: String
  
  var value: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[String] = js.undefined
}
object PickImplremoteValuesParti {
  
  inline def apply(remoteValues: String): PickImplremoteValuesParti = {
    val __obj = js.Dynamic.literal(remoteValues = remoteValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplremoteValuesParti]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplremoteValuesParti] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRemoteValues(value: String): Self = StObject.set(x, "remoteValues", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
