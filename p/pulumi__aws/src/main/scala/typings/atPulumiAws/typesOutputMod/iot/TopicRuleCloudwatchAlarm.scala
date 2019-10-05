package typings.atPulumiAws.typesOutputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleCloudwatchAlarm extends js.Object {
  /**
    * The CloudWatch alarm name.
    */
  var alarmName: String
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String
  /**
    * The reason for the alarm change.
    */
  var stateReason: String
  /**
    * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
    */
  var stateValue: String
}

object TopicRuleCloudwatchAlarm {
  @scala.inline
  def apply(alarmName: String, roleArn: String, stateReason: String, stateValue: String): TopicRuleCloudwatchAlarm = {
    val __obj = js.Dynamic.literal(alarmName = alarmName, roleArn = roleArn, stateReason = stateReason, stateValue = stateValue)
  
    __obj.asInstanceOf[TopicRuleCloudwatchAlarm]
  }
}

