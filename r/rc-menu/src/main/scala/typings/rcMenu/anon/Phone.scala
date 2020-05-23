package typings.rcMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phone extends js.Object {
  var device: js.Any
  var phone: js.Any
  var tablet: js.Any
}

object Phone {
  @scala.inline
  def apply(device: js.Any, phone: js.Any, tablet: js.Any): Phone = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phone]
  }
}

