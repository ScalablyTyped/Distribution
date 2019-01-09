package typings
package shotLib.shotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /** a string specifying the HTTP HOST header value to be used if no header is provided, and the url does not include an authority component. Defaults to 'localhost'. */
  var authority: js.UndefOr[java.lang.String] = js.undefined
  /** an optional object containing request headers. */
  var headers: js.UndefOr[Headers] = js.undefined
  /** a string specifying the HTTP request method, defaulting to 'GET'. */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** an optional request payload. Can be a string, Buffer, Stream or object. */
  var payload: js.UndefOr[java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Stream | js.Object] = js.undefined
  /** an optional string specifying the client remote address. Defaults to '127.0.0.1'. */
  var remoteAddress: js.UndefOr[java.lang.String] = js.undefined
  /** an object containing flags to simulate various conditions: */
  var simulate: js.UndefOr[shotLib.Anon_Close] = js.undefined
  /** a string specifying the request URL. */
  var url: java.lang.String
  /** Optional flag to validate this options object. Defaults to true. */
  var validate: js.UndefOr[scala.Boolean] = js.undefined
}

