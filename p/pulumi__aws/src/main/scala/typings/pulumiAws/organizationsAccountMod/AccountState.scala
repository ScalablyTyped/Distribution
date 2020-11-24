package typings.pulumiAws.organizationsAccountMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountState extends js.Object {
  
  /**
    * The ARN for this account.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account.
    */
  val email: js.UndefOr[Input[String]] = js.native
  
  /**
    * If set to `ALLOW`, the new account enables IAM users to access account billing information if they have the required permissions. If set to `DENY`, then only the root user of the new account can access account billing information.
    */
  val iamUserAccessToBilling: js.UndefOr[Input[String]] = js.native
  
  val joinedMethod: js.UndefOr[Input[String]] = js.native
  
  val joinedTimestamp: js.UndefOr[Input[String]] = js.native
  
  /**
    * A friendly name for the member account.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Parent Organizational Unit ID or Root ID for the account. Defaults to the Organization default Root ID. A configuration must be present for this argument to perform drift detection.
    */
  val parentId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of an IAM role that Organizations automatically preconfigures in the new member account. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account. The Organizations API provides no method for reading this information after account creation, so this provider cannot perform drift detection on its value and will always show a difference for a configured value after import unless [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) is used.
    */
  val roleName: js.UndefOr[Input[String]] = js.native
  
  val status: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object AccountState {
  
  @scala.inline
  def apply(): AccountState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountState]
  }
  
  @scala.inline
  implicit class AccountStateOps[Self <: AccountState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setEmail(value: Input[String]): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setIamUserAccessToBilling(value: Input[String]): Self = this.set("iamUserAccessToBilling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamUserAccessToBilling: Self = this.set("iamUserAccessToBilling", js.undefined)
    
    @scala.inline
    def setJoinedMethod(value: Input[String]): Self = this.set("joinedMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinedMethod: Self = this.set("joinedMethod", js.undefined)
    
    @scala.inline
    def setJoinedTimestamp(value: Input[String]): Self = this.set("joinedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinedTimestamp: Self = this.set("joinedTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentId(value: Input[String]): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    
    @scala.inline
    def setRoleName(value: Input[String]): Self = this.set("roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleName: Self = this.set("roleName", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
