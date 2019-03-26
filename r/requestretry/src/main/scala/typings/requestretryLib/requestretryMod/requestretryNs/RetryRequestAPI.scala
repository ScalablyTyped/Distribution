package typings
package requestretryLib.requestretryMod.requestretryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryRequestAPI
  extends requestLib.requestMod.requestNs.RequestAPI[
      requestLib.requestMod.requestNs.Request, 
      RequestRetryOptions, 
      requestLib.requestMod.requestNs.RequiredUriUrl
    ] {
  var RetryStrategies: requestretryLib.Anon_HTTPOrNetworkError = js.native
}

