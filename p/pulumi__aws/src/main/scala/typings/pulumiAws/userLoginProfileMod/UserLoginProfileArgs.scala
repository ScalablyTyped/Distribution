package typings.pulumiAws.userLoginProfileMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserLoginProfileArgs extends js.Object {
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
  val pgpKey: Input[String] = js.native
  /**
    * The IAM user's name.
    */
  val user: Input[String] = js.native
}

object UserLoginProfileArgs {
  @scala.inline
  def apply(pgpKey: Input[String], user: Input[String]): UserLoginProfileArgs = {
    val __obj = js.Dynamic.literal(pgpKey = pgpKey.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserLoginProfileArgs]
  }
  @scala.inline
  implicit class UserLoginProfileArgsOps[Self <: UserLoginProfileArgs] (val x: Self) extends AnyVal {
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
    def setPgpKey(value: Input[String]): Self = this.set("pgpKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: Input[String]): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasswordLength(value: Input[Double]): Self = this.set("passwordLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordLength: Self = this.set("passwordLength", js.undefined)
    @scala.inline
    def setPasswordResetRequired(value: Input[Boolean]): Self = this.set("passwordResetRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordResetRequired: Self = this.set("passwordResetRequired", js.undefined)
  }
  
}

