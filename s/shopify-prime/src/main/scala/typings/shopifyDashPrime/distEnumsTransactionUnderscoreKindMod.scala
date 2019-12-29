package typings.shopifyDashPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/transaction_kind", JSImport.Namespace)
@js.native
object distEnumsTransactionUnderscoreKindMod extends js.Object {
  trait _TransactionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.shopifyDashPrime.shopifyDashPrimeStrings.authorization
    - typings.shopifyDashPrime.shopifyDashPrimeStrings.capture
    - typings.shopifyDashPrime.shopifyDashPrimeStrings.sale
    - typings.shopifyDashPrime.shopifyDashPrimeStrings.void
    - typings.shopifyDashPrime.shopifyDashPrimeStrings.refund
    - java.lang.String
  */
  type TransactionKind = _TransactionKind | String
}

