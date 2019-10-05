package typings.shopifyDashPrime

import typings.shopifyDashPrime.distInfrastructureMod.BaseService
import typings.shopifyDashPrime.distModelsBlogMod.Blog
import typings.shopifyDashPrime.distOptionsBaseMod.FieldOptions
import typings.shopifyDashPrime.distOptionsBlogsMod.BlogListOptions
import typings.shopifyDashPrime.distServicesBlogsMod.Blogs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/blogs", JSImport.Namespace)
@js.native
object distServicesBlogsMod extends js.Object {
  @js.native
  class Blogs protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Gets a count of all blogs on the shop.
      */
    def count(): js.Promise[Double] = js.native
    /**
      * Creates a new blog.
      * @param blog The Blog being created.
      */
    def create(blog: Blog): js.Promise[Blog] = js.native
    /**
      * Deletes the blog with the given id.
      * @param id Id of the blog being deleted.
      */
    def delete(id: Double): js.Promise[Unit] = js.native
    /**
      * Gets a blog with the given id.
      * @param id Id of the blog to retrieve.
      * @param options Options for filtering the result.
      */
    def get(id: Double): js.Promise[Blog] = js.native
    def get(id: Double, options: FieldOptions): js.Promise[Blog] = js.native
    /**
      * Gets a list of all blogs on the shop.
      * @param options Options for filtering the results.
      */
    def list(): js.Promise[js.Array[Blog]] = js.native
    def list(options: FieldOptions with BlogListOptions): js.Promise[js.Array[Blog]] = js.native
    /**
      * Updates the blog with the given id.
      * @param id Id of the blog being updated.
      * @param blog The updated blog.
      */
    def update(id: Double, blog: Blog): js.Promise[Blog] = js.native
  }
  
  @js.native
  class default protected () extends Blogs {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

