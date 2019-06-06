package typings
package sipDotJsLib.libClientContextMod.ClientContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var params: js.UndefOr[sipDotJsLib.Anon_FromUri] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    contentType: java.lang.String = null,
    extraHeaders: js.Array[java.lang.String] = null,
    params: sipDotJsLib.Anon_FromUri = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Options]
  }
}

