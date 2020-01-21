package typings.pulumiAws.domainIdentityVerificationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainIdentityVerificationState extends js.Object {
  /**
    * The ARN of the domain identity.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The domain name of the SES domain identity to verify.
    */
  val domain: js.UndefOr[Input[String]] = js.native
}

object DomainIdentityVerificationState {
  @scala.inline
  def apply(arn: Input[String] = null, domain: Input[String] = null): DomainIdentityVerificationState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainIdentityVerificationState]
  }
}

