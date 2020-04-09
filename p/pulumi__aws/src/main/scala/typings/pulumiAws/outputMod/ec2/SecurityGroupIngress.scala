package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupIngress extends js.Object {
  /**
    * List of CIDR blocks.
    */
  var cidrBlocks: js.UndefOr[js.Array[String]] = js.native
  /**
    * Description of this egress rule.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The start port (or ICMP type number if protocol is "icmp")
    */
  var fromPort: Double = js.native
  /**
    * List of IPv6 CIDR blocks.
    */
  var ipv6CidrBlocks: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of prefix list IDs (for allowing access to VPC endpoints)
    */
  var prefixListIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The protocol. If you select a protocol of
    * "-1" (semantically equivalent to `"all"`, which is not a valid value here), you must specify a "fromPort" and "toPort" equal to 0. If not icmp, tcp, udp, or "-1" use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
    */
  var protocol: String = js.native
  /**
    * List of security group Group Names if using
    * EC2-Classic, or Group IDs if using a VPC.
    */
  var securityGroups: js.UndefOr[js.Array[String]] = js.native
  /**
    * If true, the security group itself will be added as
    * a source to this egress rule.
    */
  var self: js.UndefOr[Boolean] = js.native
  /**
    * The end range port (or ICMP code if protocol is "icmp").
    */
  var toPort: Double = js.native
}

object SecurityGroupIngress {
  @scala.inline
  def apply(
    fromPort: Double,
    protocol: String,
    toPort: Double,
    cidrBlocks: js.Array[String] = null,
    description: String = null,
    ipv6CidrBlocks: js.Array[String] = null,
    prefixListIds: js.Array[String] = null,
    securityGroups: js.Array[String] = null,
    self: js.UndefOr[Boolean] = js.undefined
  ): SecurityGroupIngress = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    if (cidrBlocks != null) __obj.updateDynamic("cidrBlocks")(cidrBlocks.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ipv6CidrBlocks != null) __obj.updateDynamic("ipv6CidrBlocks")(ipv6CidrBlocks.asInstanceOf[js.Any])
    if (prefixListIds != null) __obj.updateDynamic("prefixListIds")(prefixListIds.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupIngress]
  }
}

