package typings.roadsServer.httpServerMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.roads.mod.Response
import typings.roads.mod.Road
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  /**
    * If set, this holds the custom error handler defined by the user in the constructor
    *
    * @type null|function
    */
  var custom_error_handler: js.UndefOr[js.Function] = js.undefined
  /**
    * This is the road object that will handle all requests
    * @type Road
    */
  var road: Road
  /**
    * This is the node.js http server from the http library.
    * @todo  support HTTPS
    * @type HTTPServer
    */
  var server: typings.node.httpMod.Server
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
  /* protected */ def error_handler(http_response: ServerResponse, error: Error): Unit
  /**
    * Start the http server. Accepts the same parameters as HttpServer.listen
    *
    * @param int port
    * @param string hostname
    */
  def listen(port: Double, hostname: String): Unit
  /**
    * Standard logic for turning each request into a road request, and communicating the response
    * back to the client
    *
    * @param  HTTPRequest http_request
    * @param  HTTPResponse http_response
    */
  /* protected */ def onRequest(http_request: IncomingMessage, http_response: ServerResponse): Unit
  /**
    * Helper function to write a roads Response object to an HTTPResponse object
    *
    * @param  HTTPResponse http_response
    * @param  Response response
    */
  /* protected */ def sendResponse(http_response: ServerResponse, response: Response): Unit
}

object Server {
  @scala.inline
  def apply(
    error_handler: (ServerResponse, Error) => Unit,
    listen: (Double, String) => Unit,
    onRequest: (IncomingMessage, ServerResponse) => Unit,
    road: Road,
    sendResponse: (ServerResponse, Response) => Unit,
    server: typings.node.httpMod.Server,
    custom_error_handler: js.Function = null
  ): Server = {
    val __obj = js.Dynamic.literal(error_handler = js.Any.fromFunction2(error_handler), listen = js.Any.fromFunction2(listen), onRequest = js.Any.fromFunction2(onRequest), road = road.asInstanceOf[js.Any], sendResponse = js.Any.fromFunction2(sendResponse), server = server.asInstanceOf[js.Any])
    if (custom_error_handler != null) __obj.updateDynamic("custom_error_handler")(custom_error_handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
}

