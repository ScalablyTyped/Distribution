package typings.atPulumiAws.typesOutputMod.codepipeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookAuthenticationConfiguration extends js.Object {
  var allowedIpRange: js.UndefOr[String] = js.native
  var secretToken: js.UndefOr[String] = js.native
}

object WebhookAuthenticationConfiguration {
  @scala.inline
  def apply(allowedIpRange: String = null, secretToken: String = null): WebhookAuthenticationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (allowedIpRange != null) __obj.updateDynamic("allowedIpRange")(allowedIpRange.asInstanceOf[js.Any])
    if (secretToken != null) __obj.updateDynamic("secretToken")(secretToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookAuthenticationConfiguration]
  }
}

