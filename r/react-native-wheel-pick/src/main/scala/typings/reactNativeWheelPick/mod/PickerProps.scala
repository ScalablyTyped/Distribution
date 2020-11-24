package typings.reactNativeWheelPick.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerProps[T] extends ViewProps {
  
  var itemSpace: js.UndefOr[Double] = js.native
  
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  def onValueChange(value: T): Unit = js.native
  
  var pickerData: js.Array[T] = js.native
  
  var selectedValue: js.UndefOr[T] = js.native
  
  var textColor: js.UndefOr[String] = js.native
  
  var textSize: js.UndefOr[Double] = js.native
}
object PickerProps {
  
  @scala.inline
  def apply[T](onValueChange: T => Unit, pickerData: js.Array[T]): PickerProps[T] = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange), pickerData = pickerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[T]]
  }
  
  @scala.inline
  implicit class PickerPropsOps[Self <: PickerProps[_], T] (val x: Self with PickerProps[T]) extends AnyVal {
    
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
    def setOnValueChange(value: T => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPickerDataVarargs(value: T*): Self = this.set("pickerData", js.Array(value :_*))
    
    @scala.inline
    def setPickerData(value: js.Array[T]): Self = this.set("pickerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSpace(value: Double): Self = this.set("itemSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemSpace: Self = this.set("itemSpace", js.undefined)
    
    @scala.inline
    def setItemStyle(value: StyleProp[ViewStyle]): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    
    @scala.inline
    def setItemStyleNull: Self = this.set("itemStyle", null)
    
    @scala.inline
    def setSelectedValue(value: T): Self = this.set("selectedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedValue: Self = this.set("selectedValue", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setTextSize(value: Double): Self = this.set("textSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSize: Self = this.set("textSize", js.undefined)
  }
}
