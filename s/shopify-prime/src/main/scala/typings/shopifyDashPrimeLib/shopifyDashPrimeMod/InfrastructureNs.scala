package typings
package shopifyDashPrimeLib.shopifyDashPrimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime", "Infrastructure")
@js.native
object InfrastructureNs extends js.Object {
  @js.native
  class BaseService protected ()
    extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
    def this(shopDomain: java.lang.String, accessToken: java.lang.String, resource: java.lang.String) = this()
  }
  
  @js.native
  class ShopifyError protected ()
    extends shopifyDashPrimeLib.distInfrastructureMod.ShopifyError {
    def this(response: shopifyDashPrimeLib.Anon_Status, body: shopifyDashPrimeLib.distInfrastructureShopifyUnderscoreErrorMod.ErrorType1) = this()
    def this(response: shopifyDashPrimeLib.Anon_Status, body: shopifyDashPrimeLib.distInfrastructureShopifyUnderscoreErrorMod.ErrorType2) = this()
    def this(response: shopifyDashPrimeLib.Anon_Status, body: shopifyDashPrimeLib.distInfrastructureShopifyUnderscoreErrorMod.ErrorType3) = this()
  }
  
  @js.native
  object BaseService extends js.Object {
    def buildDefaultHeaders(): shopifyDashPrimeLib.Anon_Accept = js.native
  }
  
}

