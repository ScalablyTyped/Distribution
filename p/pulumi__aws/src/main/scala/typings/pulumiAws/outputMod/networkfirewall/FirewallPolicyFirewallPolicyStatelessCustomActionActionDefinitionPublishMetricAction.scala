package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction extends StObject {
  
  /**
    * Set of configuration blocks describing dimension settings to use for Amazon CloudWatch custom metrics. See Dimension below for more details.
    */
  var dimensions: js.Array[
    FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension
  ]
}
object FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction {
  
  inline def apply(
    dimensions: js.Array[
      FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension
    ]
  ): FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction]
  }
  
  extension [Self <: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction](x: Self) {
    
    inline def setDimensions(
      value: js.Array[
          FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension
        ]
    ): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsVarargs(
      value: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension*
    ): Self = StObject.set(x, "dimensions", js.Array(value :_*))
  }
}
