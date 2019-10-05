package typings.atPulumiAws.typesInputMod.kinesis

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration extends js.Object {
  /**
    * Defaults to `true`. Set it to `false` if you want to disable format conversion while preserving the configuration details.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Array of data processors. More details are given below
    */
  var processors: js.UndefOr[
    Input[
      js.Array[
        Input[FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor]
      ]
    ]
  ] = js.undefined
}

object FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration {
  @scala.inline
  def apply(
    enabled: Input[Boolean] = null,
    processors: Input[
      js.Array[
        Input[FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor]
      ]
    ] = null
  ): FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (processors != null) __obj.updateDynamic("processors")(processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration]
  }
}

