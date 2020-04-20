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
}

