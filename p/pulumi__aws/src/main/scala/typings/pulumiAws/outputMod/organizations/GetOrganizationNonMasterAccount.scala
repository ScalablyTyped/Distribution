package typings.pulumiAws.outputMod.organizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOrganizationNonMasterAccount extends js.Object {
  
  /**
    * ARN of the root
    */
  var arn: String = js.native
  
  /**
    * Email of the account
    */
  var email: String = js.native
  
  /**
    * Identifier of the root
    */
  var id: String = js.native
  
  /**
    * The name of the policy type
    */
  var name: String = js.native
  
  /**
    * The status of the policy type as it relates to the associated root
    */
  var status: String = js.native
}
object GetOrganizationNonMasterAccount {
  
  @scala.inline
  def apply(arn: String, email: String, id: String, name: String, status: String): GetOrganizationNonMasterAccount = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationNonMasterAccount]
  }
  
  @scala.inline
  implicit class GetOrganizationNonMasterAccountOps[Self <: GetOrganizationNonMasterAccount] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
