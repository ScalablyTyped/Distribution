package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceNameVirtualName extends js.Object {
  var deviceName: Input[String]
  var virtualName: Input[String]
}

object Anon_DeviceNameVirtualName {
  @scala.inline
  def apply(deviceName: Input[String], virtualName: Input[String]): Anon_DeviceNameVirtualName = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DeviceNameVirtualName]
  }
}

