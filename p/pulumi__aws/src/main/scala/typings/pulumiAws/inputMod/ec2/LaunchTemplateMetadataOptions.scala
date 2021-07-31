package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateMetadataOptions extends StObject {
  
  /**
    * Whether the metadata service is available. Can be `"enabled"` or `"disabled"`. (Default: `"enabled"`).
    */
  var httpEndpoint: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Can be an integer from `1` to `64`. (Default: `1`).
    */
  var httpPutResponseHopLimit: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Whether or not the metadata service requires session tokens, also referred to as _Instance Metadata Service Version 2_. Can be `"optional"` or `"required"`. (Default: `"optional"`).
    */
  var httpTokens: js.UndefOr[Input[String]] = js.undefined
}
object LaunchTemplateMetadataOptions {
  
  @scala.inline
  def apply(): LaunchTemplateMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateMetadataOptions]
  }
  
  @scala.inline
  implicit class LaunchTemplateMetadataOptionsMutableBuilder[Self <: LaunchTemplateMetadataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpEndpoint(value: Input[String]): Self = StObject.set(x, "httpEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpEndpointUndefined: Self = StObject.set(x, "httpEndpoint", js.undefined)
    
    @scala.inline
    def setHttpPutResponseHopLimit(value: Input[Double]): Self = StObject.set(x, "httpPutResponseHopLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpPutResponseHopLimitUndefined: Self = StObject.set(x, "httpPutResponseHopLimit", js.undefined)
    
    @scala.inline
    def setHttpTokens(value: Input[String]): Self = StObject.set(x, "httpTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpTokensUndefined: Self = StObject.set(x, "httpTokens", js.undefined)
  }
}
