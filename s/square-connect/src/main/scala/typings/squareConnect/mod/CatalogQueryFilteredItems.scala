package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogQueryFilteredItems")
@js.native
class CatalogQueryFilteredItems () extends js.Object {
  var category_ids: js.UndefOr[js.Array[String]] = js.native
  var custom_attribute_filters: js.UndefOr[js.Array[CatalogQueryFilteredItemsCustomAttributeFilter]] = js.native
  /**
    * See [CatalogQueryFilteredItemsNullableAttribute](#type-catalogqueryfiltereditemsnullableattribute) for possible values
    */
  var does_not_exist: js.UndefOr[js.Array[String]] = js.native
  var enabled_location_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * See [CatalogItemProductType](#type-catalogitemproducttype) for possible values
    */
  var product_types: js.UndefOr[js.Array[String]] = js.native
  var search_vendor_code: js.UndefOr[Boolean] = js.native
  /**
    * See [SortOrder](#type-sortorder) for possible values
    */
  var sort_order: js.UndefOr[String] = js.native
  /**
    * See [CatalogQueryFilteredItemsStockLevel](#type-catalogqueryfiltereditemsstocklevel) for possible values
    */
  var stock_levels: js.UndefOr[js.Array[String]] = js.native
  var text_filter: js.UndefOr[String] = js.native
  var vendor_ids: js.UndefOr[js.Array[String]] = js.native
}

