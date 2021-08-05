package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyFirewallPolicyStatelessCustomAction extends StObject {
  
  /**
    * A configuration block describing the custom action associated with the `actionName`. See Action Definition below for details.
    */
  var actionDefinition: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition
  
  /**
    * A friendly name of the custom action.
    */
  var actionName: String
}
object FirewallPolicyFirewallPolicyStatelessCustomAction {
  
  inline def apply(
    actionDefinition: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition,
    actionName: String
  ): FirewallPolicyFirewallPolicyStatelessCustomAction = {
    val __obj = js.Dynamic.literal(actionDefinition = actionDefinition.asInstanceOf[js.Any], actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicyStatelessCustomAction]
  }
  
  extension [Self <: FirewallPolicyFirewallPolicyStatelessCustomAction](x: Self) {
    
    inline def setActionDefinition(value: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition): Self = StObject.set(x, "actionDefinition", value.asInstanceOf[js.Any])
    
    inline def setActionName(value: String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
  }
}
