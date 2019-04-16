package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1AdjustInventoryRequest")
@js.native
class V1AdjustInventoryRequest () extends js.Object {
  /**
    * The reason for the inventory adjustment.
    * See [V1AdjustInventoryRequestAdjustmentType](#type-v1adjustinventoryrequestadjustmenttype) for possible values
    */
  var adjustment_type: js.UndefOr[
    squareDashConnectLib.squareDashConnectMod.V1AdjustInventoryRequestNs.AdjustmentTypeEnum
  ] = js.native
  /**
    * A note about the inventory adjustment.
    */
  var memo: js.UndefOr[java.lang.String] = js.native
  /**
    * The number to adjust the variation's quantity by.
    */
  var quantity_delta: js.UndefOr[scala.Double] = js.native
}

