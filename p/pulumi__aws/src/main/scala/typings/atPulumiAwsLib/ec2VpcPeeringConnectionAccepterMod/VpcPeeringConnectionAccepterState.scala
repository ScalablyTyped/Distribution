package typings
package atPulumiAwsLib.ec2VpcPeeringConnectionAccepterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcPeeringConnectionAccepterState extends js.Object {
  /**
    * The status of the VPC Peering Connection request.
    */
  val acceptStatus: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the accepter VPC.
    */
  val accepter: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution]
  ] = js.undefined
  /**
    * Whether or not to accept the peering request. Defaults to `false`.
    */
  val autoAccept: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The AWS account ID of the owner of the requester VPC.
    */
  val peerOwnerId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The region of the accepter VPC.
    */
  val peerRegion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the requester VPC.
    */
  val peerVpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the requester VPC.
    */
  val requester: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The ID of the accepter VPC.
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The VPC Peering Connection ID to manage.
    */
  val vpcPeeringConnectionId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object VpcPeeringConnectionAccepterState {
  @scala.inline
  def apply(
    acceptStatus: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    accepter: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution] = null,
    autoAccept: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    peerOwnerId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    peerRegion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    peerVpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    requester: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcPeeringConnectionId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

