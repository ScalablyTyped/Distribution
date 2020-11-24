package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchCatalogObjectsResponse")
@js.native
class SearchCatalogObjectsResponse () extends js.Object {
  
  /**
    * The pagination cursor to be used in a subsequent request. If unset, this is the final response.
    * See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * When the associated product catalog was last updated.
    * Will match the value for `end_time` or `cursor` if either field is included in the `SearchCatalog` request.
    */
  var latest_time: js.UndefOr[String] = js.native
  
  /**
    * The CatalogObjects returned.
    */
  var objects: js.UndefOr[js.Array[CatalogObject]] = js.native
  
  /**
    * A list of CatalogObjects referenced by the objects in the `objects` field.
    */
  var related_objects: js.UndefOr[js.Array[CatalogObject]] = js.native
}
