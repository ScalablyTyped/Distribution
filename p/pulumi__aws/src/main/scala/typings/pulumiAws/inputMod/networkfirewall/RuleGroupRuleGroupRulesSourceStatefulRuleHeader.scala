package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatefulRuleHeader extends StObject {
  
  /**
    * The destination IP address or address range to inspect for, in CIDR notation. If left empty, this matches with any destination address.
    */
  var destination: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The destination port to inspect for. If left empty, this matches with any port.
    */
  var destinationPort: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The direction of traffic flow to inspect. Valid values: `ANY` or `FORWARD`.
    */
  var direction: Input[String]
  
  /**
    * The protocol to inspect. If not specified, this matches with any protocol.
    * Valid values: `IP`, `TCP`, `UDP`, `ICMP`, `HTTP`, `FTP`, `TLS`, `SMB`, `DNS`, `DCERPC`, `SSH`, `SMTP`, `IMAP`, `MSN`, `KRB5`, `IKEV2`, `TFTP`, `NTP`, `DHCP`.
    */
  var protocol: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The source IP address or address range for, in CIDR notation. If left empty, this matches with any source address.
    */
  var source: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The source port to inspect for. If left empty, this matches with any port.
    */
  var sourcePort: js.UndefOr[Input[String]] = js.undefined
}
object RuleGroupRuleGroupRulesSourceStatefulRuleHeader {
  
  @scala.inline
  def apply(direction: Input[String]): RuleGroupRuleGroupRulesSourceStatefulRuleHeader = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatefulRuleHeader]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRulesSourceStatefulRuleHeaderMutableBuilder[Self <: RuleGroupRuleGroupRulesSourceStatefulRuleHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: Input[String]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPort(value: Input[String]): Self = StObject.set(x, "destinationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPortUndefined: Self = StObject.set(x, "destinationPort", js.undefined)
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setDirection(value: Input[String]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setSource(value: Input[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePort(value: Input[String]): Self = StObject.set(x, "sourcePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePortUndefined: Self = StObject.set(x, "sourcePort", js.undefined)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
