package typings
package shopifyDashPrimeLib.distOptionsArticlesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArticleListOptions extends js.Object {
  /**
    * Filter by article handle.
    */
  var handle: js.UndefOr[java.lang.String] = js.undefined
}

object ArticleListOptions {
  @scala.inline
  def apply(handle: java.lang.String = null): ArticleListOptions = {
    val __obj = js.Dynamic.literal()
    if (handle != null) __obj.updateDynamic("handle")(handle)
    __obj.asInstanceOf[ArticleListOptions]
  }
}

