package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1InventoryEntry")
@js.native
class V1InventoryEntry () extends js.Object {
  /**
    * The current available quantity of the item variation.
    */
  var quantity_on_hand: js.UndefOr[Double] = js.native
  /**
    * The variation that the entry corresponds to.
    */
  var variation_id: js.UndefOr[String] = js.native
}

