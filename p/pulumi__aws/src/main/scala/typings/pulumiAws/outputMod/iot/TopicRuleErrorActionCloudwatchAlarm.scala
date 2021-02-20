package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleErrorActionCloudwatchAlarm extends StObject {
  
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
object TopicRuleErrorActionCloudwatchAlarm {
  
  @scala.inline
  def apply(alarmName: String, roleArn: String, stateReason: String, stateValue: String): TopicRuleErrorActionCloudwatchAlarm = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateReason = stateReason.asInstanceOf[js.Any], stateValue = stateValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionCloudwatchAlarm]
  }
  
  @scala.inline
  implicit class TopicRuleErrorActionCloudwatchAlarmMutableBuilder[Self <: TopicRuleErrorActionCloudwatchAlarm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarmName(value: String): Self = StObject.set(x, "alarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: String): Self = StObject.set(x, "stateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateValue(value: String): Self = StObject.set(x, "stateValue", value.asInstanceOf[js.Any])
  }
}
