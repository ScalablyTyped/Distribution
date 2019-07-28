package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebServer extends js.Object {
  var port: Double = js.native
  // listen(ipAddressPort: string, cb?: (request: IWebServerRequest, response: IWebServerResponse) => void): boolean;
  def close(): Unit = js.native
  def listen(port: String): Boolean = js.native
  def listen(
    port: String,
    cb: js.Function2[/* request */ WebServerRequest, /* response */ WebServerResponse, Unit]
  ): Boolean = js.native
  def listen(port: Double): Boolean = js.native
  def listen(
    port: Double,
    cb: js.Function2[/* request */ WebServerRequest, /* response */ WebServerResponse, Unit]
  ): Boolean = js.native
  def registerDirectory(urlpath: String, directoryPath: String): Unit = js.native
  def registerFile(urlpath: String, filePath: String): Unit = js.native
  def registerPathHandler(
    urlpath: String,
    handlerCallback: js.Function2[/* request */ WebServerRequest, /* response */ WebServerResponse, Unit]
  ): Unit = js.native
}

