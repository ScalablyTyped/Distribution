package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListBankAccountsResponse")
@js.native
class ListBankAccountsResponse () extends js.Object {
  /**
    * List of BankAccounts associated with this account.
    */
  var bank_accounts: js.UndefOr[js.Array[BankAccount]] = js.native
  /**
    * When a response is truncated, it includes a cursor that you can  use in a subsequent request to fetch next set of bank accounts.
    * If empty, this is the final response.
    * For more information, see [Pagination](https://developer.squareup.com/docs/docs/working-with-apis/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}

