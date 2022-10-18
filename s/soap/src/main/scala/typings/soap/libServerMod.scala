package typings.soap

import org.scalablytyped.runtime.Instantiable1
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.soap.libTypesMod.IServerOptions
import typings.soap.libTypesMod.IServices
import typings.soap.libWsdlMod.WSDL
import typings.soap.soapStrings.headers
import typings.soap.soapStrings.request
import typings.soap.soapStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServerMod {
  
  @JSImport("soap/lib/server", "Server")
  @js.native
  open class Server protected () extends EventEmitter {
    def this(server: ServerType, path: String, services: IServices, wsdl: WSDL) = this()
    def this(server: ServerType, path: js.RegExp, services: IServices, wsdl: WSDL) = this()
    def this(server: ServerType, path: String, services: IServices, wsdl: WSDL, options: IServerOptions) = this()
    def this(server: ServerType, path: js.RegExp, services: IServices, wsdl: WSDL, options: IServerOptions) = this()
    
    /* private */ var _envelope: Any = js.native
    
    /* private */ var _executeMethod: Any = js.native
    
    /* private */ var _getMethodNameBySoapAction: Any = js.native
    
    /* private */ var _getSoapAction: Any = js.native
    
    /* private */ var _initializeOptions: Any = js.native
    
    /* private */ var _process: Any = js.native
    
    /* private */ var _processRequestXml: Any = js.native
    
    /* private */ var _processSoapHeader: Any = js.native
    
    /* private */ var _requestListener: Any = js.native
    
    /* private */ var _sendError: Any = js.native
    
    /* private */ var _sendHttpResponse: Any = js.native
    
    def addSoapHeader(soapHeader: Any): Double = js.native
    def addSoapHeader(soapHeader: Any, name: String): Double = js.native
    def addSoapHeader(soapHeader: Any, name: String, namespace: Any): Double = js.native
    def addSoapHeader(soapHeader: Any, name: String, namespace: Any, xmlns: String): Double = js.native
    def addSoapHeader(soapHeader: Any, name: String, namespace: Unit, xmlns: String): Double = js.native
    def addSoapHeader(soapHeader: Any, name: Unit, namespace: Any): Double = js.native
    def addSoapHeader(soapHeader: Any, name: Unit, namespace: Any, xmlns: String): Double = js.native
    def addSoapHeader(soapHeader: Any, name: Unit, namespace: Unit, xmlns: String): Double = js.native
    
    def authenticate(security: Any): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: Any, processAuthResult: js.Function1[/* result */ Boolean, Unit]): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: Any, processAuthResult: js.Function1[/* result */ Boolean, Unit], req: Unit, obj: Any): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: Any, processAuthResult: js.Function1[/* result */ Boolean, Unit], req: Request): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: Any, processAuthResult: js.Function1[/* result */ Boolean, Unit], req: Request, obj: Any): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: Any, processAuthResult: Unit, req: Unit, obj: Any): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: Any, processAuthResult: Unit, req: Request): Boolean | Unit | js.Promise[Boolean] = js.native
    def authenticate(security: Any, processAuthResult: Unit, req: Request, obj: Any): Boolean | Unit | js.Promise[Boolean] = js.native
    
    def authorizeConnection(req: Request): Boolean = js.native
    def authorizeConnection(req: Request, res: Response): Boolean = js.native
    
    /* private */ var callback: Any = js.native
    
    def changeSoapHeader(index: Any, soapHeader: Any): Unit = js.native
    def changeSoapHeader(index: Any, soapHeader: Any, name: Any): Unit = js.native
    def changeSoapHeader(index: Any, soapHeader: Any, name: Any, namespace: Any): Unit = js.native
    def changeSoapHeader(index: Any, soapHeader: Any, name: Any, namespace: Any, xmlns: Any): Unit = js.native
    def changeSoapHeader(index: Any, soapHeader: Any, name: Any, namespace: Unit, xmlns: Any): Unit = js.native
    def changeSoapHeader(index: Any, soapHeader: Any, name: Unit, namespace: Any): Unit = js.native
    def changeSoapHeader(index: Any, soapHeader: Any, name: Unit, namespace: Any, xmlns: Any): Unit = js.native
    def changeSoapHeader(index: Any, soapHeader: Any, name: Unit, namespace: Unit, xmlns: Any): Unit = js.native
    
    def clearSoapHeaders(): Unit = js.native
    
    @JSName("emit")
    def emit_headers(event: headers, headers: Any, methodName: String): Boolean = js.native
    @JSName("emit")
    def emit_request(event: request, request: Any, methodName: String): Boolean = js.native
    @JSName("emit")
    def emit_response(event: response, headers: Any, methodName: String): Boolean = js.native
    
    /* private */ var enableChunkedEncoding: Any = js.native
    
    def getSoapHeaders(): js.Array[String] = js.native
    
    def log(`type`: String, data: Any): Any = js.native
    
    /** Emitted when the SOAP Headers are not empty. */
    @JSName("on")
    def on_headers(event: headers, listener: js.Function2[/* headers */ Any, /* methodName */ String, Unit]): this.type = js.native
    /** Emitted for every received messages. */
    @JSName("on")
    def on_request(event: request, listener: js.Function2[/* request */ Any, /* methodName */ String, Unit]): this.type = js.native
    /** Emitted before sending SOAP response. */
    @JSName("on")
    def on_response(event: response, listener: js.Function2[/* response */ Any, /* methodName */ String, Unit]): this.type = js.native
    
    /* private */ var onewayOptions: Any = js.native
    
    var path: String | js.RegExp = js.native
    
    /* private */ var returnFault: Any = js.native
    
    var services: IServices = js.native
    
    /* private */ var soapHeaders: Any = js.native
    
    /* private */ var suppressStack: Any = js.native
    
    /* private */ var wsdl: Any = js.native
  }
  
  trait IExpressApp extends StObject {
    
    var route: Any
    
    var use: Any
  }
  object IExpressApp {
    
    inline def apply(route: Any, use: Any): IExpressApp = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExpressApp]
    }
    
    extension [Self <: IExpressApp](x: Self) {
      
      inline def setRoute(value: Any): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setUse(value: Any): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Request extends IncomingMessage {
    
    var body: js.UndefOr[Any] = js.native
  }
  
  type Response = ServerResponse[IncomingMessage]
  
  type ServerType = (typings.node.httpMod.Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]) | IExpressApp
}
