package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter extends StObject {
  
  /**
    * Parameter name. Valid Values: `LambdaArn`, `NumberOfRetries`, `RoleArn`, `BufferSizeInMBs`, `BufferIntervalInSeconds`
    */
  var parameterName: Input[String]
  
  /**
    * Parameter value. Must be between 1 and 512 length (inclusive). When providing a Lambda ARN, you should specify the resource version as well.
    */
  var parameterValue: Input[String]
}
object FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter {
  
  @scala.inline
  def apply(parameterName: Input[String], parameterValue: Input[String]): FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], parameterValue = parameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameterMutableBuilder[Self <: FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterName(value: Input[String]): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValue(value: Input[String]): Self = StObject.set(x, "parameterValue", value.asInstanceOf[js.Any])
  }
}
