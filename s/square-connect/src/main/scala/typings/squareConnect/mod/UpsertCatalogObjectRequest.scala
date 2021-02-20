package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "UpsertCatalogObjectRequest")
@js.native
class UpsertCatalogObjectRequest () extends StObject {
  
  /**
    * A value you specify that uniquely identifies this request among all your requests.
    * A common way to create a valid idempotency key is to use a Universally unique identifier (UUID).
    * If you're unsure whether a particular request was successful, you can reattempt it with the same idempotency key
    * without worrying about creating duplicate objects.
    * See [Idempotency](https://developer.squareup.com/docs/basics/api101/idempotency) for more information.
    */
  var idempotency_key: String = js.native
  
  /**
    * A CatalogObject to be created or updated.
    *  - For updates, the object must be active (the `is_deleted` field is not `true`).
    *  - For creates, the object ID must start with `#`.
    * The provided ID is replaced with a server-generated ID.
    */
  var `object`: CatalogObject = js.native
}
