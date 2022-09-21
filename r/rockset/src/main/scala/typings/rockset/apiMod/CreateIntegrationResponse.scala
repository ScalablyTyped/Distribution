package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIntegrationResponse extends StObject {
  
  /**
    * integration object that was created
    * @type {Integration}
    * @memberof CreateIntegrationResponse
    */
  var data: js.UndefOr[Integration] = js.undefined
}
object CreateIntegrationResponse {
  
  inline def apply(): CreateIntegrationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIntegrationResponse]
  }
  
  extension [Self <: CreateIntegrationResponse](x: Self) {
    
    inline def setData(value: Integration): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
