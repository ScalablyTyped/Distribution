package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAclIngress extends js.Object {
  /**
    * The action to take.
    */
  var action: String = js.native
  /**
    * The CIDR block to match. This must be a
    * valid network mask.
    */
  var cidrBlock: js.UndefOr[String] = js.native
  /**
    * The from port to match.
    */
  var fromPort: Double = js.native
  /**
    * The ICMP type code to be used. Default 0.
    */
  var icmpCode: js.UndefOr[Double] = js.native
  /**
    * The ICMP type to be used. Default 0.
    */
  var icmpType: js.UndefOr[Double] = js.native
  /**
    * The IPv6 CIDR block.
    */
  var ipv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * The protocol to match. If using the -1 'all'
    * protocol, you must specify a from and to port of 0.
    */
  var protocol: String = js.native
  /**
    * The rule number. Used for ordering.
    */
  var ruleNo: Double = js.native
  /**
    * The to port to match.
    */
  var toPort: Double = js.native
}

object NetworkAclIngress {
  @scala.inline
  def apply(action: String, fromPort: Double, protocol: String, ruleNo: Double, toPort: Double): NetworkAclIngress = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], ruleNo = ruleNo.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAclIngress]
  }
  @scala.inline
  implicit class NetworkAclIngressOps[Self <: NetworkAclIngress] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromPort(value: Double): Self = this.set("fromPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleNo(value: Double): Self = this.set("ruleNo", value.asInstanceOf[js.Any])
    @scala.inline
    def setToPort(value: Double): Self = this.set("toPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setCidrBlock(value: String): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlock: Self = this.set("cidrBlock", js.undefined)
    @scala.inline
    def setIcmpCode(value: Double): Self = this.set("icmpCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcmpCode: Self = this.set("icmpCode", js.undefined)
    @scala.inline
    def setIcmpType(value: Double): Self = this.set("icmpType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcmpType: Self = this.set("icmpType", js.undefined)
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = this.set("ipv6CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6CidrBlock: Self = this.set("ipv6CidrBlock", js.undefined)
  }
  
}

