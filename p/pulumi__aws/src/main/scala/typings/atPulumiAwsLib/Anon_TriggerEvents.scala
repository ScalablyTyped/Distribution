package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TriggerEvents extends js.Object {
  var triggerEvents: js.Array[java.lang.String]
  var triggerName: java.lang.String
  var triggerTargetArn: java.lang.String
}

object Anon_TriggerEvents {
  @scala.inline
  def apply(
    triggerEvents: js.Array[java.lang.String],
    triggerName: java.lang.String,
    triggerTargetArn: java.lang.String
  ): Anon_TriggerEvents = {
    val __obj = js.Dynamic.literal(triggerEvents = triggerEvents, triggerName = triggerName, triggerTargetArn = triggerTargetArn)
  
    __obj.asInstanceOf[Anon_TriggerEvents]
  }
}

