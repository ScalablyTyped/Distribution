package typings.rcMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amazon extends js.Object {
  var amazon: Phone
  var android: Phone
  var any: js.Any
  var apple: Device
  var other: Blackberry
  var phone: js.Any
  var tablet: js.Any
  var windows: Phone
}

object Amazon {
  @scala.inline
  def apply(
    amazon: Phone,
    android: Phone,
    any: js.Any,
    apple: Device,
    other: Blackberry,
    phone: js.Any,
    tablet: js.Any,
    windows: Phone
  ): Amazon = {
    val __obj = js.Dynamic.literal(amazon = amazon.asInstanceOf[js.Any], android = android.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], apple = apple.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amazon]
  }
}

