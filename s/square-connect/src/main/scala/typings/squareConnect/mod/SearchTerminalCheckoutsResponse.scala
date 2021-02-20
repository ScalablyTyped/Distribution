package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchTerminalCheckoutsResponse")
@js.native
class SearchTerminalCheckoutsResponse () extends StObject {
  
  /**
    * The requested search result of `TerminalCheckout`s.
    */
  var checkouts: js.UndefOr[js.Array[TerminalCheckout]] = js.native
  
  /**
    * The pagination cursor to be used in a subsequent request. If empty, this is the final response.
    * See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}
