package typings
package requestLib.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestNs {
  type Cookie = toughDashCookieLib.toughDashCookieMod.Cookie
  type OptionalUriUrl = RequiredUriUrl | js.Object
  type Options = OptionsWithUri | OptionsWithUrl
  type OptionsWithUri = UriOptions with CoreOptions
  type OptionsWithUrl = UrlOptions with CoreOptions
  type RequestCallback = js.Function3[/* error */ js.Any, /* response */ Response, /* body */ js.Any, scala.Unit]
  type RequestResponse = Response
  // aliases for backwards compatibility
  type ResponseRequest = Request
}
