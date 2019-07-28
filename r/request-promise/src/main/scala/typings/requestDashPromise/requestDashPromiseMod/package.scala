package typings.requestDashPromise

import typings.request.requestMod.RequestAPI
import typings.request.requestMod.RequiredUriUrl
import typings.request.requestMod.UriOptions
import typings.request.requestMod.UrlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestDashPromiseMod {
  type Options = OptionsWithUri | OptionsWithUrl
  type OptionsWithUri = UriOptions with RequestPromiseOptions
  type OptionsWithUrl = UrlOptions with RequestPromiseOptions
  type RequestPromiseAPI = RequestAPI[RequestPromise, RequestPromiseOptions, RequiredUriUrl]
}
