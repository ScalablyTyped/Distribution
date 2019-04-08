package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchCatalogObjectsResponse")
@js.native
class SearchCatalogObjectsResponse () extends js.Object {
  /**
    * The pagination cursor to be used in a subsequent request. If unset, this is the final response. See
    * [Pagination](/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[java.lang.String] = js.native
  /**
    * The set of [Error](#type-error)s encountered.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
  /**
    * The [CatalogObject](#type-catalogobject)s returned.
    */
  var objects: js.UndefOr[js.Array[CatalogObject]] = js.native
  /**
    * A list of [CatalogObject](#type-catalogobject)s referenced by the objects in the `objects` field.
    */
  var related_objects: js.UndefOr[js.Array[CatalogObject]] = js.native
}

