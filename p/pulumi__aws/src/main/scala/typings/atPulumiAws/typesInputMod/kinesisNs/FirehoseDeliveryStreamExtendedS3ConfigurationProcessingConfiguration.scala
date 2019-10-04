package typings.atPulumiAws.typesInputMod.kinesisNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration extends js.Object {
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
        Input[FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor]
      ]
    ]
  ] = js.undefined
}

object FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration {
  @scala.inline
  def apply(
    enabled: Input[Boolean] = null,
    processors: Input[
      js.Array[
        Input[FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor]
      ]
    ] = null
  ): FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (processors != null) __obj.updateDynamic("processors")(processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration]
  }
}

