package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/transaction_kind", JSImport.Namespace)
@js.native
object transactionKindMod extends js.Object {
  trait _TransactionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.shopifyPrime.shopifyPrimeStrings.authorization
    - typings.shopifyPrime.shopifyPrimeStrings.capture
    - typings.shopifyPrime.shopifyPrimeStrings.sale
    - typings.shopifyPrime.shopifyPrimeStrings.void
    - typings.shopifyPrime.shopifyPrimeStrings.refund
    - java.lang.String
  */
  type TransactionKind = _TransactionKind | String
}

