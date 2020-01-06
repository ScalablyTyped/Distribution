package typings.atPulumiAws.sesDomainIdentityMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainIdentityState extends js.Object {
  /**
    * The ARN of the domain identity.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The domain name to assign to SES
    */
  val domain: js.UndefOr[Input[String]] = js.native
  /**
    * A code which when added to the domain as a TXT record
    * will signal to SES that the owner of the domain has authorised SES to act on
    * their behalf. The domain identity will be in state "verification pending"
    * until this is done. See below for an example of how this might be achieved
    * when the domain is hosted in Route 53 and managed by this provider.  Find out
    * more about verifying domains in Amazon SES in the [AWS SES
    * docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html).
    */
  val verificationToken: js.UndefOr[Input[String]] = js.native
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

