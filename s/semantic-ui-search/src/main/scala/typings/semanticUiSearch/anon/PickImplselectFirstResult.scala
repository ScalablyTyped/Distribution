package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'selectFirstResult'> */
trait PickImplselectFirstResult extends StObject {
  
  var selectFirstResult: Boolean
}
object PickImplselectFirstResult {
  
  inline def apply(selectFirstResult: Boolean): PickImplselectFirstResult = {
    val __obj = js.Dynamic.literal(selectFirstResult = selectFirstResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplselectFirstResult]
  }
  
  extension [Self <: PickImplselectFirstResult](x: Self) {
    
    inline def setSelectFirstResult(value: Boolean): Self = StObject.set(x, "selectFirstResult", value.asInstanceOf[js.Any])
  }
}
