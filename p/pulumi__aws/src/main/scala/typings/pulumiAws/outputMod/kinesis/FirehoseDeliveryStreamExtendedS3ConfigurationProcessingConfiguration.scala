package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration extends js.Object {
  /**
    * Enables or disables data processing.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Array of data processors. More details are given below
    */
  var processors: js.UndefOr[
    js.Array[FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor]
  ] = js.native
}

object FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    processors: js.Array[FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessor] = null
  ): FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (processors != null) __obj.updateDynamic("processors")(processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration]
  }
}

