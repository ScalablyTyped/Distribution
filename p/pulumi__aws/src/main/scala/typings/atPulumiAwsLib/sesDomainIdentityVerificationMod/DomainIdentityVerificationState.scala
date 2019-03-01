package typings
package atPulumiAwsLib.sesDomainIdentityVerificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainIdentityVerificationState extends js.Object {
  /**
    * The ARN of the domain identity.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The domain name of the SES domain identity to verify.
    */
  val domain: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object DomainIdentityVerificationState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    domain: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): DomainIdentityVerificationState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainIdentityVerificationState]
  }
}

