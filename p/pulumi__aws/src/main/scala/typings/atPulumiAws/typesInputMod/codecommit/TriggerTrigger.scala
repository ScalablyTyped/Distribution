package typings.atPulumiAws.typesInputMod.codecommit

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerTrigger extends js.Object {
  /**
    * The branches that will be included in the trigger configuration. If no branches are specified, the trigger will apply to all branches.
    */
  var branches: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Any custom data associated with the trigger that will be included in the information sent to the target of the trigger.
    */
  var customData: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple Notification Service (SNS).
    */
  var destinationArn: Input[String] = js.native
  /**
    * The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). If no events are specified, the trigger will run for all repository events. Event types include: `all`, `updateReference`, `createReference`, `deleteReference`.
    */
  var events: Input[js.Array[Input[String]]] = js.native
  /**
    * The name of the trigger.
    */
  var name: Input[String] = js.native
}

object TriggerTrigger {
  @scala.inline
  def apply(
    destinationArn: Input[String],
    events: Input[js.Array[Input[String]]],
    name: Input[String],
    branches: Input[js.Array[Input[String]]] = null,
    customData: Input[String] = null
  ): TriggerTrigger = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (branches != null) __obj.updateDynamic("branches")(branches.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerTrigger]
  }
}

