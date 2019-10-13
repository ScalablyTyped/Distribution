package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectStrings.APPROVED
import typings.squareDashConnect.squareDashConnectStrings.FAILED
import typings.squareDashConnect.squareDashConnectStrings.PENDING
import typings.squareDashConnect.squareDashConnectStrings.REJECTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Refund")
@js.native
class Refund () extends js.Object {
  /**
    * Additional recipients (other than the merchant) receiving a portion of this refund.
    * For example, fees assessed on a refund of a purchase by a third party integration.
    */
  var additional_recipients: js.UndefOr[js.Array[AdditionalRecipient]] = js.native
  /**
    * The amount of money refunded to the buyer.
    */
  var amount_money: Money = js.native
  /**
    * The time when the refund was created, in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The refund's unique ID.
    */
  var id: String = js.native
  /**
    * The ID of the refund's associated location.
    */
  var location_id: String = js.native
  /**
    * The amount of Square processing fee money refunded to the *merchant*.
    */
  var processing_fee_money: js.UndefOr[Money] = js.native
  /**
    * The reason for the refund being issued.
    */
  var reason: String = js.native
  /**
    * The current status of the refund (`PENDING`, `APPROVED`, `REJECTED`, or `FAILED`).
    * See [RefundStatus](#type-refundstatus) for possible values.
    */
  var status: PENDING | APPROVED | REJECTED | FAILED = js.native
  /**
    * The ID of the refunded tender.
    */
  var tender_id: String = js.native
  /**
    * The ID of the transaction that the refunded tender is part of.
    */
  var transaction_id: String = js.native
}

