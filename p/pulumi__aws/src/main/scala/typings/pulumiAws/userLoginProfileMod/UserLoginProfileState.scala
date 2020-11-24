package typings.pulumiAws.userLoginProfileMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserLoginProfileState extends js.Object {
  
  /**
    * The encrypted password, base64 encoded. Only available if password was handled on this provider resource creation, not import.
    */
  val encryptedPassword: js.UndefOr[Input[String]] = js.native
  
  /**
    * The fingerprint of the PGP key used to encrypt the password. Only available if password was handled on this provider resource creation, not import.
    */
  val keyFingerprint: js.UndefOr[Input[String]] = js.native
  
  /**
    * The length of the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val passwordLength: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Whether the user should be forced to reset the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val passwordResetRequired: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:username`. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val pgpKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IAM user's name.
    */
  val user: js.UndefOr[Input[String]] = js.native
}
object UserLoginProfileState {
  
  @scala.inline
  def apply(): UserLoginProfileState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserLoginProfileState]
  }
  
  @scala.inline
  implicit class UserLoginProfileStateOps[Self <: UserLoginProfileState] (val x: Self) extends AnyVal {
    
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
    def setEncryptedPassword(value: Input[String]): Self = this.set("encryptedPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptedPassword: Self = this.set("encryptedPassword", js.undefined)
    
    @scala.inline
    def setKeyFingerprint(value: Input[String]): Self = this.set("keyFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyFingerprint: Self = this.set("keyFingerprint", js.undefined)
    
    @scala.inline
    def setPasswordLength(value: Input[Double]): Self = this.set("passwordLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordLength: Self = this.set("passwordLength", js.undefined)
    
    @scala.inline
    def setPasswordResetRequired(value: Input[Boolean]): Self = this.set("passwordResetRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordResetRequired: Self = this.set("passwordResetRequired", js.undefined)
    
    @scala.inline
    def setPgpKey(value: Input[String]): Self = this.set("pgpKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePgpKey: Self = this.set("pgpKey", js.undefined)
    
    @scala.inline
    def setUser(value: Input[String]): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
