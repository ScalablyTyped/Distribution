package typings
package retryDashRequestLib.retryDashRequestMod.retryRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var currentRetryAttempt: js.UndefOr[scala.Double] = js.undefined
  var noResponseRetries: js.UndefOr[scala.Double] = js.undefined
  var objectMode: js.UndefOr[scala.Boolean] = js.undefined
  var request: js.UndefOr[
    requestLib.requestMod.requestNs.RequestAPI[
      requestLib.requestMod.requestNs.Request, 
      requestLib.requestMod.requestNs.CoreOptions, 
      requestLib.requestMod.requestNs.RequiredUriUrl
    ]
  ] = js.undefined
  var retries: js.UndefOr[scala.Double] = js.undefined
  var shouldRetryFn: js.UndefOr[
    js.Function1[/* response */ requestLib.requestMod.requestNs.RequestResponse, scala.Boolean]
  ] = js.undefined
}

