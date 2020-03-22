package typings.rcMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPhone extends js.Object {
  var device: js.Any
  var phone: js.Any
  var tablet: js.Any
}

object AnonPhone {
  @scala.inline
  def apply(device: js.Any, phone: js.Any, tablet: js.Any): AnonPhone = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPhone]
  }
}

