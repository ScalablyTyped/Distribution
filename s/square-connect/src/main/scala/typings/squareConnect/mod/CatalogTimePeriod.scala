package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogTimePeriod")
@js.native
class CatalogTimePeriod () extends StObject {
  
  /**
    * An iCalendar (RFC5545) [event](https://tools.ietf.org/html/rfc5545#section-3.6.1), which specifies the name,
    * timing, duration and recurrence of this time period.
    * Example: `DTSTART:20190707T180000 DURATION:P2H RRULE:FREQ=WEEKLY;BYDAY=MO,WE,FR`
    * Only `SUMMARY`, `DTSTART`, `DURATION` and `RRULE` fields are supported.
    * `DTSTART` must be in local (unzoned) time format. Note that while `BEGIN:VEVENT` and `END:VEVENT`
    * is not required in the request. The response will always include them.
    */
  var event: js.UndefOr[String] = js.native
}
