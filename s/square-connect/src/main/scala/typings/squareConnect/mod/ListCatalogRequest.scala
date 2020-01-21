package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListCatalogRequest")
@js.native
class ListCatalogRequest () extends js.Object {
  /**
    * The pagination cursor returned in the previous response. Leave unset for an initial request.
    * See [Pagination](/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * An optional case-insensitive, comma-separated list of object types to retrieve, for example `ITEM,ITEM_VARIATION,CATEGORY,IMAGE`.
    * The legal values are taken from the [CatalogObjectType](#type-catalogobjecttype) enumeration, namely:
    * `ITEM`, `ITEM_VARIATION`, `CATEGORY`, `DISCOUNT`, `TAX`, `MODIFIER`, `MODIFIER_LIST`, or `IMAGE`.
    */
  var types: js.UndefOr[String] = js.native
}

