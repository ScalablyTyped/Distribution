package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor extends js.Object {
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
  def apply(
    `type`: String,
    parameters: js.Array[
      FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter
    ] = null
  ): FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor]
  }
}

