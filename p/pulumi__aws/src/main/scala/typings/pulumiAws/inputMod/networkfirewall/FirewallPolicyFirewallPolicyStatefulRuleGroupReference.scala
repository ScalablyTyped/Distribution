package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyFirewallPolicyStatefulRuleGroupReference extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the stateful rule group.
    */
  var resourceArn: Input[String]
}
object FirewallPolicyFirewallPolicyStatefulRuleGroupReference {
  
  inline def apply(resourceArn: Input[String]): FirewallPolicyFirewallPolicyStatefulRuleGroupReference = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicyStatefulRuleGroupReference]
  }
  
  extension [Self <: FirewallPolicyFirewallPolicyStatefulRuleGroupReference](x: Self) {
    
    inline def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
