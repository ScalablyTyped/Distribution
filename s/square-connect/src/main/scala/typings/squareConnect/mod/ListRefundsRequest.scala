package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListRefundsRequest")
@js.native
class ListRefundsRequest () extends js.Object {
  
  /**
    * The beginning of the requested reporting period, in RFC 3339 format.
    * See [Date ranges](#dateranges) for details on date inclusivity/exclusivity.
    * Default value: The current time minus one year.
    */
  var begin_time: js.UndefOr[String] = js.native
  
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this to retrieve the next set of results for your original query.
    * See [Paginating results](#paginatingresults) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The end of the requested reporting period, in RFC 3339 format.
    * See [Date ranges](#dateranges) for details on date inclusivity/exclusivity. Default value: The current time.
    */
  var end_time: js.UndefOr[String] = js.native
  
  /**
    * The order in which results are listed in the response (`ASC` for oldest first, `DESC` for newest first).
    * Default value: `DESC` See [SortOrder](#type-sortorder) for possible values
    */
  var sort_order: js.UndefOr[SortOrderType] = js.native
}
