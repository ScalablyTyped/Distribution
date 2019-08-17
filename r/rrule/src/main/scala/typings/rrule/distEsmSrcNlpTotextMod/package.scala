package typings.rrule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsmSrcNlpTotextMod {
  import typings.rrule.distEsmSrcWeekdayMod.Weekday

  type DateFormatter = js.Function3[/* year */ Double, /* month */ String, /* day */ Double, String]
  type GetText = js.Function1[/* id */ String | Double | Weekday, String]
}
