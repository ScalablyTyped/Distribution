package typings.pulumiAws.eventDestinationMod

import typings.pulumiAws.inputMod.ses.EventDestinationCloudwatchDestination
import typings.pulumiAws.inputMod.ses.EventDestinationKinesisDestination
import typings.pulumiAws.inputMod.ses.EventDestinationSnsDestination
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestinationState extends js.Object {
  /**
    * CloudWatch destination for the events
    */
  val cloudwatchDestinations: js.UndefOr[Input[js.Array[Input[EventDestinationCloudwatchDestination]]]] = js.native
  /**
    * The name of the configuration set
    */
  val configurationSetName: js.UndefOr[Input[String]] = js.native
  /**
    * If true, the event destination will be enabled
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Send the events to a kinesis firehose destination
    */
  val kinesisDestination: js.UndefOr[Input[EventDestinationKinesisDestination]] = js.native
  /**
    * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
    */
  val matchingTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the event destination
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Send the events to an SNS Topic destination
    */
  val snsDestination: js.UndefOr[Input[EventDestinationSnsDestination]] = js.native
}

object EventDestinationState {
  @scala.inline
  def apply(
    cloudwatchDestinations: Input[js.Array[Input[EventDestinationCloudwatchDestination]]] = null,
    configurationSetName: Input[String] = null,
    enabled: Input[Boolean] = null,
    kinesisDestination: Input[EventDestinationKinesisDestination] = null,
    matchingTypes: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    snsDestination: Input[EventDestinationSnsDestination] = null
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

