package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "TenderCardDetails")
@js.native
class TenderCardDetails () extends js.Object {
  /**
    * The credit card's non-confidential details.
    */
  var card: js.UndefOr[Card] = js.native
  /**
    * The method used to enter the card's details for the transaction.
    */
  var entry_method: js.UndefOr[squareDashConnectLib.squareDashConnectMod.TenderCardDetailsNs.EntryMethodEnum] = js.native
  /**
    * The credit card payment's current state (such as `AUTHORIZED` or `CAPTURED`). See
    * [TenderCardDetailsStatus](#type-tendercarddetailsstatus) for possible values.
    */
  var status: js.UndefOr[squareDashConnectLib.squareDashConnectMod.TenderCardDetailsNs.StatusEnum] = js.native
}

