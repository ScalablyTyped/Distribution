package typings
package atPulumiAwsLib.ec2VpcEndpointSubnetAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointSubnetAssociationArgs extends js.Object {
  /**
    * The ID of the subnet to be associated with the VPC endpoint.
    */
  val subnetId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID of the VPC endpoint with which the subnet will be associated.
    */
  val vpcEndpointId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

