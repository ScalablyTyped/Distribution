package typings.rbx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseOnBlur extends js.Object {
  var closeOnBlur: Boolean
  var closeOnEsc: Boolean
}

object CloseOnBlur {
  @scala.inline
  def apply(closeOnBlur: Boolean, closeOnEsc: Boolean): CloseOnBlur = {
    val __obj = js.Dynamic.literal(closeOnBlur = closeOnBlur.asInstanceOf[js.Any], closeOnEsc = closeOnEsc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseOnBlur]
  }
}

