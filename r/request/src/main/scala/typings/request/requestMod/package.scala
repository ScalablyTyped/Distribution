package typings.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.Buffer
  import typings.node.httpMod.Agent
  import typings.std.ArrayBuffer
  import typings.std.Uint8Array

  type Cookie = typings.toughDashCookie.toughDashCookieMod.Cookie
  type Headers = StringDictionary[js.Any]
  type MultipartBody = String | Buffer | ArrayBuffer | Uint8Array
  type OptionalUriUrl = RequiredUriUrl | js.Object
  type Options = OptionsWithUri | OptionsWithUrl
  type OptionsWithUri = UriOptions with CoreOptions
  type OptionsWithUrl = UrlOptions with CoreOptions
  /* Rewritten from type alias, can be one of: 
    - typings.request.requestBooleans.`false`
    - (org.scalablytyped.runtime.StringDictionary[typings.node.httpMod.Agent | typings.node.httpsMod.Agent]) with typings.request.requestMod.ExtraPoolOptions
    - typings.request.requestMod.ExtraPoolOptions
  */
  type PoolOptions = _PoolOptions | ((StringDictionary[Agent | typings.node.httpsMod.Agent]) with ExtraPoolOptions)
  type RequestCallback = js.Function3[/* error */ js.Any, /* response */ Response, /* body */ js.Any, Unit]
  type RequestResponse = Response
  // aliases for backwards compatibility
  type ResponseRequest = Request
}
