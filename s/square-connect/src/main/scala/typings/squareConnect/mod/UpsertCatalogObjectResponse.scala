package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "UpsertCatalogObjectResponse")
@js.native
class UpsertCatalogObjectResponse () extends js.Object {
  /**
    * The successfully created or updated CatalogObject.
    */
  var catalog_object: js.UndefOr[CatalogObject] = js.native
  /**
    * Information on any errors encountered.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * The mapping between client and server IDs for this upsert.
    */
  var id_mappings: js.UndefOr[js.Array[CatalogIdMapping]] = js.native
}

