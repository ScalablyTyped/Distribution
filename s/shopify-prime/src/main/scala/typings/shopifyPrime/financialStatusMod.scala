package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/financial_status", JSImport.Namespace)
@js.native
object financialStatusMod extends js.Object {
  trait _FinancialStatus extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.shopifyPrime.shopifyPrimeStrings.authorized
    - typings.shopifyPrime.shopifyPrimeStrings.pending
    - typings.shopifyPrime.shopifyPrimeStrings.paid
    - typings.shopifyPrime.shopifyPrimeStrings.partially_paid
    - typings.shopifyPrime.shopifyPrimeStrings.refunded
    - typings.shopifyPrime.shopifyPrimeStrings.voided
    - typings.shopifyPrime.shopifyPrimeStrings.partially_refunded
    - typings.shopifyPrime.shopifyPrimeStrings.unpaid
    - typings.shopifyPrime.shopifyPrimeStrings.any
    - java.lang.String
  */
  type FinancialStatus = _FinancialStatus | String
}

