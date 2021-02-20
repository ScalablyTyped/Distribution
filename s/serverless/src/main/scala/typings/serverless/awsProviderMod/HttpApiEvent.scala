package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpApiEvent extends StObject {
  
  var authorizer: js.UndefOr[NamedHttpApiEventAuthorizer | IdRefHttpApiEventAuthorizer] = js.native
  
  var method: String = js.native
  
  var path: String = js.native
}
object HttpApiEvent {
  
  @scala.inline
  def apply(method: String, path: String): HttpApiEvent = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpApiEvent]
  }
  
  @scala.inline
  implicit class HttpApiEventMutableBuilder[Self <: HttpApiEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizer(value: NamedHttpApiEventAuthorizer | IdRefHttpApiEventAuthorizer): Self = StObject.set(x, "authorizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerUndefined: Self = StObject.set(x, "authorizer", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
