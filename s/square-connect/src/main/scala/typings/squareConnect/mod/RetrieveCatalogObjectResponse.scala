package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RetrieveCatalogObjectResponse")
@js.native
class RetrieveCatalogObjectResponse () extends StObject {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The `CatalogObject`s returned.
    */
  var `object`: js.UndefOr[CatalogObject] = js.native
  
  /**
    * A list of `CatalogObject`s referenced by the object in the `object` field.
    */
  var related_objects: js.UndefOr[js.Array[CatalogObject]] = js.native
}
