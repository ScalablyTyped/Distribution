package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchCatalogItemsResponse")
@js.native
class SearchCatalogItemsResponse () extends StObject {
  
  /**
    * Pagination token used in the next request to return more of the search result.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * Returned items matching the specified query expressions.
    */
  var items: js.UndefOr[js.Array[CatalogObject]] = js.native
  
  /**
    * Ids of returned item variations matching the specified query expression.
    */
  var matched_variation_ids: js.UndefOr[js.Array[String]] = js.native
}
