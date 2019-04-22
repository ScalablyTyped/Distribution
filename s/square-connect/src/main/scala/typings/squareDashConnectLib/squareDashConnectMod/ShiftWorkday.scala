package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ShiftWorkday")
@js.native
class ShiftWorkday () extends js.Object {
  /**
    * Dates for fetching the shifts
    */
  var date_range: js.UndefOr[DateRange] = js.native
  /**
    * Location-specific timezones convert workdays to datetime filters.
    * Every location included in the query must have a timezone, or this field must be provided as a fallback.
    * Format: the IANA timezone database identifier for the relevant timezone.
    */
  var default_timezone: js.UndefOr[java.lang.String] = js.native
  /**
    * The strategy on which the dates are applied. See [ShiftWorkdayMatcher](#type-shiftworkdaymatcher) for possible values.
    */
  var match_shifts_by: js.UndefOr[squareDashConnectLib.squareDashConnectMod.ShiftWorkdayNs.MatchShiftsByEnum] = js.native
}

