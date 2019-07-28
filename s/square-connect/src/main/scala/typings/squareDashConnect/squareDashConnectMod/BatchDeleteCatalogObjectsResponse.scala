package typings.squareDashConnect.squareDashConnectMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BatchDeleteCatalogObjectsResponse")
@js.native
class BatchDeleteCatalogObjectsResponse () extends js.Object {
  /**
    * The database [timestamp](#workingwithdates) of this deletion in RFC 3339 format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var deleted_at: js.UndefOr[String] = js.native
  /**
    * The IDs of all [CatalogObject](#type-catalogobject)s deleted by this request.
    */
  var deleted_object_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * The set of [Error](#type-error)s encountered.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}

