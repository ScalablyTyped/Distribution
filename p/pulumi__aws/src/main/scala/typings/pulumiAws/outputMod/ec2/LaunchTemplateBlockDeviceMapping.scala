package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateBlockDeviceMapping extends js.Object {
  /**
    * The name of the device to mount.
    */
  var deviceName: js.UndefOr[String] = js.native
  /**
    * Configure EBS volume properties.
    */
  var ebs: js.UndefOr[LaunchTemplateBlockDeviceMappingEbs] = js.native
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var noDevice: js.UndefOr[String] = js.native
  /**
    * The [Instance Store Device
    * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
    * (e.g. `"ephemeral0"`).
    */
  var virtualName: js.UndefOr[String] = js.native
}

object LaunchTemplateBlockDeviceMapping {
  @scala.inline
  def apply(): LaunchTemplateBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateBlockDeviceMapping]
  }
  @scala.inline
  implicit class LaunchTemplateBlockDeviceMappingOps[Self <: LaunchTemplateBlockDeviceMapping] (val x: Self) extends AnyVal {
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
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    @scala.inline
    def setEbs(value: LaunchTemplateBlockDeviceMappingEbs): Self = this.set("ebs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbs: Self = this.set("ebs", js.undefined)
    @scala.inline
    def setNoDevice(value: String): Self = this.set("noDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDevice: Self = this.set("noDevice", js.undefined)
    @scala.inline
    def setVirtualName(value: String): Self = this.set("virtualName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualName: Self = this.set("virtualName", js.undefined)
  }
  
}

