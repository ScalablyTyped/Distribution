package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BatchUpsertCatalogObjectsResponse")
@js.native
class BatchUpsertCatalogObjectsResponse () extends js.Object {
  /**
    * Information on any errors that encountered.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * The mapping between client and server IDs for this upsert.
    */
  var id_mappings: js.UndefOr[js.Array[CatalogIdMapping]] = js.native
  /**
    * The created successfully created CatalogObjects.
    */
  var objects: js.UndefOr[js.Array[CatalogObject]] = js.native
  /**
    * The database [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates) of this update
    * in RFC 3339 format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var updated_at: js.UndefOr[String] = js.native
}

