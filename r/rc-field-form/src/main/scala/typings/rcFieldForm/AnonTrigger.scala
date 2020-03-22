package typings.rcFieldForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTrigger extends js.Object {
  var trigger: String
  var validateTrigger: String
  var valuePropName: String
}

object AnonTrigger {
  @scala.inline
  def apply(trigger: String, validateTrigger: String, valuePropName: String): AnonTrigger = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any], validateTrigger = validateTrigger.asInstanceOf[js.Any], valuePropName = valuePropName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTrigger]
  }
}

