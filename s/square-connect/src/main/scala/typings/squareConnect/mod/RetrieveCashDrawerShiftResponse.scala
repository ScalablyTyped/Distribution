package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RetrieveCashDrawerShiftResponse")
@js.native
class RetrieveCashDrawerShiftResponse () extends js.Object {
  /**
    * The cash drawer shift queried for.
    */
  var cash_drawer_shift: js.UndefOr[CashDrawerShift] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}

