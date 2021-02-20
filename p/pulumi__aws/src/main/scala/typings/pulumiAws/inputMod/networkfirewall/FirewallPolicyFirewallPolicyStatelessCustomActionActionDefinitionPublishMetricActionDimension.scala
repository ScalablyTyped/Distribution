package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension extends StObject {
  
  /**
    * The string value to use in the custom metric dimension.
    */
  var value: Input[String] = js.native
}
object FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension {
  
  @scala.inline
  def apply(value: Input[String]): FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension]
  }
  
  @scala.inline
  implicit class FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimensionMutableBuilder[Self <: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
