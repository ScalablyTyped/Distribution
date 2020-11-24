package typings.pulumiAws.outputMod.networkfirewall

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction extends js.Object {
  
  /**
    * Set of configuration blocks describing dimension settings to use for Amazon CloudWatch custom metrics. See Dimension below for more details.
    */
  var dimensions: js.Array[
    FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension
  ] = js.native
}
object FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction {
  
  @scala.inline
  def apply(
    dimensions: js.Array[
      FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension
    ]
  ): FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction]
  }
  
  @scala.inline
  implicit class FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionOps[Self <: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDimensionsVarargs(
      value: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension*
    ): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(
      value: js.Array[
          FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension
        ]
    ): Self = this.set("dimensions", value.asInstanceOf[js.Any])
  }
}
