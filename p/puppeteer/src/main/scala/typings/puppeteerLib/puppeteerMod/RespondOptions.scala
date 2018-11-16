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

