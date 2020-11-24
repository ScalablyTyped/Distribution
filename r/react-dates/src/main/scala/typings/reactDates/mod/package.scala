package typings.reactDates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CalendarDay = typings.react.mod.ComponentClass[typings.reactDates.mod.CalendarDayShape, typings.react.mod.ComponentState]
  
  type CalendarMonth = typings.react.mod.ComponentClass[typings.reactDates.mod.CalendarMonthShape, typings.react.mod.ComponentState]
  
  type CalendarMonthGrid = typings.react.mod.ComponentClass[typings.reactDates.mod.CalendarMonthGridShape, typings.react.mod.ComponentState]
  
  type CalendarMonthGridShape = typings.reactDates.mod.RenderMonthProps with typings.reactDates.anon.PickCalendarMonthShapeena with typings.reactDates.anon.FirstVisibleMonthIndex
  
  type CalendarMonthShape = typings.reactDates.mod.RenderMonthProps with typings.reactDates.anon.PickCalendarDayShapedaySi with typings.reactDates.anon.DayAriaLabelFormat
  
  type DateRangePicker = typings.react.mod.ComponentClass[typings.reactDates.mod.DateRangePickerShape, typings.react.mod.ComponentState]
  
  type DateRangePickerInput = typings.react.mod.ComponentClass[typings.reactDates.mod.DateRangePickerInputShape, typings.react.mod.ComponentState]
  
  type DateRangePickerInputController = typings.react.mod.ComponentClass[
    typings.reactDates.mod.DateRangePickerInputControllerShape, 
    typings.react.mod.ComponentState
  ]
  
  type DateRangePickerShape = typings.reactDates.mod.RenderMonthProps with typings.reactDates.anon.AnchorDirection
  
  type DayPicker = typings.react.mod.ComponentClass[typings.reactDates.mod.DayPickerShape, typings.react.mod.ComponentState]
  
  type DayPickerRangeController = typings.react.mod.ComponentClass[
    typings.reactDates.mod.DayPickerRangeControllerShape, 
    typings.react.mod.ComponentState
  ]
  
  type DayPickerRangeControllerShape = typings.reactDates.mod.RenderMonthProps with typings.reactDates.anon.PickDayPickerShaperenderW with typings.reactDates.anon.DaysViolatingMinNightsCanBeClicked
  
  type DayPickerShape = typings.reactDates.mod.RenderMonthProps with typings.reactDates.anon.PickCalendarMonthGridShap with (typings.reactDates.anon.OnGetNextScrollableMonths | typings.reactDates.anon.OnGetPrevScrollableMonths) with typings.reactDates.anon.CalendarInfoPosition
  
  type DayPickerSingleDateController = typings.react.mod.ComponentClass[
    typings.reactDates.mod.DayPickerSingleDateControllerShape, 
    typings.react.mod.ComponentState
  ]
  
  type DayPickerSingleDateControllerShape = typings.reactDates.mod.RenderMonthProps with typings.reactDates.anon.PickDayPickerShaperenderWCalendarInfoPosition with typings.reactDates.anon.InitialVisibleMonth
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.reactDates.reactDatesStrings.startDate
    - typings.reactDates.reactDatesStrings.endDate
  */
  type DisabledShape = typings.reactDates.mod._DisabledShape | scala.Boolean
  
  type ModifiersShape = typings.std.Set[java.lang.String]
  
  type SingleDatePicker = typings.react.mod.ComponentClass[typings.reactDates.mod.SingleDatePickerShape, typings.react.mod.ComponentState]
  
  type SingleDatePickerInput = typings.react.mod.FC[typings.reactDates.mod.SingleDatePickerInputShape]
  
  type SingleDatePickerShape = typings.reactDates.mod.RenderMonthProps with typings.reactDates.anon.AppendToBody
}
