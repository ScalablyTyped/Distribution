package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchShiftsRequest")
@js.native
class SearchShiftsRequest () extends js.Object {
  
  /**
    * opaque cursor for fetching the next page.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * number of resources in a page (200 by default).
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Query filters.
    */
  var query: js.UndefOr[ShiftQuery] = js.native
}
