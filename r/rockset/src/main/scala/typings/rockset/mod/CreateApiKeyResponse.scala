package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApiKeyResponse extends StObject {
  
  // the API key that was created
  var data: js.UndefOr[ApiKey] = js.undefined
}
object CreateApiKeyResponse {
  
  @scala.inline
  def apply(): CreateApiKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApiKeyResponse]
  }
  
  @scala.inline
  implicit class CreateApiKeyResponseMutableBuilder[Self <: CreateApiKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ApiKey): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
