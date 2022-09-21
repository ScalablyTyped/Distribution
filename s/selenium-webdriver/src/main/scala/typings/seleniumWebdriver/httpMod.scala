package typings.seleniumWebdriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("selenium-webdriver/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("selenium-webdriver/http", "Executor")
  @js.native
  open class Executor protected () extends StObject {
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
    def execute(command: Any): Any = js.native
  }
  
  @JSImport("selenium-webdriver/http", "HttpClient")
  @js.native
  open class HttpClient protected () extends StObject {
    /**
      * @param {string} serverUrl URL for the WebDriver server to send commands to.
      * @param {http.Agent=} opt_agent The agent to use for each request.
      *     Defaults to `http.globalAgent`.
      * @param {?string=} opt_proxy The proxy to use for the connection to the
      *     server. Default is to use no proxy.
      */
    def this(serverUrl: String) = this()
    def this(serverUrl: String, opt_agent: Any) = this()
    def this(serverUrl: String, opt_agent: Any, opt_proxy: String) = this()
    def this(serverUrl: String, opt_agent: Unit, opt_proxy: String) = this()
    
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
  
  @JSImport("selenium-webdriver/http", "Request")
  @js.native
  open class Request protected () extends StObject {
    /**
      * @param {string} method The HTTP method to use for the request.
      * @param {string} path The path on the server to send the request to.
      * @param {Object=} opt_data This request's non-serialized JSON payload data.
      */
    def this(method: String, path: String) = this()
    def this(method: String, path: String, opt_data: js.Object) = this()
  }
  
  @JSImport("selenium-webdriver/http", "Response")
  @js.native
  open class Response protected () extends StObject {
    /**
      * @param {number} status The response code.
      * @param {!Object<string>} headers The response headers. All header names
      *     will be converted to lowercase strings for consistent lookups.
      * @param {string} body The response body.
      */
    def this(status: Double, headers: js.Object, body: String) = this()
  }
  
  inline def buildPath(path: String, parameters: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPath")(path.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def del(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def get(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def headersToString(headers: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("headersToString")(headers.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseHttpResponse(httpResponse: Response, w3c: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHttpResponse")(httpResponse.asInstanceOf[js.Any], w3c.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def post(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def resource(method: String, path: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resource")(method.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def sendRequest(options: js.Object, onOk: Any, onError: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sendRequest")(options.asInstanceOf[js.Any], onOk.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def sendRequest(options: js.Object, onOk: Any, onError: Any, opt_data: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sendRequest")(options.asInstanceOf[js.Any], onOk.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], opt_data.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def sendRequest(options: js.Object, onOk: Any, onError: Any, opt_data: String, opt_proxy: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sendRequest")(options.asInstanceOf[js.Any], onOk.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], opt_data.asInstanceOf[js.Any], opt_proxy.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def sendRequest(options: js.Object, onOk: Any, onError: Any, opt_data: Unit, opt_proxy: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sendRequest")(options.asInstanceOf[js.Any], onOk.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], opt_data.asInstanceOf[js.Any], opt_proxy.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def tryParse(str: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
}
