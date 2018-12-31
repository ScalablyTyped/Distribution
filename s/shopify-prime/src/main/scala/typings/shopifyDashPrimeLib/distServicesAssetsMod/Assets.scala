package typings
package shopifyDashPrimeLib.distServicesAssetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/assets", "Assets")
@js.native
class Assets protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
    * Deletes the assets with the given id.
    * @param id Id of the asset being deleted.
    */
  def delete(id: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Retrieves a single asset for a theme
    * @param id Id of the theme.
    * @param key he path to the asset within a theme.
    * @param options Options for filtering the result.
    */
  def get(id: scala.Double, key: java.lang.String): js.Promise[shopifyDashPrimeLib.distModelsAssetMod.Asset] = js.native
  def get(
    id: scala.Double,
    key: java.lang.String,
    options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions
  ): js.Promise[shopifyDashPrimeLib.distModelsAssetMod.Asset] = js.native
  /**
    * Retrieves a list of assets for a theme
    * @param id Id of the theme.
    * @param options Options for filtering the results.
    */
  def list(id: scala.Double): js.Promise[js.Array[shopifyDashPrimeLib.distModelsAssetMod.Asset]] = js.native
  def list(id: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): js.Promise[js.Array[shopifyDashPrimeLib.distModelsAssetMod.Asset]] = js.native
  /**
    * Creates or updates an asset for a theme.
    * You can include the `src` or `source_key` property to create the asset from an existing file.
    * @param id Id of the assets being updated.
    * @param assets The updated asset.
    */
  def update(id: scala.Double, asset: shopifyDashPrimeLib.distModelsAssetMod.Asset): js.Promise[shopifyDashPrimeLib.distModelsAssetMod.Asset] = js.native
}

