package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApiKeyResponse extends StObject {
  
  /**
    * the API key that was created
    * @type {ApiKey}
    * @memberof CreateApiKeyResponse
    */
  var data: js.UndefOr[ApiKey] = js.undefined
}
object CreateApiKeyResponse {
  
  inline def apply(): CreateApiKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApiKeyResponse]
  }
  
  extension [Self <: CreateApiKeyResponse](x: Self) {
    
    inline def setData(value: ApiKey): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
