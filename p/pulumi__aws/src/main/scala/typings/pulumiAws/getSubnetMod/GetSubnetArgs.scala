package typings.pulumiAws.getSubnetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetSubnetFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSubnetArgs extends js.Object {
  /**
    * The availability zone where the
    * subnet must reside.
    */
  val availabilityZone: js.UndefOr[String] = js.native
  /**
    * The ID of the Availability Zone for the subnet.
    */
  val availabilityZoneId: js.UndefOr[String] = js.native
  /**
    * The cidr block of the desired subnet.
    */
  val cidrBlock: js.UndefOr[String] = js.native
  /**
    * Boolean constraint for whether the desired
    * subnet must be the default subnet for its associated availability zone.
    */
  val defaultForAz: js.UndefOr[Boolean] = js.native
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetSubnetFilter]] = js.native
  /**
    * The id of the specific subnet to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The Ipv6 cidr block of the desired subnet
    */
  val ipv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * The state that the desired subnet must have.
    */
  val state: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired subnet.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The id of the VPC that the desired subnet belongs to.
    */
  val vpcId: js.UndefOr[String] = js.native
}

object GetSubnetArgs {
  @scala.inline
  def apply(
    availabilityZone: String = null,
    availabilityZoneId: String = null,
    cidrBlock: String = null,
    defaultForAz: js.UndefOr[Boolean] = js.undefined,
    filters: js.Array[GetSubnetFilter] = null,
    id: String = null,
    ipv6CidrBlock: String = null,
    state: String = null,
    tags: StringDictionary[js.Any] = null,
    vpcId: String = null
  ): GetSubnetArgs = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (availabilityZoneId != null) __obj.updateDynamic("availabilityZoneId")(availabilityZoneId.asInstanceOf[js.Any])
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultForAz)) __obj.updateDynamic("defaultForAz")(defaultForAz.get.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubnetArgs]
  }
}

