package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAmiBlockDeviceMapping extends js.Object {
  var deviceName: String = js.native
  var ebs: StringDictionary[js.Any] = js.native
  var noDevice: String = js.native
  var virtualName: String = js.native
}

object GetAmiBlockDeviceMapping {
  @scala.inline
  def apply(deviceName: String, ebs: StringDictionary[js.Any], noDevice: String, virtualName: String): GetAmiBlockDeviceMapping = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], ebs = ebs.asInstanceOf[js.Any], noDevice = noDevice.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAmiBlockDeviceMapping]
  }
}

