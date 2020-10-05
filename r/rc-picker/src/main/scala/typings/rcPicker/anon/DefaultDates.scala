package typings.rcPicker.anon

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.PickerMode
import typings.rcPicker.interfaceMod.RangeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultDates[DateType] extends js.Object {
  var defaultDates: js.UndefOr[RangeValue[DateType]] = js.native
  var generateConfig: GenerateConfig[DateType] = js.native
  var picker: PickerMode = js.native
  var values: RangeValue[DateType] = js.native
}

object DefaultDates {
  @scala.inline
  def apply[DateType](generateConfig: GenerateConfig[DateType], picker: PickerMode): DefaultDates[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDates[DateType]]
  }
  @scala.inline
  implicit class DefaultDatesOps[Self <: DefaultDates[_], DateType] (val x: Self with DefaultDates[DateType]) extends AnyVal {
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
    def setGenerateConfig(value: GenerateConfig[DateType]): Self = this.set("generateConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setPicker(value: PickerMode): Self = this.set("picker", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultDates(value: RangeValue[DateType]): Self = this.set("defaultDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDates: Self = this.set("defaultDates", js.undefined)
    @scala.inline
    def setDefaultDatesNull: Self = this.set("defaultDates", null)
    @scala.inline
    def setValues(value: RangeValue[DateType]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesNull: Self = this.set("values", null)
  }
  
}

