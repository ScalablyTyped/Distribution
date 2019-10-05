package typings.atPulumiAws.typesOutputMod.codepipeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookAuthenticationConfiguration extends js.Object {
  var allowedIpRange: js.UndefOr[String] = js.undefined
  var secretToken: js.UndefOr[String] = js.undefined
}

object WebhookAuthenticationConfiguration {
  @scala.inline
  def apply(allowedIpRange: String = null, secretToken: String = null): WebhookAuthenticationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (allowedIpRange != null) __obj.updateDynamic("allowedIpRange")(allowedIpRange)
    if (secretToken != null) __obj.updateDynamic("secretToken")(secretToken)
    __obj.asInstanceOf[WebhookAuthenticationConfiguration]
  }
}

