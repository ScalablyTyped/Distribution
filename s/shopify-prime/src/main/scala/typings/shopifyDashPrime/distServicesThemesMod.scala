package typings.shopifyDashPrime

import typings.shopifyDashPrime.distInfrastructureMod.BaseService
import typings.shopifyDashPrime.distModelsThemeMod.Theme
import typings.shopifyDashPrime.distOptionsBaseMod.FieldOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/themes", JSImport.Namespace)
@js.native
object distServicesThemesMod extends js.Object {
  @js.native
  class Themes protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Creates a theme by providing the public URL of a ZIP file that contains the theme.
      * @param themes The theme being created.
      */
    def create(themes: Theme): js.Promise[Theme] = js.native
    /**
      * Deletes the themes with the given id.
      * @param id Id of the theme being deleted.
      */
    def delete(id: Double): js.Promise[Unit] = js.native
    /**
      * Gets a tsingle hemes with the given id.
      * @param id Id of the theme to retrieve.
      * @param options Options for filtering the result.
      */
    def get(id: Double): js.Promise[Theme] = js.native
    def get(id: Double, options: FieldOptions): js.Promise[Theme] = js.native
    /**
      * Gets a list of all themes on the shop.
      * @param options Options for filtering the results.
      */
    def list(): js.Promise[js.Array[Theme]] = js.native
    def list(options: FieldOptions): js.Promise[js.Array[Theme]] = js.native
    /**
      * Updates an existing theme.
      * @param id Id of the themes being updated.
      * @param themes The updated theme.
      */
    def update(id: Double, themes: Theme): js.Promise[Theme] = js.native
  }
  
  @js.native
  class default protected () extends Themes {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

