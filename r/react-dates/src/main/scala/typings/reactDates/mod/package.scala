package typings.reactDates.mod

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FC
import typings.reactDates.anon.AnchorDirection
import typings.reactDates.anon.AppendToBody
import typings.reactDates.anon.CalendarInfoPosition
import typings.reactDates.anon.DayAriaLabelFormat
import typings.reactDates.anon.DaysViolatingMinNightsCanBeClicked
import typings.reactDates.anon.FirstVisibleMonthIndex
import typings.reactDates.anon.InitialVisibleMonth
import typings.reactDates.anon.OnGetNextScrollableMonths
import typings.reactDates.anon.OnGetPrevScrollableMonths
import typings.reactDates.anon.PickCalendarDayShapedaySi
import typings.reactDates.anon.PickCalendarMonthGridShap
import typings.reactDates.anon.PickCalendarMonthShapeena
import typings.reactDates.anon.PickDayPickerShaperenderW
import typings.reactDates.anon.PickDayPickerShaperenderWCalendarInfoPosition
import typings.reactDates.mod.^
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CalendarDay: ComponentClass[CalendarDayShape, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("CalendarDay").asInstanceOf[ComponentClass[CalendarDayShape, ComponentState]]
type CalendarDay = ComponentClass[CalendarDayShape, ComponentState]

inline def CalendarMonth: ComponentClass[CalendarMonthShape, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("CalendarMonth").asInstanceOf[ComponentClass[CalendarMonthShape, ComponentState]]
type CalendarMonth = ComponentClass[CalendarMonthShape, ComponentState]

inline def CalendarMonthGrid: ComponentClass[CalendarMonthGridShape, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("CalendarMonthGrid").asInstanceOf[ComponentClass[CalendarMonthGridShape, ComponentState]]
type CalendarMonthGrid = ComponentClass[CalendarMonthGridShape, ComponentState]

inline def DateRangePicker: ComponentClass[typings.reactDates.mod.DateRangePickerShape, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("DateRangePicker").asInstanceOf[ComponentClass[typings.reactDates.mod.DateRangePickerShape, ComponentState]]
type DateRangePicker = ComponentClass[typings.reactDates.mod.DateRangePickerShape, ComponentState]

inline def DateRangePickerInput: ComponentClass[DateRangePickerInputShape, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("DateRangePickerInput").asInstanceOf[ComponentClass[DateRangePickerInputShape, ComponentState]]
type DateRangePickerInput = ComponentClass[DateRangePickerInputShape, ComponentState]

inline def DateRangePickerInputController: ComponentClass[DateRangePickerInputControllerShape, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("DateRangePickerInputController").asInstanceOf[ComponentClass[DateRangePickerInputControllerShape, ComponentState]]
type DateRangePickerInputController = ComponentClass[DateRangePickerInputControllerShape, ComponentState]

inline def DateRangePickerShape: typings.reactDates.mod.DateRangePickerShape = ^.asInstanceOf[js.Dynamic].selectDynamic("DateRangePickerShape").asInstanceOf[typings.reactDates.mod.DateRangePickerShape]
type DateRangePickerShape = RenderMonthProps & AnchorDirection

inline def DayPicker: ComponentClass[DayPickerShape, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("DayPicker").asInstanceOf[ComponentClass[DayPickerShape, ComponentState]]
type DayPicker = ComponentClass[DayPickerShape, ComponentState]

inline def DayPickerRangeController: ComponentClass[DayPickerRangeControllerShape, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("DayPickerRangeController").asInstanceOf[ComponentClass[DayPickerRangeControllerShape, ComponentState]]
type DayPickerRangeController = ComponentClass[DayPickerRangeControllerShape, ComponentState]

inline def DayPickerSingleDateController: ComponentClass[DayPickerSingleDateControllerShape, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("DayPickerSingleDateController").asInstanceOf[ComponentClass[DayPickerSingleDateControllerShape, ComponentState]]
type DayPickerSingleDateController = ComponentClass[DayPickerSingleDateControllerShape, ComponentState]

inline def SingleDatePicker: ComponentClass[typings.reactDates.mod.SingleDatePickerShape, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("SingleDatePicker").asInstanceOf[ComponentClass[typings.reactDates.mod.SingleDatePickerShape, ComponentState]]
type SingleDatePicker = ComponentClass[typings.reactDates.mod.SingleDatePickerShape, ComponentState]

inline def SingleDatePickerInput: FC[SingleDatePickerInputShape] = ^.asInstanceOf[js.Dynamic].selectDynamic("SingleDatePickerInput").asInstanceOf[FC[SingleDatePickerInputShape]]
type SingleDatePickerInput = FC[SingleDatePickerInputShape]

inline def SingleDatePickerShape: typings.reactDates.mod.SingleDatePickerShape = ^.asInstanceOf[js.Dynamic].selectDynamic("SingleDatePickerShape").asInstanceOf[typings.reactDates.mod.SingleDatePickerShape]
type SingleDatePickerShape = RenderMonthProps & AppendToBody

inline def isInclusivelyAfterDay(a: Moment, b: Moment): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInclusivelyAfterDay")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isInclusivelyBeforeDay(a: Moment, b: Moment): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInclusivelyBeforeDay")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isNextDay(a: Moment, b: Moment): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNextDay")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isSameDay(a: Moment, b: Moment): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def toISODateString(date: MomentInput): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toISODateString")(date.asInstanceOf[js.Any]).asInstanceOf[String | Null]
inline def toISODateString(date: MomentInput, currentFormat: MomentFormatSpecification): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("toISODateString")(date.asInstanceOf[js.Any], currentFormat.asInstanceOf[js.Any])).asInstanceOf[String | Null]

inline def toLocalizedDateString(date: MomentInput): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocalizedDateString")(date.asInstanceOf[js.Any]).asInstanceOf[String | Null]
inline def toLocalizedDateString(date: MomentInput, currentFormat: MomentFormatSpecification): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("toLocalizedDateString")(date.asInstanceOf[js.Any], currentFormat.asInstanceOf[js.Any])).asInstanceOf[String | Null]

inline def toMomentObject(dateString: MomentInput): Moment | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toMomentObject")(dateString.asInstanceOf[js.Any]).asInstanceOf[Moment | Null]
inline def toMomentObject(dateString: MomentInput, customFormat: MomentFormatSpecification): Moment | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("toMomentObject")(dateString.asInstanceOf[js.Any], customFormat.asInstanceOf[js.Any])).asInstanceOf[Moment | Null]

type CalendarMonthGridShape = RenderMonthProps & PickCalendarMonthShapeena & FirstVisibleMonthIndex

type CalendarMonthShape = RenderMonthProps & PickCalendarDayShapedaySi & DayAriaLabelFormat

type DayPickerRangeControllerShape = RenderMonthProps & PickDayPickerShaperenderW & DaysViolatingMinNightsCanBeClicked

type DayPickerShape = (OnGetNextScrollableMonths & RenderMonthProps & PickCalendarMonthGridShap & CalendarInfoPosition) | (OnGetPrevScrollableMonths & RenderMonthProps & PickCalendarMonthGridShap & CalendarInfoPosition)

type DayPickerSingleDateControllerShape = RenderMonthProps & PickDayPickerShaperenderWCalendarInfoPosition & InitialVisibleMonth

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typings.reactDates.reactDatesStrings.startDate
  - typings.reactDates.reactDatesStrings.endDate
*/
type DisabledShape = _DisabledShape | Boolean

type ModifiersShape = Set[String]
