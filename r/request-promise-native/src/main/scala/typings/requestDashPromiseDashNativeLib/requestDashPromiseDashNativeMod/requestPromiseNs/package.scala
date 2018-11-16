package typings
package requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestPromiseNs {
  type FullResponse = requestLib.requestMod.requestNs.Response
  type Options = OptionsWithUri | OptionsWithUrl
  type OptionsWithUri = requestLib.requestMod.requestNs.UriOptions with RequestPromiseOptions
  type OptionsWithUrl = requestLib.requestMod.requestNs.UrlOptions with RequestPromiseOptions
}
