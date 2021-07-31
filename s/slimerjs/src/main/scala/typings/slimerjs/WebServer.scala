package typings.slimerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebServer extends StObject {
  
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
  
  var port: Double = js.native
  
  def registerDirectory(urlpath: String, directoryPath: String): Unit = js.native
  
  def registerFile(urlpath: String, filePath: String): Unit = js.native
  
  def registerPathHandler(
    urlpath: String,
    handlerCallback: js.Function2[/* request */ WebServerRequest, /* response */ WebServerResponse, Unit]
  ): Unit = js.native
}
