package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListBankAccountsRequest")
@js.native
class ListBankAccountsRequest () extends js.Object {
  /**
    * The pagination cursor returned by a previous call to this endpoint.
    * Use it in the next `ListBankAccounts` request to retrieve the next set  of results.
    * See the [Pagination](https://developer.squareup.com/docs/docs/working-with-apis/pagination) guide for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Upper limit on the number of bank accounts to return in the response. Currently, 1000 is the largest supported limit.
    * You can specify a limit  of up to 1000 bank accounts. This is also the default limit.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Location ID. You can specify this optional filter to retrieve only the linked bank accounts belonging to a specific location.
    */
  var location_id: js.UndefOr[String] = js.native
}

