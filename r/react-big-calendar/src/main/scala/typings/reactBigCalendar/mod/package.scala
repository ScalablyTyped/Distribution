package typings.reactBigCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Culture = java.lang.String
  type DateFormat = java.lang.String | typings.reactBigCalendar.mod.DateFormatFunction
  type DateFormatFunction = js.Function3[
    /* date */ typings.std.Date, 
    /* culture */ js.UndefOr[typings.reactBigCalendar.mod.Culture], 
    /* localizer */ js.UndefOr[typings.reactBigCalendar.mod.DateLocalizer], 
    java.lang.String
  ]
  type DateRangeFormatFunction = js.Function3[
    /* range */ typings.reactBigCalendar.mod.DateRange, 
    /* culture */ js.UndefOr[typings.reactBigCalendar.mod.Culture], 
    /* localizer */ js.UndefOr[typings.reactBigCalendar.mod.DateLocalizer], 
    java.lang.String
  ]
  type DayLayoutFunction[TEvent /* <: js.Object */] = js.Function1[
    /* _ */ typings.reactBigCalendar.anon.Accessors[TEvent], 
    js.Array[typings.reactBigCalendar.anon.Event[TEvent]]
  ]
  type DayPropGetter = js.Function2[
    /* date */ typings.std.Date, 
    /* resourceId */ js.UndefOr[scala.Double | java.lang.String], 
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement]
  ]
  type EventPropGetter[T] = js.Function4[
    /* event */ T, 
    /* start */ typings.reactBigCalendar.mod.stringOrDate, 
    /* end */ typings.reactBigCalendar.mod.stringOrDate, 
    /* isSelected */ scala.Boolean, 
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement]
  ]
  type FormatInput = scala.Double | java.lang.String | typings.std.Date
  type SlotGroupPropGetter = js.Function0[typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement]]
  type SlotPropGetter = js.Function2[
    /* date */ typings.std.Date, 
    /* resourceId */ js.UndefOr[scala.Double | java.lang.String], 
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement]
  ]
  type ViewsProps = js.Array[typings.reactBigCalendar.mod.View] | typings.reactBigCalendar.anon.Agenda
  type stringOrDate = java.lang.String | typings.std.Date
}
