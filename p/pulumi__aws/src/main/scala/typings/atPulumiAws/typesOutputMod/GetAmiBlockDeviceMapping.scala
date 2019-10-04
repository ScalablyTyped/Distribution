package typings.atPulumiAws.typesOutputMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAmiBlockDeviceMapping extends js.Object {
  var deviceName: String
  var ebs: StringDictionary[js.Any]
  var noDevice: String
  var virtualName: String
}

object GetAmiBlockDeviceMapping {
  @scala.inline
  def apply(deviceName: String, ebs: StringDictionary[js.Any], noDevice: String, virtualName: String): GetAmiBlockDeviceMapping = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, ebs = ebs, noDevice = noDevice, virtualName = virtualName)
  
    __obj.asInstanceOf[GetAmiBlockDeviceMapping]
  }
}

