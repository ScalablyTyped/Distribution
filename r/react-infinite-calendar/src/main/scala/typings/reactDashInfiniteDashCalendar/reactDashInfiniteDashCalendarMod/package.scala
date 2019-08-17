package typings.reactDashInfiniteDashCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashInfiniteDashCalendarMod {
  import typings.react.reactMod.Component
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.std.Date

  type CalendarClass = ComponentClass[ReactInfiniteCalendarProps, ComponentState]
  type DateSelectFunction = js.Function1[/* date */ Date, Unit]
  type DateType = Date | String | Double
  type RangedSelectFunction = js.Function1[/* rangedDate */ RangedSelection, Unit]
  type ReactInfiniteCalendar = Component[ReactInfiniteCalendarProps, js.Object, js.Any]
}
