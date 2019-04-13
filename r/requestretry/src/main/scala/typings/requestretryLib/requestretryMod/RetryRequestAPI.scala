package typings
package requestretryLib.requestretryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryRequestAPI
  extends requestLib.requestMod.RequestAPI[
      requestLib.requestMod.Request, 
      RequestRetryOptions, 
      requestLib.requestMod.RequiredUriUrl
    ] {
  var RetryStrategies: requestretryLib.Anon_HTTPOrNetworkError = js.native
}

