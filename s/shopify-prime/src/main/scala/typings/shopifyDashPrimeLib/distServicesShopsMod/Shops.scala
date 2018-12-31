package typings
package shopifyDashPrimeLib.distServicesShopsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/shops", "Shops")
@js.native
class Shops protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
    * Forces the shop to uninstall your Shopify app. Uninstalling an application is an irreversible operation. Be entirely sure that you no longer need to make API calls for the shop in which the application has been installed.
    */
  def forceUninstallApp(): js.Promise[scala.Unit] = js.native
  /**
    * Returns shop data for the shop.
    * @param options Options for filtering the result.
    */
  def get(): js.Promise[shopifyDashPrimeLib.distModelsShopMod.Shop] = js.native
  def get(options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): js.Promise[shopifyDashPrimeLib.distModelsShopMod.Shop] = js.native
}

