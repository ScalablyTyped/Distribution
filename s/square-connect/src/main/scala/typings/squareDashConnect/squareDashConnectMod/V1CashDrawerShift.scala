package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1CashDrawerShift")
@js.native
class V1CashDrawerShift () extends js.Object {
  /**
    * The amount of money added to the cash drawer for reasons other than cash payments.
    */
  var cash_paid_in_money: js.UndefOr[V1Money] = js.native
  /**
    * The amount of money removed from the cash drawer for reasons other than cash refunds.
    */
  var cash_paid_out_money: js.UndefOr[V1Money] = js.native
  /**
    * The amount of money added to the cash drawer from cash payments.
    */
  var cash_payment_money: js.UndefOr[V1Money] = js.native
  /**
    * The amount of money removed from the cash drawer from cash refunds. This value is always negative or zero.
    */
  var cash_refunds_money: js.UndefOr[V1Money] = js.native
  /**
    * The time when the shift was closed, in ISO 8601 format.
    */
  var closed_at: js.UndefOr[String] = js.native
  /**
    * The amount of money found in the cash drawer at the end of the shift by an auditing employee.
    */
  var closed_cash_money: js.UndefOr[V1Money] = js.native
  /**
    * The ID of the employee that closed the cash drawer shift by auditing the cash drawer's contents.
    */
  var closing_employee_id: js.UndefOr[String] = js.native
  /**
    * A description of the cash drawer shift.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The device running Square Register that was connected to the cash drawer.
    */
  var device: js.UndefOr[Device] = js.native
  /**
    * The IDs of all employees that were logged into Square Register at some point during the cash drawer shift.
    */
  var employee_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * The time when the shift ended, in ISO 8601 format.
    */
  var ended_at: js.UndefOr[String] = js.native
  /**
    * The ID of the employee that ended the cash drawer shift.
    */
  var ending_employee_id: js.UndefOr[String] = js.native
  /**
    * The shift's current state. See [V1CashDrawerShiftEventType](#type-v1cashdrawershifteventtype) for possible values.
    */
  var event_type: js.UndefOr[String] = js.native
  /**
    * All of the events (payments, refunds, and so on) that involved the cash drawer during the shift.
    */
  var events: js.UndefOr[js.Array[V1CashDrawerEvent]] = js.native
  /**
    * The amount of money that should be in the cash drawer at the end of the shift, based on the shift's other money amounts.
    */
  var expected_cash_money: js.UndefOr[V1Money] = js.native
  /**
    * The shift's unique ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The time when the shift began, in ISO 8601 format.
    */
  var opened_at: js.UndefOr[String] = js.native
  /**
    * The ID of the employee that started the cash drawer shift.
    */
  var opening_employee_id: js.UndefOr[String] = js.native
  /**
    * The amount of money in the cash drawer at the start of the shift.
    */
  var starting_cash_money: js.UndefOr[V1Money] = js.native
}

