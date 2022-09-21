package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CashDrawerShift")
@js.native
open class CashDrawerShift () extends StObject {
  
  /**
    * The amount of money added to the cash drawer for reasons other than cash payments.
    * It is computed by summing the events of type PAID_IN. The amount is always greater than or equal to zero.
    */
  var cash_paid_in_money: js.UndefOr[Money] = js.native
  
  /**
    * The amount of money removed from the cash drawer for reasons other than cash refunds.
    * It is computed by summing the events of type PAID_OUT. The amount is always greater than or equal to zero.
    */
  var cash_paid_out_money: js.UndefOr[Money] = js.native
  
  /**
    * The amount of money added to the cash drawer from cash payments.
    * This is computed by summing all events with the types CASH_TENDER_PAYMENT and CASH_TENDER_CANCELED_PAYMENT.
    * The amount is always greater than or equal to zero.
    */
  var cash_payment_money: js.UndefOr[Money] = js.native
  
  /**
    * The amount of money removed from the cash drawer from cash refunds.
    * It is computed by summing the events of type CASH_TENDER_REFUND. The amount is always greater than or equal to zero.
    */
  var cash_refunds_money: js.UndefOr[Money] = js.native
  
  /**
    * The time when the shift was closed, in ISO 8601 format.
    */
  var closed_at: js.UndefOr[String] = js.native
  
  /**
    * The amount of money found in the cash drawer at the end of the shift by an auditing employee. The amount should be positive.
    */
  var closed_cash_money: js.UndefOr[Money] = js.native
  
  /**
    * The ID of the employee that closed the cash drawer shift by auditing the cash drawer contents.
    */
  var closing_employee_id: js.UndefOr[String] = js.native
  
  /**
    * The free-form text description of a cash drawer by an employee.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The device running Square Point of Sale that was connected to the cash drawer.
    */
  var device: js.UndefOr[CashDrawerDevice] = js.native
  
  /**
    * The IDs of all employees that were logged into Square Point of Sale at any point while the cash drawer shift was open.
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
    * The amount of money that should be in the cash drawer at the end of the shift, based on the shift's other money amounts.
    * This can be negative if employees have not correctly recorded all the events on the cash drawer.
    * cash_paid_out_money is a summation of amounts from cash_payment_money (zero or positive), cash_refunds_money
    * (zero or negative), cash_paid_in_money (zero or positive), and cash_paid_out_money (zero or negative) event types.
    */
  var expected_cash_money: js.UndefOr[Money] = js.native
  
  /**
    * The shift unique ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The time when the shift began, in ISO 8601 format.
    */
  var opened_at: js.UndefOr[String] = js.native
  
  /**
    * The amount of money in the cash drawer at the start of the shift. The amount must be greater than or equal to zero.
    */
  var opened_cash_money: js.UndefOr[Money] = js.native
  
  /**
    * The ID of the employee that started the cash drawer shift.
    */
  var opening_employee_id: js.UndefOr[String] = js.native
  
  /**
    * The shift current state. See [CashDrawerShiftState](#type-cashdrawershiftstate) for possible values.
    */
  var state: js.UndefOr[String] = js.native
}
