package typings.atPulumiAws.typesInputMod.kinesisNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor extends js.Object {
  /**
    * Array of processor parameters. More details are given below
    */
  var parameters: js.UndefOr[
    Input[
      js.Array[
        Input[
          FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter
        ]
      ]
    ]
  ] = js.undefined
  /**
    * The type of processor. Valid Values: `Lambda`
    */
  var `type`: Input[String]
}

object FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor {
  @scala.inline
  def apply(
    `type`: Input[String],
    parameters: Input[
      js.Array[
        Input[
          FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter
        ]
      ]
    ] = null
  ): FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor]
  }
}

