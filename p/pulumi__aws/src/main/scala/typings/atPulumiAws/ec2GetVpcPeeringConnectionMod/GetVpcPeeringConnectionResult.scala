package typings.atPulumiAws.ec2GetVpcPeeringConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2Ns.GetVpcPeeringConnectionFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcPeeringConnectionResult extends js.Object {
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the accepter VPC.
    */
  val accepter: StringDictionary[Boolean]
  val cidrBlock: String
  val filters: js.UndefOr[js.Array[GetVpcPeeringConnectionFilter]] = js.undefined
  val id: String
  val ownerId: String
  val peerCidrBlock: String
  val peerOwnerId: String
  val peerRegion: String
  val peerVpcId: String
  val region: String
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the requester VPC.
    */
  val requester: StringDictionary[Boolean]
  val status: String
  val tags: StringDictionary[js.Any]
  val vpcId: String
}

object GetVpcPeeringConnectionResult {
  @scala.inline
  def apply(
    accepter: StringDictionary[Boolean],
    cidrBlock: String,
    id: String,
    ownerId: String,
    peerCidrBlock: String,
    peerOwnerId: String,
    peerRegion: String,
    peerVpcId: String,
    region: String,
    requester: StringDictionary[Boolean],
    status: String,
    tags: StringDictionary[js.Any],
    vpcId: String,
    filters: js.Array[GetVpcPeeringConnectionFilter] = null
  ): GetVpcPeeringConnectionResult = {
    val __obj = js.Dynamic.literal(accepter = accepter, cidrBlock = cidrBlock, id = id, ownerId = ownerId, peerCidrBlock = peerCidrBlock, peerOwnerId = peerOwnerId, peerRegion = peerRegion, peerVpcId = peerVpcId, region = region, requester = requester, status = status, tags = tags, vpcId = vpcId)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetVpcPeeringConnectionResult]
  }
}

