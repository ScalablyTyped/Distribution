package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TriggerEvents extends js.Object {
  var triggerEvents: js.Array[String]
  var triggerName: String
  var triggerTargetArn: String
}

object Anon_TriggerEvents {
  @scala.inline
  def apply(triggerEvents: js.Array[String], triggerName: String, triggerTargetArn: String): Anon_TriggerEvents = {
    val __obj = js.Dynamic.literal(triggerEvents = triggerEvents, triggerName = triggerName, triggerTargetArn = triggerTargetArn)
  
    __obj.asInstanceOf[Anon_TriggerEvents]
  }
}

