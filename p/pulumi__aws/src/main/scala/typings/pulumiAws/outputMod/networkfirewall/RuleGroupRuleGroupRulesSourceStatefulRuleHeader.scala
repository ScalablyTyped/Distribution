package typings.pulumiAws.outputMod.networkfirewall

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRulesSourceStatefulRuleHeader extends js.Object {
  
  /**
    * The destination IP address or address range to inspect for, in CIDR notation. If left empty, this matches with any destination address.
    */
  var destination: js.UndefOr[String] = js.native
  
  /**
    * The destination port to inspect for. If left empty, this matches with any port.
    */
  var destinationPort: js.UndefOr[String] = js.native
  
  /**
    * The direction of traffic flow to inspect. Valid values: `ANY` or `FORWARD`.
    */
  var direction: String = js.native
  
  /**
    * The protocol to inspect. If not specified, this matches with any protocol.
    * Valid values: `IP`, `TCP`, `UDP`, `ICMP`, `HTTP`, `FTP`, `TLS`, `SMB`, `DNS`, `DCERPC`, `SSH`, `SMTP`, `IMAP`, `MSN`, `KRB5`, `IKEV2`, `TFTP`, `NTP`, `DHCP`.
    */
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * The source IP address or address range for, in CIDR notation. If left empty, this matches with any source address.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * The source port to inspect for. If left empty, this matches with any port.
    */
  var sourcePort: js.UndefOr[String] = js.native
}
object RuleGroupRuleGroupRulesSourceStatefulRuleHeader {
  
  @scala.inline
  def apply(direction: String): RuleGroupRuleGroupRulesSourceStatefulRuleHeader = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatefulRuleHeader]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRulesSourceStatefulRuleHeaderOps[Self <: RuleGroupRuleGroupRulesSourceStatefulRuleHeader] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setDestinationPort(value: String): Self = this.set("destinationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationPort: Self = this.set("destinationPort", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourcePort(value: String): Self = this.set("sourcePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePort: Self = this.set("sourcePort", js.undefined)
  }
}
