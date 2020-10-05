package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.clock
import typings.reactNative.reactNativeStrings.default
import typings.reactNative.reactNativeStrings.spinner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerAndroidOpenOptions extends js.Object {
  var hour: js.UndefOr[Double] = js.native
  var is24Hour: js.UndefOr[Boolean] = js.native
  var minute: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[clock | spinner | default] = js.native
}

object TimePickerAndroidOpenOptions {
  @scala.inline
  def apply(): TimePickerAndroidOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerAndroidOpenOptions]
  }
  @scala.inline
  implicit class TimePickerAndroidOpenOptionsOps[Self <: TimePickerAndroidOpenOptions] (val x: Self) extends AnyVal {
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
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    @scala.inline
    def setIs24Hour(value: Boolean): Self = this.set("is24Hour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs24Hour: Self = this.set("is24Hour", js.undefined)
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    @scala.inline
    def setMode(value: clock | spinner | default): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

