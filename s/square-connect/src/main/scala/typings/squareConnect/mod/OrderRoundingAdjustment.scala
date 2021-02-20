package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "OrderRoundingAdjustment")
@js.native
class OrderRoundingAdjustment () extends StObject {
  
  /**
    * Actual rounding adjustment amount.
    */
  var amount_money: js.UndefOr[Money] = js.native
  
  /**
    * The name of the rounding adjustment from the original sale Order.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Unique ID that identifies the rounding adjustment only within this order.
    */
  var uid: js.UndefOr[String] = js.native
}
