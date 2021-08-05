package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyFirewallPolicyStatelessRuleGroupReference extends StObject {
  
  /**
    * An integer setting that indicates the order in which to run the stateless rule groups in a single policy. AWS Network Firewall applies each stateless rule group to a packet starting with the group that has the lowest priority setting.
    */
  var priority: Input[Double]
  
  /**
    * The Amazon Resource Name (ARN) of the stateless rule group.
    */
  var resourceArn: Input[String]
}
object FirewallPolicyFirewallPolicyStatelessRuleGroupReference {
  
  inline def apply(priority: Input[Double], resourceArn: Input[String]): FirewallPolicyFirewallPolicyStatelessRuleGroupReference = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicyStatelessRuleGroupReference]
  }
  
  extension [Self <: FirewallPolicyFirewallPolicyStatelessRuleGroupReference](x: Self) {
    
    inline def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
