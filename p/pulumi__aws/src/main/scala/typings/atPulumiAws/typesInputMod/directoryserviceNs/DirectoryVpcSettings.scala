package typings.atPulumiAws.typesInputMod.directoryserviceNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryVpcSettings extends js.Object {
  /**
    * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
    */
  var subnetIds: Input[js.Array[Input[String]]]
  /**
    * The identifier of the VPC that the directory is in.
    */
  var vpcId: Input[String]
}

object DirectoryVpcSettings {
  @scala.inline
  def apply(subnetIds: Input[js.Array[Input[String]]], vpcId: Input[String]): DirectoryVpcSettings = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectoryVpcSettings]
  }
}

