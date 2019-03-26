package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceConversion describes how to convert different versions of a CR.
  */
trait CustomResourceConversion extends js.Object {
  /**
    * ConversionReviewVersions is an ordered list of preferred `ConversionReview` versions the
    * Webhook expects. API server will try to use first version in the list which it supports. If
    * none of the versions specified in this list supported by API server, conversion will fail
    * for this object. If a persisted Webhook configuration specifies allowed versions and does
    * not include any versions known to the API Server, calls to the webhook will fail. Default
    * to `['v1beta1']`.
    */
  val conversionReviewVersions: js.Array[java.lang.String]
  /**
    * `strategy` specifies the conversion strategy. Allowed values are: - `None`: The converter
    * only change the apiVersion and would not touch any other field in the CR. - `Webhook`: API
    * Server will call to an external webhook to do the conversion. Additional information is
    * needed for this option.
    */
  val strategy: java.lang.String
  /**
    * `webhookClientConfig` is the instructions for how to call the webhook if strategy is
    * `Webhook`. This field is alpha-level and is only honored by servers that enable the
    * CustomResourceWebhookConversion feature.
    */
  val webhookClientConfig: WebhookClientConfig
}

object CustomResourceConversion {
  @scala.inline
  def apply(
    conversionReviewVersions: js.Array[java.lang.String],
    strategy: java.lang.String,
    webhookClientConfig: WebhookClientConfig
  ): CustomResourceConversion = {
    val __obj = js.Dynamic.literal(conversionReviewVersions = conversionReviewVersions, strategy = strategy, webhookClientConfig = webhookClientConfig)
  
    __obj.asInstanceOf[CustomResourceConversion]
  }
}

