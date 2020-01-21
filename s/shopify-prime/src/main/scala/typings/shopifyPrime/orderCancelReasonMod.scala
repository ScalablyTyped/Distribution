package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/order_cancel_reason", JSImport.Namespace)
@js.native
object orderCancelReasonMod extends js.Object {
  trait _OrderCancelReason extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.shopifyPrime.shopifyPrimeStrings.customer
    - typings.shopifyPrime.shopifyPrimeStrings.inventory
    - typings.shopifyPrime.shopifyPrimeStrings.fraud
    - typings.shopifyPrime.shopifyPrimeStrings.other
    - java.lang.String
  */
  type OrderCancelReason = _OrderCancelReason | String
}

