package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RetrieveCatalogObjectResponse")
@js.native
class RetrieveCatalogObjectResponse () extends js.Object {
  /**
    * The set of [Error](#type-error)s encountered.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
  /**
    * The [CatalogObject](#type-catalogobject)s returned.
    */
  var `object`: js.UndefOr[CatalogObject] = js.native
  /**
    * A list of [CatalogObject](#type-catalogobject)s referenced by the object in the `object` field.
    */
  var related_objects: js.UndefOr[js.Array[CatalogObject]] = js.native
}

