package typings.reactNativeCommunityPicker.pickerIOSMod

import typings.react.mod.SyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProps
import typings.reactNativeCommunityPicker.anon.ItemIndex
import typings.reactNativeCommunityPicker.pickerMod.ItemValue
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerIOSProps extends ViewProps {
  
  var itemStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var onChange: js.UndefOr[SyntheticEvent[ItemIndex, Event]] = js.native
  
  var onValueChange: js.UndefOr[js.Function2[/* itemValue */ ItemValue, /* itemIndex */ Double, Unit]] = js.native
  
  var selectedValue: js.UndefOr[ItemValue] = js.native
  
  @JSName("style")
  var style_PickerIOSProps: js.UndefOr[StyleProp[TextStyle]] = js.native
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
    def setOnChange(value: SyntheticEvent[ItemIndex, Event]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: (/* itemValue */ ItemValue, /* itemIndex */ Double) => Unit): Self = this.set("onValueChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    
    @scala.inline
    def setSelectedValue(value: ItemValue): Self = this.set("selectedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedValue: Self = this.set("selectedValue", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[TextStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
