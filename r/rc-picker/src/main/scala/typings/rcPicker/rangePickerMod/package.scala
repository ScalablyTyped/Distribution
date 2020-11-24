package typings.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object rangePickerMod {
  
  type OmitPickerProps[Props] = typings.std.Omit[
    Props, 
    typings.rcPicker.rcPickerStrings.value | typings.rcPicker.rcPickerStrings.defaultValue | typings.rcPicker.rcPickerStrings.defaultPickerValue | typings.rcPicker.rcPickerStrings.placeholder | typings.rcPicker.rcPickerStrings.disabled | typings.rcPicker.rcPickerStrings.disabledTime | typings.rcPicker.rcPickerStrings.showToday | typings.rcPicker.rcPickerStrings.showTime | typings.rcPicker.rcPickerStrings.mode | typings.rcPicker.rcPickerStrings.onChange | typings.rcPicker.rcPickerStrings.onSelect | typings.rcPicker.rcPickerStrings.onPanelChange | typings.rcPicker.rcPickerStrings.pickerValue | typings.rcPicker.rcPickerStrings.onPickerValueChange | typings.rcPicker.rcPickerStrings.onOk | typings.rcPicker.rcPickerStrings.dateRender
  ]
  
  type RangeDateRender[DateType] = js.Function3[
    /* currentDate */ DateType, 
    /* today */ DateType, 
    /* info */ typings.rcPicker.rangePickerMod.RangeInfo, 
    typings.react.mod.ReactNode
  ]
}
