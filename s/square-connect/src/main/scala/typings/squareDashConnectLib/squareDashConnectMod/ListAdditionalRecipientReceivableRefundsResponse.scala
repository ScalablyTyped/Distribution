package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListAdditionalRecipientReceivableRefundsResponse")
@js.native
class ListAdditionalRecipientReceivableRefundsResponse () extends js.Object {
  /**
    * A pagination cursor for retrieving the next set of results, if any remain. Provide this value as the `cursor`
    * parameter in a subsequent request to this endpoint.  See [Pagination](/basics/api101/pagination) for more
    * information.
    */
  var cursor: js.UndefOr[java.lang.String] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
  /**
    * An array of AdditionalRecipientReceivableRefunds that match your query.
    */
  var receivable_refunds: js.UndefOr[js.Array[AdditionalRecipientReceivableRefund]] = js.native
}

