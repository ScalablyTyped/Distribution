package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceNameEbs extends js.Object {
  var deviceName: String
  var ebs: js.Array[Anon_DeleteOnTerminationEncrypted]
  var noDevice: String
  var virtualName: String
}

object Anon_DeviceNameEbs {
  @scala.inline
  def apply(
    deviceName: String,
    ebs: js.Array[Anon_DeleteOnTerminationEncrypted],
    noDevice: String,
    virtualName: String
  ): Anon_DeviceNameEbs = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, ebs = ebs, noDevice = noDevice, virtualName = virtualName)
  
    __obj.asInstanceOf[Anon_DeviceNameEbs]
  }
}

