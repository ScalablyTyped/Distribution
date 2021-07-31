package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag extends StObject {
  
  /**
    * Set of flags to look for in a packet. AWS Network Firewall checks only the part of the packet specified in `masks`.
    * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
    */
  var flags: js.Array[String]
  
  /**
    * Set of values describing the part of the packet that you want to check for the flags. To inspect the entire packet, leave this empty.
    * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
    */
  var masks: js.UndefOr[js.Array[String]] = js.undefined
}
object RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag {
  
  @scala.inline
  def apply(flags: js.Array[String]): RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagMutableBuilder[Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value :_*))
    
    @scala.inline
    def setMasks(value: js.Array[String]): Self = StObject.set(x, "masks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasksUndefined: Self = StObject.set(x, "masks", js.undefined)
    
    @scala.inline
    def setMasksVarargs(value: String*): Self = StObject.set(x, "masks", js.Array(value :_*))
  }
}
