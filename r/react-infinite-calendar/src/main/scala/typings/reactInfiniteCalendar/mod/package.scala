package typings.reactInfiniteCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CalendarClass = typings.react.mod.ComponentClass[
    typings.reactInfiniteCalendar.mod.ReactInfiniteCalendarProps, 
    typings.react.mod.ComponentState
  ]
  type DateSelectFunction = js.Function1[/* date */ typings.std.Date, scala.Unit]
  type DateType = typings.std.Date | java.lang.String | scala.Double
  type RangedSelectFunction = js.Function1[/* rangedDate */ typings.reactInfiniteCalendar.mod.RangedSelection, scala.Unit]
  type ReactInfiniteCalendar = typings.react.mod.Component[typings.reactInfiniteCalendar.mod.ReactInfiniteCalendarProps, js.Object, js.Any]
}
