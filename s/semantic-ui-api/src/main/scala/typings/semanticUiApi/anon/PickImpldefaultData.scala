package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'defaultData'> */
@js.native
trait PickImpldefaultData extends StObject {
  
  var defaultData: Boolean = js.native
}
object PickImpldefaultData {
  
  @scala.inline
  def apply(defaultData: Boolean): PickImpldefaultData = {
    val __obj = js.Dynamic.literal(defaultData = defaultData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldefaultData]
  }
  
  @scala.inline
  implicit class PickImpldefaultDataMutableBuilder[Self <: PickImpldefaultData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultData(value: Boolean): Self = StObject.set(x, "defaultData", value.asInstanceOf[js.Any])
  }
}
