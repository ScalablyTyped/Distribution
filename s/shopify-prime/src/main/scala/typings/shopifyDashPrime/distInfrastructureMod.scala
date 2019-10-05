package typings.shopifyDashPrime

import typings.shopifyDashPrime.distInfrastructureShopifyUnderscoreErrorMod.ErrorType1
import typings.shopifyDashPrime.distInfrastructureShopifyUnderscoreErrorMod.ErrorType2
import typings.shopifyDashPrime.distInfrastructureShopifyUnderscoreErrorMod.ErrorType3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/infrastructure", JSImport.Namespace)
@js.native
object distInfrastructureMod extends js.Object {
  @js.native
  class BaseService protected ()
    extends typings.shopifyDashPrime.distInfrastructureBaseUnderscoreServiceMod.BaseService {
    def this(shopDomain: String, accessToken: String, resource: String) = this()
  }
  
  @js.native
  class ShopifyError protected ()
    extends typings.shopifyDashPrime.distInfrastructureShopifyUnderscoreErrorMod.ShopifyError {
    def this(response: Anon_Status, body: ErrorType1) = this()
    def this(response: Anon_Status, body: ErrorType2) = this()
    def this(response: Anon_Status, body: ErrorType3) = this()
  }
  
  /* static members */
  @js.native
  object BaseService extends js.Object {
    def buildDefaultHeaders(): Anon_Accept = js.native
  }
  
}

