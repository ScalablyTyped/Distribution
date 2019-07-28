package typings.shopifyDashPrime.distServicesRedirectsMod

import typings.shopifyDashPrime.distInfrastructureMod.BaseService
import typings.shopifyDashPrime.distModelsRedirectMod.Redirect
import typings.shopifyDashPrime.distOptionsBaseMod.FieldOptions
import typings.shopifyDashPrime.distOptionsBaseMod.ListOptions
import typings.shopifyDashPrime.distOptionsRedirectsMod.RedirectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/redirects", "Redirects")
@js.native
class Redirects protected () extends BaseService {
  def this(shopDomain: String, accessToken: String) = this()
  /**
    * Gets a count of all of the shop's redirects.
    * @param options Options for filtering the results.
    */
  def count(): js.Promise[Double] = js.native
  def count(options: RedirectOptions): js.Promise[Double] = js.native
  /**
    * Creates a new redirect.
    */
  def create(redirect: Redirect): js.Promise[Redirect] = js.native
  /**
    * Deletes the redirect with the given id.
    */
  def delete(id: Double): js.Promise[Unit] = js.native
  /**
    * Retrieves the redirect with the given id.
    * @param options Options for filtering the results.
    */
  def get(id: Double): js.Promise[Redirect] = js.native
  def get(id: Double, options: FieldOptions): js.Promise[Redirect] = js.native
  /**
    * Gets a list of up to 250 of the shop's redirects.
    * @param options Options for filtering the results.
    */
  def list(): js.Promise[js.Array[Redirect]] = js.native
  def list(options: RedirectOptions with ListOptions with FieldOptions): js.Promise[js.Array[Redirect]] = js.native
  /**
    * Updates the redirect with the given id.
    * @param tag The updated redirect.
    */
  def update(id: Double, redirect: Redirect): js.Promise[Redirect] = js.native
}

