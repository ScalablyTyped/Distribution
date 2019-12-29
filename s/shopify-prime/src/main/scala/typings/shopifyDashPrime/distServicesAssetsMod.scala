package typings.shopifyDashPrime

import typings.shopifyDashPrime.distInfrastructureMod.BaseService
import typings.shopifyDashPrime.distModelsAssetMod.Asset
import typings.shopifyDashPrime.distOptionsBaseMod.FieldOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/assets", JSImport.Namespace)
@js.native
object distServicesAssetsMod extends js.Object {
  @js.native
  class Assets protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Deletes the assets with the given id.
      * @param id Id of the asset being deleted.
      */
    def delete(id: Double): js.Promise[Unit] = js.native
    /**
      * Retrieves a single asset for a theme
      * @param id Id of the theme.
      * @param key he path to the asset within a theme.
      * @param options Options for filtering the result.
      */
    def get(id: Double, key: String): js.Promise[Asset] = js.native
    def get(id: Double, key: String, options: FieldOptions): js.Promise[Asset] = js.native
    /**
      * Retrieves a list of assets for a theme
      * @param id Id of the theme.
      * @param options Options for filtering the results.
      */
    def list(id: Double): js.Promise[js.Array[Asset]] = js.native
    def list(id: Double, options: FieldOptions): js.Promise[js.Array[Asset]] = js.native
    /**
      * Creates or updates an asset for a theme.
      * You can include the `src` or `source_key` property to create the asset from an existing file.
      * @param id Id of the assets being updated.
      * @param assets The updated asset.
      */
    def update(id: Double, asset: Asset): js.Promise[Asset] = js.native
  }
  
  @js.native
  class default protected () extends Assets {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

