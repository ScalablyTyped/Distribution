package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "DateRange")
@js.native
class DateRange () extends js.Object {
  /**
    * String in `YYYY-MM-DD` format, e.g. `2017-10-31` per the ISO 8601 extended format for calendar dates.
    * The end of a date range (inclusive)
    */
  var end_date: js.UndefOr[String] = js.native
  /**
    * String in `YYYY-MM-DD` format, e.g. `2017-10-31` per the ISO 8601 extended format for calendar dates.
    * The beginning of a date range (inclusive).
    */
  var start_date: js.UndefOr[String] = js.native
}

