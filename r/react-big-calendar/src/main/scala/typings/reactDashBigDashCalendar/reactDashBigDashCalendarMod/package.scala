package typings.reactDashBigDashCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBigDashCalendarMod {
  import typings.reactDashBigDashCalendar.Anon_Agenda
  import typings.reactDashBigDashCalendar.Anon_ClassName
  import typings.std.Date

  type Culture = String | js.Array[String]
  type DateFormat = String | DateFormatFunction
  type DateFormatFunction = js.Function3[
    /* date */ Date, 
    /* culture */ js.UndefOr[String], 
    /* localizer */ js.UndefOr[js.Object], 
    String
  ]
  type DateRangeFormatFunction = js.Function3[
    /* range */ DateRange, 
    /* culture */ js.UndefOr[String], 
    /* localizer */ js.UndefOr[js.Object], 
    String
  ]
  type DayPropGetter = js.Function1[/* date */ Date, Anon_ClassName]
  type EventPropGetter[T] = js.Function4[
    /* event */ T, 
    /* start */ stringOrDate, 
    /* end */ stringOrDate, 
    /* isSelected */ Boolean, 
    Anon_ClassName
  ]
  type FormatInput = Double | String | Date
  type SlotPropGetter = js.Function1[/* date */ Date, Anon_ClassName]
  type ViewsProps = js.Array[View] | Anon_Agenda
  type stringOrDate = String | Date
}
