package typings.pulumiAws.getSubnetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetSubnetFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSubnetResult extends js.Object {
  /**
    * The ARN of the subnet.
    */
  val arn: String = js.native
  val assignIpv6AddressOnCreation: Boolean = js.native
  val availabilityZone: String = js.native
  val availabilityZoneId: String = js.native
  val cidrBlock: String = js.native
  val defaultForAz: Boolean = js.native
  val filters: js.UndefOr[js.Array[GetSubnetFilter]] = js.native
  val id: String = js.native
  val ipv6CidrBlock: String = js.native
  val ipv6CidrBlockAssociationId: String = js.native
  val mapPublicIpOnLaunch: Boolean = js.native
  /**
    * The ID of the AWS account that owns the subnet.
    */
  val ownerId: String = js.native
  val state: String = js.native
  val tags: StringDictionary[js.Any] = js.native
  val vpcId: String = js.native
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
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], assignIpv6AddressOnCreation = assignIpv6AddressOnCreation.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], availabilityZoneId = availabilityZoneId.asInstanceOf[js.Any], cidrBlock = cidrBlock.asInstanceOf[js.Any], defaultForAz = defaultForAz.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipv6CidrBlock = ipv6CidrBlock.asInstanceOf[js.Any], ipv6CidrBlockAssociationId = ipv6CidrBlockAssociationId.asInstanceOf[js.Any], mapPublicIpOnLaunch = mapPublicIpOnLaunch.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubnetResult]
  }
}

