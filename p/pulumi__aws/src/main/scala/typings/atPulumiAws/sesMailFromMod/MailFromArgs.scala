package typings.atPulumiAws.sesMailFromMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailFromArgs extends js.Object {
  /**
    * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
    */
  val behaviorOnMxFailure: js.UndefOr[Input[String]] = js.undefined
  /**
    * Verified domain name to generate DKIM tokens for.
    */
  val domain: Input[String]
  /**
    * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
    */
  val mailFromDomain: Input[String]
}

object MailFromArgs {
  @scala.inline
  def apply(domain: Input[String], mailFromDomain: Input[String], behaviorOnMxFailure: Input[String] = null): MailFromArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], mailFromDomain = mailFromDomain.asInstanceOf[js.Any])
    if (behaviorOnMxFailure != null) __obj.updateDynamic("behaviorOnMxFailure")(behaviorOnMxFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailFromArgs]
  }
}

