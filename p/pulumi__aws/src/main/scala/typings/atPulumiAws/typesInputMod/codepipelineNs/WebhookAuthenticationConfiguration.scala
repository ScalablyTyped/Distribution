package typings.atPulumiAws.typesInputMod.codepipelineNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookAuthenticationConfiguration extends js.Object {
  var allowedIpRange: js.UndefOr[Input[String]] = js.undefined
  var secretToken: js.UndefOr[Input[String]] = js.undefined
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

