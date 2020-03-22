package typings.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type DisabledTime[DateType] = js.Function1[/* date */ DateType | scala.Null, typings.rcPicker.interfaceMod.DisabledTimes]
  type EventValue[DateType] = DateType | scala.Null
  type NullableDateType[DateType] = js.UndefOr[DateType | scala.Null]
  type OnPanelChange[DateType] = js.Function2[/* value */ DateType, /* mode */ typings.rcPicker.interfaceMod.PanelMode, scala.Unit]
  type OnSelect[DateType] = js.Function2[
    /* value */ DateType, 
    /* type */ typings.rcPicker.rcPickerStrings.key | typings.rcPicker.rcPickerStrings.mouse | typings.rcPicker.rcPickerStrings.submit, 
    scala.Unit
  ]
  type RangeList = js.Array[typings.rcPicker.AnonLabel]
  type RangeValue[DateType] = (js.Tuple2[
    typings.rcPicker.interfaceMod.EventValue[DateType], 
    typings.rcPicker.interfaceMod.EventValue[DateType]
  ]) | scala.Null
}
