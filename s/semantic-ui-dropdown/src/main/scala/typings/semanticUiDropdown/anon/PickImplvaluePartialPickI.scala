package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.FieldsSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, 'value'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl>> */
trait PickImplvaluePartialPickI
  extends StObject
     with Param {
  
  var name: js.UndefOr[String] = js.undefined
  
  var remoteValues: js.UndefOr[String] = js.undefined
  
  var value: String
  
  var values: js.UndefOr[String] = js.undefined
}
object PickImplvaluePartialPickI {
  
  inline def apply(value: String): PickImplvaluePartialPickI = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvaluePartialPickI]
  }
  
  extension [Self <: PickImplvaluePartialPickI](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRemoteValues(value: String): Self = StObject.set(x, "remoteValues", value.asInstanceOf[js.Any])
    
    inline def setRemoteValuesUndefined: Self = StObject.set(x, "remoteValues", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
