package typings.pulumiAws.vpcPeeringConnectionAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterAccepter
import typings.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterRequester
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionAccepterState extends js.Object {
  /**
    * The status of the VPC Peering Connection request.
    */
  val acceptStatus: js.UndefOr[Input[String]] = js.native
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the accepter VPC.
    */
  val accepter: js.UndefOr[Input[VpcPeeringConnectionAccepterAccepter]] = js.native
  /**
    * Whether or not to accept the peering request. Defaults to `false`.
    */
  val autoAccept: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The AWS account ID of the owner of the requester VPC.
    */
  val peerOwnerId: js.UndefOr[Input[String]] = js.native
  /**
    * The region of the accepter VPC.
    */
  val peerRegion: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the requester VPC.
    */
  val peerVpcId: js.UndefOr[Input[String]] = js.native
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the requester VPC.
    */
  val requester: js.UndefOr[Input[VpcPeeringConnectionAccepterRequester]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The ID of the accepter VPC.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
  /**
    * The VPC Peering Connection ID to manage.
    */
  val vpcPeeringConnectionId: js.UndefOr[Input[String]] = js.native
}

object VpcPeeringConnectionAccepterState {
  @scala.inline
  def apply(
    acceptStatus: Input[String] = null,
    accepter: Input[VpcPeeringConnectionAccepterAccepter] = null,
    autoAccept: Input[Boolean] = null,
    peerOwnerId: Input[String] = null,
    peerRegion: Input[String] = null,
    peerVpcId: Input[String] = null,
    requester: Input[VpcPeeringConnectionAccepterRequester] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcId: Input[String] = null,
    vpcPeeringConnectionId: Input[String] = null
  ): VpcPeeringConnectionAccepterState = {
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
    if (vpcPeeringConnectionId != null) __obj.updateDynamic("vpcPeeringConnectionId")(vpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcPeeringConnectionAccepterState]
  }
}

