package typings.squareConnect.mod

import org.scalablytyped.runtime.StringDictionary
import typings.squareConnect.anon.Oauth2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ApiClient")
@js.native
open class ApiClient () extends StObject {
  
  /**
    * The authentication methods to be included for all API calls.
    */
  var authentications: Oauth2 = js.native
  
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
  var defaultHeaders: StringDictionary[String] = js.native
  
  /**
    * If set to true, the client will save the cookies from each server response, and return them in the next request.
    */
  var enableCookies: Boolean = js.native
  
  /**
    *  The default HTTP timeout for all API calls.
    */
  var timeout: Double = js.native
}
/* static members */
object ApiClient {
  
  @JSImport("square-connect", "ApiClient")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default API client implementation.
    */
  @JSImport("square-connect", "ApiClient.instance")
  @js.native
  def instance: ApiClient = js.native
  inline def instance_=(x: ApiClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
}
