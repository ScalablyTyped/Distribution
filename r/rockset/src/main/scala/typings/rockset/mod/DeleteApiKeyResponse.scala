package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApiKeyResponse extends StObject {
  
  // the API key that was deleted
  var data: js.UndefOr[ApiKey] = js.native
}
object DeleteApiKeyResponse {
  
  @scala.inline
  def apply(): DeleteApiKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteApiKeyResponse]
  }
  
  @scala.inline
  implicit class DeleteApiKeyResponseMutableBuilder[Self <: DeleteApiKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ApiKey): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
