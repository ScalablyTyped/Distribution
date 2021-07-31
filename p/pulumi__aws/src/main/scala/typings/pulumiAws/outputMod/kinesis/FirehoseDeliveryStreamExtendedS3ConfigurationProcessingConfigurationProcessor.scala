package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor extends StObject {
  
  /**
    * Array of processor parameters. More details are given below
    */
  var parameters: js.UndefOr[
    js.Array[
      FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter
    ]
  ] = js.undefined
  
  /**
    * The type of processor. Valid Values: `Lambda`
    */
  var `type`: String
}
object FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor {
  
  @scala.inline
  def apply(`type`: String): FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorMutableBuilder[Self <: FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: js.Array[
          FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
