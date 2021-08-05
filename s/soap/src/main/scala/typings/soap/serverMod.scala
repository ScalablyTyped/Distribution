package typings.soap

import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.soap.soapStrings.headers
import typings.soap.soapStrings.request
import typings.soap.soapStrings.response
import typings.soap.typesMod.IServerOptions
import typings.soap.typesMod.IServices
import typings.soap.wsdlMod.WSDL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("soap/lib/server", "Server")
  @js.native
  class Server protected () extends EventEmitter {
    def this(server: ServerType, path: String, services: IServices, wsdl: WSDL) = this()
    def this(server: ServerType, path: String, services: IServices, wsdl: WSDL, options: IServerOptions) = this()
    
    /* private */ var _envelope: js.Any = js.native
    
    /* private */ var _executeMethod: js.Any = js.native
    
    /* private */ var _initializeOptions: js.Any = js.native
    
    /* private */ var _process: js.Any = js.native
    
    /* private */ var _processRequestXml: js.Any = js.native
    
    /* private */ var _processSoapHeader: js.Any = js.native
    
    /* private */ var _requestListener: js.Any = js.native
    
    /* private */ var _sendError: js.Any = js.native
    
    /* private */ var _sendHttpResponse: js.Any = js.native
    
    def addSoapHeader(soapHeader: js.Any): Double = js.native
    def addSoapHeader(soapHeader: js.Any, name: String): Double = js.native
    def addSoapHeader(soapHeader: js.Any, name: String, namespace: js.Any): Double = js.native
    def addSoapHeader(soapHeader: js.Any, name: String, namespace: js.Any, xmlns: String): Double = js.native
    def addSoapHeader(soapHeader: js.Any, name: String, namespace: Unit, xmlns: String): Double = js.native
    def addSoapHeader(soapHeader: js.Any, name: Unit, namespace: js.Any): Double = js.native
    def addSoapHeader(soapHeader: js.Any, name: Unit, namespace: js.Any, xmlns: String): Double = js.native
    def addSoapHeader(soapHeader: js.Any, name: Unit, namespace: Unit, xmlns: String): Double = js.native
    
    def authenticate(security: js.Any): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: js.Any, processAuthResult: js.Function1[/* result */ Boolean, Unit]): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(
      security: js.Any,
      processAuthResult: js.Function1[/* result */ Boolean, Unit],
      req: Unit,
      obj: js.Any
    ): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: js.Any, processAuthResult: js.Function1[/* result */ Boolean, Unit], req: Request): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(
      security: js.Any,
      processAuthResult: js.Function1[/* result */ Boolean, Unit],
      req: Request,
      obj: js.Any
    ): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: js.Any, processAuthResult: Unit, req: Unit, obj: js.Any): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: js.Any, processAuthResult: Unit, req: Request): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: js.Any, processAuthResult: Unit, req: Request, obj: js.Any): Boolean | Unit | js.Promise[Boolean] = js.native
    
    def authorizeConnection(req: Request): Boolean = js.native
    def authorizeConnection(req: Request, res: Response): Boolean = js.native
    
    /* private */ var callback: js.Any = js.native
    
    def changeSoapHeader(index: js.Any, soapHeader: js.Any): Unit = js.native
    def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any): Unit = js.native
    def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any, namespace: js.Any): Unit = js.native
    def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any, namespace: js.Any, xmlns: js.Any): Unit = js.native
    def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any, namespace: Unit, xmlns: js.Any): Unit = js.native
    def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: Unit, namespace: js.Any): Unit = js.native
    def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: Unit, namespace: js.Any, xmlns: js.Any): Unit = js.native
    def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: Unit, namespace: Unit, xmlns: js.Any): Unit = js.native
    
    def clearSoapHeaders(): Unit = js.native
    
    @JSName("emit")
    def emit_headers(event: headers, headers: js.Any, methodName: String): Boolean = js.native
    @JSName("emit")
    def emit_request(event: request, request: js.Any, methodName: String): Boolean = js.native
    @JSName("emit")
    def emit_response(event: response, headers: js.Any, methodName: String): Boolean = js.native
    
    /* private */ var enableChunkedEncoding: js.Any = js.native
    
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
    
    /* private */ var onewayOptions: js.Any = js.native
    
    var path: String = js.native
    
    /* private */ var returnFault: js.Any = js.native
    
    var services: IServices = js.native
    
    /* private */ var soapHeaders: js.Any = js.native
    
    /* private */ var suppressStack: js.Any = js.native
    
    /* private */ var wsdl: js.Any = js.native
  }
  
  trait IExpressApp extends StObject {
    
    var route: js.Any
    
    var use: js.Any
  }
  object IExpressApp {
    
    inline def apply(route: js.Any, use: js.Any): IExpressApp = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExpressApp]
    }
    
    extension [Self <: IExpressApp](x: Self) {
      
      inline def setRoute(value: js.Any): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setUse(value: js.Any): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Request extends IncomingMessage {
    
    var body: js.UndefOr[js.Any] = js.native
  }
  
  type Response = ServerResponse
  
  type ServerType = typings.node.httpMod.Server | IExpressApp
}
