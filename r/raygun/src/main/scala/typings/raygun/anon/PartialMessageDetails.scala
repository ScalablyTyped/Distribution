package typings.raygun.anon

import typings.raygun.typesMod.BuiltError
import typings.raygun.typesMod.CustomData
import typings.raygun.typesMod.Environment
import typings.raygun.typesMod.RequestDetails
import typings.raygun.typesMod.Tag
import typings.raygun.typesMod.UserDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<raygun.raygun/build/types.MessageDetails> */
@js.native
trait PartialMessageDetails extends js.Object {
  
  var client: js.UndefOr[Name] = js.native
  
  var correlationId: js.UndefOr[String | Null] = js.native
  
  var environment: js.UndefOr[Environment] = js.native
  
  var error: js.UndefOr[BuiltError] = js.native
  
  var groupingKey: js.UndefOr[String | Null] = js.native
  
  var machineName: js.UndefOr[String] = js.native
  
  var request: js.UndefOr[RequestDetails] = js.native
  
  var tags: js.UndefOr[js.Array[Tag]] = js.native
  
  var user: js.UndefOr[UserDetails] = js.native
  
  var userCustomData: js.UndefOr[CustomData] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object PartialMessageDetails {
  
  @scala.inline
  def apply(): PartialMessageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessageDetails]
  }
  
  @scala.inline
  implicit class PartialMessageDetailsOps[Self <: PartialMessageDetails] (val x: Self) extends AnyVal {
    
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
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setCorrelationId(value: String): Self = this.set("correlationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrelationId: Self = this.set("correlationId", js.undefined)
    
    @scala.inline
    def setCorrelationIdNull: Self = this.set("correlationId", null)
    
    @scala.inline
    def setEnvironment(value: Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setError(value: BuiltError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setGroupingKey(value: String): Self = this.set("groupingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupingKey: Self = this.set("groupingKey", js.undefined)
    
    @scala.inline
    def setGroupingKeyNull: Self = this.set("groupingKey", null)
    
    @scala.inline
    def setMachineName(value: String): Self = this.set("machineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineName: Self = this.set("machineName", js.undefined)
    
    @scala.inline
    def setRequest(value: RequestDetails): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUser(value: UserDetails): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setUserCustomData(value: CustomData): Self = this.set("userCustomData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserCustomData: Self = this.set("userCustomData", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
