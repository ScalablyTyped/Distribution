package typings.pulumiAws.subnetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetArgs extends js.Object {
  /**
    * Specify true to indicate
    * that network interfaces created in the specified subnet should be
    * assigned an IPv6 address. Default is `false`
    */
  val assignIpv6AddressOnCreation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The AZ for the subnet.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The AZ ID of the subnet.
    */
  val availabilityZoneId: js.UndefOr[Input[String]] = js.native
  /**
    * The CIDR block for the subnet.
    */
  val cidrBlock: Input[String] = js.native
  /**
    * The IPv6 network range for the subnet,
    * in CIDR notation. The subnet size must use a /64 prefix length.
    */
  val ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * Specify true to indicate
    * that instances launched into the subnet should be assigned
    * a public IP address. Default is `false`.
    */
  val mapPublicIpOnLaunch: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The VPC ID.
    */
  val vpcId: Input[String] = js.native
}

object SubnetArgs {
  @scala.inline
  def apply(
    cidrBlock: Input[String],
    vpcId: Input[String],
    assignIpv6AddressOnCreation: Input[Boolean] = null,
    availabilityZone: Input[String] = null,
    availabilityZoneId: Input[String] = null,
    ipv6CidrBlock: Input[String] = null,
    mapPublicIpOnLaunch: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null
  ): SubnetArgs = {
    val __obj = js.Dynamic.literal(cidrBlock = cidrBlock.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    if (assignIpv6AddressOnCreation != null) __obj.updateDynamic("assignIpv6AddressOnCreation")(assignIpv6AddressOnCreation.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (availabilityZoneId != null) __obj.updateDynamic("availabilityZoneId")(availabilityZoneId.asInstanceOf[js.Any])
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock.asInstanceOf[js.Any])
    if (mapPublicIpOnLaunch != null) __obj.updateDynamic("mapPublicIpOnLaunch")(mapPublicIpOnLaunch.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetArgs]
  }
}

