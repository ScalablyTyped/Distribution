package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlarmNameRoleArn extends js.Object {
  var alarmName: Input[String]
  var roleArn: Input[String]
  var stateReason: Input[String]
  var stateValue: Input[String]
}

object Anon_AlarmNameRoleArn {
  @scala.inline
  def apply(
    alarmName: Input[String],
    roleArn: Input[String],
    stateReason: Input[String],
    stateValue: Input[String]
  ): Anon_AlarmNameRoleArn = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateReason = stateReason.asInstanceOf[js.Any], stateValue = stateValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AlarmNameRoleArn]
  }
}

