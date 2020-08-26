package typings.rcPicker.pickerMod

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.PickerMode
import typings.rcPicker.rcPickerStrings.date
import typings.rcPicker.rcPickerStrings.time
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcPicker.pickerMod.PickerBaseProps[DateType]
  - typings.rcPicker.pickerMod.PickerDateProps[DateType]
  - typings.rcPicker.pickerMod.PickerTimeProps[DateType]
*/
trait PickerProps[DateType] extends js.Object

object PickerProps {
  @scala.inline
  def PickerBaseProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
  @scala.inline
  def PickerDateProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
  @scala.inline
  def PickerTimeProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: time): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
}

