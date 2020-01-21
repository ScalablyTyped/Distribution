package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RetrieveCatalogObjectRequest")
@js.native
class RetrieveCatalogObjectRequest () extends js.Object {
  /**
    * If `true`, the response will include additional objects that are related to the requested object, as follows:
    * If the `object` field of the response contains a [CatalogItem](#type-catalogitem), its associated
    * [CatalogCategory](#type-catalogcategory), [CatalogTax](#type-catalogtax)es, [CatalogImage](#type-catalogimage)s
    * and [CatalogModifierList](#type-catalogmodifierlist)s will be returned in the `related_objects` field of the response.
    * If the `object` field of the response contains a [CatalogItemVariation](#type-catalogitemvariation), its
    * parent [CatalogItem](#type-catalogitem) will be returned in the `related_objects` field of  the response.
    * Default value: `false`.
    */
  var include_related_objects: js.UndefOr[Boolean] = js.native
}

