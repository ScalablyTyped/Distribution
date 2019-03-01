package typings
package atPulumiAwsLib.sesEventDestinationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDestinationArgs extends js.Object {
  /**
    * CloudWatch destination for the events
    */
  val cloudwatchDestinations: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DefaultValueDimensionNameValueSource]
      ]
    ]
  ] = js.undefined
  /**
    * The name of the configuration set
    */
  val configurationSetName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * If true, the event destination will be enabled
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Send the events to a kinesis firehose destination
    */
  val kinesisDestination: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_RoleArnStreamArnInput]] = js.undefined
  /**
    * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
    */
  val matchingTypes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * The name of the event destination
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Send the events to an SNS Topic destination
    */
  val snsDestination: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TopicArnInput]] = js.undefined
}

object EventDestinationArgs {
  @scala.inline
  def apply(
    configurationSetName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    matchingTypes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    cloudwatchDestinations: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DefaultValueDimensionNameValueSource]
      ]
    ] = null,
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    kinesisDestination: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_RoleArnStreamArnInput] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    snsDestination: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TopicArnInput] = null
  ): EventDestinationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configurationSetName")(configurationSetName.asInstanceOf[js.Any])
    __obj.updateDynamic("matchingTypes")(matchingTypes.asInstanceOf[js.Any])
    if (cloudwatchDestinations != null) __obj.updateDynamic("cloudwatchDestinations")(cloudwatchDestinations.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (kinesisDestination != null) __obj.updateDynamic("kinesisDestination")(kinesisDestination.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (snsDestination != null) __obj.updateDynamic("snsDestination")(snsDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestinationArgs]
  }
}

