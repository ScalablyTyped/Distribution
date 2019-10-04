package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchTemplateBlockDeviceMapping extends js.Object {
  var deviceName: String
  var ebs: js.Array[GetLaunchTemplateBlockDeviceMappingEb]
  var noDevice: String
  var virtualName: String
}

object GetLaunchTemplateBlockDeviceMapping {
  @scala.inline
  def apply(
    deviceName: String,
    ebs: js.Array[GetLaunchTemplateBlockDeviceMappingEb],
    noDevice: String,
    virtualName: String
  ): GetLaunchTemplateBlockDeviceMapping = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, ebs = ebs, noDevice = noDevice, virtualName = virtualName)
  
    __obj.asInstanceOf[GetLaunchTemplateBlockDeviceMapping]
  }
}

