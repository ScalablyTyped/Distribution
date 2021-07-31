package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CalculateLoyaltyPointsRequest")
@js.native
class CalculateLoyaltyPointsRequest () extends StObject {
  
  /**
    * The `order` ID for which to calculate the points.
    * Specify this field if your application uses the Orders API to process orders.
    * Otherwise, specify the `transaction_amount`.
    */
  var order_id: js.UndefOr[String] = js.native
  
  /**
    * The purchase amount for which to calculate the points.
    * Specify this field if your application does not use the Orders API to process orders.
    * Otherwise, specify the `order_id`.
    */
  var transaction_amount_money: js.UndefOr[Money] = js.native
}
