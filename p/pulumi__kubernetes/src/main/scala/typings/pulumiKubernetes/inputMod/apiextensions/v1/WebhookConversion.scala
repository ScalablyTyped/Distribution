package typings.pulumiKubernetes.inputMod.apiextensions.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebhookConversion describes how to call a conversion webhook
  */
trait WebhookConversion extends js.Object {
  /**
    * clientConfig is the instructions for how to call the webhook if strategy is `Webhook`.
    */
  var clientConfig: js.UndefOr[Input[WebhookClientConfig]] = js.undefined
  /**
    * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the
    * Webhook expects. The API server will use the first version in the list which it supports.
    * If none of the versions specified in this list are supported by API server, conversion will
    * fail for the custom resource. If a persisted Webhook configuration specifies allowed
    * versions and does not include any versions known to the API Server, calls to the webhook
    * will fail.
    */
  var conversionReviewVersions: Input[js.Array[Input[String]]]
}

object WebhookConversion {
  @scala.inline
  def apply(
    conversionReviewVersions: Input[js.Array[Input[String]]],
    clientConfig: Input[WebhookClientConfig] = null
  ): WebhookConversion = {
    val __obj = js.Dynamic.literal(conversionReviewVersions = conversionReviewVersions.asInstanceOf[js.Any])
    if (clientConfig != null) __obj.updateDynamic("clientConfig")(clientConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookConversion]
  }
}

