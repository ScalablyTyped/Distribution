package typings.rcPicker.pickerPanelMod

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
  - typings.rcPicker.pickerPanelMod.PickerPanelBaseProps[DateType]
  - typings.rcPicker.pickerPanelMod.PickerPanelDateProps[DateType]
  - typings.rcPicker.pickerPanelMod.PickerPanelTimeProps[DateType]
*/
trait PickerPanelProps[DateType] extends js.Object

object PickerPanelProps {
  @scala.inline
  def PickerPanelBaseProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): PickerPanelProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerPanelProps[DateType]]
  }
  @scala.inline
  def PickerPanelDateProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): PickerPanelProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerPanelProps[DateType]]
  }
  @scala.inline
  def PickerPanelTimeProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: time): PickerPanelProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerPanelProps[DateType]]
  }
}

