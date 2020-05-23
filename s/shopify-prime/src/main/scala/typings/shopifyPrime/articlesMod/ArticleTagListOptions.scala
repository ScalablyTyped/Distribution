package typings.shopifyPrime.articlesMod

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
  def apply(limit: js.UndefOr[Double] = js.undefined, popular: js.UndefOr[Double] = js.undefined): ArticleTagListOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(popular)) __obj.updateDynamic("popular")(popular.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArticleTagListOptions]
  }
}

