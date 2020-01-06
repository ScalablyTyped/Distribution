package typings.atPulumiAws.sesEventDestinationMod

import typings.atPulumiAws.typesInputMod.ses.EventDestinationCloudwatchDestination
import typings.atPulumiAws.typesInputMod.ses.EventDestinationKinesisDestination
import typings.atPulumiAws.typesInputMod.ses.EventDestinationSnsDestination
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestinationArgs extends js.Object {
  /**
    * CloudWatch destination for the events
    */
  val cloudwatchDestinations: js.UndefOr[Input[js.Array[Input[EventDestinationCloudwatchDestination]]]] = js.native
  /**
    * The name of the configuration set
    */
  val configurationSetName: Input[String] = js.native
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
  val matchingTypes: Input[js.Array[Input[String]]] = js.native
  /**
    * The name of the event destination
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Send the events to an SNS Topic destination
    */
  val snsDestination: js.UndefOr[Input[EventDestinationSnsDestination]] = js.native
}

object EventDestinationArgs {
  @scala.inline
  def apply(
    configurationSetName: Input[String],
    matchingTypes: Input[js.Array[Input[String]]],
    cloudwatchDestinations: Input[js.Array[Input[EventDestinationCloudwatchDestination]]] = null,
    enabled: Input[Boolean] = null,
    kinesisDestination: Input[EventDestinationKinesisDestination] = null,
    name: Input[String] = null,
    snsDestination: Input[EventDestinationSnsDestination] = null
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

