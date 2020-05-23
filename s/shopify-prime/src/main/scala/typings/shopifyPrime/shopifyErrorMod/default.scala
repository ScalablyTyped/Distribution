package typings.shopifyPrime.shopifyErrorMod

import typings.shopifyPrime.anon.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/infrastructure/shopify_error", JSImport.Default)
@js.native
class default protected () extends ShopifyError {
  def this(response: Status, body: ErrorType1) = this()
  def this(response: Status, body: ErrorType2) = this()
  def this(response: Status, body: ErrorType3) = this()
}

