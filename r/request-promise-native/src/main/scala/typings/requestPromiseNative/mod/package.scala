package typings.requestPromiseNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FullResponse = typings.request.mod.Response
  type Options = typings.requestPromiseNative.mod.OptionsWithUri | typings.requestPromiseNative.mod.OptionsWithUrl
  type OptionsWithUri = typings.request.mod.UriOptions with typings.requestPromiseNative.mod.RequestPromiseOptions
  type OptionsWithUrl = typings.request.mod.UrlOptions with typings.requestPromiseNative.mod.RequestPromiseOptions
  type RequestPromiseAPI = typings.request.mod.RequestAPI[
    typings.requestPromiseNative.mod.RequestPromise[js.Any], 
    typings.requestPromiseNative.mod.RequestPromiseOptions, 
    typings.request.mod.RequiredUriUrl
  ]
}
