package typings
package shopifyDashPrimeLib.distServicesRedirectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/redirects", "Redirects")
@js.native
class Redirects protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
       * Gets a count of all of the shop's redirects.
       * @param options Options for filtering the results.
       */
  def count(): stdLib.Promise[scala.Double] = js.native
  /**
       * Gets a count of all of the shop's redirects.
       * @param options Options for filtering the results.
       */
  def count(options: shopifyDashPrimeLib.distOptionsRedirectsMod.RedirectOptions): stdLib.Promise[scala.Double] = js.native
  /**
       * Creates a new redirect.
       */
  def create(redirect: shopifyDashPrimeLib.distModelsRedirectMod.Redirect): stdLib.Promise[shopifyDashPrimeLib.distModelsRedirectMod.Redirect] = js.native
  /**
       * Deletes the redirect with the given id.
       */
  def delete(id: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Retrieves the redirect with the given id.
       * @param options Options for filtering the results.
       */
  def get(id: scala.Double): stdLib.Promise[shopifyDashPrimeLib.distModelsRedirectMod.Redirect] = js.native
  /**
       * Retrieves the redirect with the given id.
       * @param options Options for filtering the results.
       */
  def get(id: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): stdLib.Promise[shopifyDashPrimeLib.distModelsRedirectMod.Redirect] = js.native
  /**
       * Gets a list of up to 250 of the shop's redirects.
       * @param options Options for filtering the results.
       */
  def list(): stdLib.Promise[js.Array[shopifyDashPrimeLib.distModelsRedirectMod.Redirect]] = js.native
  /**
       * Gets a list of up to 250 of the shop's redirects.
       * @param options Options for filtering the results.
       */
  def list(
    options: shopifyDashPrimeLib.distOptionsRedirectsMod.RedirectOptions with shopifyDashPrimeLib.distOptionsBaseMod.ListOptions with shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions
  ): stdLib.Promise[js.Array[shopifyDashPrimeLib.distModelsRedirectMod.Redirect]] = js.native
  /**
       * Updates the redirect with the given id.
       * @param tag The updated redirect.
       */
  def update(id: scala.Double, redirect: shopifyDashPrimeLib.distModelsRedirectMod.Redirect): stdLib.Promise[shopifyDashPrimeLib.distModelsRedirectMod.Redirect] = js.native
}

