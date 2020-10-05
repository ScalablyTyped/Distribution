package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerIOSProps extends ViewProps {
  var itemStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var onValueChange: js.UndefOr[js.Function1[/* value */ String | Double, Unit]] = js.native
  var selectedValue: js.UndefOr[String | Double] = js.native
}

object PickerIOSProps {
  @scala.inline
  def apply(): PickerIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerIOSProps]
  }
  @scala.inline
  implicit class PickerIOSPropsOps[Self <: PickerIOSProps] (val x: Self) extends AnyVal {
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
    def setItemStyle(value: StyleProp[TextStyle]): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setItemStyleNull: Self = this.set("itemStyle", null)
    @scala.inline
    def setOnValueChange(value: /* value */ String | Double => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    @scala.inline
    def setSelectedValue(value: String | Double): Self = this.set("selectedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedValue: Self = this.set("selectedValue", js.undefined)
  }
  
}

