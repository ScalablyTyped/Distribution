package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseInfo extends js.Object {
  var allResponseHeaders: js.UndefOr[java.lang.String] = js.undefined
  /** Can be string or bytearray depending on request.binaryStringResponseBody field */
  var body: js.UndefOr[java.lang.String | stdLib.Uint8Array] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var responseAvailable: scala.Boolean
  var state: js.UndefOr[js.Any] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

