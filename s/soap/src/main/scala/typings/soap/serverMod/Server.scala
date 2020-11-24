package typings.soap.serverMod

import typings.node.eventsMod.EventEmitter
import typings.soap.soapStrings.headers
import typings.soap.soapStrings.request
import typings.soap.soapStrings.response
import typings.soap.typesMod.IServerOptions
import typings.soap.typesMod.IServices
import typings.soap.wsdlMod.WSDL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soap/lib/server", "Server")
@js.native
class Server protected () extends EventEmitter {
  def this(server: ServerType, path: String, services: IServices, wsdl: WSDL) = this()
  def this(server: ServerType, path: String, services: IServices, wsdl: WSDL, options: IServerOptions) = this()
  
  var _envelope: js.Any = js.native
  
  var _executeMethod: js.Any = js.native
  
  var _initializeOptions: js.Any = js.native
  
  var _process: js.Any = js.native
  
  var _processRequestXml: js.Any = js.native
  
  var _processSoapHeader: js.Any = js.native
  
  var _requestListener: js.Any = js.native
  
  var _sendError: js.Any = js.native
  
  var _sendHttpResponse: js.Any = js.native
  
  def addSoapHeader(soapHeader: js.Any): Double = js.native
  def addSoapHeader(
    soapHeader: js.Any,
    name: js.UndefOr[scala.Nothing],
    namespace: js.UndefOr[scala.Nothing],
    xmlns: String
  ): Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: js.UndefOr[scala.Nothing], namespace: js.Any): Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: js.UndefOr[scala.Nothing], namespace: js.Any, xmlns: String): Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: String): Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: String, namespace: js.UndefOr[scala.Nothing], xmlns: String): Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: String, namespace: js.Any): Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: String, namespace: js.Any, xmlns: String): Double = js.native
  
  def authenticate(security: js.Any): Boolean | Unit | js.Promise[Boolean] = js.native
  def authenticate(
    security: js.Any,
    processAuthResult: js.UndefOr[scala.Nothing],
    req: js.UndefOr[scala.Nothing],
    obj: js.Any
  ): Boolean | Unit | js.Promise[Boolean] = js.native
  def authenticate(security: js.Any, processAuthResult: js.UndefOr[scala.Nothing], req: Request): Boolean | Unit | js.Promise[Boolean] = js.native
  def authenticate(security: js.Any, processAuthResult: js.UndefOr[scala.Nothing], req: Request, obj: js.Any): Boolean | Unit | js.Promise[Boolean] = js.native
  def authenticate(security: js.Any, processAuthResult: js.Function1[/* result */ Boolean, Unit]): Boolean | Unit | js.Promise[Boolean] = js.native
  def authenticate(
    security: js.Any,
    processAuthResult: js.Function1[/* result */ Boolean, Unit],
    req: js.UndefOr[scala.Nothing],
    obj: js.Any
  ): Boolean | Unit | js.Promise[Boolean] = js.native
  def authenticate(security: js.Any, processAuthResult: js.Function1[/* result */ Boolean, Unit], req: Request): Boolean | Unit | js.Promise[Boolean] = js.native
  def authenticate(
    security: js.Any,
    processAuthResult: js.Function1[/* result */ Boolean, Unit],
    req: Request,
    obj: js.Any
  ): Boolean | Unit | js.Promise[Boolean] = js.native
  
  def authorizeConnection(req: Request): Boolean = js.native
  def authorizeConnection(req: Request, res: Response): Boolean = js.native
  
  var callback: js.Any = js.native
  
  def changeSoapHeader(index: js.Any, soapHeader: js.Any): Unit = js.native
  def changeSoapHeader(
    index: js.Any,
    soapHeader: js.Any,
    name: js.UndefOr[scala.Nothing],
    namespace: js.UndefOr[scala.Nothing],
    xmlns: js.Any
  ): Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.UndefOr[scala.Nothing], namespace: js.Any): Unit = js.native
  def changeSoapHeader(
    index: js.Any,
    soapHeader: js.Any,
    name: js.UndefOr[scala.Nothing],
    namespace: js.Any,
    xmlns: js.Any
  ): Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any): Unit = js.native
  def changeSoapHeader(
    index: js.Any,
    soapHeader: js.Any,
    name: js.Any,
    namespace: js.UndefOr[scala.Nothing],
    xmlns: js.Any
  ): Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any, namespace: js.Any): Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any, namespace: js.Any, xmlns: js.Any): Unit = js.native
  
  def clearSoapHeaders(): Unit = js.native
  
  @JSName("emit")
  def emit_headers(event: headers, headers: js.Any, methodName: String): Boolean = js.native
  @JSName("emit")
  def emit_request(event: request, request: js.Any, methodName: String): Boolean = js.native
  @JSName("emit")
  def emit_response(event: response, headers: js.Any, methodName: String): Boolean = js.native
  
  var enableChunkedEncoding: js.Any = js.native
  
  def getSoapHeaders(): js.Array[String] = js.native
  
  def log(`type`: String, data: js.Any): js.Any = js.native
  
  /** Emitted when the SOAP Headers are not empty. */
  @JSName("on")
  def on_headers(event: headers, listener: js.Function2[/* headers */ js.Any, /* methodName */ String, Unit]): this.type = js.native
  /** Emitted for every received messages. */
  @JSName("on")
  def on_request(event: request, listener: js.Function2[/* request */ js.Any, /* methodName */ String, Unit]): this.type = js.native
  /** Emitted before sending SOAP response. */
  @JSName("on")
  def on_response(event: response, listener: js.Function2[/* response */ js.Any, /* methodName */ String, Unit]): this.type = js.native
  
  var onewayOptions: js.Any = js.native
  
  var path: String = js.native
  
  var returnFault: js.Any = js.native
  
  var services: IServices = js.native
  
  var soapHeaders: js.Any = js.native
  
  var suppressStack: js.Any = js.native
  
  var wsdl: js.Any = js.native
}
