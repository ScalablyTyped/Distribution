package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupIngress extends js.Object {
  /**
    * List of CIDR blocks.
    */
  var cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Description of this egress rule.
    */
  var description: js.UndefOr[Input[String]] = js.native
  /**
    * The start port (or ICMP type number if protocol is "icmp")
    */
  var fromPort: Input[Double] = js.native
  /**
    * List of IPv6 CIDR blocks.
    */
  var ipv6CidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of prefix list IDs (for allowing access to VPC endpoints)
    */
  var prefixListIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The protocol. If you select a protocol of
    * "-1" (semantically equivalent to `"all"`, which is not a valid value here), you must specify a "fromPort" and "toPort" equal to 0. If not icmp, tcp, udp, or "-1" use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
    */
  var protocol: Input[String] = js.native
  /**
    * List of security group Group Names if using
    * EC2-Classic, or Group IDs if using a VPC.
    */
  var securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * If true, the security group itself will be added as
    * a source to this egress rule.
    */
  var self: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The end range port (or ICMP code if protocol is "icmp").
    */
  var toPort: Input[Double] = js.native
}

object SecurityGroupIngress {
  @scala.inline
  def apply(
    fromPort: Input[Double],
    protocol: Input[String],
    toPort: Input[Double],
    cidrBlocks: Input[js.Array[Input[String]]] = null,
    description: Input[String] = null,
    ipv6CidrBlocks: Input[js.Array[Input[String]]] = null,
    prefixListIds: Input[js.Array[Input[String]]] = null,
    securityGroups: Input[js.Array[Input[String]]] = null,
    self: Input[Boolean] = null
  ): SecurityGroupIngress = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    if (cidrBlocks != null) __obj.updateDynamic("cidrBlocks")(cidrBlocks.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ipv6CidrBlocks != null) __obj.updateDynamic("ipv6CidrBlocks")(ipv6CidrBlocks.asInstanceOf[js.Any])
    if (prefixListIds != null) __obj.updateDynamic("prefixListIds")(prefixListIds.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupIngress]
  }
}

