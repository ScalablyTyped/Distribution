package typings.pulumiKubernetes.outputMod.apiextensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceConversion describes how to convert different versions of a CR.
  */
@js.native
trait CustomResourceConversion extends js.Object {
  /**
    * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `["v1beta1"]`.
    */
  var conversionReviewVersions: js.Array[String] = js.native
  /**
    * strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
    *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
    */
  var strategy: String = js.native
  /**
    * webhookClientConfig is the instructions for how to call the webhook if strategy is `Webhook`. Required when `strategy` is set to `Webhook`.
    */
  var webhookClientConfig: WebhookClientConfig = js.native
}

object CustomResourceConversion {
  @scala.inline
  def apply(
    conversionReviewVersions: js.Array[String],
    strategy: String,
    webhookClientConfig: WebhookClientConfig
  ): CustomResourceConversion = {
    val __obj = js.Dynamic.literal(conversionReviewVersions = conversionReviewVersions.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], webhookClientConfig = webhookClientConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceConversion]
  }
  @scala.inline
  implicit class CustomResourceConversionOps[Self <: CustomResourceConversion] (val x: Self) extends AnyVal {
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
    def setConversionReviewVersionsVarargs(value: String*): Self = this.set("conversionReviewVersions", js.Array(value :_*))
    @scala.inline
    def setConversionReviewVersions(value: js.Array[String]): Self = this.set("conversionReviewVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrategy(value: String): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebhookClientConfig(value: WebhookClientConfig): Self = this.set("webhookClientConfig", value.asInstanceOf[js.Any])
  }
  
}

