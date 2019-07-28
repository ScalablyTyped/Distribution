package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlarmName extends js.Object {
  var alarmName: String
  var roleArn: String
  var stateReason: String
  var stateValue: String
}

object Anon_AlarmName {
  @scala.inline
  def apply(alarmName: String, roleArn: String, stateReason: String, stateValue: String): Anon_AlarmName = {
    val __obj = js.Dynamic.literal(alarmName = alarmName, roleArn = roleArn, stateReason = stateReason, stateValue = stateValue)
  
    __obj.asInstanceOf[Anon_AlarmName]
  }
}

