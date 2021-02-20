package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "UpsertCatalogObjectResponse")
@js.native
class UpsertCatalogObjectResponse () extends StObject {
  
  /**
    * The successfully created or updated CatalogObject.
    */
  var catalog_object: js.UndefOr[CatalogObject] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The mapping between client and server IDs for this upsert.
    */
  var id_mappings: js.UndefOr[js.Array[CatalogIdMapping]] = js.native
}
