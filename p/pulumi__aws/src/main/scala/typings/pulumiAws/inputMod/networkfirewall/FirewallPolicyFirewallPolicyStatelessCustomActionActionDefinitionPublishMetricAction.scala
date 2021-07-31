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
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionMutableBuilder[Self <: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(
      value: Input[
          js.Array[
            Input[
              FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension
            ]
          ]
        ]
    ): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsVarargs(
      value: (Input[
          FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension
        ])*
    ): Self = StObject.set(x, "dimensions", js.Array(value :_*))
  }
}
