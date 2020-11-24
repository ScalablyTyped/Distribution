package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleErrorActionCloudwatchAlarm extends js.Object {
  
  /**
    * The CloudWatch alarm name.
    */
  var alarmName: Input[String] = js.native
  
  /**
    * The IAM role ARN that allows access to the CloudWatch alarm.
    */
  var roleArn: Input[String] = js.native
  
  /**
    * The reason for the alarm change.
    */
  var stateReason: Input[String] = js.native
  
  /**
    * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
    */
  var stateValue: Input[String] = js.native
}
object TopicRuleErrorActionCloudwatchAlarm {
  
  @scala.inline
  def apply(
    alarmName: Input[String],
    roleArn: Input[String],
    stateReason: Input[String],
    stateValue: Input[String]
  ): TopicRuleErrorActionCloudwatchAlarm = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateReason = stateReason.asInstanceOf[js.Any], stateValue = stateValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionCloudwatchAlarm]
  }
  
  @scala.inline
  implicit class TopicRuleErrorActionCloudwatchAlarmOps[Self <: TopicRuleErrorActionCloudwatchAlarm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlarmName(value: Input[String]): Self = this.set("alarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: Input[String]): Self = this.set("stateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateValue(value: Input[String]): Self = this.set("stateValue", value.asInstanceOf[js.Any])
  }
}
