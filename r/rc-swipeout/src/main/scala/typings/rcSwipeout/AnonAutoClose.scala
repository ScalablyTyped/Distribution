package typings.rcSwipeout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoClose extends js.Object {
  var autoClose: Boolean
  var disabled: Boolean
  var left: js.Array[scala.Nothing]
  var prefixCls: String
  var right: js.Array[scala.Nothing]
  def onClose(): Unit
  def onOpen(): Unit
}

object AnonAutoClose {
  @scala.inline
  def apply(
    autoClose: Boolean,
    disabled: Boolean,
    left: js.Array[scala.Nothing],
    onClose: () => Unit,
    onOpen: () => Unit,
    prefixCls: String,
    right: js.Array[scala.Nothing]
  ): AnonAutoClose = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onOpen = js.Any.fromFunction0(onOpen), prefixCls = prefixCls.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoClose]
  }
}

