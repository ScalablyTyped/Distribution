package typings.squareDashConnect.squareDashConnectMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BatchChangeInventoryResponse")
@js.native
class BatchChangeInventoryResponse () extends js.Object {
  /**
    * The current counts for all objects referenced in the request.
    */
  var counts: js.UndefOr[js.Array[InventoryCount]] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}

