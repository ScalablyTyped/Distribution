package typings
package atPulumiAwsLib.sesMailFromMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailFromState extends js.Object {
  /**
    * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
    */
  val behaviorOnMxFailure: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Verified domain name to generate DKIM tokens for.
    */
  val domain: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
    */
  val mailFromDomain: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object MailFromState {
  @scala.inline
  def apply(
    behaviorOnMxFailure: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    domain: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    mailFromDomain: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): MailFromState = {
    val __obj = js.Dynamic.literal()
    if (behaviorOnMxFailure != null) __obj.updateDynamic("behaviorOnMxFailure")(behaviorOnMxFailure.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (mailFromDomain != null) __obj.updateDynamic("mailFromDomain")(mailFromDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailFromState]
  }
}

