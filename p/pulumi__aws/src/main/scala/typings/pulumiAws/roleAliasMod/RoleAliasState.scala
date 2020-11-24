package typings.pulumiAws.roleAliasMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleAliasState extends js.Object {
  
  /**
    * The name of the role alias.
    */
  val alias: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN assigned by AWS to this role alias.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The duration of the credential, in seconds. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 900 seconds (15 minutes) to 3600 seconds (60 minutes).
    */
  val credentialDuration: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The identity of the role to which the alias refers.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
}
object RoleAliasState {
  
  @scala.inline
  def apply(): RoleAliasState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleAliasState]
  }
  
  @scala.inline
  implicit class RoleAliasStateOps[Self <: RoleAliasState] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: Input[String]): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCredentialDuration(value: Input[Double]): Self = this.set("credentialDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentialDuration: Self = this.set("credentialDuration", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
}
