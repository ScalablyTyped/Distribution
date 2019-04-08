package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchShiftsResponse")
@js.native
class SearchShiftsResponse () extends js.Object {
  /**
    * Opaque cursor for fetching the next page.
    */
  var cursor: js.UndefOr[java.lang.String] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
  /**
    * Shifts
    */
  var shifts: js.UndefOr[js.Array[Shift]] = js.native
}

