package typings.rmcDialog.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterClose extends js.Object {
  var afterClose: js.Function0[Unit] = js.native
  var className: String = js.native
  var closable: Boolean = js.native
  var mask: Boolean = js.native
  var maskClosable: Boolean = js.native
  var onClose: js.Function0[Unit] = js.native
  var prefixCls: String = js.native
  var visible: Boolean = js.native
}

object AfterClose {
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
  ): AfterClose = {
    val __obj = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterClose]
  }
  @scala.inline
  implicit class AfterCloseOps[Self <: AfterClose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterClose(value: () => Unit): Self = this.set("afterClose", js.Any.fromFunction0(value))
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaskClosable(value: Boolean): Self = this.set("maskClosable", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

