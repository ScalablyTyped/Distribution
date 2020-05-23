package typings.shopifyPrime

import typings.shopifyPrime.anon.Accept
import typings.shopifyPrime.anon.Status
import typings.shopifyPrime.shopifyErrorMod.ErrorType1
import typings.shopifyPrime.shopifyErrorMod.ErrorType2
import typings.shopifyPrime.shopifyErrorMod.ErrorType3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/infrastructure", JSImport.Namespace)
@js.native
object infrastructureMod extends js.Object {
  @js.native
  class BaseService protected ()
    extends typings.shopifyPrime.baseServiceMod.BaseService {
    def this(shopDomain: String, accessToken: String, resource: String) = this()
  }
  
  @js.native
  class ShopifyError protected ()
    extends typings.shopifyPrime.shopifyErrorMod.ShopifyError {
    def this(response: Status, body: ErrorType1) = this()
    def this(response: Status, body: ErrorType2) = this()
    def this(response: Status, body: ErrorType3) = this()
  }
  
  /* static members */
  @js.native
  object BaseService extends js.Object {
    def buildDefaultHeaders(): Accept = js.native
  }
  
}

