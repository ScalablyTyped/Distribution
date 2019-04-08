package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ShiftFilter")
@js.native
class ShiftFilter () extends js.Object {
  /**
    * Fetch shifts for the specified employee.
    */
  var employee_id: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * Fetch the `Shift`s that end in the time range - Inclusive.
    */
  var end: js.UndefOr[TimeRange] = js.native
  /**
    * Fetch shifts for the specified location.
    */
  var location_id: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * Fetch `Shift`s that start in the time range - Inclusive.
    */
  var start: js.UndefOr[TimeRange] = js.native
  /**
    * Fetch a `Shift` instance by `Shift.status`.
    */
  var status: js.UndefOr[squareDashConnectLib.squareDashConnectMod.ShiftFilterNs.StatusEnum] = js.native
  /**
    * Fetch the `Shift`s based on workday date range.
    */
  var workday: js.UndefOr[ShiftWorkday] = js.native
}

