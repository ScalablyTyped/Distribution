package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateBlockDeviceMapping extends js.Object {
  var deviceName: String = js.native
  var ebs: js.Array[GetLaunchTemplateBlockDeviceMappingEb] = js.native
  var noDevice: String = js.native
  var virtualName: String = js.native
}

object GetLaunchTemplateBlockDeviceMapping {
  @scala.inline
  def apply(
    deviceName: String,
    ebs: js.Array[GetLaunchTemplateBlockDeviceMappingEb],
    noDevice: String,
    virtualName: String
  ): GetLaunchTemplateBlockDeviceMapping = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], ebs = ebs.asInstanceOf[js.Any], noDevice = noDevice.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateBlockDeviceMapping]
  }
}

