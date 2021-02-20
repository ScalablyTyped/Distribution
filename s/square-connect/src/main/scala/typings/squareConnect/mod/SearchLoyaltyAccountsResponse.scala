package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchLoyaltyAccountsResponse")
@js.native
class SearchLoyaltyAccountsResponse () extends StObject {
  
  /**
    * The pagination cursor to use in a subsequent request. If empty, this is the final response.
    * For more information, see [Pagination](https://developer.squareup.com/docs/docs/basics/api101/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The loyalty accounts that met the search criteria, in order of creation date.
    */
  var loyalty_accounts: js.UndefOr[js.Array[LoyaltyAccount]] = js.native
}
