package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.FieldsSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, 'values'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl>> */
trait PickImplvaluesPartialPickName
  extends StObject
     with Param {
  
  var name: js.UndefOr[String] = js.undefined
  
  var remoteValues: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
  
  var values: String
}
object PickImplvaluesPartialPickName {
  
  inline def apply(values: String): PickImplvaluesPartialPickName = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvaluesPartialPickName]
  }
  
  extension [Self <: PickImplvaluesPartialPickName](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRemoteValues(value: String): Self = StObject.set(x, "remoteValues", value.asInstanceOf[js.Any])
    
    inline def setRemoteValuesUndefined: Self = StObject.set(x, "remoteValues", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
