package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'saveRemoteData'> */
trait PickImplsaveRemoteData extends StObject {
  
  var saveRemoteData: Boolean
}
object PickImplsaveRemoteData {
  
  @scala.inline
  def apply(saveRemoteData: Boolean): PickImplsaveRemoteData = {
    val __obj = js.Dynamic.literal(saveRemoteData = saveRemoteData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsaveRemoteData]
  }
  
  @scala.inline
  implicit class PickImplsaveRemoteDataMutableBuilder[Self <: PickImplsaveRemoteData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSaveRemoteData(value: Boolean): Self = StObject.set(x, "saveRemoteData", value.asInstanceOf[js.Any])
  }
}
