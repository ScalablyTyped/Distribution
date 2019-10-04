package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor extends js.Object {
  /**
    * Array of processor parameters. More details are given below
    */
  var parameters: js.UndefOr[
    js.Array[
      FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter
    ]
  ] = js.undefined
  /**
    * The type of processor. Valid Values: `Lambda`
    */
  var `type`: String
}

object FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor {
  @scala.inline
  def apply(
    `type`: String,
    parameters: js.Array[
      FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter
    ] = null
  ): FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor]
  }
}

