package typings
package reactDashNativeDashCalendarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashCalendarsMod {
  type CalendarMarkingProps = MultiDotMarkingProps | DotMarkingProps | PeriodMarkingProps | MultiPeriodMarkingProps | CustomMarkingProps | js.Object
  type DateCallbackHandler = js.Function1[/* date */ DateObject, scala.Unit]
  type Marking = CustomMarking | DotMarking | MultiDotMarking | MultiPeriodMarking | PeriodMarking
  type TCalendarDate = stdLib.Date | DateObject | scala.Double | java.lang.String | js.Any
}
