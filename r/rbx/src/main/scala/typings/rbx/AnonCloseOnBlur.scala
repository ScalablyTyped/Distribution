package typings.rbx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloseOnBlur extends js.Object {
  var closeOnBlur: Boolean
  var closeOnEsc: Boolean
}

object AnonCloseOnBlur {
  @scala.inline
  def apply(closeOnBlur: Boolean, closeOnEsc: Boolean): AnonCloseOnBlur = {
    val __obj = js.Dynamic.literal(closeOnBlur = closeOnBlur.asInstanceOf[js.Any], closeOnEsc = closeOnEsc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloseOnBlur]
  }
}

