package typings
package simplecrawlerLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerResponse
  extends simplecrawlerLib.streamMod.Writable {
  var finished: scala.Boolean = js.native
  var headersSent: scala.Boolean = js.native
  var sendDate: scala.Boolean = js.native
  var statusCode: scala.Double = js.native
  var statusMessage: java.lang.String = js.native
  def addTrailers(headers: OutgoingHttpHeaders): scala.Unit = js.native
  def getHeader(name: java.lang.String): java.lang.String = js.native
  def removeHeader(name: java.lang.String): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: js.Array[java.lang.String]): scala.Unit = js.native
  def setTimeout(msecs: scala.Double, callback: js.Function): ServerResponse = js.native
  def write(str: java.lang.String, encoding: java.lang.String, fd: java.lang.String): scala.Boolean = js.native
  def writeContinue(): scala.Unit = js.native
  def writeHead(statusCode: scala.Double): scala.Unit = js.native
  def writeHead(statusCode: scala.Double, headers: OutgoingHttpHeaders): scala.Unit = js.native
  def writeHead(statusCode: scala.Double, reasonPhrase: java.lang.String): scala.Unit = js.native
  def writeHead(statusCode: scala.Double, reasonPhrase: java.lang.String, headers: OutgoingHttpHeaders): scala.Unit = js.native
}

