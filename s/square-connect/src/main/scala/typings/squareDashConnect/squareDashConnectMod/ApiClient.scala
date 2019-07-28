package typings.squareDashConnect.squareDashConnectMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ApiClient")
@js.native
class ApiClient () extends js.Object {
  /**
    * The authentication methods to be included for all API calls.
    */
  var authentications: Record[String, _] = js.native
  /**
    * The base URL against which to resolve every API call's (relative) path.
    */
  var basePath: String = js.native
  /**
    * If set to false an additional timestamp parameter is added to all API GET calls to prevent browser caching.
    */
  var cache: Boolean = js.native
  /**
    * The default HTTP headers to be included for all API calls.
    */
  var defaultHeaders: Record[String, String] = js.native
  /**
    * If set to true, the client will save the cookies from each server response, and return them in the next request.
    */
  var enableCookies: Boolean = js.native
  /**
    * The default HTTP timeout for all API calls.
    */
  var timeout: Double = js.native
}

