package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApiKeyRequest extends StObject {
  
  /**
    * descriptive label
    * @type {string}
    * @memberof CreateApiKeyRequest
    */
  var name: String
}
object CreateApiKeyRequest {
  
  inline def apply(name: String): CreateApiKeyRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiKeyRequest]
  }
  
  extension [Self <: CreateApiKeyRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
