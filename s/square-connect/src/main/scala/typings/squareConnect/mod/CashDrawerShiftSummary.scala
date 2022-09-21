package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CashDrawerShiftSummary")
@js.native
open class CashDrawerShiftSummary () extends StObject {
  
  /**
    * The shift close time in ISO 8601 format.
    */
  var closed_at: js.UndefOr[String] = js.native
  
  /**
    * The amount of money found in the cash drawer at the end of the shift by an auditing employee.
    * The amount must be greater than or equal to zero.
    */
  var closed_cash_money: js.UndefOr[Money] = js.native
  
  /**
    * An employee free-text description of a cash drawer shift.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The shift end time in ISO 8601 format.
    */
  var ended_at: js.UndefOr[String] = js.native
  
  /**
    * The amount of money that should be in the cash drawer at the end of the shift, based on the cash drawer events on the shift.
    * The amount is correct if all shift employees accurately recorded their cash drawer shift events.
    * Unrecorded events and events with the wrong amount result in an incorrect expected_cash_money amount that can be negative.
    */
  var expected_cash_money: js.UndefOr[Money] = js.native
  
  /**
    * The shift unique ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The shift start time in ISO 8601 format.
    */
  var opened_at: js.UndefOr[String] = js.native
  
  /**
    * The amount of money in the cash drawer at the start of the shift. This must be a positive amount.
    */
  var opened_cash_money: js.UndefOr[Money] = js.native
  
  /**
    * The shift current state. See [CashDrawerShiftState](#type-cashdrawershiftstate) for possible values.
    */
  var state: js.UndefOr[String] = js.native
}
