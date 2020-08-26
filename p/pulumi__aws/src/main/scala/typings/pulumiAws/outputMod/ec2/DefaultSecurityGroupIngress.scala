package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultSecurityGroupIngress extends js.Object {
  var cidrBlocks: js.UndefOr[js.Array[String]] = js.native
  /**
    * The description of the security group
    */
  var description: js.UndefOr[String] = js.native
  var fromPort: Double = js.native
  var ipv6CidrBlocks: js.UndefOr[js.Array[String]] = js.native
  var prefixListIds: js.UndefOr[js.Array[String]] = js.native
  var protocol: String = js.native
  var securityGroups: js.UndefOr[js.Array[String]] = js.native
  var self: js.UndefOr[Boolean] = js.native
  var toPort: Double = js.native
}

object DefaultSecurityGroupIngress {
  @scala.inline
  def apply(fromPort: Double, protocol: String, toPort: Double): DefaultSecurityGroupIngress = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSecurityGroupIngress]
  }
  @scala.inline
  implicit class DefaultSecurityGroupIngressOps[Self <: DefaultSecurityGroupIngress] (val x: Self) extends AnyVal {
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
    def setFromPort(value: Double): Self = this.set("fromPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setToPort(value: Double): Self = this.set("toPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setCidrBlocksVarargs(value: String*): Self = this.set("cidrBlocks", js.Array(value :_*))
    @scala.inline
    def setCidrBlocks(value: js.Array[String]): Self = this.set("cidrBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlocks: Self = this.set("cidrBlocks", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIpv6CidrBlocksVarargs(value: String*): Self = this.set("ipv6CidrBlocks", js.Array(value :_*))
    @scala.inline
    def setIpv6CidrBlocks(value: js.Array[String]): Self = this.set("ipv6CidrBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6CidrBlocks: Self = this.set("ipv6CidrBlocks", js.undefined)
    @scala.inline
    def setPrefixListIdsVarargs(value: String*): Self = this.set("prefixListIds", js.Array(value :_*))
    @scala.inline
    def setPrefixListIds(value: js.Array[String]): Self = this.set("prefixListIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixListIds: Self = this.set("prefixListIds", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: js.Array[String]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
    @scala.inline
    def setSelf(value: Boolean): Self = this.set("self", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelf: Self = this.set("self", js.undefined)
  }
  
}

