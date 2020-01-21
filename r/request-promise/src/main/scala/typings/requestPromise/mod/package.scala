package typings.requestPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Options = typings.requestPromise.mod.OptionsWithUri | typings.requestPromise.mod.OptionsWithUrl
  type OptionsWithUri = typings.request.mod.UriOptions with typings.requestPromise.mod.RequestPromiseOptions
  type OptionsWithUrl = typings.request.mod.UrlOptions with typings.requestPromise.mod.RequestPromiseOptions
  type RequestPromiseAPI = typings.request.mod.RequestAPI[
    typings.requestPromise.mod.RequestPromise[js.Any], 
    typings.requestPromise.mod.RequestPromiseOptions, 
    typings.request.mod.RequiredUriUrl
  ]
}
