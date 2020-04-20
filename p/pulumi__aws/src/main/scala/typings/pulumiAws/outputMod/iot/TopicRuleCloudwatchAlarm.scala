package typings.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleCloudwatchAlarm extends js.Object {
  /**
    * The CloudWatch alarm name.
    */
  var alarmName: String = js.native
  /**
    * The IAM role ARN that allows access to the CloudWatch alarm.
    */
  var roleArn: String = js.native
  /**
    * The reason for the alarm change.
    */
  var stateReason: String = js.native
  /**
    * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
    */
  var stateValue: String = js.native
}

object TopicRuleCloudwatchAlarm {
  @scala.inline
  def apply(alarmName: String, roleArn: String, stateReason: String, stateValue: String): TopicRuleCloudwatchAlarm = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateReason = stateReason.asInstanceOf[js.Any], stateValue = stateValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleCloudwatchAlarm]
  }
}

