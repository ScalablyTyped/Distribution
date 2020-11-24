package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListTransactionsResponse")
@js.native
class ListTransactionsResponse () extends js.Object {
  
  /**
    * A pagination cursor for retrieving the next set of results, if any remain.
    * Provide this value as the `cursor` parameter in a subsequent request to this endpoint.
    * See [Paginating results](#paginatingresults) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * An array of transactions that match your query.
    */
  var transactions: js.UndefOr[js.Array[Transaction]] = js.native
}
