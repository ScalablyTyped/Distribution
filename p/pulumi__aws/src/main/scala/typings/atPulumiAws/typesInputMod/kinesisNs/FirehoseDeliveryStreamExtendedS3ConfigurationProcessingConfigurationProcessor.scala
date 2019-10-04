package typings.atPulumiAws.typesInputMod.kinesisNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor extends js.Object {
  /**
    * Array of processor parameters. More details are given below
    */
  var parameters: js.UndefOr[
    Input[
      js.Array[
        Input[
          FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter
        ]
      ]
    ]
  ] = js.undefined
  /**
    * The type of processor. Valid Values: `Lambda`
    */
  var `type`: Input[String]
}

object FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor {
  @scala.inline
  def apply(
    `type`: Input[String],
    parameters: Input[
      js.Array[
        Input[
          FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter
        ]
      ]
    ] = null
  ): FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor]
  }
}

