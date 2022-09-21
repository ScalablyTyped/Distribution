package typings.roadsServer

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import typings.roads.mod.Response
import typings.roads.mod.Road
import typings.roadsServer.anon.Enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpServerMod {
  
  @JSImport("roads-server/types/httpServer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Server {
    /**
      * Constructs a new Server object that helps create Roads servers.
      *
      * @todo  tests
      * @param {Roads} road The Road that handles all the routes
      * @param {Function} error_handler An overwrite to the standard error handler. Accepts a single parameter (the error) and should return a Roads.Response object.
      * @param {Object} httpsOptions HTTPS servers require additional data. You can pass all of those parameters here. Valid values can be found in the node docs: https://nodejs.org/api/https.html#https_https_createserver_options_requestlistener
      */
    def this(road: Road) = this()
    def this(road: Road, error_handler: js.Function) = this()
    def this(road: Road, error_handler: js.Function, options: RoadsServerOptions) = this()
    def this(road: Road, error_handler: Unit, options: RoadsServerOptions) = this()
  }
  
  trait RoadsServerOptions extends StObject {
    
    var https: js.UndefOr[Enabled] = js.undefined
    
    var maxRequestBodySize: js.UndefOr[Double] = js.undefined
  }
  object RoadsServerOptions {
    
    inline def apply(): RoadsServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoadsServerOptions]
    }
    
    extension [Self <: RoadsServerOptions](x: Self) {
      
      inline def setHttps(value: Enabled): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      inline def setMaxRequestBodySize(value: Double): Self = StObject.set(x, "maxRequestBodySize", value.asInstanceOf[js.Any])
      
      inline def setMaxRequestBodySizeUndefined: Self = StObject.set(x, "maxRequestBodySize", js.undefined)
    }
  }
  
  @js.native
  trait Server extends StObject {
    
    /**
      * If set, this holds the custom error handler defined by the user in the constructor
      *
      * @type null|function
      */
    /* protected */ var custom_error_handler: js.UndefOr[js.Function] = js.native
    
    /**
      * Standard logic to handle any errors thrown in the roads request.
      * If a custom error handler was provided in the constructor, it will use that. Otherwise
      * it will fall back to the roads default logic.
      *
      * The roads default logic is
      *  - If the error is a roads.HttpError, display the error message and status code exactly as thrown.
      *  - If the error is anything else, display a 500 error with the message "Server Error: ".
      *
      * @param  HTTPResponse http_response
      * @param  Error error
      */
    /* protected */ def error_handler(http_response: ServerResponse[IncomingMessage], error: js.Error): Unit = js.native
    
    /**
      * Start the http server.
      *
      * @param int port
      * @param string host
      */
    def listen(port: Double, host: String): Unit = js.native
    def listen(port: Double, host: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    /**
      * The maximum sizze we should allow for any incoming request body. We will stop reading incoming data at this point.
      */
    /* protected */ var maxRequestBodySize: Double = js.native
    
    /**
      * Standard logic for turning each request into a road request, and communicating the response
      * back to the client
      *
      * @param  HTTPRequest http_request
      * @param  HTTPResponse http_response
      */
    /* protected */ def onRequest(http_request: IncomingMessage, http_response: ServerResponse[IncomingMessage]): Unit = js.native
    
    /**
      * This is the road object that will handle all requests
      * @type Road
      */
    /* protected */ var road: Road = js.native
    
    /**
      * Helper function to write a roads Response object to an HTTPResponse object
      *
      * @param  HTTPResponse http_response
      * @param  Response response
      */
    /* protected */ def sendResponse(http_response: ServerResponse[IncomingMessage], response: Response): Unit = js.native
    
    /**
      * This is the node.js http server from the http library.
      * @todo  support HTTPS
      * @type HTTPServer
      */
    /* protected */ var server: (typings.node.httpMod.Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ]) | (typings.node.httpsMod.Server[
        Instantiable1[/* socket */ Socket, typings.node.nodeHttpMod.IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          typings.node.nodeHttpMod.ServerResponse[IncomingMessage]
        ]
      ]) = js.native
  }
}
