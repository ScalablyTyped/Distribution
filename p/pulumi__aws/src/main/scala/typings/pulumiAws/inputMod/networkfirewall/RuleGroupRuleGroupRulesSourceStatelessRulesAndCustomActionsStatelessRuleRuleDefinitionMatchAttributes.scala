package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes extends js.Object {
  
  /**
    * Set of configuration blocks describing the destination ports to inspect for. If not specified, this matches with any destination port. See Destination Port below for details.
    */
  var destinationPorts: js.UndefOr[
    Input[
      js.Array[
        Input[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort
        ]
      ]
    ]
  ] = js.native
  
  /**
    * Set of configuration blocks describing the destination IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any destination address. See Destination below for details.
    */
  var destinations: js.UndefOr[
    Input[
      js.Array[
        Input[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination
        ]
      ]
    ]
  ] = js.native
  
  /**
    * Set of protocols to inspect for, specified using the protocol's assigned internet protocol number (IANA).
    */
  var protocols: js.UndefOr[Input[js.Array[Input[Double]]]] = js.native
  
  /**
    * Set of configuration blocks describing the source ports to inspect for. If not specified, this matches with any source port. See Source Port below for details.
    */
  var sourcePorts: js.UndefOr[
    Input[
      js.Array[
        Input[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort
        ]
      ]
    ]
  ] = js.native
  
  /**
    * Set of configuration blocks describing the source IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any source address. See Source below for details.
    */
  var sources: js.UndefOr[
    Input[
      js.Array[
        Input[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource
        ]
      ]
    ]
  ] = js.native
  
  /**
    * Set of configuration blocks containing the TCP flags and masks to inspect for. If not specified, this matches with any settings.
    */
  var tcpFlags: js.UndefOr[
    Input[
      js.Array[
        Input[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag
        ]
      ]
    ]
  ] = js.native
}
object RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes {
  
  @scala.inline
  def apply(): RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesOps[Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes] (val x: Self) extends AnyVal {
    
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
    def setDestinationPortsVarargs(
      value: (Input[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort
        ])*
    ): Self = this.set("destinationPorts", js.Array(value :_*))
    
    @scala.inline
    def setDestinationPorts(
      value: Input[
          js.Array[
            Input[
              RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort
            ]
          ]
        ]
    ): Self = this.set("destinationPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationPorts: Self = this.set("destinationPorts", js.undefined)
    
    @scala.inline
    def setDestinationsVarargs(
      value: (Input[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination
        ])*
    ): Self = this.set("destinations", js.Array(value :_*))
    
    @scala.inline
    def setDestinations(
      value: Input[
          js.Array[
            Input[
              RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination
            ]
          ]
        ]
    ): Self = this.set("destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinations: Self = this.set("destinations", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: Input[Double]*): Self = this.set("protocols", js.Array(value :_*))
    
    @scala.inline
    def setProtocols(value: Input[js.Array[Input[Double]]]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    
    @scala.inline
    def setSourcePortsVarargs(
      value: (Input[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort
        ])*
    ): Self = this.set("sourcePorts", js.Array(value :_*))
    
    @scala.inline
    def setSourcePorts(
      value: Input[
          js.Array[
            Input[
              RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort
            ]
          ]
        ]
    ): Self = this.set("sourcePorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePorts: Self = this.set("sourcePorts", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(
      value: (Input[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource
        ])*
    ): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(
      value: Input[
          js.Array[
            Input[
              RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource
            ]
          ]
        ]
    ): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    
    @scala.inline
    def setTcpFlagsVarargs(
      value: (Input[
          RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag
        ])*
    ): Self = this.set("tcpFlags", js.Array(value :_*))
    
    @scala.inline
    def setTcpFlags(
      value: Input[
          js.Array[
            Input[
              RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag
            ]
          ]
        ]
    ): Self = this.set("tcpFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcpFlags: Self = this.set("tcpFlags", js.undefined)
  }
}
