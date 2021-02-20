package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyEventFilter")
@js.native
class LoyaltyEventFilter () extends StObject {
  
  /**
    * Filter events by date time range.  For each range, the start time is inclusive and the end time  is exclusive.
    */
  var date_time_filter: js.UndefOr[LoyaltyEventDateTimeFilter] = js.native
  
  /**
    * Filter events by location.
    */
  var location_filter: js.UndefOr[LoyaltyEventLocationFilter] = js.native
  
  /**
    * Filter events by loyalty account.
    */
  var loyalty_account_filter: js.UndefOr[LoyaltyEventLoyaltyAccountFilter] = js.native
  
  /**
    * Filter events by the order associated with the event.
    */
  var order_filter: js.UndefOr[LoyaltyEventOrderFilter] = js.native
  
  /**
    * Filter events by event type.
    */
  var type_filter: js.UndefOr[LoyaltyEventTypeFilter] = js.native
}
