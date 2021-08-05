package typings.spdy

import typings.spdy.anon.Connection
import typings.spdy.anon.Plain
import typings.spdy.mod.agent.Agent
import typings.spdy.mod.server.Server
import typings.spdy.mod.socket.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spdy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object agent {
    
    @JSImport("spdy", "agent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("spdy", "agent.Agent")
    @js.native
    class Agent ()
      extends typings.node.httpsMod.Agent {
      def this(options: typings.node.httpsMod.AgentOptions) = this()
    }
    
    @JSImport("spdy", "agent.PlainAgent")
    @js.native
    class PlainAgent ()
      extends typings.node.httpMod.Agent {
      def this(opts: typings.node.httpMod.AgentOptions) = this()
    }
    
    inline def create(base: js.Any, options: typings.spdy.mod.agent.AgentOptions): Agent | typings.spdy.mod.agent.PlainAgent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Agent | typings.spdy.mod.agent.PlainAgent]
    
    trait AgentOptions
      extends StObject
         with typings.node.httpsMod.AgentOptions {
      
      var spdy: js.UndefOr[Plain] = js.undefined
    }
    object AgentOptions {
      
      inline def apply(): typings.spdy.mod.agent.AgentOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.spdy.mod.agent.AgentOptions]
      }
      
      extension [Self <: typings.spdy.mod.agent.AgentOptions](x: Self) {
        
        inline def setSpdy(value: Plain): Self = StObject.set(x, "spdy", value.asInstanceOf[js.Any])
        
        inline def setSpdyUndefined: Self = StObject.set(x, "spdy", js.undefined)
      }
    }
  }
  
  inline def createAgent(base: js.Any, options: AgentOptions): Agent_ | PlainAgent = (^.asInstanceOf[js.Dynamic].applyDynamic("createAgent")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Agent_ | PlainAgent]
  inline def createAgent(options: AgentOptions): Agent_ | PlainAgent = ^.asInstanceOf[js.Dynamic].applyDynamic("createAgent")(options.asInstanceOf[js.Any]).asInstanceOf[Agent_ | PlainAgent]
  
  inline def createServer(
    base: js.Any,
    options: ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Server_]
  inline def createServer(
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(handler.asInstanceOf[js.Any]).asInstanceOf[Server_]
  inline def createServer(
    options: ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Server_]
  
  object request {
    
    @JSImport("spdy", "request")
    @js.native
    val ^ : js.Any = js.native
    
    inline def onNewListener(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNewListener")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object response {
    
    @JSImport("spdy", "response")
    @js.native
    val ^ : js.Any = js.native
    
    inline def end(data: js.Any, encoding: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("end")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def writeHead(statusCode: Double, obj: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeHead")(statusCode.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeHead(statusCode: Double, reason: String, obj: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeHead")(statusCode.asInstanceOf[js.Any], reason.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object server {
    
    @JSImport("spdy", "server")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(
      base: js.Any,
      options: typings.node.httpsMod.ServerOptions,
      handler: js.Function2[
          /* request */ typings.spdy.mod.server.IncomingMessage, 
          /* response */ typings.spdy.mod.server.ServerResponse | typings.node.httpMod.ServerResponse, 
          Unit
        ]
    ): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Server]
    inline def create(
      handler: js.Function2[
          /* request */ typings.spdy.mod.server.IncomingMessage, 
          /* response */ typings.spdy.mod.server.ServerResponse | typings.node.httpMod.ServerResponse, 
          Unit
        ]
    ): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(handler.asInstanceOf[js.Any]).asInstanceOf[Server]
    inline def create(
      options: typings.node.httpsMod.ServerOptions,
      handler: js.Function2[
          /* request */ typings.spdy.mod.server.IncomingMessage, 
          /* response */ typings.node.httpMod.ServerResponse, 
          Unit
        ]
    ): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Server]
    
    type IncomingMessage = typings.node.httpMod.IncomingMessage
    
    type PlainServer = typings.node.httpMod.Server
    
    /* Rewritten from type alias, can be one of: 
      - typings.spdy.spdyStrings.h2
      - typings.spdy.spdyStrings.spdySlash3Dot1
      - typings.spdy.spdyStrings.spdySlash3
      - typings.spdy.spdyStrings.spdySlash2
      - typings.spdy.spdyStrings.httpSlash1Dot1
      - typings.spdy.spdyStrings.httpSlash1Dot0
    */
    trait Protocol extends StObject
    object Protocol {
      
      inline def h2: typings.spdy.spdyStrings.h2 = "h2".asInstanceOf[typings.spdy.spdyStrings.h2]
      
      inline def httpSlash1Dot0: typings.spdy.spdyStrings.httpSlash1Dot0 = "http/1.0".asInstanceOf[typings.spdy.spdyStrings.httpSlash1Dot0]
      
      inline def httpSlash1Dot1: typings.spdy.spdyStrings.httpSlash1Dot1 = "http/1.1".asInstanceOf[typings.spdy.spdyStrings.httpSlash1Dot1]
      
      inline def spdySlash2: typings.spdy.spdyStrings.spdySlash2 = "spdy/2".asInstanceOf[typings.spdy.spdyStrings.spdySlash2]
      
      inline def spdySlash3: typings.spdy.spdyStrings.spdySlash3 = "spdy/3".asInstanceOf[typings.spdy.spdyStrings.spdySlash3]
      
      inline def spdySlash3Dot1: typings.spdy.spdyStrings.spdySlash3Dot1 = "spdy/3.1".asInstanceOf[typings.spdy.spdyStrings.spdySlash3Dot1]
    }
    
    trait PushOptions extends StObject {
      
      var method: js.UndefOr[String] = js.undefined
      
      var request: js.UndefOr[js.Any] = js.undefined
      
      var response: js.UndefOr[js.Any] = js.undefined
      
      var status: js.UndefOr[Double] = js.undefined
    }
    object PushOptions {
      
      inline def apply(): PushOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PushOptions]
      }
      
      extension [Self <: PushOptions](x: Self) {
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        inline def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
        
        inline def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
        
        inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    type Server = typings.node.httpsMod.Server
    
    trait ServerOptions
      extends StObject
         with typings.node.httpsMod.ServerOptions {
      
      var spdy: js.UndefOr[Connection] = js.undefined
    }
    object ServerOptions {
      
      inline def apply(): typings.spdy.mod.server.ServerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.spdy.mod.server.ServerOptions]
      }
      
      extension [Self <: typings.spdy.mod.server.ServerOptions](x: Self) {
        
        inline def setSpdy(value: Connection): Self = StObject.set(x, "spdy", value.asInstanceOf[js.Any])
        
        inline def setSpdyUndefined: Self = StObject.set(x, "spdy", js.undefined)
      }
    }
    
    @js.native
    trait ServerResponse
      extends typings.node.httpMod.ServerResponse {
      
      def push(filename: String, options: PushOptions): js.Any = js.native
    }
  }
  
  type AgentOptions = typings.spdy.mod.agent.AgentOptions
  
  type Agent_ = Agent
  
  @js.native
  trait Handle extends StObject {
    
    def assignClientRequest(req: js.Any): Unit = js.native
    
    def assignRequest(req: js.Any): Unit = js.native
    
    def assignResponse(res: js.Any): Unit = js.native
    
    def assignSocket(socket: Socket_, options: js.Object): Unit = js.native
    
    def create(options: js.Object, stream: js.Any, socket: Socket_): Handle = js.native
    
    def emitRequest(): Unit = js.native
    
    def emitResponse(status: js.Any, headers: js.Any): Unit = js.native
    
    def getStream(): js.Any = js.native
    def getStream(callback: js.Function1[/* stream */ js.Any, Unit]): js.Any = js.native
  }
  
  type IncomingMessage = typings.spdy.mod.server.IncomingMessage
  
  type PlainAgent = typings.spdy.mod.agent.PlainAgent
  
  type PlainServer = typings.spdy.mod.server.PlainServer
  
  type ServerOptions = typings.spdy.mod.server.ServerOptions
  
  type ServerRequest = typings.spdy.mod.server.IncomingMessage
  
  type ServerResponse = typings.spdy.mod.server.ServerResponse
  
  type Server_ = Server
  
  type Socket_ = Socket
  
  object socket {
    
    // tslint:disable-next-line no-empty-interface
    trait Socket extends StObject
  }
}
