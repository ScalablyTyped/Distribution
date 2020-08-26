package typings.pulumiAws.outputMod.codepipeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookAuthenticationConfiguration extends js.Object {
  /**
    * A valid CIDR block for `IP` filtering. Required for `IP`.
    */
  var allowedIpRange: js.UndefOr[String] = js.native
  /**
    * The shared secret for the GitHub repository webhook. Set this as `secret` in your `githubRepositoryWebhook`'s `configuration` block. Required for `GITHUB_HMAC`.
    */
  var secretToken: js.UndefOr[String] = js.native
}

object WebhookAuthenticationConfiguration {
  @scala.inline
  def apply(): WebhookAuthenticationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookAuthenticationConfiguration]
  }
  @scala.inline
  implicit class WebhookAuthenticationConfigurationOps[Self <: WebhookAuthenticationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowedIpRange(value: String): Self = this.set("allowedIpRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedIpRange: Self = this.set("allowedIpRange", js.undefined)
    @scala.inline
    def setSecretToken(value: String): Self = this.set("secretToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretToken: Self = this.set("secretToken", js.undefined)
  }
  
}

