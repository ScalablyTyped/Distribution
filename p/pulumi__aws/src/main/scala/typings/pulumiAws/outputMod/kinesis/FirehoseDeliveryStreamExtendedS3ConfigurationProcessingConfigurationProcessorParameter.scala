package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter extends StObject {
  
  /**
    * Parameter name. Valid Values: `LambdaArn`, `NumberOfRetries`, `RoleArn`, `BufferSizeInMBs`, `BufferIntervalInSeconds`
    */
  var parameterName: String
  
  /**
    * Parameter value. Must be between 1 and 512 length (inclusive). When providing a Lambda ARN, you should specify the resource version as well.
    */
  var parameterValue: String
}
object FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter {
  
  @scala.inline
  def apply(parameterName: String, parameterValue: String): FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], parameterValue = parameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterMutableBuilder[Self <: FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValue(value: String): Self = StObject.set(x, "parameterValue", value.asInstanceOf[js.Any])
  }
}
