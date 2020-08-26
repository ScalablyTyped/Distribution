package typings.rcCascader.cascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CascaderState extends js.Object {
  var activeValue: js.UndefOr[CascaderValueType] = js.native
  var popupVisible: js.UndefOr[Boolean] = js.native
  var prevProps: js.UndefOr[CascaderProps] = js.native
  var value: js.UndefOr[CascaderValueType] = js.native
}

object CascaderState {
  @scala.inline
  def apply(): CascaderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CascaderState]
  }
  @scala.inline
  implicit class CascaderStateOps[Self <: CascaderState] (val x: Self) extends AnyVal {
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
    def setActiveValueVarargs(value: (String | Double)*): Self = this.set("activeValue", js.Array(value :_*))
    @scala.inline
    def setActiveValue(value: CascaderValueType): Self = this.set("activeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveValue: Self = this.set("activeValue", js.undefined)
    @scala.inline
    def setPopupVisible(value: Boolean): Self = this.set("popupVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupVisible: Self = this.set("popupVisible", js.undefined)
    @scala.inline
    def setPrevProps(value: CascaderProps): Self = this.set("prevProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevProps: Self = this.set("prevProps", js.undefined)
    @scala.inline
    def setValueVarargs(value: (String | Double)*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: CascaderValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

