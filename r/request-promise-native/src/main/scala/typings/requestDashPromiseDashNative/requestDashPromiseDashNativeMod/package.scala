package typings.requestDashPromiseDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestDashPromiseDashNativeMod {
  import typings.request.requestMod.RequestAPI
  import typings.request.requestMod.RequiredUriUrl
  import typings.request.requestMod.Response
  import typings.request.requestMod.UriOptions
  import typings.request.requestMod.UrlOptions

  type FullResponse = Response
  type Options = OptionsWithUri | OptionsWithUrl
  type OptionsWithUri = UriOptions with RequestPromiseOptions
  type OptionsWithUrl = UrlOptions with RequestPromiseOptions
  type RequestPromiseAPI = RequestAPI[RequestPromise[js.Any], RequestPromiseOptions, RequiredUriUrl]
}
