package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListMerchantsResponse")
@js.native
class ListMerchantsResponse () extends StObject {
  
  /**
    * If the  response is truncated, the cursor to use in next request to fetch next set of objects.
    */
  var cursor: js.UndefOr[Double] = js.native
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The requested `Merchant` entities.
    */
  var merchant: js.UndefOr[js.Array[Merchant]] = js.native
}
