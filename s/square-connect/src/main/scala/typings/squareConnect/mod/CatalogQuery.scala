package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogQuery")
@js.native
class CatalogQuery () extends js.Object {
  
  /**
    * An exact query expression to return objects with attribute name and value matching the specified attribute name and value exactly.
    * Value matching is case insensitive.
    */
  var exact_query: js.UndefOr[CatalogQueryExact] = js.native
  
  /**
    * A query expression to return item variations (of the `CatalogItemVariation` that contain all of the specified `CatalogItemOption` IDs.
    */
  var item_variations_for_item_option_values_query: js.UndefOr[CatalogQueryItemVariationsForItemOptionValues] = js.native
  
  /**
    * A query expression to return items that contains the specified item options (as identified the corresponding `CatalogItemOption` IDs).
    */
  var items_for_item_options_query: js.UndefOr[CatalogQueryItemsForItemOptions] = js.native
  
  /**
    * A query expression to return items that have any of the given modifier list (as identified by the corresponding `CatalogModifierList`s IDs) enabled.
    */
  var items_for_modifier_list_query: js.UndefOr[CatalogQueryItemsForModifierList] = js.native
  
  /**
    * A query expression to return items that have any of the specified taxes (as identified by the corresponding `CatalogTax` object IDs) enabled.
    */
  var items_for_tax_query: js.UndefOr[CatalogQueryItemsForTax] = js.native
  
  /**
    * A prefix query expression to return objects with attribute values that have a prefix matching the specified string value.
    * Value matching is case insensitive.
    */
  var prefix_query: js.UndefOr[CatalogQueryPrefix] = js.native
  
  /**
    * A range query expression to return objects with numeric values that lie in the specified range.
    */
  var range_query: js.UndefOr[CatalogQueryRange] = js.native
  
  /**
    * A set query expression to return objects with attribute name and value matching the specified attribute name
    * and any of the specified attribute values exactly. Value matching is case insensitive.
    */
  var set_query: js.UndefOr[CatalogQuerySet] = js.native
  
  /**
    * A query expression to sort returned query result by the given attribute.
    */
  var sorted_attribute_query: js.UndefOr[CatalogQuerySortedAttribute] = js.native
  
  /**
    * A text query expression to return object whose searchable attributes contain all of the given keywords,
    * irrespective of their order. For example, if a `CatalogItem` contains custom attribute values of
    * `{\"name\": \"t-shirt\"}` and `{\"description\": \"Small, Purple\"}`, the query filter of
    * `{\"keywords\": [\"shirt\", \"sma\", \"purp\"]}` returns this item.
    */
  var text_query: js.UndefOr[CatalogQueryText] = js.native
}
