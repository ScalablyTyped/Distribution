package typings.reactBigCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Culture = java.lang.String | js.Array[java.lang.String]
  type DateFormat = java.lang.String | typings.reactBigCalendar.mod.DateFormatFunction
  type DateFormatFunction = js.Function3[
    /* date */ typings.std.Date, 
    /* culture */ js.UndefOr[java.lang.String], 
    /* localizer */ js.UndefOr[js.Object], 
    java.lang.String
  ]
  type DateRangeFormatFunction = js.Function3[
    /* range */ typings.reactBigCalendar.mod.DateRange, 
    /* culture */ js.UndefOr[java.lang.String], 
    /* localizer */ js.UndefOr[js.Object], 
    java.lang.String
  ]
  type DayPropGetter = js.Function1[/* date */ typings.std.Date, typings.reactBigCalendar.AnonClassName]
  type EventPropGetter[T] = js.Function4[
    /* event */ T, 
    /* start */ typings.reactBigCalendar.mod.stringOrDate, 
    /* end */ typings.reactBigCalendar.mod.stringOrDate, 
    /* isSelected */ scala.Boolean, 
    typings.reactBigCalendar.AnonClassName
  ]
  type FormatInput = scala.Double | java.lang.String | typings.std.Date
  type SlotPropGetter = js.Function1[/* date */ typings.std.Date, typings.reactBigCalendar.AnonClassName]
  type ViewsProps = js.Array[typings.reactBigCalendar.mod.View] | typings.reactBigCalendar.AnonAgenda
  type stringOrDate = java.lang.String | typings.std.Date
}
