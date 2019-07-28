package typings.atPulumiAws.sesDomainIdentityMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainIdentityState extends js.Object {
  /**
    * The ARN of the domain identity.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The domain name to assign to SES
    */
  val domain: js.UndefOr[Input[String]] = js.undefined
  val verificationToken: js.UndefOr[Input[String]] = js.undefined
}

object DomainIdentityState {
  @scala.inline
  def apply(arn: Input[String] = null, domain: Input[String] = null, verificationToken: Input[String] = null): DomainIdentityState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (verificationToken != null) __obj.updateDynamic("verificationToken")(verificationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainIdentityState]
  }
}

