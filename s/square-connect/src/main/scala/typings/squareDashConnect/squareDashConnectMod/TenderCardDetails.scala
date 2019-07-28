package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.TenderCardDetailsNs.EntryMethodEnum
import typings.squareDashConnect.squareDashConnectMod.TenderCardDetailsNs.StatusEnum
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
    * See [TenderCardDetailsEntryMethod](#type-tendercarddetailsentrymethod) for possible values.
    */
  var entry_method: js.UndefOr[EntryMethodEnum] = js.native
  /**
    * The credit card payment's current state (such as `AUTHORIZED` or `CAPTURED`).
    * See [TenderCardDetailsStatus](#type-tendercarddetailsstatus) for possible values.
    */
  var status: js.UndefOr[StatusEnum] = js.native
}

