package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIntegrationResponse extends StObject {
  
  /**
    * integration object that was deleted
    * @type {Integration}
    * @memberof DeleteIntegrationResponse
    */
  var data: js.UndefOr[Integration] = js.undefined
}
object DeleteIntegrationResponse {
  
  inline def apply(): DeleteIntegrationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIntegrationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteIntegrationResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Integration): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
