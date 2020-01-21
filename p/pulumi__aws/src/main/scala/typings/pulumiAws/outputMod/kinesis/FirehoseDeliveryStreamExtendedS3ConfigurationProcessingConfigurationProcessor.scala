package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor extends js.Object {
  /**
    * Array of processor parameters. More details are given below
    */
  var parameters: js.UndefOr[
    js.Array[
      FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter
    ]
  ] = js.native
  /**
    * The type of processor. Valid Values: `Lambda`
    */
  var `type`: String = js.native
}

object FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor {
  @scala.inline
  def apply(
    `type`: String,
    parameters: js.Array[
      FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter
    ] = null
  ): FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor]
  }
}

