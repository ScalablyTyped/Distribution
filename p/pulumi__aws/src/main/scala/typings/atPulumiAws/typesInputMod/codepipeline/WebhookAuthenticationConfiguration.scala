package typings.atPulumiAws.typesInputMod.codepipeline

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookAuthenticationConfiguration extends js.Object {
  var allowedIpRange: js.UndefOr[Input[String]] = js.native
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

