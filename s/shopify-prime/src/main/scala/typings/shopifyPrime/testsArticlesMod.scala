package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/tests/articles", JSImport.Namespace)
@js.native
object testsArticlesMod extends js.Object {
  @js.native
  class ArticleTests () extends js.Object {
    var blogId: js.Any = js.native
    var created: js.Any = js.native
    var service: js.Any = js.native
    def CountsArticles(): js.Promise[Unit] = js.native
    def CreatesArticles(): js.Promise[Unit] = js.native
    def DeletesArticles(): js.Promise[Unit] = js.native
    def GetsArticles(): js.Promise[Unit] = js.native
    def ListsArticles(): js.Promise[Unit] = js.native
    def ListsAuthors(): js.Promise[Unit] = js.native
    def ListsTags(): js.Promise[Unit] = js.native
    def ListsTagsForBlog(): js.Promise[Unit] = js.native
    def UpdatesArticles(): js.Promise[Unit] = js.native
    /* private */ def create(scheduleForDeletion: js.Any): js.Any = js.native
    /* private */ def setupAsync(): js.Any = js.native
    /* private */ def teardownAsync(): js.Any = js.native
  }
  
}

