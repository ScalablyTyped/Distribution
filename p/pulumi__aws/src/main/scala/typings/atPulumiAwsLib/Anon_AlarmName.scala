package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlarmName extends js.Object {
  var alarmName: java.lang.String
  var roleArn: java.lang.String
  var stateReason: java.lang.String
  var stateValue: java.lang.String
}

object Anon_AlarmName {
  @scala.inline
  def apply(
    alarmName: java.lang.String,
    roleArn: java.lang.String,
    stateReason: java.lang.String,
    stateValue: java.lang.String
  ): Anon_AlarmName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alarmName")(alarmName)
    __obj.updateDynamic("roleArn")(roleArn)
    __obj.updateDynamic("stateReason")(stateReason)
    __obj.updateDynamic("stateValue")(stateValue)
    __obj.asInstanceOf[Anon_AlarmName]
  }
}

