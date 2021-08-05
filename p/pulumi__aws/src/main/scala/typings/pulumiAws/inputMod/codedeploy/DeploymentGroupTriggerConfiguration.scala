package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupTriggerConfiguration extends StObject {
  
  /**
    * The event type or types for which notifications are triggered. Some values that are supported: `DeploymentStart`, `DeploymentSuccess`, `DeploymentFailure`, `DeploymentStop`, `DeploymentRollback`, `InstanceStart`, `InstanceSuccess`, `InstanceFailure`.  See [the CodeDeploy documentation](http://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-sns-event-notifications-create-trigger.html) for all possible values.
    */
  var triggerEvents: Input[js.Array[Input[String]]]
  
  /**
    * The name of the notification trigger.
    */
  var triggerName: Input[String]
  
  /**
    * The ARN of the SNS topic through which notifications are sent.
    */
  var triggerTargetArn: Input[String]
}
object DeploymentGroupTriggerConfiguration {
  
  inline def apply(
    triggerEvents: Input[js.Array[Input[String]]],
    triggerName: Input[String],
    triggerTargetArn: Input[String]
  ): DeploymentGroupTriggerConfiguration = {
    val __obj = js.Dynamic.literal(triggerEvents = triggerEvents.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any], triggerTargetArn = triggerTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupTriggerConfiguration]
  }
  
  extension [Self <: DeploymentGroupTriggerConfiguration](x: Self) {
    
    inline def setTriggerEvents(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "triggerEvents", value.asInstanceOf[js.Any])
    
    inline def setTriggerEventsVarargs(value: Input[String]*): Self = StObject.set(x, "triggerEvents", js.Array(value :_*))
    
    inline def setTriggerName(value: Input[String]): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
    
    inline def setTriggerTargetArn(value: Input[String]): Self = StObject.set(x, "triggerTargetArn", value.asInstanceOf[js.Any])
  }
}
