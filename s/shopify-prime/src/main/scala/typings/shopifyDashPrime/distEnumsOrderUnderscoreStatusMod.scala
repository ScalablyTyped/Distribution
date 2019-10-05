package typings.shopifyDashPrime

import typings.shopifyDashPrime.distEnumsOrderUnderscoreStatusMod._OrderStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/order_status", JSImport.Namespace)
@js.native
object distEnumsOrderUnderscoreStatusMod extends js.Object {
  trait _OrderStatus extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.shopifyDashPrime.shopifyDashPrimeStrings.open
    - typings.shopifyDashPrime.shopifyDashPrimeStrings.closed
    - typings.shopifyDashPrime.shopifyDashPrimeStrings.cancelled
    - typings.shopifyDashPrime.shopifyDashPrimeStrings.any
    - java.lang.String
  */
  type OrderStatus = _OrderStatus | String
}

