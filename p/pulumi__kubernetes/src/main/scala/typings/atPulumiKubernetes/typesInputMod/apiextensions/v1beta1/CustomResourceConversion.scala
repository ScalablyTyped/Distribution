package typings.atPulumiKubernetes.typesInputMod.apiextensions.v1beta1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceConversion describes how to convert different versions of a CR.
  */
trait CustomResourceConversion extends js.Object {
  /**
    * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the
    * Webhook expects. The API server will use the first version in the list which it supports.
    * If none of the versions specified in this list are supported by API server, conversion will
    * fail for the custom resource. If a persisted Webhook configuration specifies allowed
    * versions and does not include any versions known to the API Server, calls to the webhook
    * will fail. Defaults to `["v1beta1"]`.
    */
  var conversionReviewVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * strategy specifies how custom resources are converted between versions. Allowed values are:
    * - `None`: The converter only change the apiVersion and would not touch any other field in
    * the custom resource. - `Webhook`: API Server will call to an external webhook to do the
    * conversion. Additional information
    *   is needed for this option. This requires spec.preserveUnknownFields to be false, and
    * spec.conversion.webhookClientConfig to be set.
    */
  var strategy: Input[String]
  /**
    * webhookClientConfig is the instructions for how to call the webhook if strategy is
    * `Webhook`. Required when `strategy` is set to `Webhook`.
    */
  var webhookClientConfig: js.UndefOr[Input[WebhookClientConfig]] = js.undefined
}

object CustomResourceConversion {
  @scala.inline
  def apply(
    strategy: Input[String],
    conversionReviewVersions: Input[js.Array[Input[String]]] = null,
    webhookClientConfig: Input[WebhookClientConfig] = null
  ): CustomResourceConversion = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
    if (conversionReviewVersions != null) __obj.updateDynamic("conversionReviewVersions")(conversionReviewVersions.asInstanceOf[js.Any])
    if (webhookClientConfig != null) __obj.updateDynamic("webhookClientConfig")(webhookClientConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceConversion]
  }
}

