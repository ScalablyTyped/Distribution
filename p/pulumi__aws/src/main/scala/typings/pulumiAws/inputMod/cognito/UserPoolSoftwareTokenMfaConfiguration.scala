package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolSoftwareTokenMfaConfiguration extends js.Object {
  /**
    * Boolean whether to enable software token Multi-Factor (MFA) tokens, such as Time-based One-Time Password (TOTP). To disable software token MFA when `smsConfiguration` is not present, the `mfaConfiguration` argument must be set to `OFF` and the `softwareTokenMfaConfiguration` configuration block must be fully removed.
    */
  var enabled: Input[Boolean] = js.native
}

object UserPoolSoftwareTokenMfaConfiguration {
  @scala.inline
  def apply(enabled: Input[Boolean]): UserPoolSoftwareTokenMfaConfiguration = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolSoftwareTokenMfaConfiguration]
  }
  @scala.inline
  implicit class UserPoolSoftwareTokenMfaConfigurationOps[Self <: UserPoolSoftwareTokenMfaConfiguration] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
  }
  
}

