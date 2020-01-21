package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/order_status", JSImport.Namespace)
@js.native
object orderStatusMod extends js.Object {
  trait _OrderStatus extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.shopifyPrime.shopifyPrimeStrings.open
    - typings.shopifyPrime.shopifyPrimeStrings.closed
    - typings.shopifyPrime.shopifyPrimeStrings.cancelled
    - typings.shopifyPrime.shopifyPrimeStrings.any
    - java.lang.String
  */
  type OrderStatus = _OrderStatus | String
}

