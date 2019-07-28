package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchOrdersDateTimeFilter")
@js.native
class SearchOrdersDateTimeFilter () extends js.Object {
  /**
    * Time range for filtering on the `closed_at` timestamp.
    */
  var closed_at: js.UndefOr[TimeRange] = js.native
  /**
    * Time range for filtering on the `created_at` timestamp.
    */
  var created_at: js.UndefOr[TimeRange] = js.native
  /**
    * Time range for filtering on the `updated_at` timestamp.
    */
  var updated_at: js.UndefOr[TimeRange] = js.native
}

