package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListCashDrawerShiftsRequest")
@js.native
class ListCashDrawerShiftsRequest () extends js.Object {
  
  /**
    * The inclusive start time of the query on opened_at, in ISO 8601 format.
    */
  var begin_time: js.UndefOr[String] = js.native
  
  /**
    * Opaque cursor for fetching the next page of results.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The exclusive end date of the query on opened_at, in ISO 8601 format.
    */
  var end_time: js.UndefOr[String] = js.native
  
  /**
    * Number of cash drawer shift events in a page of results (200 by default, 1000 max).
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * The ID of the location to query for a list of cash drawer shifts.
    */
  var location_id: String = js.native
  
  /**
    * The order in which cash drawer shifts are listed in the response, based on their opened_at field.
    * Default value: ASC See [SortOrder](#type-sortorder) for possible values.
    */
  var sort_order: js.UndefOr[String] = js.native
}
