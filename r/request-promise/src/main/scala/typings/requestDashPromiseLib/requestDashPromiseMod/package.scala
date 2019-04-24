package typings
package requestDashPromiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestDashPromiseMod {
  type Options = OptionsWithUri | OptionsWithUrl
  type OptionsWithUri = requestLib.requestMod.UriOptions with RequestPromiseOptions
  type OptionsWithUrl = requestLib.requestMod.UrlOptions with RequestPromiseOptions
  type RequestPromiseAPI = requestLib.requestMod.RequestAPI[RequestPromise, RequestPromiseOptions, requestLib.requestMod.RequiredUriUrl]
}
