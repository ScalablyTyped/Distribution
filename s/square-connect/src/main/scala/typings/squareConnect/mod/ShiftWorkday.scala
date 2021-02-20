package typings.squareConnect.mod

import typings.squareConnect.squareConnectStrings.END_AT
import typings.squareConnect.squareConnectStrings.INTERSECTION
import typings.squareConnect.squareConnectStrings.START_AT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ShiftWorkday")
@js.native
class ShiftWorkday () extends StObject {
  
  /**
    * Dates for fetching the shifts
    */
  var date_range: js.UndefOr[DateRange] = js.native
  
  /**
    * Location-specific timezones convert workdays to datetime filters.
    * Every location included in the query must have a timezone, or this field must be provided as a fallback.
    * Format: the IANA timezone database identifier for the relevant timezone.
    */
  var default_timezone: js.UndefOr[String] = js.native
  
  /**
    * The strategy on which the dates are applied. See [ShiftWorkdayMatcher](#type-shiftworkdaymatcher) for possible values.
    */
  var match_shifts_by: js.UndefOr[START_AT | END_AT | INTERSECTION] = js.native
}
