package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CashDrawerShiftEvent")
@js.native
class CashDrawerShiftEvent () extends js.Object {
  
  /**
    * The event time in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * An optional description of the event, entered by the employee that created the event.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The ID of the employee that created the event.
    */
  var employee_id: js.UndefOr[String] = js.native
  
  /**
    * The amount of money that was added to or removed from the cash drawer in the event.
    * The amount can be positive (for added money), negative (for removed money), or zero (for other tender type payments).
    */
  var event_money: js.UndefOr[Money] = js.native
  
  /**
    * The type of cash drawer shift event. See [CashDrawerEventType](#type-cashdrawereventtype) for possible values
    */
  var event_type: js.UndefOr[String] = js.native
  
  /**
    * The unique ID of the event.
    */
  var id: js.UndefOr[String] = js.native
}
