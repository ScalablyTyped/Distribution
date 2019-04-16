package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BatchChangeInventoryRequest")
@js.native
class BatchChangeInventoryRequest () extends js.Object {
  /**
    * The set of physical counts and inventory adjustments to be made.
    * Changes are applied based on the client-supplied timestamp and may be sent out of order. Max size is 100 changes.
    */
  var changes: js.UndefOr[js.Array[InventoryChange]] = js.native
  /**
    * A client-supplied, universally unique identifier (UUID) for the request.
    * See [Idempotency](/basics/api101/idempotency) in the [API Development 101](/basics/api101/overview) section for details.
    */
  var idempotency_key: js.UndefOr[java.lang.String] = js.native
  /**
    * Indicates whether the current physical count should be ignored if the quantity is unchanged since the last physical count.
    * Default: `true`.
    */
  var ignore_unchanged_counts: js.UndefOr[scala.Boolean] = js.native
}

