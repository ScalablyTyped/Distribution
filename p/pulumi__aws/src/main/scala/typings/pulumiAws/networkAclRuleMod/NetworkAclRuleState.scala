package typings.pulumiAws.networkAclRuleMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkAclRuleState extends js.Object {
  
  /**
    * The network range to allow or deny, in CIDR notation (for example 172.16.0.0/24 ).
    */
  val cidrBlock: js.UndefOr[Input[String]] = js.native
  
  /**
    * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet). Default `false`.
    */
  val egress: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The from port to match.
    */
  val fromPort: js.UndefOr[Input[Double]] = js.native
  
  /**
    * ICMP protocol: The ICMP code. Required if specifying ICMP for the protocol. e.g. -1
    */
  val icmpCode: js.UndefOr[Input[String]] = js.native
  
  /**
    * ICMP protocol: The ICMP type. Required if specifying ICMP for the protocol. e.g. -1
    */
  val icmpType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IPv6 CIDR block to allow or deny.
    */
  val ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the network ACL.
    */
  val networkAclId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The protocol. A value of -1 means all protocols.
    */
  val protocol: js.UndefOr[Input[String]] = js.native
  
  /**
    * Indicates whether to allow or deny the traffic that matches the rule. Accepted values: `allow` | `deny`
    */
  val ruleAction: js.UndefOr[Input[String]] = js.native
  
  /**
    * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
    */
  val ruleNumber: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The to port to match.
    */
  val toPort: js.UndefOr[Input[Double]] = js.native
}
object NetworkAclRuleState {
  
  @scala.inline
  def apply(): NetworkAclRuleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAclRuleState]
  }
  
  @scala.inline
  implicit class NetworkAclRuleStateOps[Self <: NetworkAclRuleState] (val x: Self) extends AnyVal {
    
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
    def setCidrBlock(value: Input[String]): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlock: Self = this.set("cidrBlock", js.undefined)
    
    @scala.inline
    def setEgress(value: Input[Boolean]): Self = this.set("egress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEgress: Self = this.set("egress", js.undefined)
    
    @scala.inline
    def setFromPort(value: Input[Double]): Self = this.set("fromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromPort: Self = this.set("fromPort", js.undefined)
    
    @scala.inline
    def setIcmpCode(value: Input[String]): Self = this.set("icmpCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcmpCode: Self = this.set("icmpCode", js.undefined)
    
    @scala.inline
    def setIcmpType(value: Input[String]): Self = this.set("icmpType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcmpType: Self = this.set("icmpType", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlock(value: Input[String]): Self = this.set("ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6CidrBlock: Self = this.set("ipv6CidrBlock", js.undefined)
    
    @scala.inline
    def setNetworkAclId(value: Input[String]): Self = this.set("networkAclId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkAclId: Self = this.set("networkAclId", js.undefined)
    
    @scala.inline
    def setProtocol(value: Input[String]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setRuleAction(value: Input[String]): Self = this.set("ruleAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleAction: Self = this.set("ruleAction", js.undefined)
    
    @scala.inline
    def setRuleNumber(value: Input[Double]): Self = this.set("ruleNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleNumber: Self = this.set("ruleNumber", js.undefined)
    
    @scala.inline
    def setToPort(value: Input[Double]): Self = this.set("toPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToPort: Self = this.set("toPort", js.undefined)
  }
}
