package typings.raygun.typesMod

import typings.raygun.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageDetails extends js.Object {
  
  var client: Name = js.native
  
  var correlationId: String | Null = js.native
  
  var environment: Environment = js.native
  
  var error: BuiltError = js.native
  
  var groupingKey: String | Null = js.native
  
  var machineName: String = js.native
  
  var request: RequestDetails = js.native
  
  var tags: js.Array[Tag] = js.native
  
  var user: UserDetails = js.native
  
  var userCustomData: CustomData = js.native
  
  var version: String = js.native
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
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], machineName = machineName.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], userCustomData = userCustomData.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDetails]
  }
  
  @scala.inline
  implicit class MessageDetailsOps[Self <: MessageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClient(value: Name): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: BuiltError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineName(value: String): Self = this.set("machineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestDetails): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: UserDetails): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCustomData(value: CustomData): Self = this.set("userCustomData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationId(value: String): Self = this.set("correlationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationIdNull: Self = this.set("correlationId", null)
    
    @scala.inline
    def setGroupingKey(value: String): Self = this.set("groupingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingKeyNull: Self = this.set("groupingKey", null)
  }
}
