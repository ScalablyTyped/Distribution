package typings.pulumiKubernetes.inputMod.apiextensions.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WebhookConversion describes how to call a conversion webhook
  */
@js.native
trait WebhookConversion extends StObject {
  
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
  implicit class WebhookConversionMutableBuilder[Self <: WebhookConversion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientConfig(value: Input[WebhookClientConfig]): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
    
    @scala.inline
    def setConversionReviewVersions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "conversionReviewVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionReviewVersionsVarargs(value: Input[String]*): Self = StObject.set(x, "conversionReviewVersions", js.Array(value :_*))
  }
}
