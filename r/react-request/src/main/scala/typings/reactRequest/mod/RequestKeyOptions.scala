package typings.reactRequest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestKeyOptions extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object RequestKeyOptions {
  @scala.inline
  def apply(body: String = null, method: String = null, responseType: String = null, url: String = null): RequestKeyOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestKeyOptions]
  }
}

