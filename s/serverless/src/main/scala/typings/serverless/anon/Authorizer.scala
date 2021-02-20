package typings.serverless.anon

import typings.serverless.validateMod.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authorizer extends StObject {
  
  var authorizer: js.UndefOr[js.Any] = js.native
  
  var cors: js.UndefOr[js.Any] = js.native
  
  var integration: js.UndefOr[String] = js.native
  
  var mehtod: HttpMethod = js.native
  
  var path: String = js.native
}
object Authorizer {
  
  @scala.inline
  def apply(mehtod: HttpMethod, path: String): Authorizer = {
    val __obj = js.Dynamic.literal(mehtod = mehtod.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorizer]
  }
  
  @scala.inline
  implicit class AuthorizerMutableBuilder[Self <: Authorizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizer(value: js.Any): Self = StObject.set(x, "authorizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerUndefined: Self = StObject.set(x, "authorizer", js.undefined)
    
    @scala.inline
    def setCors(value: js.Any): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    @scala.inline
    def setIntegration(value: String): Self = StObject.set(x, "integration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationUndefined: Self = StObject.set(x, "integration", js.undefined)
    
    @scala.inline
    def setMehtod(value: HttpMethod): Self = StObject.set(x, "mehtod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
