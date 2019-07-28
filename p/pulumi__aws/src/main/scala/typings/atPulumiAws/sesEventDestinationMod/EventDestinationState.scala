package typings.atPulumiAws.sesEventDestinationMod

import typings.atPulumiAws.Anon_DefaultValueDimensionNameValueSource
import typings.atPulumiAws.Anon_RoleArnStreamArnInput
import typings.atPulumiAws.Anon_TopicArnInput
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDestinationState extends js.Object {
  /**
    * CloudWatch destination for the events
    */
  val cloudwatchDestinations: js.UndefOr[Input[js.Array[Input[Anon_DefaultValueDimensionNameValueSource]]]] = js.undefined
  /**
    * The name of the configuration set
    */
  val configurationSetName: js.UndefOr[Input[String]] = js.undefined
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
  val matchingTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The name of the event destination
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Send the events to an SNS Topic destination
    */
  val snsDestination: js.UndefOr[Input[Anon_TopicArnInput]] = js.undefined
}

object EventDestinationState {
  @scala.inline
  def apply(
    cloudwatchDestinations: Input[js.Array[Input[Anon_DefaultValueDimensionNameValueSource]]] = null,
    configurationSetName: Input[String] = null,
    enabled: Input[Boolean] = null,
    kinesisDestination: Input[Anon_RoleArnStreamArnInput] = null,
    matchingTypes: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    snsDestination: Input[Anon_TopicArnInput] = null
  ): EventDestinationState = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchDestinations != null) __obj.updateDynamic("cloudwatchDestinations")(cloudwatchDestinations.asInstanceOf[js.Any])
    if (configurationSetName != null) __obj.updateDynamic("configurationSetName")(configurationSetName.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (kinesisDestination != null) __obj.updateDynamic("kinesisDestination")(kinesisDestination.asInstanceOf[js.Any])
    if (matchingTypes != null) __obj.updateDynamic("matchingTypes")(matchingTypes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (snsDestination != null) __obj.updateDynamic("snsDestination")(snsDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestinationState]
  }
}

