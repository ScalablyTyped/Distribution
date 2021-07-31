package typings.pulumiKubernetes.inputMod.apiextensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceConversion describes how to convert different versions of a CR.
  */
trait CustomResourceConversion extends StObject {
  
  /**
    * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `["v1beta1"]`.
    */
  var conversionReviewVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
    *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
    */
  var strategy: Input[String]
  
  /**
    * webhookClientConfig is the instructions for how to call the webhook if strategy is `Webhook`. Required when `strategy` is set to `Webhook`.
    */
  var webhookClientConfig: js.UndefOr[Input[WebhookClientConfig]] = js.undefined
}
object CustomResourceConversion {
  
  @scala.inline
  def apply(strategy: Input[String]): CustomResourceConversion = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceConversion]
  }
  
  @scala.inline
  implicit class CustomResourceConversionMutableBuilder[Self <: CustomResourceConversion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversionReviewVersions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "conversionReviewVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionReviewVersionsUndefined: Self = StObject.set(x, "conversionReviewVersions", js.undefined)
    
    @scala.inline
    def setConversionReviewVersionsVarargs(value: Input[String]*): Self = StObject.set(x, "conversionReviewVersions", js.Array(value :_*))
    
    @scala.inline
    def setStrategy(value: Input[String]): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookClientConfig(value: Input[WebhookClientConfig]): Self = StObject.set(x, "webhookClientConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookClientConfigUndefined: Self = StObject.set(x, "webhookClientConfig", js.undefined)
  }
}
