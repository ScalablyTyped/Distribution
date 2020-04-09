package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "UpdateItemModifierListsRequest")
@js.native
class UpdateItemModifierListsRequest () extends js.Object {
  /**
    * The IDs of the catalog items associated with the CatalogModifierList objects being updated.
    */
  var item_ids: js.Array[String] = js.native
  /**
    * The IDs of the CatalogModifierList objects to disable for the CatalogItem.
    */
  var modifier_lists_to_disable: js.UndefOr[js.Array[String]] = js.native
  /**
    * The IDs of the CatalogModifierList objects to enable for the CatalogItem.
    */
  var modifier_lists_to_enable: js.UndefOr[js.Array[String]] = js.native
}

