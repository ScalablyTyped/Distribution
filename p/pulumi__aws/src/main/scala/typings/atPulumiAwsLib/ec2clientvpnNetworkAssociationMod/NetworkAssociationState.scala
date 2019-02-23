package typings
package atPulumiAwsLib.ec2clientvpnNetworkAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkAssociationState extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  val clientVpnEndpointId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IDs of the security groups applied to the target network association.
    */
  val securityGroups: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The current state of the target network association.
    */
  val status: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the subnet to associate with the Client VPN endpoint.
    */
  val subnetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the VPC in which the target network (subnet) is located.
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

