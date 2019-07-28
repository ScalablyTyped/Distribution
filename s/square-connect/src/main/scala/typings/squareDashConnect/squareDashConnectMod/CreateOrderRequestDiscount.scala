package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateOrderRequestDiscount")
@js.native
class CreateOrderRequestDiscount () extends js.Object {
  /**
    * Only used for ad hoc discounts. The monetary amount of the discount.
    */
  var amount_money: js.UndefOr[Money] = js.native
  /**
    * Only used for catalog discounts. The catalog object ID for an existing [CatalogDiscount](#type-catalogdiscount).
    * Do not provide a value for this field if you provide values in other fields for an ad hoc discount.
    */
  var catalog_object_id: js.UndefOr[String] = js.native
  /**
    * Only used for ad hoc discounts. The discount's name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Only used for ad hoc discounts. The percentage of the discount, as a string representation of a decimal number.
    * A value of `7.25` corresponds to a percentage of 7.25%. This value range between 0.0 up to 100.0.
    */
  var percentage: js.UndefOr[String] = js.native
}

