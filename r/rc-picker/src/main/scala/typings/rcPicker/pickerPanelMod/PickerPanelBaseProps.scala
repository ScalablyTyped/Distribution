package typings.rcPicker.pickerPanelMod

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.PickerMode
import typings.rcPicker.rcPickerStrings.date
import typings.rcPicker.rcPickerStrings.time
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerPanelBaseProps[DateType]
  extends PickerPanelSharedProps[DateType]
     with PickerPanelProps[DateType] {
  var picker: Exclude[PickerMode, date | time] = js.native
}

object PickerPanelBaseProps {
  @scala.inline
  def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): PickerPanelBaseProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerPanelBaseProps[DateType]]
  }
  @scala.inline
  implicit class PickerPanelBasePropsOps[Self <: PickerPanelBaseProps[_], DateType] (val x: Self with PickerPanelBaseProps[DateType]) extends AnyVal {
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
    def setPicker(value: Exclude[PickerMode, date | time]): Self = this.set("picker", value.asInstanceOf[js.Any])
  }
  
}

