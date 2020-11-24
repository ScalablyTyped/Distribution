package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListCustomerSegmentsRequest")
@js.native
class ListCustomerSegmentsRequest () extends js.Object {
  
  /**
    * A pagination cursor returned by previous calls to __ListCustomerSegments__. Used to retrieve the next set of query results.
    * See the [Pagination guide](https://developer.squareup.com/docs/docs/working-with-apis/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
}
