package typings.rmcPicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnValueChange extends js.Object {
  var prefixCls: String = js.native
  def onValueChange(): Unit = js.native
}

object OnValueChange {
  @scala.inline
  def apply(onValueChange: () => Unit, prefixCls: String): OnValueChange = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction0(onValueChange), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnValueChange]
  }
  @scala.inline
  implicit class OnValueChangeOps[Self <: OnValueChange] (val x: Self) extends AnyVal {
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
    def setOnValueChange(value: () => Unit): Self = this.set("onValueChange", js.Any.fromFunction0(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
  }
  
}

