package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogQuery")
@js.native
class CatalogQuery () extends js.Object {
  /**
    * A query that returns only objects for which the given (string-valued) attribute has the given case-insensitive
    * value.
    */
  var exact_query: js.UndefOr[CatalogQueryExact] = js.native
  /**
    * A query that returns all `CatalogItemVariation`s that have all of the given `CatalogItemOption` values.
    */
  var item_variations_for_item_option_values_query: js.UndefOr[CatalogQueryItemVariationsForItemOptionValues] = js.native
  /**
    * A query that returns all `CatalogItem`s that have all of the given `CatalogItemOption`s.
    */
  var items_for_item_options_query: js.UndefOr[CatalogQueryItemsForItemOptions] = js.native
  /**
    * A query that returns all `CatalogItem`s that have any of the given `CatalogModifierList`s enabled.
    */
  var items_for_modifier_list_query: js.UndefOr[CatalogQueryItemsForModifierList] = js.native
  /**
    * A query that returns all `CatalogItem`s that have any of the given `CatalogTax`es enabled.
    */
  var items_for_tax_query: js.UndefOr[CatalogQueryItemsForTax] = js.native
  /**
    * A query that returns only objects for which the given (string-valued) attribute has the given case-insensitive
    * prefix.
    */
  var prefix_query: js.UndefOr[CatalogQueryPrefix] = js.native
  /**
    * A query that returns only objects for which the given (integer-valued) attribute lies in the given range.
    */
  var range_query: js.UndefOr[CatalogQueryRange] = js.native
  /**
    * A query that returns all objects, sorted by the given attribute.
    */
  var sorted_attribute_query: js.UndefOr[CatalogQuerySortedAttribute] = js.native
  /**
    * A query that returns only objects whose searchable attributes contain all of the given keywords as prefixes.
    * For example, if a `CatalogItem` contains attributes `{\"name\": \"t-shirt\"}` and `{\"description\": \"Small, Purple\"}`,
    * it will be matched by the query `{\"keywords\": [\"shirt\", \"sma\", \"purp\"]}`.
    */
  var text_query: js.UndefOr[CatalogQueryText] = js.native
}

