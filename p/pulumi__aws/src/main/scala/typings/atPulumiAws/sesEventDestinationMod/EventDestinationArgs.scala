package typings.atPulumiAws.sesEventDestinationMod

import typings.atPulumiAws.Anon_DefaultValueDimensionNameValueSource
import typings.atPulumiAws.Anon_RoleArnStreamArnInput
import typings.atPulumiAws.Anon_TopicArnInput
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDestinationArgs extends js.Object {
  /**
    * CloudWatch destination for the events
    */
  val cloudwatchDestinations: js.UndefOr[Input[js.Array[Input[Anon_DefaultValueDimensionNameValueSource]]]] = js.undefined
  /**
    * The name of the configuration set
    */
  val configurationSetName: Input[String]
  /**
    * If true, the event destination will be enabled
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Send the events to a kinesis firehose destination
    */
  val kinesisDestination: js.UndefOr[Input[Anon_RoleArnStreamArnInput]] = js.undefined
  /**
    * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
    */
  val matchingTypes: Input[js.Array[Input[String]]]
  /**
    * The name of the event destination
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Send the events to an SNS Topic destination
    */
  val snsDestination: js.UndefOr[Input[Anon_TopicArnInput]] = js.undefined
}

object EventDestinationArgs {
  @scala.inline
  def apply(
    configurationSetName: Input[String],
    matchingTypes: Input[js.Array[Input[String]]],
    cloudwatchDestinations: Input[js.Array[Input[Anon_DefaultValueDimensionNameValueSource]]] = null,
    enabled: Input[Boolean] = null,
    kinesisDestination: Input[Anon_RoleArnStreamArnInput] = null,
    name: Input[String] = null,
    snsDestination: Input[Anon_TopicArnInput] = null
  ): EventDestinationArgs = {
    val __obj = js.Dynamic.literal(configurationSetName = configurationSetName.asInstanceOf[js.Any], matchingTypes = matchingTypes.asInstanceOf[js.Any])
    if (cloudwatchDestinations != null) __obj.updateDynamic("cloudwatchDestinations")(cloudwatchDestinations.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (kinesisDestination != null) __obj.updateDynamic("kinesisDestination")(kinesisDestination.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (snsDestination != null) __obj.updateDynamic("snsDestination")(snsDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestinationArgs]
  }
}

