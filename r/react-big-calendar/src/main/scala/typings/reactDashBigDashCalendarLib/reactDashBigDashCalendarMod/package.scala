package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBigDashCalendarMod {
  type Culture = java.lang.String | js.Array[java.lang.String]
  type DateFormat = java.lang.String | DateFormatFunction
  type DateFormatFunction = js.Function3[
    /* date */ stdLib.Date, 
    /* culture */ js.UndefOr[java.lang.String], 
    /* localizer */ js.UndefOr[js.Object], 
    java.lang.String
  ]
  type DateRangeFormatFunction = js.Function3[
    /* range */ DateRange, 
    /* culture */ js.UndefOr[java.lang.String], 
    /* localizer */ js.UndefOr[js.Object], 
    java.lang.String
  ]
  type DayPropGetter = js.Function1[/* date */ stdLib.Date, reactDashBigDashCalendarLib.Anon_ClassName]
  type EventPropGetter[T] = js.Function4[
    /* event */ T, 
    /* start */ stringOrDate, 
    /* end */ stringOrDate, 
    /* isSelected */ scala.Boolean, 
    reactDashBigDashCalendarLib.Anon_ClassName
  ]
  type FormatInput = scala.Double | java.lang.String | stdLib.Date
  type SlotPropGetter = js.Function1[/* date */ stdLib.Date, reactDashBigDashCalendarLib.Anon_ClassName]
  type ViewsProps = js.Array[View] | reactDashBigDashCalendarLib.Anon_Agenda
  type stringOrDate = java.lang.String | stdLib.Date
}
