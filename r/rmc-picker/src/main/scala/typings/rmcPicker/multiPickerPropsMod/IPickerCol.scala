package typings.rmcPicker.multiPickerPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPickerCol extends js.Object {
  var key: js.UndefOr[String] = js.native
  var props: js.UndefOr[js.Any] = js.native
}

object IPickerCol {
  @scala.inline
  def apply(): IPickerCol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickerCol]
  }
  @scala.inline
  implicit class IPickerColOps[Self <: IPickerCol] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setProps(value: js.Any): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
  
}

