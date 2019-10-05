package typings.shopifyDashPrime

import typings.shopifyDashPrime.distEnumsTransactionUnderscoreStatusMod._TransactionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/transaction_status", JSImport.Namespace)
@js.native
object distEnumsTransactionUnderscoreStatusMod extends js.Object {
  trait _TransactionStatus extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.shopifyDashPrime.shopifyDashPrimeStrings.pending
    - typings.shopifyDashPrime.shopifyDashPrimeStrings.failure
    - typings.shopifyDashPrime.shopifyDashPrimeStrings.success
    - typings.shopifyDashPrime.shopifyDashPrimeStrings.error
    - java.lang.String
  */
  type TransactionStatus = _TransactionStatus | String
}

