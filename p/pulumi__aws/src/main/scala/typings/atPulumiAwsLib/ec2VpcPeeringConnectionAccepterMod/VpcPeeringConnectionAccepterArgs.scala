package typings
package atPulumiAwsLib.ec2VpcPeeringConnectionAccepterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcPeeringConnectionAccepterArgs extends js.Object {
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
    * The VPC Peering Connection ID to manage.
    */
  val vpcPeeringConnectionId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object VpcPeeringConnectionAccepterArgs {
  @scala.inline
  def apply(
    vpcPeeringConnectionId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    accepter: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution] = null,
    autoAccept: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    requester: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): VpcPeeringConnectionAccepterArgs = {
    val __obj = js.Dynamic.literal(vpcPeeringConnectionId = vpcPeeringConnectionId.asInstanceOf[js.Any])
    if (accepter != null) __obj.updateDynamic("accepter")(accepter.asInstanceOf[js.Any])
    if (autoAccept != null) __obj.updateDynamic("autoAccept")(autoAccept.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcPeeringConnectionAccepterArgs]
  }
}

