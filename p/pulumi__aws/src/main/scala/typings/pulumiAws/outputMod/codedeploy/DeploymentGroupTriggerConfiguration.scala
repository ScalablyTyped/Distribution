package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupTriggerConfiguration extends StObject {
  
  /**
    * The event type or types for which notifications are triggered. Some values that are supported: `DeploymentStart`, `DeploymentSuccess`, `DeploymentFailure`, `DeploymentStop`, `DeploymentRollback`, `InstanceStart`, `InstanceSuccess`, `InstanceFailure`.  See [the CodeDeploy documentation](http://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-sns-event-notifications-create-trigger.html) for all possible values.
    */
  var triggerEvents: js.Array[String]
  
  /**
    * The name of the notification trigger.
    */
  var triggerName: String
  
  /**
    * The ARN of the SNS topic through which notifications are sent.
    */
  var triggerTargetArn: String
}
object DeploymentGroupTriggerConfiguration {
  
  inline def apply(triggerEvents: js.Array[String], triggerName: String, triggerTargetArn: String): DeploymentGroupTriggerConfiguration = {
    val __obj = js.Dynamic.literal(triggerEvents = triggerEvents.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any], triggerTargetArn = triggerTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupTriggerConfiguration]
  }
  
  extension [Self <: DeploymentGroupTriggerConfiguration](x: Self) {
    
    inline def setTriggerEvents(value: js.Array[String]): Self = StObject.set(x, "triggerEvents", value.asInstanceOf[js.Any])
    
    inline def setTriggerEventsVarargs(value: String*): Self = StObject.set(x, "triggerEvents", js.Array(value :_*))
    
    inline def setTriggerName(value: String): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
    
    inline def setTriggerTargetArn(value: String): Self = StObject.set(x, "triggerTargetArn", value.asInstanceOf[js.Any])
  }
}
