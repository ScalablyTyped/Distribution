package typings
package atPulumiAwsLib.ec2GetVpcPeeringConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcPeeringConnectionResult extends js.Object {
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the accepter VPC.
    */
  val accepter: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  val cidrBlock: java.lang.String
  val id: java.lang.String
  val ownerId: java.lang.String
  val peerCidrBlock: java.lang.String
  val peerOwnerId: java.lang.String
  val peerRegion: java.lang.String
  val peerVpcId: java.lang.String
  val region: java.lang.String
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the requester VPC.
    */
  val requester: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  val status: java.lang.String
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val vpcId: java.lang.String
}

object GetVpcPeeringConnectionResult {
  @scala.inline
  def apply(
    accepter: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    cidrBlock: java.lang.String,
    id: java.lang.String,
    ownerId: java.lang.String,
    peerCidrBlock: java.lang.String,
    peerOwnerId: java.lang.String,
    peerRegion: java.lang.String,
    peerVpcId: java.lang.String,
    region: java.lang.String,
    requester: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    status: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    vpcId: java.lang.String
  ): GetVpcPeeringConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accepter")(accepter)
    __obj.updateDynamic("cidrBlock")(cidrBlock)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ownerId")(ownerId)
    __obj.updateDynamic("peerCidrBlock")(peerCidrBlock)
    __obj.updateDynamic("peerOwnerId")(peerOwnerId)
    __obj.updateDynamic("peerRegion")(peerRegion)
    __obj.updateDynamic("peerVpcId")(peerVpcId)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("requester")(requester)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[GetVpcPeeringConnectionResult]
  }
}

