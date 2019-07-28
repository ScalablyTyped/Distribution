package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderQuantityUnit")
@js.native
class OrderQuantityUnit () extends js.Object {
  /**
    * A [MeasurementUnit](#type-measurementunit) that represents the unit of measure for the quantity.
    */
  var measurement_unit: js.UndefOr[MeasurementUnit] = js.native
  /**
    * For non-integer quantities, represents the number of digits after the decimal point that are recorded for this quantity.
    * For example, a precision of 1 allows quantities like "1.0" and "1.1", but not "1.01".
    * Min: 0. Max: 5. Orders Hub and older versions of Connect do not support non-integer quantities.
    * See [Decimal quantities with Orders hub and older versions of Connect](/more-apis/orders/overview#decimal-quantities).
    */
  var precision: js.UndefOr[Double] = js.native
}

