package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "OrderFulfillmentUpdatedUpdate")
@js.native
class OrderFulfillmentUpdatedUpdate () extends StObject {
  
  /**
    * Unique ID that identifies the fulfillment only within this order.
    */
  var fulfillment_uid: js.UndefOr[String] = js.native
  
  /**
    * The state of the fulfillment after the change.
    * May be equal to old_state if a non-state field was changed on the fulfillment (e.g. tracking number).
    * See [OrderFulfillmentState](#type-orderfulfillmentstate) for possible values.
    */
  var new_state: js.UndefOr[String] = js.native
  
  /**
    * The state of the fulfillment before the change.
    * Will not be populated if the fulfillment is created with this new Order version.
    * See [OrderFulfillmentState](#type-orderfulfillmentstate) for possible values.
    */
  var old_state: js.UndefOr[String] = js.native
}
