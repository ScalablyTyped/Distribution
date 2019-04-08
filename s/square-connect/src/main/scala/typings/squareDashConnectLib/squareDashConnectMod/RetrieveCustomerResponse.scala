package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RetrieveCustomerResponse")
@js.native
class RetrieveCustomerResponse () extends js.Object {
  /**
    * The requested customer.
    */
  var customer: js.UndefOr[Customer] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
}

