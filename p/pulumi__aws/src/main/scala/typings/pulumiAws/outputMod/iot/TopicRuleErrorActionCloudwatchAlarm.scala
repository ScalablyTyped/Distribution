package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleErrorActionCloudwatchAlarm extends StObject {
  
  /**
    * The CloudWatch alarm name.
    */
  var alarmName: String
  
  /**
    * The IAM role ARN that allows access to the CloudWatch alarm.
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
object TopicRuleErrorActionCloudwatchAlarm {
  
  inline def apply(alarmName: String, roleArn: String, stateReason: String, stateValue: String): TopicRuleErrorActionCloudwatchAlarm = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateReason = stateReason.asInstanceOf[js.Any], stateValue = stateValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionCloudwatchAlarm]
  }
  
  extension [Self <: TopicRuleErrorActionCloudwatchAlarm](x: Self) {
    
    inline def setAlarmName(value: String): Self = StObject.set(x, "alarmName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setStateReason(value: String): Self = StObject.set(x, "stateReason", value.asInstanceOf[js.Any])
    
    inline def setStateValue(value: String): Self = StObject.set(x, "stateValue", value.asInstanceOf[js.Any])
  }
}
