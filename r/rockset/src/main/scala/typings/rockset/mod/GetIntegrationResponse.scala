package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIntegrationResponse extends StObject {
  
  // integration object
  var data: js.UndefOr[Integration] = js.undefined
}
object GetIntegrationResponse {
  
  @scala.inline
  def apply(): GetIntegrationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIntegrationResponse]
  }
  
  @scala.inline
  implicit class GetIntegrationResponseMutableBuilder[Self <: GetIntegrationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Integration): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
