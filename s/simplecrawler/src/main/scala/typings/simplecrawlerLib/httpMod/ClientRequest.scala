package typings
package simplecrawlerLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientRequest
  extends simplecrawlerLib.streamMod.Writable {
  val path: java.lang.String = js.native
  def abort(): scala.Unit = js.native
  def addTrailers(headers: OutgoingHttpHeaders): scala.Unit = js.native
  def getHeader(name: java.lang.String): java.lang.String = js.native
  def removeHeader(name: java.lang.String): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: js.Array[java.lang.String]): scala.Unit = js.native
  def setNoDelay(): scala.Unit = js.native
  def setNoDelay(noDelay: scala.Boolean): scala.Unit = js.native
  def setSocketKeepAlive(): scala.Unit = js.native
  def setSocketKeepAlive(enable: scala.Boolean): scala.Unit = js.native
  def setSocketKeepAlive(enable: scala.Boolean, initialDelay: scala.Double): scala.Unit = js.native
  def setTimeout(timeout: scala.Double): scala.Unit = js.native
  def setTimeout(timeout: scala.Double, callback: js.Function): scala.Unit = js.native
  def write(str: java.lang.String, encoding: java.lang.String, fd: java.lang.String): scala.Boolean = js.native
}

