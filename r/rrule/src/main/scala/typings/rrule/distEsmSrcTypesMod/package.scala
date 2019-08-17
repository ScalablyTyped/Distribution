package typings.rrule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsmSrcTypesMod {
  import typings.std.Date

  /* Rewritten from type alias, can be one of: 
    - typings.rrule.distEsmSrcWeekdayMod.WeekdayStr
    - scala.Double
    - typings.rrule.distEsmSrcWeekdayMod.Weekday
  */
  type ByWeekday = _ByWeekday | Double
  type IterResultType[M /* <: QueryMethodTypes */] = Date | Null | js.Array[Date]
  type QueryMethodTypes = String
}
