package typings.atPulumiAws.ec2GetSubnetMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.GetSubnetFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSubnetResult extends js.Object {
  /**
    * The ARN of the subnet.
    */
  val arn: String
  val assignIpv6AddressOnCreation: Boolean
  val availabilityZone: String
  val availabilityZoneId: String
  val cidrBlock: String
  val defaultForAz: Boolean
  val filters: js.UndefOr[js.Array[GetSubnetFilter]] = js.undefined
  val id: String
  val ipv6CidrBlock: String
  val ipv6CidrBlockAssociationId: String
  val mapPublicIpOnLaunch: Boolean
  /**
    * The ID of the AWS account that owns the subnet.
    */
  val ownerId: String
  val state: String
  val tags: StringDictionary[js.Any]
  val vpcId: String
}

object GetSubnetResult {
  @scala.inline
  def apply(
    arn: String,
    assignIpv6AddressOnCreation: Boolean,
    availabilityZone: String,
    availabilityZoneId: String,
    cidrBlock: String,
    defaultForAz: Boolean,
    id: String,
    ipv6CidrBlock: String,
    ipv6CidrBlockAssociationId: String,
    mapPublicIpOnLaunch: Boolean,
    ownerId: String,
    state: String,
    tags: StringDictionary[js.Any],
    vpcId: String,
    filters: js.Array[GetSubnetFilter] = null
  ): GetSubnetResult = {
    val __obj = js.Dynamic.literal(arn = arn, assignIpv6AddressOnCreation = assignIpv6AddressOnCreation, availabilityZone = availabilityZone, availabilityZoneId = availabilityZoneId, cidrBlock = cidrBlock, defaultForAz = defaultForAz, id = id, ipv6CidrBlock = ipv6CidrBlock, ipv6CidrBlockAssociationId = ipv6CidrBlockAssociationId, mapPublicIpOnLaunch = mapPublicIpOnLaunch, ownerId = ownerId, state = state, tags = tags, vpcId = vpcId)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetSubnetResult]
  }
}

