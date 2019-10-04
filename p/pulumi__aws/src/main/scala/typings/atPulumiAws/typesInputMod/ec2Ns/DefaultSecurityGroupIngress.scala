package typings.atPulumiAws.typesInputMod.ec2Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultSecurityGroupIngress extends js.Object {
  var cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The description of the security group
    */
  var description: js.UndefOr[Input[String]] = js.undefined
  var fromPort: Input[Double]
  var ipv6CidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var prefixListIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var protocol: Input[String]
  var securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var self: js.UndefOr[Input[Boolean]] = js.undefined
  var toPort: Input[Double]
}

object DefaultSecurityGroupIngress {
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
  ): DefaultSecurityGroupIngress = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    if (cidrBlocks != null) __obj.updateDynamic("cidrBlocks")(cidrBlocks.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ipv6CidrBlocks != null) __obj.updateDynamic("ipv6CidrBlocks")(ipv6CidrBlocks.asInstanceOf[js.Any])
    if (prefixListIds != null) __obj.updateDynamic("prefixListIds")(prefixListIds.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSecurityGroupIngress]
  }
}

