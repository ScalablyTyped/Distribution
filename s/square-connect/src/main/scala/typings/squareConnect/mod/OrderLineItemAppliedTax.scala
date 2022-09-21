package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "OrderLineItemAppliedTax")
@js.native
open class OrderLineItemAppliedTax () extends StObject {
  
  /**
    * The amount of money applied by the tax to the line item.
    */
  var applied_money: js.UndefOr[Money] = js.native
  
  /**
    * The `uid` of the tax for which this applied tax represents.
    * Must reference a tax present in the `order.taxes` field. This field is immutable.
    * To change which taxes apply to a line item, delete and add new `OrderLineItemAppliedTax`s.
    */
  var tax_uid: String = js.native
  
  /**
    * Unique ID that identifies the applied tax only within this order.
    */
  var uid: js.UndefOr[String] = js.native
}
