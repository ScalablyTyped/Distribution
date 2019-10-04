package typings.atPulumiAws.typesOutputMod.codecommitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerTrigger extends js.Object {
  /**
    * The branches that will be included in the trigger configuration. If no branches are specified, the trigger will apply to all branches.
    */
  var branches: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Any custom data associated with the trigger that will be included in the information sent to the target of the trigger.
    */
  var customData: js.UndefOr[String] = js.undefined
  /**
    * The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple Notification Service (SNS).
    */
  var destinationArn: String
  /**
    * The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). If no events are specified, the trigger will run for all repository events. Event types include: `all`, `updateReference`, `createReference`, `deleteReference`.
    */
  var events: js.Array[String]
  /**
    * The name of the trigger.
    */
  var name: String
}

object TriggerTrigger {
  @scala.inline
  def apply(
    destinationArn: String,
    events: js.Array[String],
    name: String,
    branches: js.Array[String] = null,
    customData: String = null
  ): TriggerTrigger = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn, events = events, name = name)
    if (branches != null) __obj.updateDynamic("branches")(branches)
    if (customData != null) __obj.updateDynamic("customData")(customData)
    __obj.asInstanceOf[TriggerTrigger]
  }
}

