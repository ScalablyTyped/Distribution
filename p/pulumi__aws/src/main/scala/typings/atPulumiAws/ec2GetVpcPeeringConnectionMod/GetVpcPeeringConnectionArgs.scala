package typings.atPulumiAws.ec2GetVpcPeeringConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcPeeringConnectionArgs extends js.Object {
  /**
    * The CIDR block of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val cidrBlock: js.UndefOr[String] = js.undefined
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  /**
    * The ID of the specific VPC Peering Connection to retrieve.
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * The AWS account ID of the owner of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val ownerId: js.UndefOr[String] = js.undefined
  /**
    * The CIDR block of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerCidrBlock: js.UndefOr[String] = js.undefined
  /**
    * The AWS account ID of the owner of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerOwnerId: js.UndefOr[String] = js.undefined
  /**
    * The region of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerRegion: js.UndefOr[String] = js.undefined
  /**
    * The ID of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerVpcId: js.UndefOr[String] = js.undefined
  /**
    * The region of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val region: js.UndefOr[String] = js.undefined
  /**
    * The status of the specific VPC Peering Connection to retrieve.
    */
  val status: js.UndefOr[String] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired VPC Peering Connection.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * The ID of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val vpcId: js.UndefOr[String] = js.undefined
}

object GetVpcPeeringConnectionArgs {
  @scala.inline
  def apply(
    cidrBlock: String = null,
    filters: js.Array[Anon_NameValues] = null,
    id: String = null,
    ownerId: String = null,
    peerCidrBlock: String = null,
    peerOwnerId: String = null,
    peerRegion: String = null,
    peerVpcId: String = null,
    region: String = null,
    status: String = null,
    tags: StringDictionary[js.Any] = null,
    vpcId: String = null
  ): GetVpcPeeringConnectionArgs = {
    val __obj = js.Dynamic.literal()
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId)
    if (peerCidrBlock != null) __obj.updateDynamic("peerCidrBlock")(peerCidrBlock)
    if (peerOwnerId != null) __obj.updateDynamic("peerOwnerId")(peerOwnerId)
    if (peerRegion != null) __obj.updateDynamic("peerRegion")(peerRegion)
    if (peerVpcId != null) __obj.updateDynamic("peerVpcId")(peerVpcId)
    if (region != null) __obj.updateDynamic("region")(region)
    if (status != null) __obj.updateDynamic("status")(status)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[GetVpcPeeringConnectionArgs]
  }
}

