package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchTerminalRefundsRequest")
@js.native
class SearchTerminalRefundsRequest () extends StObject {
  
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this to retrieve the next set of results for the original query.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Limit the number of results returned for a single request.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Query the terminal refunds based on given conditions and sort order. Calling `SearchTerminalRefunds` without
    * an explicitly query parameter will return all available refunds with the default sort order.
    */
  var query: js.UndefOr[TerminalRefundQuery] = js.native
}
