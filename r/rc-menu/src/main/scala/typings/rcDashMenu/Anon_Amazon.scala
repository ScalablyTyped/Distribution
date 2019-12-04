package typings.rcDashMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amazon extends js.Object {
  var amazon: Anon_DevicePhone
  var android: Anon_DevicePhone
  var any: js.Any
  var apple: Anon_Device
  var other: Anon_Blackberry
  var phone: js.Any
  var tablet: js.Any
  var windows: Anon_DevicePhone
}

object Anon_Amazon {
  @scala.inline
  def apply(
    amazon: Anon_DevicePhone,
    android: Anon_DevicePhone,
    any: js.Any,
    apple: Anon_Device,
    other: Anon_Blackberry,
    phone: js.Any,
    tablet: js.Any,
    windows: Anon_DevicePhone
  ): Anon_Amazon = {
    val __obj = js.Dynamic.literal(amazon = amazon.asInstanceOf[js.Any], android = android.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], apple = apple.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Amazon]
  }
}

