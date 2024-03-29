package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension extends StObject {
  
  /**
    * The string value to use in the custom metric dimension.
    */
  var value: String
}
object FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension {
  
  inline def apply(value: String): FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension]
  }
  
  extension [Self <: FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
