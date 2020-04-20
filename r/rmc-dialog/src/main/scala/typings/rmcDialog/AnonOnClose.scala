package typings.rmcDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnClose extends js.Object {
  var onClose: js.Function0[Unit]
  var prefixCls: String
  var visible: Boolean
}

object AnonOnClose {
  @scala.inline
  def apply(onClose: () => Unit, prefixCls: String, visible: Boolean): AnonOnClose = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnClose]
  }
}

