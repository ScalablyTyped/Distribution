package typings.requestStats

import org.scalablytyped.runtime.Instantiable1
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import typings.requestStats.anon.Bytes
import typings.requestStats.anon.BytesDelta
import typings.requestStats.anon.Headers
import typings.requestStats.anon.Speed
import typings.requestStats.requestStatsStrings.complete
import typings.requestStats.requestStatsStrings.request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Attach request-stats to a single HTTP request.
    * If no callback is provided, you can later attach a listener on the "complete" event.
    *
    * @param req An instance of a HTTP request.
    * @param res An instance of a HTTP response.
    * @param statsCallback A callback which will be called with a stats object when the HTTP request completes.
    */
  inline def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage]): StatsEmitter = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[StatsEmitter]
  inline def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage], statsCallback: StatsCallback): StatsEmitter = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], statsCallback.asInstanceOf[js.Any])).asInstanceOf[StatsEmitter]
  /**
    * Attach request-stats to a HTTP server.
    * If no callback is provided, you can later attach a listener on the "complete" event.
    *
    * @param server Initialize request-stats with an instance a HTTP server.
    * @param statsCallback A callback which will be called for each completed HTTP request with a stats object.
    */
  inline def apply(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): StatsEmitter = ^.asInstanceOf[js.Dynamic].apply(server.asInstanceOf[js.Any]).asInstanceOf[StatsEmitter]
  inline def apply(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    statsCallback: StatsCallback
  ): StatsEmitter = (^.asInstanceOf[js.Dynamic].apply(server.asInstanceOf[js.Any], statsCallback.asInstanceOf[js.Any])).asInstanceOf[StatsEmitter]
  inline def apply(
    server: typings.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typings.node.nodeHttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeHttpMod.ServerResponse[IncomingMessage]
      ]
    ]
  ): StatsEmitter = ^.asInstanceOf[js.Dynamic].apply(server.asInstanceOf[js.Any]).asInstanceOf[StatsEmitter]
  inline def apply(
    server: typings.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typings.node.nodeHttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeHttpMod.ServerResponse[IncomingMessage]
      ]
    ],
    statsCallback: StatsCallback
  ): StatsEmitter = (^.asInstanceOf[js.Dynamic].apply(server.asInstanceOf[js.Any], statsCallback.asInstanceOf[js.Any])).asInstanceOf[StatsEmitter]
  
  @JSImport("request-stats", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Progress extends StObject {
    
    /**
      * `false` if the request is still in progress
      */
    var completed: Boolean
    
    var req: BytesDelta
    
    var res: Speed
    
    /**
      * The total time the reuqest have been in progress
      */
    var time: Double
    
    /**
      * The time since previous call to `.progress()`
      */
    var timeDelta: Double
  }
  object Progress {
    
    inline def apply(completed: Boolean, req: BytesDelta, res: Speed, time: Double, timeDelta: Double): Progress = {
      val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeDelta = timeDelta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Progress]
    }
    
    extension [Self <: Progress](x: Self) {
      
      inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setReq(value: BytesDelta): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRes(value: Speed): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeDelta(value: Double): Self = StObject.set(x, "timeDelta", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request extends StObject {
    
    /**
      * Returns a progress object if called while a HTTP request is in progress.
      * If called multiple times, the returned progress object will contain the delta of the previous
      * call to `.progress()`.
      */
    def progress(): Progress
  }
  object Request {
    
    inline def apply(progress: () => Progress): Request = {
      val __obj = js.Dynamic.literal(progress = js.Any.fromFunction0(progress))
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setProgress(value: () => Progress): Self = StObject.set(x, "progress", js.Any.fromFunction0(value))
    }
  }
  
  trait Stats extends StObject {
    
    /**
      * `true` if the connection was closed correctly and `false` otherwise
      */
    var ok: Boolean
    
    var req: Bytes
    
    var res: Headers
    
    /**
      * The milliseconds it took to serve the request
      */
    var time: Double
  }
  object Stats {
    
    inline def apply(ok: Boolean, req: Bytes, res: Headers, time: Double): Stats = {
      val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setReq(value: Bytes): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRes(value: Headers): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  type StatsCallback = js.Function1[/* stats */ Stats, Unit]
  
  @js.native
  trait StatsEmitter extends EventEmitter {
    
    @JSName("addListener")
    def addListener_complete(event: complete, listener: StatsCallback): this.type = js.native
    @JSName("addListener")
    def addListener_request(event: request, listener: js.Function1[/* req */ Request, Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_complete(event: complete, stats: Stats): Boolean = js.native
    @JSName("emit")
    def emit_request(event: request, req: Request): Boolean = js.native
    
    def listenerCount(`type`: complete | request): Double = js.native
    
    @JSName("listeners")
    def listeners_complete(event: complete): js.Array[StatsCallback] = js.native
    @JSName("listeners")
    def listeners_request(event: request): js.Array[js.Function1[/* req */ Request, Unit]] = js.native
    
    @JSName("off")
    def off_complete(event: complete, listener: StatsCallback): this.type = js.native
    @JSName("off")
    def off_request(event: request, listener: js.Function1[/* req */ Request, Unit]): this.type = js.native
    
    @JSName("on")
    def on_complete(event: complete, listener: StatsCallback): this.type = js.native
    @JSName("on")
    def on_request(event: request, listener: js.Function1[/* req */ Request, Unit]): this.type = js.native
    
    @JSName("once")
    def once_complete(event: complete, listener: StatsCallback): this.type = js.native
    @JSName("once")
    def once_request(event: request, listener: js.Function1[/* req */ Request, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_complete(event: complete, listener: StatsCallback): this.type = js.native
    @JSName("prependListener")
    def prependListener_request(event: request, listener: js.Function1[/* req */ Request, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_complete(event: complete, listener: StatsCallback): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_request(event: request, listener: js.Function1[/* req */ Request, Unit]): this.type = js.native
    
    @JSName("rawListeners")
    def rawListeners_complete(event: complete): js.Array[StatsCallback] = js.native
    @JSName("rawListeners")
    def rawListeners_request(event: request): js.Array[js.Function1[/* req */ Request, Unit]] = js.native
    
    def removeAllListeners(event: complete | request): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_complete(event: complete, listener: StatsCallback): this.type = js.native
    @JSName("removeListener")
    def removeListener_request(event: request, listener: js.Function1[/* req */ Request, Unit]): this.type = js.native
  }
}
