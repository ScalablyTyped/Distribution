package typings.rbx.modalContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalContextValue extends js.Object {
  var closeOnBlur: Boolean
  var closeOnEsc: Boolean
  def close(): Unit
}

object ModalContextValue {
  @scala.inline
  def apply(close: () => Unit, closeOnBlur: Boolean, closeOnEsc: Boolean): ModalContextValue = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), closeOnBlur = closeOnBlur.asInstanceOf[js.Any], closeOnEsc = closeOnEsc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalContextValue]
  }
}

