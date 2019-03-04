package typings
package atPulumiAwsLib.ec2VpcPeeringConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcPeeringConnectionArgs extends js.Object {
  /**
    * An optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that accepts
    * the peering connection (a maximum of one).
    */
  val accepter: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution]
  ] = js.undefined
  /**
    * Accept the peering (both VPCs need to be in the same AWS account).
    */
  val autoAccept: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The AWS account ID of the owner of the peer VPC.
    * Defaults to the account ID the [AWS provider][1] is currently connected to.
    */
  val peerOwnerId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The region of the accepter VPC of the [VPC Peering Connection]. `auto_accept` must be `false`,
    * and use the `aws_vpc_peering_connection_accepter` to manage the accepter side.
    */
  val peerRegion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the VPC with which you are creating the VPC Peering Connection.
    */
  val peerVpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that requests
    * the peering connection (a maximum of one).
    */
  val requester: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The ID of the requester VPC.
    */
  val vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object VpcPeeringConnectionArgs {
  @scala.inline
  def apply(
    peerVpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    accepter: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution] = null,
    autoAccept: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    peerOwnerId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    peerRegion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    requester: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): VpcPeeringConnectionArgs = {
    val __obj = js.Dynamic.literal(peerVpcId = peerVpcId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    if (accepter != null) __obj.updateDynamic("accepter")(accepter.asInstanceOf[js.Any])
    if (autoAccept != null) __obj.updateDynamic("autoAccept")(autoAccept.asInstanceOf[js.Any])
    if (peerOwnerId != null) __obj.updateDynamic("peerOwnerId")(peerOwnerId.asInstanceOf[js.Any])
    if (peerRegion != null) __obj.updateDynamic("peerRegion")(peerRegion.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcPeeringConnectionArgs]
  }
}

