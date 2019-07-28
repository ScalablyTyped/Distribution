package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracingStartOptions extends js.Object {
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var path: String
  var screenshots: js.UndefOr[Boolean] = js.undefined
}

object TracingStartOptions {
  @scala.inline
  def apply(path: String, categories: js.Array[String] = null, screenshots: js.UndefOr[Boolean] = js.undefined): TracingStartOptions = {
    val __obj = js.Dynamic.literal(path = path)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (!js.isUndefined(screenshots)) __obj.updateDynamic("screenshots")(screenshots)
    __obj.asInstanceOf[TracingStartOptions]
  }
}

