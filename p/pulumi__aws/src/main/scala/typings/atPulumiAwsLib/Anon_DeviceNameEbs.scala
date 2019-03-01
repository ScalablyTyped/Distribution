package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceNameEbs extends js.Object {
  var deviceName: java.lang.String
  var ebs: js.Array[Anon_DeleteOnTerminationEncrypted]
  var noDevice: java.lang.String
  var virtualName: java.lang.String
}

object Anon_DeviceNameEbs {
  @scala.inline
  def apply(
    deviceName: java.lang.String,
    ebs: js.Array[Anon_DeleteOnTerminationEncrypted],
    noDevice: java.lang.String,
    virtualName: java.lang.String
  ): Anon_DeviceNameEbs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceName")(deviceName)
    __obj.updateDynamic("ebs")(ebs)
    __obj.updateDynamic("noDevice")(noDevice)
    __obj.updateDynamic("virtualName")(virtualName)
    __obj.asInstanceOf[Anon_DeviceNameEbs]
  }
}

