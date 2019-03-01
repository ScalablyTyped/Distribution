package typings
package reactDashRequestLib.reactDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestKeyOptions extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object RequestKeyOptions {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    method: java.lang.String = null,
    responseType: java.lang.String = null,
    url: java.lang.String = null
  ): RequestKeyOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (method != null) __obj.updateDynamic("method")(method)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RequestKeyOptions]
  }
}

