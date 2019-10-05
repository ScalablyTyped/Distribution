package typings.atPulumiAws.typesInputMod.kinesis

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter extends js.Object {
  /**
    * Parameter name. Valid Values: `LambdaArn`, `NumberOfRetries`, `RoleArn`, `BufferSizeInMBs`, `BufferIntervalInSeconds`
    */
  var parameterName: Input[String]
  /**
    * Parameter value. Must be between 1 and 512 length (inclusive). When providing a Lambda ARN, you should specify the resource version as well.
    */
  var parameterValue: Input[String]
}

object FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter {
  @scala.inline
  def apply(parameterName: Input[String], parameterValue: Input[String]): FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], parameterValue = parameterValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter]
  }
}

