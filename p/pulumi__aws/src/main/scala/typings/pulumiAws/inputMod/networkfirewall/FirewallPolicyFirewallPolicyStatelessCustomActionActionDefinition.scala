package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition extends StObject {
  
  /**
    * A configuration block describing the stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet. You can pair this custom action with any of the standard stateless rule actions. See Publish Metric Action below for details.
    */
  var publishMetricAction: Input[
    FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction
  ]
}
object FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition {
  
  inline def apply(
    publishMetricAction: Input[
      FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction
    ]
  ): FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition = {
    val __obj = js.Dynamic.literal(publishMetricAction = publishMetricAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition]
  }
  
  extension [Self <: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition](x: Self) {
    
    inline def setPublishMetricAction(
      value: Input[
          FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction
        ]
    ): Self = StObject.set(x, "publishMetricAction", value.asInstanceOf[js.Any])
  }
}
