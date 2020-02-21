package typings.roadsServer.http2ServerMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.http2Mod.Http2Server
import typings.node.http2Mod.ServerHttp2Stream
import typings.roads.mod.Response
import typings.roads.mod.Road
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads-server/types/http2Server", JSImport.Default)
@js.native
class default protected () extends Server {
  /**
    * Constructs a new Server object that helps create Roads servers.
    *
    * @param {Road} road The Road that handles all the routes
    */
  def this(road: Road) = this()
  /**
    * This is the road object that will handle all requests
    * @type {Road}
    */
  /* CompleteClass */
  override var road: Road = js.native
  /**
    * This is the node.js http2 server from the http2 library.
    * @todo  support HTTPS
    * @type HTTPServer
    */
  /* CompleteClass */
  override var server: Http2Server = js.native
  /**
    * Start the http server. Accepts the same parameters as HttpServer.listen
    *
    * @param {number} port
    * @param {string} hostname
    */
  /* CompleteClass */
  override def listen(port: Double, hostname: String): Http2Server = js.native
  /**
    * Standard logic for turning each request into a road request, and communicating the response
    * back to the client
    *
    * @param {ServerHttp2Stream} stream
    * @param {object} headers
    */
  /* CompleteClass */
  /* protected */ override def onStream(stream: ServerHttp2Stream, headers: StringDictionary[js.Any]): Unit = js.native
  /**
    * Helper function to write a roads Response object to an HTTPResponse object
    *
    * @param {ServerHttp2Stream} stream
    * @param {Response} response
    */
  /* CompleteClass */
  /* protected */ override def sendResponse(stream: ServerHttp2Stream, response: Response): Unit = js.native
}

