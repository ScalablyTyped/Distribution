package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApiKeyResponse extends StObject {
  
  /**
    * the API key that was deleted
    * @type {ApiKey}
    * @memberof DeleteApiKeyResponse
    */
  var data: js.UndefOr[ApiKey] = js.undefined
}
object DeleteApiKeyResponse {
  
  inline def apply(): DeleteApiKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteApiKeyResponse]
  }
  
  extension [Self <: DeleteApiKeyResponse](x: Self) {
    
    inline def setData(value: ApiKey): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
