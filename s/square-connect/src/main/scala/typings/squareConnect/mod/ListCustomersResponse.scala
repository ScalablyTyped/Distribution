package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListCustomersResponse")
@js.native
class ListCustomersResponse () extends js.Object {
  
  /**
    * A pagination cursor to retrieve the next set of results for the original query.
    * Only present if the request succeeded and additional results are available.
    * See the [Pagination guide](https://developer.squareup.com/docs/working-with-apis/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * An array of `Customer` objects that match the provided query.
    */
  var customers: js.UndefOr[js.Array[Customer]] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}
