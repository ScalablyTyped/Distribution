package typings
package simplecrawlerLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingMessage
  extends simplecrawlerLib.streamMod.Readable {
  var connection: simplecrawlerLib.netMod.Socket = js.native
  var headers: IncomingHttpHeaders = js.native
  var httpVersion: java.lang.String = js.native
  var httpVersionMajor: scala.Double = js.native
  var httpVersionMinor: scala.Double = js.native
  /**
    * Only valid for request obtained from http.Server.
    */
  var method: js.UndefOr[java.lang.String] = js.native
  var rawHeaders: js.Array[java.lang.String] = js.native
  var rawTrailers: js.Array[java.lang.String] = js.native
  var socket: simplecrawlerLib.netMod.Socket = js.native
  /**
    * Only valid for response obtained from http.ClientRequest.
    */
  var statusCode: js.UndefOr[scala.Double] = js.native
  /**
    * Only valid for response obtained from http.ClientRequest.
    */
  var statusMessage: js.UndefOr[java.lang.String] = js.native
  var trailers: OutgoingHttpHeaders = js.native
  /**
    * Only valid for request obtained from http.Server.
    */
  var url: js.UndefOr[java.lang.String] = js.native
  def destroy(): scala.Unit = js.native
  def destroy(error: simplecrawlerLib.Error): scala.Unit = js.native
  def setTimeout(msecs: scala.Double, callback: js.Function): simplecrawlerLib.NodeJSNs.Timer = js.native
}

