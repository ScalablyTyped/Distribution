package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/inventory_behavior", JSImport.Namespace)
@js.native
object inventoryBehaviorMod extends js.Object {
  trait _InventoryBehavior extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.shopifyPrime.shopifyPrimeStrings.bypass
    - typings.shopifyPrime.shopifyPrimeStrings.decrement_ignoring_policy
    - typings.shopifyPrime.shopifyPrimeStrings.decrement_obeying_policy
    - java.lang.String
  */
  type InventoryBehavior = _InventoryBehavior | String
}

