package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overrides extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var method: js.UndefOr[HttpMethod] = js.undefined
  var postData: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Overrides {
  @scala.inline
  def apply(
    headers: Headers = null,
    method: HttpMethod = null,
    postData: java.lang.String = null,
    url: java.lang.String = null
  ): Overrides = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (postData != null) __obj.updateDynamic("postData")(postData)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Overrides]
  }
}

