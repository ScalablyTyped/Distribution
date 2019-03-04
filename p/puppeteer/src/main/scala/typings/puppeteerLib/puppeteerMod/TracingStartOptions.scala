package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracingStartOptions extends js.Object {
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var path: java.lang.String
  var screenshots: js.UndefOr[scala.Boolean] = js.undefined
}

object TracingStartOptions {
  @scala.inline
  def apply(
    path: java.lang.String,
    categories: js.Array[java.lang.String] = null,
    screenshots: js.UndefOr[scala.Boolean] = js.undefined
  ): TracingStartOptions = {
    val __obj = js.Dynamic.literal(path = path)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (!js.isUndefined(screenshots)) __obj.updateDynamic("screenshots")(screenshots)
    __obj.asInstanceOf[TracingStartOptions]
  }
}

