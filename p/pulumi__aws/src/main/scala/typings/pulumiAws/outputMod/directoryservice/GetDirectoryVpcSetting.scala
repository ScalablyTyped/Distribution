package typings.pulumiAws.outputMod.directoryservice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectoryVpcSetting extends js.Object {
  /**
    * The identifiers of the subnets for the connector servers (2 subnets in 2 different AZs).
    */
  var subnetIds: js.Array[String] = js.native
  /**
    * The ID of the VPC that the connector is in.
    */
  var vpcId: String = js.native
}

object GetDirectoryVpcSetting {
  @scala.inline
  def apply(subnetIds: js.Array[String], vpcId: String): GetDirectoryVpcSetting = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryVpcSetting]
  }
}

