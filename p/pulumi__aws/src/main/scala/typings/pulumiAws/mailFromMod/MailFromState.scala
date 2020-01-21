package typings.pulumiAws.mailFromMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailFromState extends js.Object {
  /**
    * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
    */
  val behaviorOnMxFailure: js.UndefOr[Input[String]] = js.native
  /**
    * Verified domain name to generate DKIM tokens for.
    */
  val domain: js.UndefOr[Input[String]] = js.native
  /**
    * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
    */
  val mailFromDomain: js.UndefOr[Input[String]] = js.native
}

object MailFromState {
  @scala.inline
  def apply(
    behaviorOnMxFailure: Input[String] = null,
    domain: Input[String] = null,
    mailFromDomain: Input[String] = null
  ): MailFromState = {
    val __obj = js.Dynamic.literal()
    if (behaviorOnMxFailure != null) __obj.updateDynamic("behaviorOnMxFailure")(behaviorOnMxFailure.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (mailFromDomain != null) __obj.updateDynamic("mailFromDomain")(mailFromDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailFromState]
  }
}

