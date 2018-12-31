package typings
package requestLib.requestMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthOptions extends js.Object {
  var body_hash: js.UndefOr[requestLib.requestLibNumbers.`true` | java.lang.String] = js.undefined
  var callback: js.UndefOr[java.lang.String] = js.undefined
  var consumer_key: js.UndefOr[java.lang.String] = js.undefined
  var consumer_secret: js.UndefOr[java.lang.String] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var token_secret: js.UndefOr[java.lang.String] = js.undefined
  var transport_method: js.UndefOr[
    requestLib.requestLibStrings.body | requestLib.requestLibStrings.header | requestLib.requestLibStrings.query
  ] = js.undefined
  var verifier: js.UndefOr[java.lang.String] = js.undefined
}

