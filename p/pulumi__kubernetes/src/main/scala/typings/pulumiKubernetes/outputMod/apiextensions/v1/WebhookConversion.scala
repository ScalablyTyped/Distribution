package typings.pulumiKubernetes.outputMod.apiextensions.v1

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
  val clientConfig: WebhookClientConfig
  /**
    * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the
    * Webhook expects. The API server will use the first version in the list which it supports.
    * If none of the versions specified in this list are supported by API server, conversion will
    * fail for the custom resource. If a persisted Webhook configuration specifies allowed
    * versions and does not include any versions known to the API Server, calls to the webhook
    * will fail.
    */
  val conversionReviewVersions: js.Array[String]
}

object WebhookConversion {
  @scala.inline
  def apply(clientConfig: WebhookClientConfig, conversionReviewVersions: js.Array[String]): WebhookConversion = {
    val __obj = js.Dynamic.literal(clientConfig = clientConfig.asInstanceOf[js.Any], conversionReviewVersions = conversionReviewVersions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookConversion]
  }
}

