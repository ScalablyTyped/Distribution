package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RetrieveInventoryCountResponse")
@js.native
class RetrieveInventoryCountResponse () extends StObject {
  
  /**
    * The current calculated inventory counts for the requested object and locations.
    */
  var counts: js.UndefOr[js.Array[InventoryCount]] = js.native
  
  /**
    * The pagination cursor to be used in a subsequent request. If unset, this is the final response.
    * See the [Pagination](https://developer.squareup.com/docs/docs/working-with-apis/pagination) guide for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}
