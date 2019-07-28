package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TriggerEventsTriggerName extends js.Object {
  var triggerEvents: Input[js.Array[Input[String]]]
  var triggerName: Input[String]
  var triggerTargetArn: Input[String]
}

object Anon_TriggerEventsTriggerName {
  @scala.inline
  def apply(
    triggerEvents: Input[js.Array[Input[String]]],
    triggerName: Input[String],
    triggerTargetArn: Input[String]
  ): Anon_TriggerEventsTriggerName = {
    val __obj = js.Dynamic.literal(triggerEvents = triggerEvents.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any], triggerTargetArn = triggerTargetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TriggerEventsTriggerName]
  }
}

