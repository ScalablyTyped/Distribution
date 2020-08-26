package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckBoxProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.native
  var checkedIcon: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var label: String = js.native
  var style: js.UndefOr[Label] = js.native
  var uncheckedIcon: js.UndefOr[String] = js.native
  var value: String | Double = js.native
  def onCheck(checked: Boolean): Unit = js.native
}

object CheckBoxProps {
  @scala.inline
  def apply(label: String, onCheck: Boolean => Unit, value: String | Double): CheckBoxProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onCheck = js.Any.fromFunction1(onCheck), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBoxProps]
  }
  @scala.inline
  implicit class CheckBoxPropsOps[Self <: CheckBoxProps] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCheck(value: Boolean => Unit): Self = this.set("onCheck", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setCheckedIcon(value: String): Self = this.set("checkedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedIcon: Self = this.set("checkedIcon", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setStyle(value: Label): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setUncheckedIcon(value: String): Self = this.set("uncheckedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUncheckedIcon: Self = this.set("uncheckedIcon", js.undefined)
  }
  
}

