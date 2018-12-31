package typings
package shopifyDashPrimeLib.distServicesThemesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/themes", "Themes")
@js.native
class Themes protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
    * Creates a theme by providing the public URL of a ZIP file that contains the theme.
    * @param themes The theme being created.
    */
  def create(themes: shopifyDashPrimeLib.distModelsThemeMod.Theme): js.Promise[shopifyDashPrimeLib.distModelsThemeMod.Theme] = js.native
  /**
    * Deletes the themes with the given id.
    * @param id Id of the theme being deleted.
    */
  def delete(id: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Gets a tsingle hemes with the given id.
    * @param id Id of the theme to retrieve.
    * @param options Options for filtering the result.
    */
  def get(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsThemeMod.Theme] = js.native
  def get(id: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): js.Promise[shopifyDashPrimeLib.distModelsThemeMod.Theme] = js.native
  /**
    * Gets a list of all themes on the shop.
    * @param options Options for filtering the results.
    */
  def list(): js.Promise[js.Array[shopifyDashPrimeLib.distModelsThemeMod.Theme]] = js.native
  def list(options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): js.Promise[js.Array[shopifyDashPrimeLib.distModelsThemeMod.Theme]] = js.native
  /**
    * Updates an existing theme.
    * @param id Id of the themes being updated.
    * @param themes The updated theme.
    */
  def update(id: scala.Double, themes: shopifyDashPrimeLib.distModelsThemeMod.Theme): js.Promise[shopifyDashPrimeLib.distModelsThemeMod.Theme] = js.native
}

