package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overrides extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var method: js.UndefOr[HttpMethod] = js.undefined
  var postData: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Overrides {
  @scala.inline
  def apply(headers: Headers = null, method: HttpMethod = null, postData: String = null, url: String = null): Overrides = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (postData != null) __obj.updateDynamic("postData")(postData.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overrides]
  }
}

