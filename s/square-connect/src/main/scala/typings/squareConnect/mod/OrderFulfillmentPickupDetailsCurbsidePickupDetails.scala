package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "OrderFulfillmentPickupDetailsCurbsidePickupDetails")
@js.native
open class OrderFulfillmentPickupDetailsCurbsidePickupDetails () extends StObject {
  
  /**
    * The [timestamp](#workingwithdates) in RFC 3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\",
    * indicating when the buyer arrived and is waiting for pickup.
    */
  var buyer_arrived_at: js.UndefOr[String] = js.native
  
  /**
    * Specific details for curbside pickup, such as parking number, vehicle model, etc.
    */
  var curbside_details: js.UndefOr[String] = js.native
}
