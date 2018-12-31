package typings
package shopifyDashPrimeLib.distServicesBlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/blogs", "Blogs")
@js.native
class Blogs protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
    * Gets a count of all blogs on the shop.
    */
  def count(): js.Promise[scala.Double] = js.native
  /**
    * Creates a new blog.
    * @param blog The Blog being created.
    */
  def create(blog: shopifyDashPrimeLib.distModelsBlogMod.Blog): js.Promise[shopifyDashPrimeLib.distModelsBlogMod.Blog] = js.native
  /**
    * Deletes the blog with the given id.
    * @param id Id of the blog being deleted.
    */
  def delete(id: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Gets a blog with the given id.
    * @param id Id of the blog to retrieve.
    * @param options Options for filtering the result.
    */
  def get(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsBlogMod.Blog] = js.native
  def get(id: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): js.Promise[shopifyDashPrimeLib.distModelsBlogMod.Blog] = js.native
  /**
    * Gets a list of all blogs on the shop.
    * @param options Options for filtering the results.
    */
  def list(): js.Promise[js.Array[shopifyDashPrimeLib.distModelsBlogMod.Blog]] = js.native
  def list(
    options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions with shopifyDashPrimeLib.distOptionsBlogsMod.BlogListOptions
  ): js.Promise[js.Array[shopifyDashPrimeLib.distModelsBlogMod.Blog]] = js.native
  /**
    * Updates the blog with the given id.
    * @param id Id of the blog being updated.
    * @param blog The updated blog.
    */
  def update(id: scala.Double, blog: shopifyDashPrimeLib.distModelsBlogMod.Blog): js.Promise[shopifyDashPrimeLib.distModelsBlogMod.Blog] = js.native
}

