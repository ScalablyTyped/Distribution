package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction extends StObject {
  
  /**
    * Set of configuration blocks describing dimension settings to use for Amazon CloudWatch custom metrics. See Dimension below for more details.
    */
  var dimensions: Input[
    js.Array[
      Input[
        FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension
      ]
    ]
  ]
}
object FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction {
  
  inline def apply(
    dimensions: Input[
      js.Array[
        Input[
          FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension
        ]
      ]
    ]
  ): FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction]
  }
  
  extension [Self <: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction](x: Self) {
    
    inline def setDimensions(
      value: Input[
          js.Array[
            Input[
              FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension
            ]
          ]
        ]
    ): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsVarargs(
      value: (Input[
          FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension
        ])*
    ): Self = StObject.set(x, "dimensions", js.Array(value :_*))
  }
}
