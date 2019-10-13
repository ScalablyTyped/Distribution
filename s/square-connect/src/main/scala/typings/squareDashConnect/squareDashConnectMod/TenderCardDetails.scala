package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectStrings.AUTHORIZED
import typings.squareDashConnect.squareDashConnectStrings.CAPTURED
import typings.squareDashConnect.squareDashConnectStrings.CONTACTLESS
import typings.squareDashConnect.squareDashConnectStrings.EMV
import typings.squareDashConnect.squareDashConnectStrings.FAILED
import typings.squareDashConnect.squareDashConnectStrings.KEYED
import typings.squareDashConnect.squareDashConnectStrings.ON_FILE
import typings.squareDashConnect.squareDashConnectStrings.SWIPED
import typings.squareDashConnect.squareDashConnectStrings.VOIDED
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
  var entry_method: js.UndefOr[SWIPED | KEYED | EMV | ON_FILE | CONTACTLESS] = js.native
  /**
    * The credit card payment's current state (such as `AUTHORIZED` or `CAPTURED`).
    * See [TenderCardDetailsStatus](#type-tendercarddetailsstatus) for possible values.
    */
  var status: js.UndefOr[AUTHORIZED | CAPTURED | VOIDED | FAILED] = js.native
}

