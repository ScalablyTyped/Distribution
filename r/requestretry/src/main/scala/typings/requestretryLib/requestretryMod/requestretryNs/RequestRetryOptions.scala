package typings
package requestretryLib.requestretryMod.requestretryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestRetryOptions
  extends requestLib.requestMod.requestNs.CoreOptions {
  var fullResponse: js.UndefOr[scala.Boolean] = js.undefined
  var maxAttempts: js.UndefOr[scala.Double] = js.undefined
  var promiseFactory: js.UndefOr[js.Function1[/* resolver */ js.Any, _]] = js.undefined
  var retryDelay: js.UndefOr[scala.Double] = js.undefined
  var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
}

