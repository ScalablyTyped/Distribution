package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIntegrationResponse extends StObject {
  
  // integration object that was created
  var data: js.UndefOr[Integration] = js.native
}
object CreateIntegrationResponse {
  
  @scala.inline
  def apply(): CreateIntegrationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIntegrationResponse]
  }
  
  @scala.inline
  implicit class CreateIntegrationResponseMutableBuilder[Self <: CreateIntegrationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Integration): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
