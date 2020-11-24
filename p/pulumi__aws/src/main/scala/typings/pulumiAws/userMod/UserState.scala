package typings.pulumiAws.userMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserState extends js.Object {
  
  /**
    * The ARN assigned by AWS for this user.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * When destroying this user, destroy even if it
    * has non-provider-managed IAM access keys, login profile or MFA devices. Without `forceDestroy`
    * a user with non-provider-managed access keys and login profile will fail to be destroyed.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The user's name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. User names are not distinguished by case. For example, you cannot create users named both "TESTUSER" and "testuser".
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Path in which to create the user.
    */
  val path: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the policy that is used to set the permissions boundary for the user.
    */
  val permissionsBoundary: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value mapping of tags for the IAM user
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The [unique ID][1] assigned by AWS.
    */
  val uniqueId: js.UndefOr[Input[String]] = js.native
}
object UserState {
  
  @scala.inline
  def apply(): UserState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserState]
  }
  
  @scala.inline
  implicit class UserStateOps[Self <: UserState] (val x: Self) extends AnyVal {
    
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
    def setForceDestroy(value: Input[Boolean]): Self = this.set("forceDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceDestroy: Self = this.set("forceDestroy", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPermissionsBoundary(value: Input[String]): Self = this.set("permissionsBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionsBoundary: Self = this.set("permissionsBoundary", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUniqueId(value: Input[String]): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueId: Self = this.set("uniqueId", js.undefined)
  }
}
