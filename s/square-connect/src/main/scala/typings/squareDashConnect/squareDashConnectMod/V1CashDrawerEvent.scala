package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1CashDrawerEvent")
@js.native
class V1CashDrawerEvent () extends js.Object {
  /**
    * The time when the event occurred, in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * An optional description of the event, entered by the employee that created it.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The ID of the employee that created the event.
    */
  var employee_id: js.UndefOr[String] = js.native
  /**
    * The amount of money that was added to or removed from the cash drawer because of the event.
    * This value can be positive (for added money) or negative (for removed money).
    */
  var event_money: js.UndefOr[V1Money] = js.native
  /**
    * The type of event that occurred. See [V1CashDrawerEventEventType](#type-v1cashdrawereventeventtype) for possible
    * values
    */
  var event_type: js.UndefOr[String] = js.native
  /**
    * The event's unique ID.
    */
  var id: js.UndefOr[String] = js.native
}

