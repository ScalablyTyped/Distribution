package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ApiClient")
@js.native
class ApiClient () extends js.Object {
  /**
    * The authentication methods to be included for all API calls.
    */
  var authentications: stdLib.Record[java.lang.String, _] = js.native
  /**
    * The base URL against which to resolve every API call's (relative) path.
    */
  var basePath: java.lang.String = js.native
  /**
    * If set to false an additional timestamp parameter is added to all API GET calls to prevent browser caching.
    */
  var cache: scala.Boolean = js.native
  /**
    * The default HTTP headers to be included for all API calls.
    */
  var defaultHeaders: stdLib.Record[java.lang.String, java.lang.String] = js.native
  /**
    * If set to true, the client will save the cookies from each server response, and return them in the next request.
    */
  var enableCookies: scala.Boolean = js.native
  /**
    * The default HTTP timeout for all API calls.
    */
  var timeout: scala.Double = js.native
}

