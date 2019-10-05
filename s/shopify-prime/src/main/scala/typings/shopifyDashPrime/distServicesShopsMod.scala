package typings.shopifyDashPrime

import typings.shopifyDashPrime.distInfrastructureMod.BaseService
import typings.shopifyDashPrime.distModelsShopMod.Shop
import typings.shopifyDashPrime.distOptionsBaseMod.FieldOptions
import typings.shopifyDashPrime.distServicesShopsMod.Shops
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/shops", JSImport.Namespace)
@js.native
object distServicesShopsMod extends js.Object {
  @js.native
  class Shops protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Forces the shop to uninstall your Shopify app. Uninstalling an application is an irreversible operation. Be entirely sure that you no longer need to make API calls for the shop in which the application has been installed.
      */
    def forceUninstallApp(): js.Promise[Unit] = js.native
    /**
      * Returns shop data for the shop.
      * @param options Options for filtering the result.
      */
    def get(): js.Promise[Shop] = js.native
    def get(options: FieldOptions): js.Promise[Shop] = js.native
  }
  
  @js.native
  class default protected () extends Shops {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

