package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter extends js.Object {
  /**
    * Parameter name. Valid Values: `LambdaArn`, `NumberOfRetries`, `RoleArn`, `BufferSizeInMBs`, `BufferIntervalInSeconds`
    */
  var parameterName: String = js.native
  /**
    * Parameter value. Must be between 1 and 512 length (inclusive). When providing a Lambda ARN, you should specify the resource version as well.
    */
  var parameterValue: String = js.native
}

object FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter {
  @scala.inline
  def apply(parameterName: String, parameterValue: String): FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], parameterValue = parameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterOps[Self <: FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameterName(value: String): Self = this.set("parameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameterValue(value: String): Self = this.set("parameterValue", value.asInstanceOf[js.Any])
  }
  
}

