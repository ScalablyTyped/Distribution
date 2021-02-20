package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RetrieveCatalogObjectRequest")
@js.native
class RetrieveCatalogObjectRequest () extends StObject {
  
  /**
    * If `true`, the response will include additional objects that are related to the requested object, as follows:
    *  - If the `object` field of the response contains a `CatalogItem`, its associated `CatalogCategory`, `CatalogTax`,
    *      `CatalogImage` and `CatalogModifierList` objects will be returned in the `related_objects` field of the response.
    *  - If the `object` field of the response contains a `CatalogItemVariation`, its parent `CatalogItem` will be returned
    *     in the `related_objects` field of the response.  Default value: `false`
    */
  var include_related_objects: js.UndefOr[Boolean] = js.native
}
