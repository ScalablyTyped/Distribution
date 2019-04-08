package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BatchUpsertCatalogObjectsResponse")
@js.native
class BatchUpsertCatalogObjectsResponse () extends js.Object {
  /**
    * The set of [Error](#type-error)s encountered.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
  /**
    * The mapping between client and server IDs for this Upsert.
    */
  var id_mappings: js.UndefOr[js.Array[CatalogIdMapping]] = js.native
  /**
    * The created [CatalogObject](#type-catalogobject)s
    */
  var objects: js.UndefOr[js.Array[CatalogObject]] = js.native
  /**
    * The database [timestamp](#workingwithdates) of this update in RFC 3339 format, e.g.,
    * \"2016-09-04T23:59:33.123Z\".
    */
  var updated_at: js.UndefOr[java.lang.String] = js.native
}

