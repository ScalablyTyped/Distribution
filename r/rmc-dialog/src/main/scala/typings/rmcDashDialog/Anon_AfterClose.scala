package typings.rmcDashDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterClose extends js.Object {
  var afterClose: js.Function0[Unit]
  var className: String
  var closable: Boolean
  var mask: Boolean
  var maskClosable: Boolean
  var onClose: js.Function0[Unit]
  var prefixCls: String
  var visible: Boolean
}

object Anon_AfterClose {
  @scala.inline
  def apply(
    afterClose: () => Unit,
    className: String,
    closable: Boolean,
    mask: Boolean,
    maskClosable: Boolean,
    onClose: () => Unit,
    prefixCls: String,
    visible: Boolean
  ): Anon_AfterClose = {
    val __obj = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AfterClose]
  }
}

