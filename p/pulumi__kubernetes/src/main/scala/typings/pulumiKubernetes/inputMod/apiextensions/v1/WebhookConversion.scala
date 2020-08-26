package typings.pulumiKubernetes.inputMod.apiextensions.v1

import typings.pulumiPulumi.outputMod.Input
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
  var clientConfig: js.UndefOr[Input[WebhookClientConfig]] = js.native
  /**
    * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.
    */
  var conversionReviewVersions: Input[js.Array[Input[String]]] = js.native
}

object WebhookConversion {
  @scala.inline
  def apply(conversionReviewVersions: Input[js.Array[Input[String]]]): WebhookConversion = {
    val __obj = js.Dynamic.literal(conversionReviewVersions = conversionReviewVersions.asInstanceOf[js.Any])
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
    def setConversionReviewVersionsVarargs(value: Input[String]*): Self = this.set("conversionReviewVersions", js.Array(value :_*))
    @scala.inline
    def setConversionReviewVersions(value: Input[js.Array[Input[String]]]): Self = this.set("conversionReviewVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientConfig(value: Input[WebhookClientConfig]): Self = this.set("clientConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientConfig: Self = this.set("clientConfig", js.undefined)
  }
  
}

