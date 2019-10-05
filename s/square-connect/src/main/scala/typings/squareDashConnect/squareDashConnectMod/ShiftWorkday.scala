package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.ShiftWorkday.MatchShiftsByEnum
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
  var default_timezone: js.UndefOr[String] = js.native
  /**
    * The strategy on which the dates are applied. See [ShiftWorkdayMatcher](#type-shiftworkdaymatcher) for possible values.
    */
  var match_shifts_by: js.UndefOr[MatchShiftsByEnum] = js.native
}

@JSImport("square-connect", "ShiftWorkday")
@js.native
object ShiftWorkday extends js.Object {
  @js.native
  sealed trait MatchShiftsByEnum extends js.Object
  
  @js.native
  object MatchShiftsByEnum extends js.Object {
    @js.native
    sealed trait END_AT extends MatchShiftsByEnum
    
    @js.native
    sealed trait INTERSECTION extends MatchShiftsByEnum
    
    @js.native
    sealed trait START_AT extends MatchShiftsByEnum
    
    /* "END_AT" */ val END_AT: typings.squareDashConnect.squareDashConnectMod.ShiftWorkday.MatchShiftsByEnum.END_AT with String = js.native
    /* "INTERSECTION" */ val INTERSECTION: typings.squareDashConnect.squareDashConnectMod.ShiftWorkday.MatchShiftsByEnum.INTERSECTION with String = js.native
    /* "START_AT" */ val START_AT: typings.squareDashConnect.squareDashConnectMod.ShiftWorkday.MatchShiftsByEnum.START_AT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MatchShiftsByEnum with String] = js.native
  }
  
}

