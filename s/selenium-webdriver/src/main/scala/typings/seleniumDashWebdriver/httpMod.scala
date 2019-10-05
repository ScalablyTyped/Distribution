package typings.seleniumDashWebdriver

import typings.seleniumDashWebdriver.httpMod.HttpClient
import typings.seleniumDashWebdriver.httpMod.Request
import typings.seleniumDashWebdriver.httpMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/http", JSImport.Namespace)
@js.native
object httpMod extends js.Object {
  @js.native
  class Executor protected () extends js.Object {
    def this(client: js.Promise[HttpClient]) = this()
    /**
      * @param {!(HttpClient|IThenable<!HttpClient>)} client The client to use for sending
      *     requests to the server, or a promise-like object that will resolve to
      *     to the client.
      */
    def this(client: HttpClient) = this()
    /**
      * Defines a new command for use with this executor. When a command is sent,
      * the {@code path} will be preprocessed using the command's parameters; any
      * path segments prefixed with ':' will be replaced by the parameter of the
      * same name. For example, given '/person/:name' and the parameters
      * '{name: 'Bob'}', the final command path will be '/person/Bob'.
      *
      * @param {string} name The command name.
      * @param {string} method The HTTP method to use when sending this command.
      * @param {string} path The path to send the command to, relative to
      *     the WebDriver server's command root and of the form
      *     '/path/:variable/segment'.
      */
    def defineCommand(name: String, method: String, path: String): Unit = js.native
    /** @override */
    def execute(command: js.Any): js.Any = js.native
  }
  
  @js.native
  class HttpClient protected () extends js.Object {
    /**
      * @param {string} serverUrl URL for the WebDriver server to send commands to.
      * @param {http.Agent=} opt_agent The agent to use for each request.
      *     Defaults to `http.globalAgent`.
      * @param {?string=} opt_proxy The proxy to use for the connection to the
      *     server. Default is to use no proxy.
      */
    def this(serverUrl: String) = this()
    def this(serverUrl: String, opt_agent: js.Any) = this()
    def this(serverUrl: String, opt_agent: js.Any, opt_proxy: String) = this()
    /**
      * Sends a request to the server. The client will automatically follow any
      * redirects returned by the server, fulfilling the returned promise with
      * the final response.
      *
      * @param {!HttpRequest} httpRequest The request to send.
      * @return {!Promise<HttpResponse>} A promise that will be fulfilled
      *     with the server's response.
      */
    def send(httpRequest: Request): js.Promise[Response] = js.native
  }
  
  @js.native
  class Request protected () extends js.Object {
    /**
      * @param {string} method The HTTP method to use for the request.
      * @param {string} path The path on the server to send the request to.
      * @param {Object=} opt_data This request's non-serialized JSON payload data.
      */
    def this(method: String, path: String) = this()
    def this(method: String, path: String, opt_data: js.Object) = this()
  }
  
  @js.native
  class Response protected () extends js.Object {
    /**
      * @param {number} status The response code.
      * @param {!Object<string>} headers The response headers. All header names
      *     will be converted to lowercase strings for consistent lookups.
      * @param {string} body The response body.
      */
    def this(status: Double, headers: js.Object, body: String) = this()
  }
  
  def buildPath(path: String, parameters: js.Object): String = js.native
  def del(path: String): js.Any = js.native
  def get(path: String): js.Any = js.native
  def headersToString(headers: js.Any): String = js.native
  def parseHttpResponse(httpResponse: Response, w3c: Boolean): js.Any = js.native
  def post(path: String): js.Any = js.native
  def resource(method: String, path: String): js.Any = js.native
  def sendRequest(options: js.Object, onOk: js.Any, onError: js.Any): js.Any = js.native
  def sendRequest(options: js.Object, onOk: js.Any, onError: js.Any, opt_data: String): js.Any = js.native
  def sendRequest(options: js.Object, onOk: js.Any, onError: js.Any, opt_data: String, opt_proxy: String): js.Any = js.native
  def tryParse(str: String): js.Any = js.native
}

