package typings.raygun.typesMod

import typings.raygun.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageDetails extends StObject {
  
  var client: Name
  
  var correlationId: String | Null
  
  var environment: Environment
  
  var error: BuiltError
  
  var groupingKey: String | Null
  
  var machineName: String
  
  var request: RequestDetails
  
  var tags: js.Array[Tag]
  
  var user: UserDetails
  
  var userCustomData: CustomData
  
  var version: String
}
object MessageDetails {
  
  @scala.inline
  def apply(
    client: Name,
    environment: Environment,
    error: BuiltError,
    machineName: String,
    request: RequestDetails,
    tags: js.Array[Tag],
    user: UserDetails,
    userCustomData: CustomData,
    version: String
  ): MessageDetails = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], machineName = machineName.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], userCustomData = userCustomData.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], correlationId = null, groupingKey = null)
    __obj.asInstanceOf[MessageDetails]
  }
  
  @scala.inline
  implicit class MessageDetailsMutableBuilder[Self <: MessageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: Name): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationIdNull: Self = StObject.set(x, "correlationId", null)
    
    @scala.inline
    def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: BuiltError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingKey(value: String): Self = StObject.set(x, "groupingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingKeyNull: Self = StObject.set(x, "groupingKey", null)
    
    @scala.inline
    def setMachineName(value: String): Self = StObject.set(x, "machineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestDetails): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: UserDetails): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCustomData(value: CustomData): Self = StObject.set(x, "userCustomData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
