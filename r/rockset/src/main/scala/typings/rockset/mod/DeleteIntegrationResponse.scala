package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIntegrationResponse extends StObject {
  
  // integration object that was deleted
  var data: js.UndefOr[Integration] = js.native
}
object DeleteIntegrationResponse {
  
  @scala.inline
  def apply(): DeleteIntegrationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIntegrationResponse]
  }
  
  @scala.inline
  implicit class DeleteIntegrationResponseMutableBuilder[Self <: DeleteIntegrationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Integration): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
