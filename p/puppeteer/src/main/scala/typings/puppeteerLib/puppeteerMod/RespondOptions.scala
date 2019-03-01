package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RespondOptions extends js.Object {
  /** Specifies the response body. */
  var body: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  /** Specifies the Content-Type response header. */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the response headers. */
  var headers: js.UndefOr[Headers] = js.undefined
  /**
    * Specifies the response status code.
    * @default 200
    */
  var status: js.UndefOr[scala.Double] = js.undefined
}

object RespondOptions {
  @scala.inline
  def apply(
    body: nodeLib.Buffer | java.lang.String = null,
    contentType: java.lang.String = null,
    headers: Headers = null,
    status: scala.Int | scala.Double = null
  ): RespondOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RespondOptions]
  }
}

