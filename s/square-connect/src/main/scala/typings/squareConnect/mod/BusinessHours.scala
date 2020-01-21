package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BusinessHours")
@js.native
class BusinessHours () extends js.Object {
  /**
    * The list of time periods during which the business is open. There may be at most 10 periods per day.
    */
  var periods: js.UndefOr[js.Array[BusinessHoursPeriod]] = js.native
}

