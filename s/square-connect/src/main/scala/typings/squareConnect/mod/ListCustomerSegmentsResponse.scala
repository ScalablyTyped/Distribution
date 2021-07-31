package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListCustomerSegmentsResponse")
@js.native
class ListCustomerSegmentsResponse () extends StObject {
  
  /**
    * A pagination cursor to be used in subsequent calls to __ListCustomerSegments__ to retrieve the next set of query results.
    * Only present only if the request succeeded and additional results are available.
    * See the [Pagination guide](https://developer.squareup.com/docs/docs/working-with-apis/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The list of customer segments belonging to the associated Square account.
    */
  var segments: js.UndefOr[js.Array[CustomerSegment]] = js.native
}
