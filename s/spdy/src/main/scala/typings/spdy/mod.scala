package typings.spdy

import typings.node.tlsMod.TlsOptions
import typings.spdy.anon.Connection
import typings.spdy.anon.Plain
import typings.spdy.mod.agent.Agent
import typings.spdy.mod.server.Server
import typings.spdy.mod.socket.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object agent {
    
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
    
    @JSImport("spdy", "agent.create")
    @js.native
    def create(base: js.Any, options: typings.spdy.mod.agent.AgentOptions): Agent | typings.spdy.mod.agent.PlainAgent = js.native
    
    @js.native
    trait AgentOptions
      extends typings.node.httpsMod.AgentOptions {
      
      var spdy: js.UndefOr[Plain] = js.native
    }
    object AgentOptions {
      
      @scala.inline
      def apply(): typings.spdy.mod.agent.AgentOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.spdy.mod.agent.AgentOptions]
      }
      
      @scala.inline
      implicit class AgentOptionsMutableBuilder[Self <: typings.spdy.mod.agent.AgentOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSpdy(value: Plain): Self = StObject.set(x, "spdy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpdyUndefined: Self = StObject.set(x, "spdy", js.undefined)
      }
    }
  }
  
  @JSImport("spdy", "createAgent")
  @js.native
  def createAgent(base: js.Any, options: AgentOptions): Agent_ | PlainAgent = js.native
  @JSImport("spdy", "createAgent")
  @js.native
  def createAgent(options: AgentOptions): Agent_ | PlainAgent = js.native
  
  @JSImport("spdy", "createServer")
  @js.native
  def createServer(
    base: js.Any,
    options: ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server_ = js.native
  @JSImport("spdy", "createServer")
  @js.native
  def createServer(
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server_ = js.native
  @JSImport("spdy", "createServer")
  @js.native
  def createServer(
    options: ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server_ = js.native
  
  object request {
    
    @JSImport("spdy", "request.onNewListener")
    @js.native
    def onNewListener(`type`: String): Unit = js.native
  }
  
  object response {
    
    @JSImport("spdy", "response.end")
    @js.native
    def end(data: js.Any, encoding: String, callback: js.Function0[Unit]): Unit = js.native
    
    @JSImport("spdy", "response.writeHead")
    @js.native
    def writeHead(statusCode: Double, obj: js.Object): Unit = js.native
    @JSImport("spdy", "response.writeHead")
    @js.native
    def writeHead(statusCode: Double, reason: String, obj: js.Object): Unit = js.native
  }
  
  object server {
    
    @JSImport("spdy", "server.create")
    @js.native
    def create(
      base: js.Any,
      options: typings.node.httpsMod.ServerOptions,
      handler: js.Function2[
          /* request */ typings.spdy.mod.server.IncomingMessage, 
          /* response */ typings.spdy.mod.server.ServerResponse | typings.node.httpMod.ServerResponse, 
          Unit
        ]
    ): Server = js.native
    @JSImport("spdy", "server.create")
    @js.native
    def create(
      handler: js.Function2[
          /* request */ typings.spdy.mod.server.IncomingMessage, 
          /* response */ typings.spdy.mod.server.ServerResponse | typings.node.httpMod.ServerResponse, 
          Unit
        ]
    ): Server = js.native
    @JSImport("spdy", "server.create")
    @js.native
    def create(
      options: typings.node.httpsMod.ServerOptions,
      handler: js.Function2[
          /* request */ typings.spdy.mod.server.IncomingMessage, 
          /* response */ typings.node.httpMod.ServerResponse, 
          Unit
        ]
    ): Server = js.native
    
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
      
      @scala.inline
      def h2: typings.spdy.spdyStrings.h2 = "h2".asInstanceOf[typings.spdy.spdyStrings.h2]
      
      @scala.inline
      def httpSlash1Dot0: typings.spdy.spdyStrings.httpSlash1Dot0 = "http/1.0".asInstanceOf[typings.spdy.spdyStrings.httpSlash1Dot0]
      
      @scala.inline
      def httpSlash1Dot1: typings.spdy.spdyStrings.httpSlash1Dot1 = "http/1.1".asInstanceOf[typings.spdy.spdyStrings.httpSlash1Dot1]
      
      @scala.inline
      def spdySlash2: typings.spdy.spdyStrings.spdySlash2 = "spdy/2".asInstanceOf[typings.spdy.spdyStrings.spdySlash2]
      
      @scala.inline
      def spdySlash3: typings.spdy.spdyStrings.spdySlash3 = "spdy/3".asInstanceOf[typings.spdy.spdyStrings.spdySlash3]
      
      @scala.inline
      def spdySlash3Dot1: typings.spdy.spdyStrings.spdySlash3Dot1 = "spdy/3.1".asInstanceOf[typings.spdy.spdyStrings.spdySlash3Dot1]
    }
    
    @js.native
    trait PushOptions extends StObject {
      
      var method: js.UndefOr[String] = js.native
      
      var request: js.UndefOr[js.Any] = js.native
      
      var response: js.UndefOr[js.Any] = js.native
      
      var status: js.UndefOr[Double] = js.native
    }
    object PushOptions {
      
      @scala.inline
      def apply(): PushOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PushOptions]
      }
      
      @scala.inline
      implicit class PushOptionsMutableBuilder[Self <: PushOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        @scala.inline
        def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
        
        @scala.inline
        def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
        
        @scala.inline
        def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    type Server = typings.node.httpsMod.Server
    
    @js.native
    trait ServerOptions
      extends TlsOptions
         with typings.node.httpMod.ServerOptions {
      
      var spdy: js.UndefOr[Connection] = js.native
    }
    object ServerOptions {
      
      @scala.inline
      def apply(): typings.spdy.mod.server.ServerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.spdy.mod.server.ServerOptions]
      }
      
      @scala.inline
      implicit class ServerOptionsMutableBuilder[Self <: typings.spdy.mod.server.ServerOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSpdy(value: Connection): Self = StObject.set(x, "spdy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpdyUndefined: Self = StObject.set(x, "spdy", js.undefined)
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
    @js.native
    trait Socket extends StObject
  }
}
