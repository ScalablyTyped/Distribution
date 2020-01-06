package typings.atPulumiAws.ec2VpcPeeringConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2.VpcPeeringConnectionAccepter
import typings.atPulumiAws.typesInputMod.ec2.VpcPeeringConnectionRequester
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionState extends js.Object {
  /**
    * The status of the VPC Peering Connection request.
    */
  val acceptStatus: js.UndefOr[Input[String]] = js.native
  /**
    * An optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that accepts
    * the peering connection (a maximum of one).
    */
  val accepter: js.UndefOr[Input[VpcPeeringConnectionAccepter]] = js.native
  /**
    * Accept the peering (both VPCs need to be in the same AWS account).
    */
  val autoAccept: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The AWS account ID of the owner of the peer VPC.
    * Defaults to the account ID the [AWS provider][1] is currently connected to.
    */
  val peerOwnerId: js.UndefOr[Input[String]] = js.native
  /**
    * The region of the accepter VPC of the [VPC Peering Connection]. `autoAccept` must be `false`,
    * and use the `aws.ec2.VpcPeeringConnectionAccepter` to manage the accepter side.
    */
  val peerRegion: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC with which you are creating the VPC Peering Connection.
    */
  val peerVpcId: js.UndefOr[Input[String]] = js.native
  /**
    * A optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that requests
    * the peering connection (a maximum of one).
    */
  val requester: js.UndefOr[Input[VpcPeeringConnectionRequester]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The ID of the requester VPC.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object VpcPeeringConnectionState {
  @scala.inline
  def apply(
    acceptStatus: Input[String] = null,
    accepter: Input[VpcPeeringConnectionAccepter] = null,
    autoAccept: Input[Boolean] = null,
    peerOwnerId: Input[String] = null,
    peerRegion: Input[String] = null,
    peerVpcId: Input[String] = null,
    requester: Input[VpcPeeringConnectionRequester] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcId: Input[String] = null
  ): VpcPeeringConnectionState = {
    val __obj = js.Dynamic.literal()
    if (acceptStatus != null) __obj.updateDynamic("acceptStatus")(acceptStatus.asInstanceOf[js.Any])
    if (accepter != null) __obj.updateDynamic("accepter")(accepter.asInstanceOf[js.Any])
    if (autoAccept != null) __obj.updateDynamic("autoAccept")(autoAccept.asInstanceOf[js.Any])
    if (peerOwnerId != null) __obj.updateDynamic("peerOwnerId")(peerOwnerId.asInstanceOf[js.Any])
    if (peerRegion != null) __obj.updateDynamic("peerRegion")(peerRegion.asInstanceOf[js.Any])
    if (peerVpcId != null) __obj.updateDynamic("peerVpcId")(peerVpcId.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcPeeringConnectionState]
  }
}

