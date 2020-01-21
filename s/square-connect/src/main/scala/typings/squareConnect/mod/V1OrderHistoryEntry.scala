package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1OrderHistoryEntry")
@js.native
class V1OrderHistoryEntry () extends js.Object {
  /**
    * The type of action performed on the order.
    * See [V1OrderHistoryEntryAction](#type-v1orderhistoryentryaction) for possible values.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * The time when the action was performed, in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.native
}

