package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebServer extends js.Object {
  var port: scala.Double = js.native
  // listen(ipAddressPort: string, cb?: (request: IWebServerRequest, response: IWebServerResponse) => void): boolean;
  def close(): scala.Unit = js.native
  def listen(port: java.lang.String): scala.Boolean = js.native
  def listen(
    port: java.lang.String,
    cb: js.Function2[/* request */ WebServerRequest, /* response */ WebServerResponse, scala.Unit]
  ): scala.Boolean = js.native
  def listen(port: scala.Double): scala.Boolean = js.native
  def listen(
    port: scala.Double,
    cb: js.Function2[/* request */ WebServerRequest, /* response */ WebServerResponse, scala.Unit]
  ): scala.Boolean = js.native
  def registerDirectory(urlpath: java.lang.String, directoryPath: java.lang.String): scala.Unit = js.native
  def registerFile(urlpath: java.lang.String, filePath: java.lang.String): scala.Unit = js.native
  def registerPathHandler(
    urlpath: java.lang.String,
    handlerCallback: js.Function2[/* request */ WebServerRequest, /* response */ WebServerResponse, scala.Unit]
  ): scala.Unit = js.native
}

