package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleCloudwatchAlarm extends StObject {
  
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
object TopicRuleCloudwatchAlarm {
  
  @scala.inline
  def apply(
    alarmName: Input[String],
    roleArn: Input[String],
    stateReason: Input[String],
    stateValue: Input[String]
  ): TopicRuleCloudwatchAlarm = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateReason = stateReason.asInstanceOf[js.Any], stateValue = stateValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleCloudwatchAlarm]
  }
  
  @scala.inline
  implicit class TopicRuleCloudwatchAlarmMutableBuilder[Self <: TopicRuleCloudwatchAlarm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarmName(value: Input[String]): Self = StObject.set(x, "alarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: Input[String]): Self = StObject.set(x, "stateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateValue(value: Input[String]): Self = StObject.set(x, "stateValue", value.asInstanceOf[js.Any])
  }
}
