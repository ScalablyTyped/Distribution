package typings.rcPicker.rangePickerMod

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.PickerMode
import typings.rcPicker.rcPickerStrings.date
import typings.rcPicker.rcPickerStrings.time
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rcPicker.rangePickerMod.RangePickerBaseProps[DateType]
  - typings.rcPicker.rangePickerMod.RangePickerDateProps[DateType]
  - typings.rcPicker.rangePickerMod.RangePickerTimeProps[DateType]
*/
trait RangePickerProps[DateType] extends js.Object

object RangePickerProps {
  @scala.inline
  def RangePickerBaseProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): RangePickerProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerProps[DateType]]
  }
  @scala.inline
  def RangePickerDateProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): RangePickerProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerProps[DateType]]
  }
  @scala.inline
  def RangePickerTimeProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: time): RangePickerProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerProps[DateType]]
  }
}

