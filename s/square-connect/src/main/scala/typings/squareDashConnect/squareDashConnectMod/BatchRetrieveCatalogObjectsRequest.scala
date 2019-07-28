package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BatchRetrieveCatalogObjectsRequest")
@js.native
class BatchRetrieveCatalogObjectsRequest () extends js.Object {
  /**
    * If `true`, the response will include additional objects that are related to the requested objects, as follows:
    * If the `objects` field of the response contains a [CatalogItem](#type-catalogitem), its associated
    * [CatalogCategory](#type-catalogcategory), [CatalogTax](#type-catalogtax)es, and
    * [CatalogModifierList](#type-catalogmodifierlist)s will be returned in the `related_objects` field of the
    * response. If the `objects` field of the response contains a [CatalogItemVariation](#type-catalogitemvariation),
    * its parent [CatalogItem](#type-catalogitem) will be returned in the `related_objects` field of the response.
    */
  var include_related_objects: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the [CatalogObject](#type-catalogobject)s to be retrieved.
    */
  var object_ids: js.Array[String] = js.native
}

