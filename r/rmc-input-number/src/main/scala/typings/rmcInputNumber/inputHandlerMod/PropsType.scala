package typings.rmcInputNumber.inputHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsType extends js.Object {
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var prefixCls: String = js.native
  var role: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[Boolean] = js.native
  def onTouchEnd(e: js.Any): Unit = js.native
  def onTouchStart(e: js.Any): Unit = js.native
}

object PropsType {
  @scala.inline
  def apply(onTouchEnd: js.Any => Unit, onTouchStart: js.Any => Unit, prefixCls: String): PropsType = {
    val __obj = js.Dynamic.literal(onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
  @scala.inline
  implicit class PropsTypeOps[Self <: PropsType] (val x: Self) extends AnyVal {
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
    def setOnTouchEnd(value: js.Any => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTouchStart(value: js.Any => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setUnselectable(value: Boolean): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
  }
  
}

