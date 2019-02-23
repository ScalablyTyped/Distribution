package typings
package atPulumiAwsLib.ec2VpcEndpointSubnetAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointSubnetAssociationState extends js.Object {
  /**
    * The ID of the subnet to be associated with the VPC endpoint.
    */
  val subnetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the VPC endpoint with which the subnet will be associated.
    */
  val vpcEndpointId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

