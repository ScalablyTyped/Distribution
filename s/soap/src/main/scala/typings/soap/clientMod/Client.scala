package typings.soap.clientMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingHttpHeaders
import typings.request.mod.Headers
import typings.soap.soapStrings.message
import typings.soap.soapStrings.request
import typings.soap.soapStrings.response
import typings.soap.soapStrings.soapError
import typings.soap.typesMod.IHeaders
import typings.soap.typesMod.IOptions
import typings.soap.typesMod.ISecurity
import typings.soap.wsdlMod.WSDL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/client", "Client")
@js.native
class Client protected ()
  extends EventEmitter
     with /* method */ StringDictionary[js.Any] {
  def this(wsdl: WSDL) = this()
  def this(wsdl: WSDL, endpoint: String) = this()
  def this(wsdl: WSDL, endpoint: String, options: IOptions) = this()
  var SOAPAction: js.Any = js.native
  var _defineMethod: js.Any = js.native
  var _definePort: js.Any = js.native
  var _defineService: js.Any = js.native
  var _initializeOptions: js.Any = js.native
  var _initializeServices: js.Any = js.native
  var _invoke: js.Any = js.native
  var _processSoapHeader: js.Any = js.native
  var bodyAttributes: js.Any = js.native
  var endpoint: js.Any = js.native
  var httpClient: js.Any = js.native
  var httpHeaders: js.Any = js.native
  var lastElapsedTime: js.UndefOr[Double] = js.native
  var lastEndpoint: js.UndefOr[String] = js.native
  var lastMessage: js.UndefOr[String] = js.native
  /** contains last full soap request for client logging */
  var lastRequest: js.UndefOr[String] = js.native
  var lastRequestHeaders: js.UndefOr[Headers] = js.native
  var lastResponse: js.UndefOr[js.Any] = js.native
  var lastResponseHeaders: js.UndefOr[IncomingHttpHeaders] = js.native
  var normalizeNames: js.Any = js.native
  var security: js.Any = js.native
  var soapHeaders: js.Any = js.native
  var streamAllowed: js.Any = js.native
  var wsdl: js.Any = js.native
  def addBodyAttribute(bodyAttribute: js.Any): Unit = js.native
  def addBodyAttribute(bodyAttribute: js.Any, name: String): Unit = js.native
  def addBodyAttribute(bodyAttribute: js.Any, name: String, namespace: String): Unit = js.native
  def addBodyAttribute(bodyAttribute: js.Any, name: String, namespace: String, xmlns: String): Unit = js.native
  def addHttpHeader(name: String, value: js.Any): Unit = js.native
  /** add soapHeader to soap:Header node */
  def addSoapHeader(soapHeader: js.Any): Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: String): Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: String, namespace: js.Any): Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: String, namespace: js.Any, xmlns: String): Double = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any): Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any): Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any, namespace: js.Any): Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any, namespace: js.Any, xmlns: js.Any): Unit = js.native
  def clearBodyAttributes(): Unit = js.native
  def clearHttpHeaders(): Unit = js.native
  /** remove all defined headers */
  def clearSoapHeaders(): Unit = js.native
  /** description of services, ports and methods as a JavaScript object */
  def describe(): js.Any = js.native
  @JSName("emit")
  def emit_message(event: message, message: String, eid: String): Boolean = js.native
  @JSName("emit")
  def emit_request(event: request, xml: String, eid: String): Boolean = js.native
  @JSName("emit")
  def emit_response(event: response, body: js.Any, response: js.Any, eid: String): Boolean = js.native
  @JSName("emit")
  def emit_soapError(event: soapError, error: js.Any, eid: String): Boolean = js.native
  def getBodyAttributes(): js.Array[_] = js.native
  def getHttpHeaders(): IHeaders = js.native
  /** return all defined headers */
  def getSoapHeaders(): js.Array[String] = js.native
  /** Emitted before a request is sent, but only the body is passed to the event handler. Useful if you don't want to log /store Soap headers. */
  @JSName("on")
  def on_message(event: message, listener: js.Function2[/* message */ String, /* eid */ String, Unit]): this.type = js.native
  /** Emitted before a request is sent. */
  @JSName("on")
  def on_request(event: request, listener: js.Function2[/* xml */ String, /* eid */ String, Unit]): this.type = js.native
  /** Emitted after a response is received. This is emitted for all responses (both success and errors). */
  @JSName("on")
  def on_response(
    event: response,
    listener: js.Function3[/* body */ js.Any, /* response */ js.Any, /* eid */ String, Unit]
  ): this.type = js.native
  /** Emitted when an erroneous response is received. */
  @JSName("on")
  def on_soapError(event: soapError, listener: js.Function2[/* error */ js.Any, /* eid */ String, Unit]): this.type = js.native
  /** overwrite the SOAP service endpoint address */
  def setEndpoint(endpoint: String): Unit = js.native
  def setSOAPAction(SOAPAction: String): Unit = js.native
  /** use the specified security protocol */
  def setSecurity(security: ISecurity): Unit = js.native
}

