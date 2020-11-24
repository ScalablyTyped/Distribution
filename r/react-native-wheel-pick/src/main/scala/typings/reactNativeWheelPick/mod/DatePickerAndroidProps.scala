package typings.reactNativeWheelPick.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeWheelPick.reactNativeWheelPickStrings.date
import typings.reactNativeWheelPick.reactNativeWheelPickStrings.datetime
import typings.reactNativeWheelPick.reactNativeWheelPickStrings.time
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerAndroidProps extends ViewProps {
  
  var date: js.UndefOr[Date] = js.native
  
  var itemSpace: js.UndefOr[Double] = js.native
  
  var labelUnit: js.UndefOr[typings.reactNativeWheelPick.anon.Date] = js.native
  
  var maximumDate: js.UndefOr[Date] = js.native
  
  var minimumDate: js.UndefOr[Date] = js.native
  
  var mode: js.UndefOr[date | time | datetime] = js.native
  
  def onDateChange(newDate: Date): Unit = js.native
  
  var order: js.UndefOr[String] = js.native
  
  var textColor: js.UndefOr[String] = js.native
  
  var textSize: js.UndefOr[Double] = js.native
}
object DatePickerAndroidProps {
  
  @scala.inline
  def apply(onDateChange: Date => Unit): DatePickerAndroidProps = {
    val __obj = js.Dynamic.literal(onDateChange = js.Any.fromFunction1(onDateChange))
    __obj.asInstanceOf[DatePickerAndroidProps]
  }
  
  @scala.inline
  implicit class DatePickerAndroidPropsOps[Self <: DatePickerAndroidProps] (val x: Self) extends AnyVal {
    
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
    def setOnDateChange(value: Date => Unit): Self = this.set("onDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setItemSpace(value: Double): Self = this.set("itemSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemSpace: Self = this.set("itemSpace", js.undefined)
    
    @scala.inline
    def setLabelUnit(value: typings.reactNativeWheelPick.anon.Date): Self = this.set("labelUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelUnit: Self = this.set("labelUnit", js.undefined)
    
    @scala.inline
    def setMaximumDate(value: Date): Self = this.set("maximumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumDate: Self = this.set("maximumDate", js.undefined)
    
    @scala.inline
    def setMinimumDate(value: Date): Self = this.set("minimumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumDate: Self = this.set("minimumDate", js.undefined)
    
    @scala.inline
    def setMode(value: date | time | datetime): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
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
