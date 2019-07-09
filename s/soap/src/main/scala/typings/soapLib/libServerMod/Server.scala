package typings
package soapLib.libServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/server", "Server")
@js.native
class Server protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(server: ServerType, path: java.lang.String, services: soapLib.libTypesMod.IServices, wsdl: soapLib.libWsdlMod.WSDL) = this()
  def this(server: ServerType, path: java.lang.String, services: soapLib.libTypesMod.IServices, wsdl: soapLib.libWsdlMod.WSDL, options: soapLib.libTypesMod.IServerOptions) = this()
  var _envelope: js.Any = js.native
  var _executeMethod: js.Any = js.native
  var _initializeOptions: js.Any = js.native
  var _process: js.Any = js.native
  var _processRequestXml: js.Any = js.native
  var _processSoapHeader: js.Any = js.native
  var _requestListener: js.Any = js.native
  var _sendError: js.Any = js.native
  var _sendHttpResponse: js.Any = js.native
  var callback: js.UndefOr[js.Any] = js.native
  var enableChunkedEncoding: js.Any = js.native
  var onewayOptions: js.Any = js.native
  var path: java.lang.String = js.native
  var returnFault: js.Any = js.native
  var services: soapLib.libTypesMod.IServices = js.native
  var soapHeaders: js.Any = js.native
  var suppressStack: js.Any = js.native
  var wsdl: js.Any = js.native
  def addSoapHeader(soapHeader: js.Any): scala.Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: java.lang.String): scala.Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: java.lang.String, namespace: js.Any): scala.Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: java.lang.String, namespace: js.Any, xmlns: java.lang.String): scala.Double = js.native
  def authenticate(security: js.Any): scala.Boolean | scala.Unit | js.Promise[scala.Boolean] = js.native
  def authenticate(security: js.Any, processAuthResult: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Boolean | scala.Unit | js.Promise[scala.Boolean] = js.native
  def authenticate(
    security: js.Any,
    processAuthResult: js.Function1[/* result */ scala.Boolean, scala.Unit],
    req: Request
  ): scala.Boolean | scala.Unit | js.Promise[scala.Boolean] = js.native
  def authenticate(
    security: js.Any,
    processAuthResult: js.Function1[/* result */ scala.Boolean, scala.Unit],
    req: Request,
    obj: js.Any
  ): scala.Boolean | scala.Unit | js.Promise[scala.Boolean] = js.native
  def authorizeConnection(req: Request): scala.Boolean = js.native
  def authorizeConnection(req: Request, res: Response): scala.Boolean = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any): scala.Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any): scala.Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any, namespace: js.Any): scala.Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any, namespace: js.Any, xmlns: js.Any): scala.Unit = js.native
  def clearSoapHeaders(): scala.Unit = js.native
  @JSName("emit")
  def emit_headers(event: soapLib.soapLibStrings.headers, headers: js.Any, methodName: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_request(event: soapLib.soapLibStrings.request, request: js.Any, methodName: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_response(event: soapLib.soapLibStrings.response, headers: js.Any, methodName: java.lang.String): scala.Boolean = js.native
  def getSoapHeaders(): js.Array[java.lang.String] = js.native
  def log(`type`: java.lang.String, data: js.Any): js.Any = js.native
  /** Emitted when the SOAP Headers are not empty. */
  @JSName("on")
  def on_headers(
    event: soapLib.soapLibStrings.headers,
    listener: js.Function2[/* headers */ js.Any, /* methodName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /** Emitted for every received messages. */
  @JSName("on")
  def on_request(
    event: soapLib.soapLibStrings.request,
    listener: js.Function2[/* request */ js.Any, /* methodName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /** Emitted before sending SOAP response. */
  @JSName("on")
  def on_response(
    event: soapLib.soapLibStrings.response,
    listener: js.Function2[/* response */ js.Any, /* methodName */ java.lang.String, scala.Unit]
  ): this.type = js.native
}

