package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "UpdateItemTaxesRequest")
@js.native
class UpdateItemTaxesRequest () extends js.Object {
  /**
    * IDs for the CatalogItems associated with the CatalogTax objects being updated.
    */
  var item_ids: js.Array[String] = js.native
  /**
    * IDs of the CatalogTax objects to disable.
    */
  var taxes_to_disable: js.UndefOr[js.Array[String]] = js.native
  /**
    * IDs of the CatalogTax objects to enable.
    */
  var taxes_to_enable: js.UndefOr[js.Array[String]] = js.native
}

