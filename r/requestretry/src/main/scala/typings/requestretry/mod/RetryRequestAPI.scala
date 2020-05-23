package typings.requestretry.mod

import typings.request.mod.RequestAPI
import typings.request.mod.RequiredUriUrl
import typings.requestretry.anon.HTTPOrNetworkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryRequestAPI extends RequestAPI[RequestPromise, RequestRetryOptions, RequiredUriUrl] {
  var RetryStrategies: HTTPOrNetworkError = js.native
}

