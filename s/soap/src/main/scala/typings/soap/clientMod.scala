package typings.soap

import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingHttpHeaders
import typings.soap.soapStrings.message
import typings.soap.soapStrings.request
import typings.soap.soapStrings.response
import typings.soap.soapStrings.soapError
import typings.soap.typesMod.IHeaders
import typings.soap.typesMod.IMTOMAttachments
import typings.soap.typesMod.IOptions
import typings.soap.typesMod.ISecurity
import typings.soap.wsdlMod.WSDL
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @JSImport("soap/lib/client", "Client")
  @js.native
  open class Client protected () extends EventEmitter {
    def this(wsdl: WSDL) = this()
    def this(wsdl: WSDL, endpoint: String) = this()
    def this(wsdl: WSDL, endpoint: String, options: IOptions) = this()
    def this(wsdl: WSDL, endpoint: Unit, options: IOptions) = this()
    
    /* private */ var SOAPAction: Any = js.native
    
    /* private */ var _defineMethod: Any = js.native
    
    /* private */ var _definePort: Any = js.native
    
    /* private */ var _defineService: Any = js.native
    
    /* private */ var _initializeOptions: Any = js.native
    
    /* private */ var _initializeServices: Any = js.native
    
    /* private */ var _invoke: Any = js.native
    
    /* private */ var _processSoapHeader: Any = js.native
    
    /* private */ var _promisifyMethod: Any = js.native
    
    def addBodyAttribute(bodyAttribute: Any): Unit = js.native
    def addBodyAttribute(bodyAttribute: Any, name: String): Unit = js.native
    def addBodyAttribute(bodyAttribute: Any, name: String, namespace: String): Unit = js.native
    def addBodyAttribute(bodyAttribute: Any, name: String, namespace: String, xmlns: String): Unit = js.native
    def addBodyAttribute(bodyAttribute: Any, name: String, namespace: Unit, xmlns: String): Unit = js.native
    def addBodyAttribute(bodyAttribute: Any, name: Unit, namespace: String): Unit = js.native
    def addBodyAttribute(bodyAttribute: Any, name: Unit, namespace: String, xmlns: String): Unit = js.native
    def addBodyAttribute(bodyAttribute: Any, name: Unit, namespace: Unit, xmlns: String): Unit = js.native
    
    def addHttpHeader(name: String, value: Any): Unit = js.native
    
    /** add soapHeader to soap:Header node */
    def addSoapHeader(soapHeader: Any): Double = js.native
    def addSoapHeader(soapHeader: Any, name: String): Double = js.native
    def addSoapHeader(soapHeader: Any, name: String, namespace: Any): Double = js.native
    def addSoapHeader(soapHeader: Any, name: String, namespace: Any, xmlns: String): Double = js.native
    def addSoapHeader(soapHeader: Any, name: String, namespace: Unit, xmlns: String): Double = js.native
    def addSoapHeader(soapHeader: Any, name: Unit, namespace: Any): Double = js.native
    def addSoapHeader(soapHeader: Any, name: Unit, namespace: Any, xmlns: String): Double = js.native
    def addSoapHeader(soapHeader: Any, name: Unit, namespace: Unit, xmlns: String): Double = js.native
    
    /* private */ var bodyAttributes: Any = js.native
    
    def changeSoapHeader(index: Any, soapHeader: Any): Unit = js.native
    def changeSoapHeader(index: Any, soapHeader: Any, name: Any): Unit = js.native
    def changeSoapHeader(index: Any, soapHeader: Any, name: Any, namespace: Any): Unit = js.native
    def changeSoapHeader(index: Any, soapHeader: Any, name: Any, namespace: Any, xmlns: Any): Unit = js.native
    def changeSoapHeader(index: Any, soapHeader: Any, name: Any, namespace: Unit, xmlns: Any): Unit = js.native
    def changeSoapHeader(index: Any, soapHeader: Any, name: Unit, namespace: Any): Unit = js.native
    def changeSoapHeader(index: Any, soapHeader: Any, name: Unit, namespace: Any, xmlns: Any): Unit = js.native
    def changeSoapHeader(index: Any, soapHeader: Any, name: Unit, namespace: Unit, xmlns: Any): Unit = js.native
    
    def clearBodyAttributes(): Unit = js.native
    
    def clearHttpHeaders(): Unit = js.native
    
    /** remove all defined headers */
    def clearSoapHeaders(): Unit = js.native
    
    /** description of services, ports and methods as a JavaScript object */
    def describe(): Any = js.native
    
    @JSName("emit")
    def emit_message(event: message, message: String, eid: String): Boolean = js.native
    @JSName("emit")
    def emit_request(event: request, xml: String, eid: String): Boolean = js.native
    @JSName("emit")
    def emit_response(event: response, body: Any, response: Any, eid: String): Boolean = js.native
    @JSName("emit")
    def emit_soapError(event: soapError, error: Any, eid: String): Boolean = js.native
    
    /* private */ var endpoint: Any = js.native
    
    def getBodyAttributes(): js.Array[Any] = js.native
    
    def getHttpHeaders(): IHeaders = js.native
    
    /** return all defined headers */
    def getSoapHeaders(): js.Array[String] = js.native
    
    /* private */ var httpClient: Any = js.native
    
    /* private */ var httpHeaders: Any = js.native
    
    var lastElapsedTime: js.UndefOr[Double] = js.native
    
    var lastEndpoint: js.UndefOr[String] = js.native
    
    var lastMessage: js.UndefOr[String] = js.native
    
    /** contains last full soap request for client logging */
    var lastRequest: js.UndefOr[String] = js.native
    
    var lastRequestHeaders: js.UndefOr[Any] = js.native
    
    var lastResponse: js.UndefOr[Any] = js.native
    
    var lastResponseAttachments: IMTOMAttachments = js.native
    
    var lastResponseHeaders: js.UndefOr[IncomingHttpHeaders] = js.native
    
    /* private */ var normalizeNames: Any = js.native
    
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
      listener: js.Function3[/* body */ Any, /* response */ Any, /* eid */ String, Unit]
    ): this.type = js.native
    /** Emitted when an erroneous response is received. */
    @JSName("on")
    def on_soapError(event: soapError, listener: js.Function2[/* error */ Any, /* eid */ String, Unit]): this.type = js.native
    
    /* private */ var overridePromiseSuffix: Any = js.native
    
    /* private */ var returnSaxStream: Any = js.native
    
    /* private */ var security: Any = js.native
    
    /** overwrite the SOAP service endpoint address */
    def setEndpoint(endpoint: String): Unit = js.native
    
    def setSOAPAction(SOAPAction: String): Unit = js.native
    
    /** use the specified security protocol */
    def setSecurity(security: ISecurity): Unit = js.native
    
    /* private */ var soapHeaders: Any = js.native
    
    /* private */ var streamAllowed: Any = js.native
    
    var wsdl: WSDL = js.native
  }
  
  trait ISoapError
    extends StObject
       with Error {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var response: js.UndefOr[Any] = js.undefined
  }
  object ISoapError {
    
    inline def apply(message: String, name: String): ISoapError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISoapError]
    }
    
    extension [Self <: ISoapError](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
}
