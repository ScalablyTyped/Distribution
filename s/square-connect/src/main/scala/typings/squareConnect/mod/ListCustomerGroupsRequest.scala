package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListCustomerGroupsRequest")
@js.native
class ListCustomerGroupsRequest () extends StObject {
  
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this to retrieve the next set of results for your original query.
    * See the [Pagination guide](https://developer.squareup.com/docs/working-with-apis/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
}
