package typings
package reactDashNativeDashCalendarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashCalendarsMod {
  /* Rewritten from type alias, can be one of: 
    - MultiDotMarkingProps
    - DotMarkingProps
    - PeriodMarkingProps
    - MultiPeriodMarkingProps
    - CustomMarkingProps
    - js.Object
  */
  type CalendarMarkingProps = _CalendarMarkingProps | js.Object
  type DateCallbackHandler = js.Function1[/* date */ DateObject, scala.Unit]
  type TCalendarDate = stdLib.Date | DateObject | scala.Double | java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify XDate */ js.Any)
}
