package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultSecurityGroupEgress extends js.Object {
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

object DefaultSecurityGroupEgress {
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
  ): DefaultSecurityGroupEgress = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    if (cidrBlocks != null) __obj.updateDynamic("cidrBlocks")(cidrBlocks.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ipv6CidrBlocks != null) __obj.updateDynamic("ipv6CidrBlocks")(ipv6CidrBlocks.asInstanceOf[js.Any])
    if (prefixListIds != null) __obj.updateDynamic("prefixListIds")(prefixListIds.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSecurityGroupEgress]
  }
}

