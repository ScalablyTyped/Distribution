package typings
package requestDashPromiseDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestDashPromiseDashNativeMod {
  type FullResponse = requestLib.requestMod.Response
  type Options = OptionsWithUri | OptionsWithUrl
  type OptionsWithUri = requestLib.requestMod.UriOptions with RequestPromiseOptions
  type OptionsWithUrl = requestLib.requestMod.UrlOptions with RequestPromiseOptions
  type RequestPromiseAPI = requestLib.requestMod.RequestAPI[RequestPromise[js.Any], RequestPromiseOptions, requestLib.requestMod.RequiredUriUrl]
}
