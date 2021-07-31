package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BatchRetrieveCatalogObjectsRequest")
@js.native
class BatchRetrieveCatalogObjectsRequest () extends StObject {
  
  /**
    * If `true`, the response will include additional objects that are related to the requested objects, as follows:
    *  * If the `objects` field of the response contains a CatalogItem, its associated CatalogCategory objects, CatalogTax objects,
    *  CatalogImage objects and CatalogModifierLists will be returned in the `related_objects` field of the response.
    *  * If the `objects` field of the response contains a CatalogItemVariation, its parent CatalogItem will be returned
    *  in the `related_objects` field of the response.
    */
  var include_related_objects: js.UndefOr[Boolean] = js.native
  
  /**
    * The IDs of the CatalogObjects to be retrieved.
    */
  var object_ids: js.Array[String] = js.native
}
