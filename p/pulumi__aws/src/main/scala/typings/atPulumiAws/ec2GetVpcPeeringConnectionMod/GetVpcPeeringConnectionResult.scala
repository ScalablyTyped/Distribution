package typings.atPulumiAws.ec2GetVpcPeeringConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.GetVpcPeeringConnectionFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcPeeringConnectionResult extends js.Object {
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the accepter VPC.
    */
  val accepter: StringDictionary[Boolean] = js.native
  val cidrBlock: String = js.native
  val filters: js.UndefOr[js.Array[GetVpcPeeringConnectionFilter]] = js.native
  val id: String = js.native
  val ownerId: String = js.native
  val peerCidrBlock: String = js.native
  val peerOwnerId: String = js.native
  val peerRegion: String = js.native
  val peerVpcId: String = js.native
  val region: String = js.native
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the requester VPC.
    */
  val requester: StringDictionary[Boolean] = js.native
  val status: String = js.native
  val tags: StringDictionary[js.Any] = js.native
  val vpcId: String = js.native
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
    val __obj = js.Dynamic.literal(accepter = accepter.asInstanceOf[js.Any], cidrBlock = cidrBlock.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], peerCidrBlock = peerCidrBlock.asInstanceOf[js.Any], peerOwnerId = peerOwnerId.asInstanceOf[js.Any], peerRegion = peerRegion.asInstanceOf[js.Any], peerVpcId = peerVpcId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], requester = requester.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcPeeringConnectionResult]
  }
}

