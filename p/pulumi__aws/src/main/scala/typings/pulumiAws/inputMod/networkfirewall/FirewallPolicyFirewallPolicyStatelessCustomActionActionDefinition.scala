package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition extends js.Object {
  
  /**
    * A configuration block describing the stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet. You can pair this custom action with any of the standard stateless rule actions. See Publish Metric Action below for details.
    */
  var publishMetricAction: Input[
    FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction
  ] = js.native
}
object FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition {
  
  @scala.inline
  def apply(
    publishMetricAction: Input[
      FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction
    ]
  ): FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition = {
    val __obj = js.Dynamic.literal(publishMetricAction = publishMetricAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition]
  }
  
  @scala.inline
  implicit class FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionOps[Self <: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition] (val x: Self) extends AnyVal {
    
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
    def setPublishMetricAction(
      value: Input[
          FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction
        ]
    ): Self = this.set("publishMetricAction", value.asInstanceOf[js.Any])
  }
}
