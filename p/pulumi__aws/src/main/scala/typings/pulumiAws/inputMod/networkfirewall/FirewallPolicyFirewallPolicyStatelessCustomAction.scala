package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyFirewallPolicyStatelessCustomAction extends StObject {
  
  /**
    * A configuration block describing the custom action associated with the `actionName`. See Action Definition below for details.
    */
  var actionDefinition: Input[FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition]
  
  /**
    * A friendly name of the custom action.
    */
  var actionName: Input[String]
}
object FirewallPolicyFirewallPolicyStatelessCustomAction {
  
  @scala.inline
  def apply(
    actionDefinition: Input[FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition],
    actionName: Input[String]
  ): FirewallPolicyFirewallPolicyStatelessCustomAction = {
    val __obj = js.Dynamic.literal(actionDefinition = actionDefinition.asInstanceOf[js.Any], actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicyStatelessCustomAction]
  }
  
  @scala.inline
  implicit class FirewallPolicyFirewallPolicyStatelessCustomActionMutableBuilder[Self <: FirewallPolicyFirewallPolicyStatelessCustomAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionDefinition(value: Input[FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition]): Self = StObject.set(x, "actionDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionName(value: Input[String]): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
  }
}
