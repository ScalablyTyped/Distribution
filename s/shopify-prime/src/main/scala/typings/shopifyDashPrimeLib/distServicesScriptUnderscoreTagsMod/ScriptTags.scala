package typings
package shopifyDashPrimeLib.distServicesScriptUnderscoreTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/script_tags", "ScriptTags")
@js.native
class ScriptTags protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
       * Gets a count of all of the shop's script tags.
       * @param options Options for filtering the results.
       */
  def count(): js.Promise[scala.Double] = js.native
  /**
       * Gets a count of all of the shop's script tags.
       * @param options Options for filtering the results.
       */
  def count(options: shopifyDashPrimeLib.distOptionsScriptUnderscoreTagsMod.ScriptTagOptions): js.Promise[scala.Double] = js.native
  /**
       * Creates a new script tag.
       */
  def create(tag: shopifyDashPrimeLib.distModelsScriptUnderscoreTagMod.ScriptTag): js.Promise[shopifyDashPrimeLib.distModelsScriptUnderscoreTagMod.ScriptTag] = js.native
  /**
       * Deletes the script tag with the given id.
       */
  def delete(id: scala.Double): js.Promise[scala.Unit] = js.native
  /**
       * Retrieves the script tag with the given id.
       * @param options Options for filtering the results.
       */
  def get(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsScriptUnderscoreTagMod.ScriptTag] = js.native
  /**
       * Retrieves the script tag with the given id.
       * @param options Options for filtering the results.
       */
  def get(id: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): js.Promise[shopifyDashPrimeLib.distModelsScriptUnderscoreTagMod.ScriptTag] = js.native
  /**
       * Gets a list of up to 250 of the shop's script tags.
       * @param options Options for filtering the results.
       */
  def list(): js.Promise[js.Array[shopifyDashPrimeLib.distModelsScriptUnderscoreTagMod.ScriptTag]] = js.native
  /**
       * Gets a list of up to 250 of the shop's script tags.
       * @param options Options for filtering the results.
       */
  def list(
    options: shopifyDashPrimeLib.distOptionsScriptUnderscoreTagsMod.ScriptTagOptions with shopifyDashPrimeLib.distOptionsBaseMod.ListOptions with shopifyDashPrimeLib.distOptionsBaseMod.DateOptions with shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions
  ): js.Promise[js.Array[shopifyDashPrimeLib.distModelsScriptUnderscoreTagMod.ScriptTag]] = js.native
  /**
       * Updates the script tag with the given id.
       * @param tag The updated script tag.
       */
  def update(id: scala.Double, tag: shopifyDashPrimeLib.distModelsScriptUnderscoreTagMod.ScriptTag): js.Promise[shopifyDashPrimeLib.distModelsScriptUnderscoreTagMod.ScriptTag] = js.native
}

