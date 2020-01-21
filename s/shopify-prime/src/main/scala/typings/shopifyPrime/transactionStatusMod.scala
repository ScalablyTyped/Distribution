package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/transaction_status", JSImport.Namespace)
@js.native
object transactionStatusMod extends js.Object {
  trait _TransactionStatus extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.shopifyPrime.shopifyPrimeStrings.pending
    - typings.shopifyPrime.shopifyPrimeStrings.failure
    - typings.shopifyPrime.shopifyPrimeStrings.success
    - typings.shopifyPrime.shopifyPrimeStrings.error
    - java.lang.String
  */
  type TransactionStatus = _TransactionStatus | String
}

