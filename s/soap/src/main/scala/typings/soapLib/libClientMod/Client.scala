package typings
package soapLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/client", "Client")
@js.native
class Client protected ()
  extends nodeLib.eventsMod.EventEmitter
     with /* method */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def this(wsdl: soapLib.libWsdlMod.WSDL) = this()
  def this(wsdl: soapLib.libWsdlMod.WSDL, endpoint: java.lang.String) = this()
  def this(wsdl: soapLib.libWsdlMod.WSDL, endpoint: java.lang.String, options: soapLib.libTypesMod.IOptions) = this()
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
  var lastElapsedTime: js.UndefOr[scala.Double] = js.native
  var lastEndpoint: js.UndefOr[java.lang.String] = js.native
  var lastMessage: js.UndefOr[java.lang.String] = js.native
  /** contains last full soap request for client logging */
  var lastRequest: js.UndefOr[java.lang.String] = js.native
  var lastRequestHeaders: js.UndefOr[requestLib.requestMod.Headers] = js.native
  var lastResponse: js.UndefOr[js.Any] = js.native
  var lastResponseHeaders: js.UndefOr[nodeLib.httpMod.IncomingHttpHeaders] = js.native
  var normalizeNames: js.Any = js.native
  var security: js.Any = js.native
  var soapHeaders: js.Any = js.native
  var streamAllowed: js.Any = js.native
  var wsdl: js.Any = js.native
  def addBodyAttribute(bodyAttribute: js.Any): scala.Unit = js.native
  def addBodyAttribute(bodyAttribute: js.Any, name: java.lang.String): scala.Unit = js.native
  def addBodyAttribute(bodyAttribute: js.Any, name: java.lang.String, namespace: java.lang.String): scala.Unit = js.native
  def addBodyAttribute(
    bodyAttribute: js.Any,
    name: java.lang.String,
    namespace: java.lang.String,
    xmlns: java.lang.String
  ): scala.Unit = js.native
  def addHttpHeader(name: java.lang.String, value: js.Any): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /** add soapHeader to soap:Header node */
  def addSoapHeader(soapHeader: js.Any): scala.Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: java.lang.String): scala.Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: java.lang.String, namespace: js.Any): scala.Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: java.lang.String, namespace: js.Any, xmlns: java.lang.String): scala.Double = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any): scala.Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any): scala.Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any, namespace: js.Any): scala.Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any, namespace: js.Any, xmlns: js.Any): scala.Unit = js.native
  def clearBodyAttributes(): scala.Unit = js.native
  def clearHttpHeaders(): scala.Unit = js.native
  /** remove all defined headers */
  def clearSoapHeaders(): scala.Unit = js.native
  /** description of services, ports and methods as a JavaScript object */
  def describe(): js.Any = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(event: soapLib.soapLibStrings.message, message: java.lang.String, eid: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_request(event: soapLib.soapLibStrings.request, xml: java.lang.String, eid: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_response(event: soapLib.soapLibStrings.response, body: js.Any, response: js.Any, eid: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_soapError(event: soapLib.soapLibStrings.soapError, error: js.Any, eid: java.lang.String): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  def getBodyAttributes(): js.Array[_] = js.native
  def getHttpHeaders(): soapLib.libTypesMod.IHeaders = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  /** return all defined headers */
  def getSoapHeaders(): js.Array[java.lang.String] = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /** Emitted before a request is sent, but only the body is passed to the event handler. Useful if you don't want to log /store Soap headers. */
  @JSName("on")
  def on_message(
    event: soapLib.soapLibStrings.message,
    listener: js.Function2[/* message */ java.lang.String, /* eid */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /** Emitted before a request is sent. */
  @JSName("on")
  def on_request(
    event: soapLib.soapLibStrings.request,
    listener: js.Function2[/* xml */ java.lang.String, /* eid */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /** Emitted after a response is received. This is emitted for all responses (both success and errors). */
  @JSName("on")
  def on_response(
    event: soapLib.soapLibStrings.response,
    listener: js.Function3[/* body */ js.Any, /* response */ js.Any, /* eid */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /** Emitted when an erroneous response is received. */
  @JSName("on")
  def on_soapError(
    event: soapLib.soapLibStrings.soapError,
    listener: js.Function2[/* error */ js.Any, /* eid */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /** overwrite the SOAP service endpoint address */
  def setEndpoint(endpoint: java.lang.String): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  def setSOAPAction(SOAPAction: java.lang.String): scala.Unit = js.native
  /** use the specified security protocol */
  def setSecurity(security: soapLib.libTypesMod.ISecurity): scala.Unit = js.native
}

