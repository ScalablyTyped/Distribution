package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "DeleteCatalogObjectResponse")
@js.native
class DeleteCatalogObjectResponse () extends js.Object {
  /**
    * The database [timestamp](#workingwithdates) of this deletion in RFC 3339 format, e.g.,
    * \"2016-09-04T23:59:33.123Z\".
    */
  var deleted_at: js.UndefOr[java.lang.String] = js.native
  /**
    * The IDs of all [CatalogObject](#type-catalogobject)s deleted by this request. Multiple IDs may be returned when
    * associated objects are also deleted, for example a [CatalogItemVariation](#type-catalogitemvariation) will be
    * deleted (and its ID included in this field) when its parent [CatalogItem](#type-catalogitem) is deleted.
    */
  var deleted_object_ids: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * The set of [Error](#type-error)s encountered.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
}

