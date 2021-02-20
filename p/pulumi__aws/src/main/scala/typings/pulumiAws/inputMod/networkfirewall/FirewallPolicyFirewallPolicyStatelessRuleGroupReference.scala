package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallPolicyFirewallPolicyStatelessRuleGroupReference extends StObject {
  
  /**
    * An integer setting that indicates the order in which to run the stateless rule groups in a single policy. AWS Network Firewall applies each stateless rule group to a packet starting with the group that has the lowest priority setting.
    */
  var priority: Input[Double] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the stateless rule group.
    */
  var resourceArn: Input[String] = js.native
}
object FirewallPolicyFirewallPolicyStatelessRuleGroupReference {
  
  @scala.inline
  def apply(priority: Input[Double], resourceArn: Input[String]): FirewallPolicyFirewallPolicyStatelessRuleGroupReference = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicyStatelessRuleGroupReference]
  }
  
  @scala.inline
  implicit class FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceMutableBuilder[Self <: FirewallPolicyFirewallPolicyStatelessRuleGroupReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
