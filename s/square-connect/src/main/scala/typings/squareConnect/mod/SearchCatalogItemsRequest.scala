package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchCatalogItemsRequest")
@js.native
class SearchCatalogItemsRequest () extends StObject {
  
  /**
    * The category id query expression to return items containing the specified category IDs.
    */
  var category_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The pagination token, returned in the previous response, used to fetch the next batch of pending results.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The customer-attribute filter to return items or item variations matching the specified custom attribute expressions.
    * A maximum number of 10 custom attribute expressions are supported in a single call to the `SearchCatalogItems` endpoint.
    */
  var custom_attribute_filters: js.UndefOr[js.Array[CustomAttributeFilter]] = js.native
  
  /**
    * The enabled-location query expression to return items and item variations having specified enabled locations.
    */
  var enabled_location_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The maximum number of results to return per page. The default value is 100.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * The product types query expression to return items or item variations having the specified product types.
    * See [CatalogItemProductType](#type-catalogitemproducttype) for possible values.
    */
  var product_types: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The order to sort the results by item names. The default sort order is ascending (`ASC`).
    * See [SortOrder](#type-sortorder) for possible values.
    */
  var sort_order: js.UndefOr[String] = js.native
  
  /**
    * The stock-level query expression to return item variations with the specified stock levels.
    * See [SearchCatalogItemsRequestStockLevel](#type-searchcatalogitemsrequeststocklevel) for possible values.
    */
  var stock_levels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The text filter expression to return items or item variations containing specified text in the `name`, `description`,
    * or `abbreviation` attribute value of an item, or in the `name`, `sku`, or `upc` attribute value of an item variation.
    */
  var text_filter: js.UndefOr[String] = js.native
}
