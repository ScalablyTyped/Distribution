package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1PaymentItemDetail")
@js.native
class V1PaymentItemDetail () extends js.Object {
  /**
    * The name of the item's merchant-defined category, if any.
    */
  var category_name: js.UndefOr[java.lang.String] = js.native
  /**
    * The unique ID of the item purchased, if any.
    */
  var item_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The unique ID of the item variation purchased, if any.
    */
  var item_variation_id: js.UndefOr[java.lang.String] = js.native
  /**
    *  The item's merchant-defined SKU, if any.
    */
  var sku: js.UndefOr[java.lang.String] = js.native
}

