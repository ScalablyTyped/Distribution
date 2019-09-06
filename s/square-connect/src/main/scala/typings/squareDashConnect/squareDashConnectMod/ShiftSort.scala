package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.ShiftSortNs.FieldEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ShiftSort")
@js.native
class ShiftSort () extends js.Object {
  /**
    * The field to sort on. See [ShiftSortField](#type-shiftsortfield) for possible values.
    */
  var field: js.UndefOr[FieldEnum] = js.native
  /**
    * The order in which results are returned. Defaults to DESC. See [SortOrder](#type-sortorder) for possible values.
    */
  var order: js.UndefOr[SortOrderEnum] = js.native
}

