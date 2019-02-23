package typings
package atPulumiAwsLib.ec2PeeringConnectionOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeeringConnectionOptionsArgs extends js.Object {
  /**
    * An optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that accepts
    * the peering connection (a maximum of one).
    */
  val accepter: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution]
  ] = js.undefined
  /**
    * A optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that requests
    * the peering connection (a maximum of one).
    */
  val requester: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution]
  ] = js.undefined
  /**
    * The ID of the requester VPC peering connection.
    */
  val vpcPeeringConnectionId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

