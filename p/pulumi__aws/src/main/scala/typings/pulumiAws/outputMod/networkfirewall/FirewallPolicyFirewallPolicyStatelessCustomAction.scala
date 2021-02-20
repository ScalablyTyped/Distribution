package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallPolicyFirewallPolicyStatelessCustomAction extends StObject {
  
  /**
    * A configuration block describing the custom action associated with the `actionName`. See Action Definition below for details.
    */
  var actionDefinition: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition = js.native
  
  /**
    * A friendly name of the custom action.
    */
  var actionName: String = js.native
}
object FirewallPolicyFirewallPolicyStatelessCustomAction {
  
  @scala.inline
  def apply(
    actionDefinition: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition,
    actionName: String
  ): FirewallPolicyFirewallPolicyStatelessCustomAction = {
    val __obj = js.Dynamic.literal(actionDefinition = actionDefinition.asInstanceOf[js.Any], actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicyStatelessCustomAction]
  }
  
  @scala.inline
  implicit class FirewallPolicyFirewallPolicyStatelessCustomActionMutableBuilder[Self <: FirewallPolicyFirewallPolicyStatelessCustomAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionDefinition(value: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition): Self = StObject.set(x, "actionDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionName(value: String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
  }
}
