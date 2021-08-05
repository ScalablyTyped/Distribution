package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag extends StObject {
  
  /**
    * Set of flags to look for in a packet. AWS Network Firewall checks only the part of the packet specified in `masks`.
    * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
    */
  var flags: Input[js.Array[Input[String]]]
  
  /**
    * Set of values describing the part of the packet that you want to check for the flags. To inspect the entire packet, leave this empty.
    * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
    */
  var masks: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag {
  
  inline def apply(flags: Input[js.Array[Input[String]]]): RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag]
  }
  
  extension [Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag](x: Self) {
    
    inline def setFlags(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsVarargs(value: Input[String]*): Self = StObject.set(x, "flags", js.Array(value :_*))
    
    inline def setMasks(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "masks", value.asInstanceOf[js.Any])
    
    inline def setMasksUndefined: Self = StObject.set(x, "masks", js.undefined)
    
    inline def setMasksVarargs(value: Input[String]*): Self = StObject.set(x, "masks", js.Array(value :_*))
  }
}
