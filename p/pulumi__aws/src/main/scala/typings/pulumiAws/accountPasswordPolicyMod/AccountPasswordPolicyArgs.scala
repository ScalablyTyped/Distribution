package typings.pulumiAws.accountPasswordPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPasswordPolicyArgs extends js.Object {
  
  /**
    * Whether to allow users to change their own password
    */
  val allowUsersToChangePassword: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Whether users are prevented from setting a new password after their password has expired (i.e. require administrator reset)
    */
  val hardExpiry: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The number of days that an user password is valid.
    */
  val maxPasswordAge: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Minimum length to require for user passwords.
    */
  val minimumPasswordLength: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of previous passwords that users are prevented from reusing.
    */
  val passwordReusePrevention: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Whether to require lowercase characters for user passwords.
    */
  val requireLowercaseCharacters: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Whether to require numbers for user passwords.
    */
  val requireNumbers: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Whether to require symbols for user passwords.
    */
  val requireSymbols: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Whether to require uppercase characters for user passwords.
    */
  val requireUppercaseCharacters: js.UndefOr[Input[Boolean]] = js.native
}
object AccountPasswordPolicyArgs {
  
  @scala.inline
  def apply(): AccountPasswordPolicyArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordPolicyArgs]
  }
  
  @scala.inline
  implicit class AccountPasswordPolicyArgsOps[Self <: AccountPasswordPolicyArgs] (val x: Self) extends AnyVal {
    
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
    def setAllowUsersToChangePassword(value: Input[Boolean]): Self = this.set("allowUsersToChangePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUsersToChangePassword: Self = this.set("allowUsersToChangePassword", js.undefined)
    
    @scala.inline
    def setHardExpiry(value: Input[Boolean]): Self = this.set("hardExpiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardExpiry: Self = this.set("hardExpiry", js.undefined)
    
    @scala.inline
    def setMaxPasswordAge(value: Input[Double]): Self = this.set("maxPasswordAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPasswordAge: Self = this.set("maxPasswordAge", js.undefined)
    
    @scala.inline
    def setMinimumPasswordLength(value: Input[Double]): Self = this.set("minimumPasswordLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumPasswordLength: Self = this.set("minimumPasswordLength", js.undefined)
    
    @scala.inline
    def setPasswordReusePrevention(value: Input[Double]): Self = this.set("passwordReusePrevention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordReusePrevention: Self = this.set("passwordReusePrevention", js.undefined)
    
    @scala.inline
    def setRequireLowercaseCharacters(value: Input[Boolean]): Self = this.set("requireLowercaseCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireLowercaseCharacters: Self = this.set("requireLowercaseCharacters", js.undefined)
    
    @scala.inline
    def setRequireNumbers(value: Input[Boolean]): Self = this.set("requireNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireNumbers: Self = this.set("requireNumbers", js.undefined)
    
    @scala.inline
    def setRequireSymbols(value: Input[Boolean]): Self = this.set("requireSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireSymbols: Self = this.set("requireSymbols", js.undefined)
    
    @scala.inline
    def setRequireUppercaseCharacters(value: Input[Boolean]): Self = this.set("requireUppercaseCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireUppercaseCharacters: Self = this.set("requireUppercaseCharacters", js.undefined)
  }
}
