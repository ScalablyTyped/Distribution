package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.calendar
import typings.reactNative.reactNativeStrings.default
import typings.reactNative.reactNativeStrings.spinner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerAndroidOpenOptions extends js.Object {
  var date: js.UndefOr[Date | Double] = js.native
  var maxDate: js.UndefOr[Date | Double] = js.native
  var minDate: js.UndefOr[Date | Double] = js.native
  var mode: js.UndefOr[calendar | spinner | default] = js.native
}

object DatePickerAndroidOpenOptions {
  @scala.inline
  def apply(): DatePickerAndroidOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerAndroidOpenOptions]
  }
  @scala.inline
  implicit class DatePickerAndroidOpenOptionsOps[Self <: DatePickerAndroidOpenOptions] (val x: Self) extends AnyVal {
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
    def setDate(value: Date | Double): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setMaxDate(value: Date | Double): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: Date | Double): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setMode(value: calendar | spinner | default): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

