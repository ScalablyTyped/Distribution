package typings.pulumiAws.securityGroupRuleMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityGroupRuleState extends js.Object {
  
  /**
    * List of CIDR blocks. Cannot be specified with `sourceSecurityGroupId`.
    */
  val cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Description of the rule.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The start port (or ICMP type number if protocol is "icmp" or "icmpv6").
    */
  val fromPort: js.UndefOr[Input[Double]] = js.native
  
  /**
    * List of IPv6 CIDR blocks.
    */
  val ipv6CidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * List of prefix list IDs (for allowing access to VPC endpoints).
    * Only valid with `egress`.
    */
  val prefixListIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The protocol. If not icmp, icmpv6, tcp, udp, or all use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
    */
  val protocol: js.UndefOr[Input[String]] = js.native
  
  /**
    * The security group to apply this rule to.
    */
  val securityGroupId: js.UndefOr[Input[String]] = js.native
  
  /**
    * If true, the security group itself will be added as
    * a source to this ingress rule. Cannot be specified with `sourceSecurityGroupId`.
    */
  val self: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The security group id to allow access to/from,
    * depending on the `type`. Cannot be specified with `cidrBlocks` and `self`.
    */
  val sourceSecurityGroupId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The end port (or ICMP code if protocol is "icmp").
    */
  val toPort: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The type of rule being created. Valid options are `ingress` (inbound)
    * or `egress` (outbound).
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}
object SecurityGroupRuleState {
  
  @scala.inline
  def apply(): SecurityGroupRuleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupRuleState]
  }
  
  @scala.inline
  implicit class SecurityGroupRuleStateOps[Self <: SecurityGroupRuleState] (val x: Self) extends AnyVal {
    
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
    def setCidrBlocksVarargs(value: Input[String]*): Self = this.set("cidrBlocks", js.Array(value :_*))
    
    @scala.inline
    def setCidrBlocks(value: Input[js.Array[Input[String]]]): Self = this.set("cidrBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlocks: Self = this.set("cidrBlocks", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFromPort(value: Input[Double]): Self = this.set("fromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromPort: Self = this.set("fromPort", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlocksVarargs(value: Input[String]*): Self = this.set("ipv6CidrBlocks", js.Array(value :_*))
    
    @scala.inline
    def setIpv6CidrBlocks(value: Input[js.Array[Input[String]]]): Self = this.set("ipv6CidrBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6CidrBlocks: Self = this.set("ipv6CidrBlocks", js.undefined)
    
    @scala.inline
    def setPrefixListIdsVarargs(value: Input[String]*): Self = this.set("prefixListIds", js.Array(value :_*))
    
    @scala.inline
    def setPrefixListIds(value: Input[js.Array[Input[String]]]): Self = this.set("prefixListIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixListIds: Self = this.set("prefixListIds", js.undefined)
    
    @scala.inline
    def setProtocol(value: Input[String]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setSecurityGroupId(value: Input[String]): Self = this.set("securityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupId: Self = this.set("securityGroupId", js.undefined)
    
    @scala.inline
    def setSelf(value: Input[Boolean]): Self = this.set("self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelf: Self = this.set("self", js.undefined)
    
    @scala.inline
    def setSourceSecurityGroupId(value: Input[String]): Self = this.set("sourceSecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSecurityGroupId: Self = this.set("sourceSecurityGroupId", js.undefined)
    
    @scala.inline
    def setToPort(value: Input[Double]): Self = this.set("toPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToPort: Self = this.set("toPort", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
