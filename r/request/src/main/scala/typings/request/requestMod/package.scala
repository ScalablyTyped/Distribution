package typings.request

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestMod {
  type Cookie = typings.toughDashCookie.toughDashCookieMod.Cookie
  type Headers = StringDictionary[js.Any]
  type OptionalUriUrl = RequiredUriUrl | js.Object
  type Options = OptionsWithUri | OptionsWithUrl
  type OptionsWithUri = UriOptions with CoreOptions
  type OptionsWithUrl = UrlOptions with CoreOptions
  type RequestCallback = js.Function3[/* error */ js.Any, /* response */ Response, /* body */ js.Any, Unit]
  type RequestResponse = Response
  // aliases for backwards compatibility
  type ResponseRequest = Request
}
