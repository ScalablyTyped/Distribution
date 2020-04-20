package typings.rcMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmazon extends js.Object {
  var amazon: AnonPhone
  var android: AnonPhone
  var any: js.Any
  var apple: AnonDevice
  var other: AnonBlackberry
  var phone: js.Any
  var tablet: js.Any
  var windows: AnonPhone
}

object AnonAmazon {
  @scala.inline
  def apply(
    amazon: AnonPhone,
    android: AnonPhone,
    any: js.Any,
    apple: AnonDevice,
    other: AnonBlackberry,
    phone: js.Any,
    tablet: js.Any,
    windows: AnonPhone
  ): AnonAmazon = {
    val __obj = js.Dynamic.literal(amazon = amazon.asInstanceOf[js.Any], android = android.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], apple = apple.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmazon]
  }
}

