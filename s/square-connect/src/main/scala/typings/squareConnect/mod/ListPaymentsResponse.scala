package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListPaymentsResponse")
@js.native
open class ListPaymentsResponse () extends StObject {
  
  /**
    * The pagination cursor to be used in a subsequent request. If empty, this is the final response.
    * For more information, see [Pagination](https://developer.squareup.com/docs/basics/api101/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Information about errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The requested list of payments.
    */
  var payments: js.UndefOr[js.Array[Payment]] = js.native
}
