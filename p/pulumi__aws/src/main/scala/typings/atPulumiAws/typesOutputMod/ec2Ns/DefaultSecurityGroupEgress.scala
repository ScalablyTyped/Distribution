package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultSecurityGroupEgress extends js.Object {
  var cidrBlocks: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The description of the security group
    */
  var description: js.UndefOr[String] = js.undefined
  var fromPort: Double
  var ipv6CidrBlocks: js.UndefOr[js.Array[String]] = js.undefined
  var prefixListIds: js.UndefOr[js.Array[String]] = js.undefined
  var protocol: String
  var securityGroups: js.UndefOr[js.Array[String]] = js.undefined
  var self: js.UndefOr[Boolean] = js.undefined
  var toPort: Double
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
    val __obj = js.Dynamic.literal(fromPort = fromPort, protocol = protocol, toPort = toPort)
    if (cidrBlocks != null) __obj.updateDynamic("cidrBlocks")(cidrBlocks)
    if (description != null) __obj.updateDynamic("description")(description)
    if (ipv6CidrBlocks != null) __obj.updateDynamic("ipv6CidrBlocks")(ipv6CidrBlocks)
    if (prefixListIds != null) __obj.updateDynamic("prefixListIds")(prefixListIds)
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups)
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[DefaultSecurityGroupEgress]
  }
}

