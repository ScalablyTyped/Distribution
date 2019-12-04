package typings.rcDashMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Device extends js.Object {
  var device: Boolean
  var ipod: js.Any
  var phone: Boolean
  var tablet: Boolean
}

object Anon_Device {
  @scala.inline
  def apply(device: Boolean, ipod: js.Any, phone: Boolean, tablet: Boolean): Anon_Device = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], ipod = ipod.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Device]
  }
}

