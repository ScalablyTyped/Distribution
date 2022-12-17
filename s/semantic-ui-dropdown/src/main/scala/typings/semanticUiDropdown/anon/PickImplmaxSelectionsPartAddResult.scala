package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.MessageSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, 'maxSelections'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl>> */
trait PickImplmaxSelectionsPartAddResult
  extends StObject
     with Param {
  
  var addResult: js.UndefOr[String] = js.undefined
  
  var count: js.UndefOr[String] = js.undefined
  
  var maxSelections: String
  
  var noResults: js.UndefOr[String] = js.undefined
}
object PickImplmaxSelectionsPartAddResult {
  
  inline def apply(maxSelections: String): PickImplmaxSelectionsPartAddResult = {
    val __obj = js.Dynamic.literal(maxSelections = maxSelections.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxSelectionsPartAddResult]
  }
  
  extension [Self <: PickImplmaxSelectionsPartAddResult](x: Self) {
    
    inline def setAddResult(value: String): Self = StObject.set(x, "addResult", value.asInstanceOf[js.Any])
    
    inline def setAddResultUndefined: Self = StObject.set(x, "addResult", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setMaxSelections(value: String): Self = StObject.set(x, "maxSelections", value.asInstanceOf[js.Any])
    
    inline def setNoResults(value: String): Self = StObject.set(x, "noResults", value.asInstanceOf[js.Any])
    
    inline def setNoResultsUndefined: Self = StObject.set(x, "noResults", js.undefined)
  }
}
