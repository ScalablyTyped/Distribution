package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "UpsertCatalogObjectRequest")
@js.native
class UpsertCatalogObjectRequest () extends js.Object {
  /**
    * A value you specify that uniquely identifies this request among all your requests. A common way to create a valid
    * idempotency key is to use a Universally unique identifier (UUID).  If you're unsure whether a particular request
    * was successful, you can reattempt it with the same idempotency key without worrying about creating duplicate
    * objects.  See [Idempotency](/basics/api101/idempotency) for more information.
    */
  var idempotency_key: java.lang.String = js.native
  /**
    * A [CatalogObject](#type-catalogobject) to be created or updated. The object's `is_deleted` field must not be set
    * to `true`. When creating a new object, the object's ID must either start with a `#` character or be left blank.
    * In either case it will be replaced with a server-generated ID.
    */
  var `object`: CatalogObject = js.native
}

