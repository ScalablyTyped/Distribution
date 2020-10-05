package typings.rcPicker.pickerPanelMod

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.DisabledTime
import typings.rcPicker.interfaceMod.DisabledTimes
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.rcPickerStrings.date
import typings.rcPicker.timePanelMod.SharedTimeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerPanelDateProps[DateType]
  extends PickerPanelSharedProps[DateType]
     with PickerPanelProps[DateType] {
  var disabledTime: js.UndefOr[DisabledTime[DateType]] = js.native
  var picker: js.UndefOr[date] = js.native
  var showNow: js.UndefOr[Boolean] = js.native
  var showTime: js.UndefOr[Boolean | SharedTimeProps[DateType]] = js.native
  var showToday: js.UndefOr[Boolean] = js.native
}

object PickerPanelDateProps {
  @scala.inline
  def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): PickerPanelDateProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerPanelDateProps[DateType]]
  }
  @scala.inline
  implicit class PickerPanelDatePropsOps[Self <: PickerPanelDateProps[_], DateType] (val x: Self with PickerPanelDateProps[DateType]) extends AnyVal {
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
    def setDisabledTime(value: /* date */ DateType | Null => DisabledTimes): Self = this.set("disabledTime", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisabledTime: Self = this.set("disabledTime", js.undefined)
    @scala.inline
    def setPicker(value: date): Self = this.set("picker", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePicker: Self = this.set("picker", js.undefined)
    @scala.inline
    def setShowNow(value: Boolean): Self = this.set("showNow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNow: Self = this.set("showNow", js.undefined)
    @scala.inline
    def setShowTime(value: Boolean | SharedTimeProps[DateType]): Self = this.set("showTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTime: Self = this.set("showTime", js.undefined)
    @scala.inline
    def setShowToday(value: Boolean): Self = this.set("showToday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowToday: Self = this.set("showToday", js.undefined)
  }
  
}

