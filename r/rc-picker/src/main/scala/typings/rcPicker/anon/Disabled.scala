package typings.rcPicker.anon

import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.PickerMode
import typings.rcPicker.interfaceMod.RangeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disabled[DateType] extends js.Object {
  
  var disabled: js.Tuple2[Boolean, Boolean] = js.native
  
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
  
  var generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType] = js.native
  
  var locale: Locale = js.native
  
  var picker: PickerMode = js.native
  
  var selectedValue: RangeValue[DateType] = js.native
}
object Disabled {
  
  @scala.inline
  def apply[DateType](
    disabled: js.Tuple2[Boolean, Boolean],
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    locale: Locale,
    picker: PickerMode
  ): Disabled[DateType] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled[DateType]]
  }
  
  @scala.inline
  implicit class DisabledOps[Self <: Disabled[_], DateType] (val x: Self with Disabled[DateType]) extends AnyVal {
    
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
    def setDisabled(value: js.Tuple2[Boolean, Boolean]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateConfig(value: typings.rcPicker.generateMod.GenerateConfig[DateType]): Self = this.set("generateConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicker(value: PickerMode): Self = this.set("picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledDate(value: /* date */ DateType => Boolean): Self = this.set("disabledDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDisabledDate: Self = this.set("disabledDate", js.undefined)
    
    @scala.inline
    def setSelectedValue(value: RangeValue[DateType]): Self = this.set("selectedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedValueNull: Self = this.set("selectedValue", null)
  }
}
