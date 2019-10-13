package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BatchDeleteCatalogObjectsRequest")
@js.native
class BatchDeleteCatalogObjectsRequest () extends js.Object {
  /**
    * The IDs of the [CatalogObject](#type-catalogobject)s to be deleted. When an object is deleted, other objects in
    * the graph that depend on that object will be deleted as well (for example, deleting a
    * [CatalogItem](#type-catalogitem) will delete its [CatalogItemVariation](#type-catalogitemvariation)s).
    */
  var object_ids: js.UndefOr[js.Array[String]] = js.native
}

