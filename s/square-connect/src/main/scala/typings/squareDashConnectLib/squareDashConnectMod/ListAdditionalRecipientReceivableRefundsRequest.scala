package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListAdditionalRecipientReceivableRefundsRequest")
@js.native
class ListAdditionalRecipientReceivableRefundsRequest () extends js.Object {
  /**
    * The beginning of the requested reporting period, in RFC 3339 format.
    * See [Date ranges](#dateranges) for details on date inclusivity/exclusivity. Default value: The current time minus one year.
    */
  var begin_time: js.UndefOr[java.lang.String] = js.native
  /**
    * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of
    * results for your original query. See [Pagination](/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[java.lang.String] = js.native
  /**
    * The end of the requested reporting period, in RFC 3339 format.
    * See [Date ranges](#dateranges) for details on date inclusivity/exclusivity. Default value: The current time.
    */
  var end_time: js.UndefOr[java.lang.String] = js.native
  /**
    * The order in which results are listed in the response (`ASC` for oldest first, `DESC` for newest first).
    * Default value: `DESC` See [SortOrder](#type-sortorder) for possible values.
    */
  var sort_order: js.UndefOr[
    squareDashConnectLib.squareDashConnectMod.ListAdditionalRecipientReceivableRefundsRequestNs.SortOrderEnum
  ] = js.native
}

