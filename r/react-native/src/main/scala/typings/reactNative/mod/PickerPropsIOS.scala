package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerPropsIOS extends ViewProps {
  /**
    * Style to apply to each of the item labels.
    * @platform ios
    */
  var itemStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
}

object PickerPropsIOS {
  @scala.inline
  def apply(): PickerPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerPropsIOS]
  }
  @scala.inline
  implicit class PickerPropsIOSOps[Self <: PickerPropsIOS] (val x: Self) extends AnyVal {
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
  }
  
}

