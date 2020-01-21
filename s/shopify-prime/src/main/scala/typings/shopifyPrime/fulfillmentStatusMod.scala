package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/fulfillment_status", JSImport.Namespace)
@js.native
object fulfillmentStatusMod extends js.Object {
  trait _FulfillmentStatus extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.shopifyPrime.shopifyPrimeStrings.shipped
    - typings.shopifyPrime.shopifyPrimeStrings.partial
    - typings.shopifyPrime.shopifyPrimeStrings.unshipped
    - typings.shopifyPrime.shopifyPrimeStrings.any
    - java.lang.String
  */
  type FulfillmentStatus = _FulfillmentStatus | String
}

