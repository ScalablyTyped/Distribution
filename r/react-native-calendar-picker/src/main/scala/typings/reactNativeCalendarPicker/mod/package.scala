package typings.reactNativeCalendarPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CustomDatesStylesFunc = js.Function1[
    /* date */ typings.moment.mod.Moment, 
    typings.reactNativeCalendarPicker.anon.ContainerStyle
  ]
  
  type CustomDayHeaderStylesFunc = js.Function1[
    /* date */ typings.reactNativeCalendarPicker.mod.CustomDayHeaderStylesFuncDateArg, 
    typings.reactNativeCalendarPicker.anon.Style
  ]
  
  type DateChangedCallback = js.Function2[
    /* date */ typings.moment.mod.Moment, 
    /* type */ typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.START_DATE | typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.END_DATE, 
    scala.Unit
  ]
  
  type DisabledDatesFunc = js.Function1[/* date */ typings.moment.mod.Moment, scala.Boolean]
  
  type MomentParsable = typings.moment.mod.MomentInput
  
  type MonthChangedCallback = js.Function1[/* date */ typings.moment.mod.Moment, scala.Unit]
}
