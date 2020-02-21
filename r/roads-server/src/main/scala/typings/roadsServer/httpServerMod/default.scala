package typings.roadsServer.httpServerMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.httpsMod.ServerOptions
import typings.roads.mod.Response
import typings.roads.mod.Road
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads-server/types/httpServer", JSImport.Default)
@js.native
class default protected () extends Server {
  /**
    * Constructs a new Server object that helps create Roads servers.
    *
    * @todo  tests
    * @param {Roads} road The Road that handles all the routes
    * @param {Function} error_handler An overwrite to the standard error handler. Accepts a single parameter (the error) and should return a Roads.Response object.
    * @param {Object} httpsOptions HTTPS servers require additional data. You can pass all of those parameters here. Valid values can be found in the node docs: https://nodejs.org/api/https.html#https_https_createserver_options_requestlistener
    */
  def this(road: Road) = this()
  def this(road: Road, error_handler: js.Function) = this()
  def this(road: Road, error_handler: js.Function, httpsOptions: ServerOptions) = this()
  /**
    * This is the road object that will handle all requests
    * @type Road
    */
  /* CompleteClass */
  override var road: Road = js.native
  /**
    * This is the node.js http server from the http library.
    * @todo  support HTTPS
    * @type HTTPServer
    */
  /* CompleteClass */
  override var server: typings.node.httpMod.Server = js.native
  /**
    * Standard logic to handle any errors thrown in the roads request.
    * If a custom error handler was provided in the constructor, it will use that. Otherwise
    * it will fall back to the roads default logic.
    *
    * The roads default logic is
    *  - If the error is a roads.HttpError, display the error message and status code exactly as thrown.
    *  - If the error is anything else, display a 500 error with the message "Server Error: ".
    *
    * @param  HTTPResponse http_response
    * @param  Error error
    */
  /* CompleteClass */
  /* protected */ override def error_handler(http_response: ServerResponse, error: Error): Unit = js.native
  /**
    * Start the http server. Accepts the same parameters as HttpServer.listen
    *
    * @param int port
    * @param string hostname
    */
  /* CompleteClass */
  override def listen(port: Double, hostname: String): Unit = js.native
  /**
    * Standard logic for turning each request into a road request, and communicating the response
    * back to the client
    *
    * @param  HTTPRequest http_request
    * @param  HTTPResponse http_response
    */
  /* CompleteClass */
  /* protected */ override def onRequest(http_request: IncomingMessage, http_response: ServerResponse): Unit = js.native
  /**
    * Helper function to write a roads Response object to an HTTPResponse object
    *
    * @param  HTTPResponse http_response
    * @param  Response response
    */
  /* CompleteClass */
  /* protected */ override def sendResponse(http_response: ServerResponse, response: Response): Unit = js.native
}

