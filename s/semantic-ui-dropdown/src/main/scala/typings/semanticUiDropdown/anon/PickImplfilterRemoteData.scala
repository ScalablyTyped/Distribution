package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'filterRemoteData'> */
@js.native
trait PickImplfilterRemoteData extends StObject {
  
  var filterRemoteData: Boolean = js.native
}
object PickImplfilterRemoteData {
  
  @scala.inline
  def apply(filterRemoteData: Boolean): PickImplfilterRemoteData = {
    val __obj = js.Dynamic.literal(filterRemoteData = filterRemoteData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfilterRemoteData]
  }
  
  @scala.inline
  implicit class PickImplfilterRemoteDataMutableBuilder[Self <: PickImplfilterRemoteData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterRemoteData(value: Boolean): Self = StObject.set(x, "filterRemoteData", value.asInstanceOf[js.Any])
  }
}
