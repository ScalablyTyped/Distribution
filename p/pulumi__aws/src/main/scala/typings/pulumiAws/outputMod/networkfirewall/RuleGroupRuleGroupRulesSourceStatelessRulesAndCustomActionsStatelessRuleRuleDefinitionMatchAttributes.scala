package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes extends StObject {
  
  /**
    * Set of configuration blocks describing the destination ports to inspect for. If not specified, this matches with any destination port. See Destination Port below for details.
    */
  var destinationPorts: js.UndefOr[
    js.Array[
      RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort
    ]
  ] = js.undefined
  
  /**
    * Set of configuration blocks describing the destination IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any destination address. See Destination below for details.
    */
  var destinations: js.UndefOr[
    js.Array[
      RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination
    ]
  ] = js.undefined
  
  /**
    * Set of protocols to inspect for, specified using the protocol's assigned internet protocol number (IANA).
    */
  var protocols: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Set of configuration blocks describing the source ports to inspect for. If not specified, this matches with any source port. See Source Port below for details.
    */
  var sourcePorts: js.UndefOr[
    js.Array[
      RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort
    ]
  ] = js.undefined
  
  /**
    * Set of configuration blocks describing the source IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any source address. See Source below for details.
    */
  var sources: js.UndefOr[
    js.Array[
      RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource
    ]
  ] = js.undefined
  
  /**
    * Set of configuration blocks containing the TCP flags and masks to inspect for. If not specified, this matches with any settings.
    */
  var tcpFlags: js.UndefOr[
    js.Array[
      RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag
    ]
  ] = js.undefined
}
object RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes {
  
  inline def apply(): RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes]
  }
  
  extension [Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes](x: Self) {
    
    inline def setDestinationPorts(
      value: js.Array[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort
        ]
    ): Self = StObject.set(x, "destinationPorts", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortsUndefined: Self = StObject.set(x, "destinationPorts", js.undefined)
    
    inline def setDestinationPortsVarargs(
      value: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort*
    ): Self = StObject.set(x, "destinationPorts", js.Array(value :_*))
    
    inline def setDestinations(
      value: js.Array[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination
        ]
    ): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    inline def setDestinationsVarargs(
      value: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination*
    ): Self = StObject.set(x, "destinations", js.Array(value :_*))
    
    inline def setProtocols(value: js.Array[Double]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: Double*): Self = StObject.set(x, "protocols", js.Array(value :_*))
    
    inline def setSourcePorts(
      value: js.Array[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort
        ]
    ): Self = StObject.set(x, "sourcePorts", value.asInstanceOf[js.Any])
    
    inline def setSourcePortsUndefined: Self = StObject.set(x, "sourcePorts", js.undefined)
    
    inline def setSourcePortsVarargs(
      value: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort*
    ): Self = StObject.set(x, "sourcePorts", js.Array(value :_*))
    
    inline def setSources(
      value: js.Array[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource
        ]
    ): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(
      value: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource*
    ): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    inline def setTcpFlags(
      value: js.Array[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag
        ]
    ): Self = StObject.set(x, "tcpFlags", value.asInstanceOf[js.Any])
    
    inline def setTcpFlagsUndefined: Self = StObject.set(x, "tcpFlags", js.undefined)
    
    inline def setTcpFlagsVarargs(
      value: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag*
    ): Self = StObject.set(x, "tcpFlags", js.Array(value :_*))
  }
}
