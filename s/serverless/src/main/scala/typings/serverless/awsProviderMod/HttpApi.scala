package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpApi extends StObject {
  
  var authorizers: js.UndefOr[Authorizers] = js.undefined
  
  var cors: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var payload: js.UndefOr[String] = js.undefined
}
object HttpApi {
  
  @scala.inline
  def apply(): HttpApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpApi]
  }
  
  @scala.inline
  implicit class HttpApiMutableBuilder[Self <: HttpApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizers(value: Authorizers): Self = StObject.set(x, "authorizers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizersUndefined: Self = StObject.set(x, "authorizers", js.undefined)
    
    @scala.inline
    def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
