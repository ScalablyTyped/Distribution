package typings
package reactDashInfiniteDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashInfiniteDashCalendarMod {
  type CalendarClass = reactLib.reactMod.ReactNs.ComponentClass[ReactInfiniteCalendarProps, reactLib.reactMod.ReactNs.ComponentState]
  type DateSelectFunction = js.Function1[/* date */ stdLib.Date, scala.Unit]
  type DateType = stdLib.Date | java.lang.String | scala.Double
  type RangedSelectFunction = js.Function1[/* rangedDate */ RangedSelection, scala.Unit]
  type ReactInfiniteCalendar = reactLib.reactMod.Component[ReactInfiniteCalendarProps, js.Object, js.Any]
}
