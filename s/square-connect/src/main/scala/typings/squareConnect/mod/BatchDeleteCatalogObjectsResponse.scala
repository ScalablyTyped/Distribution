package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BatchDeleteCatalogObjectsResponse")
@js.native
open class BatchDeleteCatalogObjectsResponse () extends StObject {
  
  /**
    * The database [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates) of this deletion
    * in RFC 3339 format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var deleted_at: js.UndefOr[String] = js.native
  
  /**
    * The IDs of all CatalogObjects deleted by this request.
    */
  var deleted_object_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
