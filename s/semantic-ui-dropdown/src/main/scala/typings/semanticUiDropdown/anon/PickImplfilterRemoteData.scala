package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'filterRemoteData'> */
trait PickImplfilterRemoteData extends StObject {
  
  var filterRemoteData: Boolean
}
object PickImplfilterRemoteData {
  
  inline def apply(filterRemoteData: Boolean): PickImplfilterRemoteData = {
    val __obj = js.Dynamic.literal(filterRemoteData = filterRemoteData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfilterRemoteData]
  }
  
  extension [Self <: PickImplfilterRemoteData](x: Self) {
    
    inline def setFilterRemoteData(value: Boolean): Self = StObject.set(x, "filterRemoteData", value.asInstanceOf[js.Any])
  }
}
