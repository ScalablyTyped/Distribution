package typings
package seleniumDashWebdriverLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/http", "HttpClient")
@js.native
class HttpClient protected () extends js.Object {
  /**
    * @param {string} serverUrl URL for the WebDriver server to send commands to.
    * @param {http.Agent=} opt_agent The agent to use for each request.
    *     Defaults to `http.globalAgent`.
    * @param {?string=} opt_proxy The proxy to use for the connection to the
    *     server. Default is to use no proxy.
    */
  def this(serverUrl: java.lang.String) = this()
  def this(serverUrl: java.lang.String, opt_agent: js.Any) = this()
  def this(serverUrl: java.lang.String, opt_agent: js.Any, opt_proxy: java.lang.String) = this()
  /**
    * Sends a request to the server. The client will automatically follow any
    * redirects returned by the server, fulfilling the returned promise with the
    * final response.
    *
    * @param {!HttpRequest} httpRequest The request to send.
    * @return {!promise.Promise<HttpResponse>} A promise that will be fulfilled
    *     with the server's response.
    */
  def send(httpRequest: Request): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[Response] = js.native
}

