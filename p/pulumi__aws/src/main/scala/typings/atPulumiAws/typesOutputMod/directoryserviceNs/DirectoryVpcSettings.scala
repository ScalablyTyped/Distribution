package typings.atPulumiAws.typesOutputMod.directoryserviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryVpcSettings extends js.Object {
  /**
    * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
    */
  var subnetIds: js.Array[String]
  /**
    * The identifier of the VPC that the directory is in.
    */
  var vpcId: String
}

object DirectoryVpcSettings {
  @scala.inline
  def apply(subnetIds: js.Array[String], vpcId: String): DirectoryVpcSettings = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[DirectoryVpcSettings]
  }
}

