package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListCashDrawerShiftEventsRequest")
@js.native
class ListCashDrawerShiftEventsRequest () extends js.Object {
  
  /**
    * Opaque cursor for fetching the next page of results.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Number of resources to be returned in a page of results (200 by default, 1000 max).
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * The ID of the location to list cash drawer shifts for.
    */
  var location_id: String = js.native
}
