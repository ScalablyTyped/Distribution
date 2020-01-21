package typings.shopifyPrime.articlesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArticleListOptions extends js.Object {
  /**
    * Filter by article handle.
    */
  var handle: js.UndefOr[String] = js.undefined
}

object ArticleListOptions {
  @scala.inline
  def apply(handle: String = null): ArticleListOptions = {
    val __obj = js.Dynamic.literal()
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArticleListOptions]
  }
}

