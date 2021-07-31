package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource extends StObject {
  
  /**
    * An IP address or a block of IP addresses in CIDR notation. AWS Network Firewall supports all address ranges for IPv4.
    */
  var addressDefinition: js.UndefOr[String] = js.undefined
}
object RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource {
  
  @scala.inline
  def apply(): RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceMutableBuilder[Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressDefinition(value: String): Self = StObject.set(x, "addressDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressDefinitionUndefined: Self = StObject.set(x, "addressDefinition", js.undefined)
  }
}
