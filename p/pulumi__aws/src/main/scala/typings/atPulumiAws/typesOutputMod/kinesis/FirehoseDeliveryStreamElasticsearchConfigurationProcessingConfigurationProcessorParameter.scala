package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter extends js.Object {
  /**
    * Parameter name. Valid Values: `LambdaArn`, `NumberOfRetries`, `RoleArn`, `BufferSizeInMBs`, `BufferIntervalInSeconds`
    */
  var parameterName: String
  /**
    * Parameter value. Must be between 1 and 512 length (inclusive). When providing a Lambda ARN, you should specify the resource version as well.
    */
  var parameterValue: String
}

object FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter {
  @scala.inline
  def apply(parameterName: String, parameterValue: String): FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter = {
    val __obj = js.Dynamic.literal(parameterName = parameterName, parameterValue = parameterValue)
  
    __obj.asInstanceOf[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter]
  }
}

