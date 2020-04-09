package typings.pulumiAws.inputMod.codepipeline

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookAuthenticationConfiguration extends js.Object {
  /**
    * A valid CIDR block for `IP` filtering. Required for `IP`.
    */
  var allowedIpRange: js.UndefOr[Input[String]] = js.native
  /**
    * The shared secret for the GitHub repository webhook. Set this as `secret` in your `githubRepositoryWebhook`'s `configuration` block. Required for `GITHUB_HMAC`.
    */
  var secretToken: js.UndefOr[Input[String]] = js.native
}

object WebhookAuthenticationConfiguration {
  @scala.inline
  def apply(allowedIpRange: Input[String] = null, secretToken: Input[String] = null): WebhookAuthenticationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (allowedIpRange != null) __obj.updateDynamic("allowedIpRange")(allowedIpRange.asInstanceOf[js.Any])
    if (secretToken != null) __obj.updateDynamic("secretToken")(secretToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookAuthenticationConfiguration]
  }
}

