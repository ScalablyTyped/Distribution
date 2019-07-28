package typings.shopifyDashPrime.distOptionsArticlesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArticleTagListOptions extends js.Object {
  /**
    * The number of tags to return.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * A flag to indicate only to a certain number of the most popular tags.
    */
  var popular: js.UndefOr[Double] = js.undefined
}

object ArticleTagListOptions {
  @scala.inline
  def apply(limit: Int | Double = null, popular: Int | Double = null): ArticleTagListOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (popular != null) __obj.updateDynamic("popular")(popular.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArticleTagListOptions]
  }
}

