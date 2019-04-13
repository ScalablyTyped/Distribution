package typings
package requestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestMod {
  type Cookie = toughDashCookieLib.toughDashCookieMod.Cookie
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  type OptionalUriUrl = RequiredUriUrl | js.Object
  type Options = OptionsWithUri | OptionsWithUrl
  type OptionsWithUri = UriOptions with CoreOptions
  type OptionsWithUrl = UrlOptions with CoreOptions
  type RequestCallback = js.Function3[/* error */ js.Any, /* response */ Response, /* body */ js.Any, scala.Unit]
  type RequestResponse = Response
  // aliases for backwards compatibility
  type ResponseRequest = Request
}
