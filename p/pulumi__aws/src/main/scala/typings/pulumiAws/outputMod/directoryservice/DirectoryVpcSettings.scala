package typings.pulumiAws.outputMod.directoryservice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryVpcSettings extends js.Object {
  var availabilityZones: js.Array[String] = js.native
  /**
    * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
    */
  var subnetIds: js.Array[String] = js.native
  /**
    * The identifier of the VPC that the directory is in.
    */
  var vpcId: String = js.native
}

object DirectoryVpcSettings {
  @scala.inline
  def apply(availabilityZones: js.Array[String], subnetIds: js.Array[String], vpcId: String): DirectoryVpcSettings = {
    val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryVpcSettings]
  }
  @scala.inline
  implicit class DirectoryVpcSettingsOps[Self <: DirectoryVpcSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("availabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: js.Array[String]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("subnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: js.Array[String]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
  }
  
}

