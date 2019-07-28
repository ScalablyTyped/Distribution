package typings.requestretry.requestretryMod

import typings.request.requestMod.RequestAPI
import typings.request.requestMod.RequiredUriUrl
import typings.requestretry.Anon_HTTPOrNetworkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryRequestAPI extends RequestAPI[RequestPromise, RequestRetryOptions, RequiredUriUrl] {
  var RetryStrategies: Anon_HTTPOrNetworkError = js.native
}

