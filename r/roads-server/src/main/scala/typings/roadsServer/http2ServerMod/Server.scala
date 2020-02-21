package typings.roadsServer.http2ServerMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.http2Mod.Http2Server
import typings.node.http2Mod.ServerHttp2Stream
import typings.roads.mod.Response
import typings.roads.mod.Road
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  /**
    * This is the road object that will handle all requests
    * @type {Road}
    */
  var road: Road
  /**
    * This is the node.js http2 server from the http2 library.
    * @todo  support HTTPS
    * @type HTTPServer
    */
  var server: Http2Server
  /**
    * Start the http server. Accepts the same parameters as HttpServer.listen
    *
    * @param {number} port
    * @param {string} hostname
    */
  def listen(port: Double, hostname: String): Http2Server
  /**
    * Standard logic for turning each request into a road request, and communicating the response
    * back to the client
    *
    * @param {ServerHttp2Stream} stream
    * @param {object} headers
    */
  /* protected */ def onStream(stream: ServerHttp2Stream, headers: StringDictionary[js.Any]): Unit
  /**
    * Helper function to write a roads Response object to an HTTPResponse object
    *
    * @param {ServerHttp2Stream} stream
    * @param {Response} response
    */
  /* protected */ def sendResponse(stream: ServerHttp2Stream, response: Response): Unit
}

object Server {
  @scala.inline
  def apply(
    listen: (Double, String) => Http2Server,
    onStream: (ServerHttp2Stream, StringDictionary[js.Any]) => Unit,
    road: Road,
    sendResponse: (ServerHttp2Stream, Response) => Unit,
    server: Http2Server
  ): Server = {
    val __obj = js.Dynamic.literal(listen = js.Any.fromFunction2(listen), onStream = js.Any.fromFunction2(onStream), road = road.asInstanceOf[js.Any], sendResponse = js.Any.fromFunction2(sendResponse), server = server.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Server]
  }
}

