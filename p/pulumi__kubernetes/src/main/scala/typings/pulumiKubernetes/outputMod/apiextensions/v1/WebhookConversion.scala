package typings.pulumiKubernetes.outputMod.apiextensions.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebhookConversion describes how to call a conversion webhook
  */
@js.native
trait WebhookConversion extends js.Object {
  /**
    * clientConfig is the instructions for how to call the webhook if strategy is `Webhook`.
    */
  var clientConfig: WebhookClientConfig = js.native
  /**
    * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.
    */
  var conversionReviewVersions: js.Array[String] = js.native
}

object WebhookConversion {
  @scala.inline
  def apply(clientConfig: WebhookClientConfig, conversionReviewVersions: js.Array[String]): WebhookConversion = {
    val __obj = js.Dynamic.literal(clientConfig = clientConfig.asInstanceOf[js.Any], conversionReviewVersions = conversionReviewVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookConversion]
  }
  @scala.inline
  implicit class WebhookConversionOps[Self <: WebhookConversion] (val x: Self) extends AnyVal {
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
    def setClientConfig(value: WebhookClientConfig): Self = this.set("clientConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setConversionReviewVersionsVarargs(value: String*): Self = this.set("conversionReviewVersions", js.Array(value :_*))
    @scala.inline
    def setConversionReviewVersions(value: js.Array[String]): Self = this.set("conversionReviewVersions", value.asInstanceOf[js.Any])
  }
  
}

