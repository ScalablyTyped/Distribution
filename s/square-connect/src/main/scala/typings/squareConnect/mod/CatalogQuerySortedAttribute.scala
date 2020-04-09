package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogQuerySortedAttribute")
@js.native
class CatalogQuerySortedAttribute () extends js.Object {
  /**
    * The attribute whose value should be used as the sort key.
    */
  var attribute_name: String = js.native
  /**
    * The first attribute value to be returned by the query. Ascending sorts will return only objects with this value
    * or greater, while descending sorts will return only objects with this value or less.
    * If unset, start at the beginning (for ascending sorts) or end (for descending sorts).
    */
  var initial_attribute_value: js.UndefOr[String] = js.native
  /**
    * The desired sort order, "ASC" (ascending) or "DESC" (descending). See [SortOrder](#type-sortorder) for possible values.
    */
  var sort_order: js.UndefOr[SortOrderType] = js.native
}

