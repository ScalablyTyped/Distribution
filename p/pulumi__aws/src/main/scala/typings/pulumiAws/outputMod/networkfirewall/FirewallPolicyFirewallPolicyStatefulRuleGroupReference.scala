package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyFirewallPolicyStatefulRuleGroupReference extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the stateful rule group.
    */
  var resourceArn: String
}
object FirewallPolicyFirewallPolicyStatefulRuleGroupReference {
  
  inline def apply(resourceArn: String): FirewallPolicyFirewallPolicyStatefulRuleGroupReference = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicyStatefulRuleGroupReference]
  }
  
  extension [Self <: FirewallPolicyFirewallPolicyStatefulRuleGroupReference](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
