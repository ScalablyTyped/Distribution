package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAmiBlockDeviceMapping extends js.Object {
  var deviceName: String = js.native
  var ebs: StringDictionary[String] = js.native
  var noDevice: String = js.native
  var virtualName: String = js.native
}

object GetAmiBlockDeviceMapping {
  @scala.inline
  def apply(deviceName: String, ebs: StringDictionary[String], noDevice: String, virtualName: String): GetAmiBlockDeviceMapping = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], ebs = ebs.asInstanceOf[js.Any], noDevice = noDevice.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAmiBlockDeviceMapping]
  }
  @scala.inline
  implicit class GetAmiBlockDeviceMappingOps[Self <: GetAmiBlockDeviceMapping] (val x: Self) extends AnyVal {
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
    def setEbs(value: StringDictionary[String]): Self = this.set("ebs", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoDevice(value: String): Self = this.set("noDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualName(value: String): Self = this.set("virtualName", value.asInstanceOf[js.Any])
  }
  
}

