package typings.primus

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.streamMod.Stream
import typings.primus.anon.Authenticate
import typings.primus.anon.Close
import typings.primus.anon.Factor
import typings.primus.anon.Ip
import typings.primus.anon.Name
import typings.primus.anon.Reconnect
import typings.primus.mod.emits.emits
import typings.primus.mod.emits.fn
import typings.primus.mod.emits.parser
import typings.primus.primusStrings.`reconnect failed`
import typings.primus.primusStrings.`reconnect scheduled`
import typings.primus.primusStrings.`reconnect timeout`
import typings.primus.primusStrings.browserchannel
import typings.primus.primusStrings.connection
import typings.primus.primusStrings.data
import typings.primus.primusStrings.disconnect
import typings.primus.primusStrings.disconnection
import typings.primus.primusStrings.end
import typings.primus.primusStrings.engineDotio
import typings.primus.primusStrings.error
import typings.primus.primusStrings.faye
import typings.primus.primusStrings.incoming
import typings.primus.primusStrings.online
import typings.primus.primusStrings.open
import typings.primus.primusStrings.outgoing
import typings.primus.primusStrings.plugin
import typings.primus.primusStrings.plugout
import typings.primus.primusStrings.reconnect
import typings.primus.primusStrings.reconnected
import typings.primus.primusStrings.sockjs
import typings.primus.primusStrings.timeout
import typings.primus.primusStrings.uws
import typings.primus.primusStrings.websockets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("primus", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Primus {
    def this(server: Server[
            Instantiable1[/* socket */ typings.node.nodeColonnetMod.Socket, IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              ServerResponse[IncomingMessage]
            ]
          ]) = this()
    def this(
      server: Server[
            Instantiable1[/* socket */ typings.node.nodeColonnetMod.Socket, IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              ServerResponse[IncomingMessage]
            ]
          ],
      options: PrimusOptions
    ) = this()
  }
  @JSImport("primus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("primus", "Socket")
  @js.native
  open class Socket () extends Stream {
    def this(options: SocketOptions) = this()
    def this(url: String) = this()
    def this(url: String, options: SocketOptions) = this()
    def this(url: Unit, options: SocketOptions) = this()
    
    def destroy(): Unit = js.native
    
    def emits(event: String, arg1: Any, parser: parser): fn = js.native
    def emits(event: String, args: Any*): fn = js.native
    def emits(event: String, parser: parser): fn = js.native
    @JSName("emits")
    var emits_Original: emits = js.native
    
    def end(): this.type = js.native
    def end(data: Any): this.type = js.native
    
    def id(fn: js.Function1[/* id */ String, Unit]): this.type = js.native
    
    def on(event: open | end, handler: js.Function0[Unit]): this.type = js.native
    def on(
      event: reconnect | (`reconnect scheduled`) | reconnected,
      handler: js.Function1[/* opts */ ReconnectEventOpts, Unit]
    ): this.type = js.native
    def on(
      event: (`reconnect timeout`) | (`reconnect failed`),
      handler: js.Function2[/* err */ js.Error, /* opts */ ReconnectEventOpts, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_data(event: data, handler: js.Function1[/* message */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, handler: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    def open(): this.type = js.native
    
    def write(data: Any): this.type = js.native
  }
  
  inline def createServer(): Primus = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Primus]
  inline def createServer(fn: js.Function1[/* spark */ Spark, Unit]): Primus = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(fn.asInstanceOf[js.Any]).asInstanceOf[Primus]
  inline def createServer(fn: js.Function1[/* spark */ Spark, Unit], options: PrimusOptions): Primus = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Primus]
  inline def createServer(options: PrimusOptions): Primus = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Primus]
  
  inline def createSocket(): Instantiable1[/* options */ js.UndefOr[SocketOptions], Socket] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")().asInstanceOf[Instantiable1[/* options */ js.UndefOr[SocketOptions], Socket]]
  inline def createSocket(options: SocketOptions): Instantiable1[/* options */ js.UndefOr[SocketOptions], Socket] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(options.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* options */ js.UndefOr[SocketOptions], Socket]]
  
  type AuthorizationHandler = js.Function2[
    /* req */ IncomingMessage, 
    /* done */ js.Function1[/* err */ js.UndefOr[String | js.Error | Authenticate], Unit], 
    Unit
  ]
  
  type Middleware = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], Unit]
  
  trait Parser extends StObject {
    
    def decoder(data: Any, fn: js.Function2[/* error */ js.Error, /* response */ Any, Unit]): Unit
    
    def encoder(data: Any, fn: js.Function2[/* error */ js.Error, /* response */ Any, Unit]): Unit
  }
  object Parser {
    
    inline def apply(
      decoder: (Any, js.Function2[/* error */ js.Error, /* response */ Any, Unit]) => Unit,
      encoder: (Any, js.Function2[/* error */ js.Error, /* response */ Any, Unit]) => Unit
    ): Parser = {
      val __obj = js.Dynamic.literal(decoder = js.Any.fromFunction2(decoder), encoder = js.Any.fromFunction2(encoder))
      __obj.asInstanceOf[Parser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parser] (val x: Self) extends AnyVal {
      
      inline def setDecoder(value: (Any, js.Function2[/* error */ js.Error, /* response */ Any, Unit]) => Unit): Self = StObject.set(x, "decoder", js.Any.fromFunction2(value))
      
      inline def setEncoder(value: (Any, js.Function2[/* error */ js.Error, /* response */ Any, Unit]) => Unit): Self = StObject.set(x, "encoder", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Primus extends EventEmitter {
    
    var Socket: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Primus.Socket */ Any = js.native
    
    def authorize(fn: AuthorizationHandler): this.type = js.native
    
    var connected: Double = js.native
    
    var connections: StringDictionary[Spark] = js.native
    
    def destroy(options: Close, fn: js.Function0[Unit]): this.type = js.native
    
    def disable(name: String): this.type = js.native
    
    def emits(event: String, arg1: Any, parser: parser): fn = js.native
    def emits(event: String, args: Any*): fn = js.native
    def emits(event: String, parser: parser): fn = js.native
    @JSName("emits")
    var emits_Original: emits = js.native
    
    def enable(name: String): this.type = js.native
    
    def end(): Unit = js.native
    def end(data: Any): Unit = js.native
    def end(data: Any, options: Reconnect): Unit = js.native
    def end(data: Unit, options: Reconnect): Unit = js.native
    
    def forEach(cb: js.Function1[/* spark */ Spark, Boolean]): this.type = js.native
    def forEach(
      cb: js.Function2[
          /* spark */ Spark, 
          /* next */ js.Function2[/* err */ js.Error | Null, /* forward */ Boolean, Unit], 
          Unit
        ],
      done: js.Function1[/* err */ js.Error | Null, Unit]
    ): this.type = js.native
    
    def library(): String = js.native
    
    def on(event: connection | disconnection, cb: js.Function1[/* spark */ Spark, Unit]): this.type = js.native
    def on(event: plugin | plugout, cb: js.Function2[/* name */ String, /* energon */ Any, Unit]): this.type = js.native
    
    def plugin(): Any = js.native
    def plugin(energon: Name): this.type = js.native
    def plugin(name: String): Any = js.native
    def plugin(name: String, energon: String): this.type = js.native
    def plugin(name: String, energon: Name): this.type = js.native
    // This has a lot of variations and can be improved
    @JSName("plugin")
    def plugin_StringDictionary(): StringDictionary[Any] = js.native
    
    def plugout(name: String): this.type = js.native
    
    def remove(name: String): this.type = js.native
    
    def reserved(name: String): Boolean = js.native
    
    // This is marked as private in the source code, but documented in the readme
    def spark(id: String): Spark = js.native
    
    def transform(`type`: incoming | outgoing, fn: js.Function1[/* packet */ PrimusPacket, Unit]): this.type = js.native
    
    def use(fn: js.Function0[Middleware]): this.type = js.native
    def use(fn: js.Function0[Middleware], options: js.Object): this.type = js.native
    def use(fn: js.Function0[Middleware], options: js.Object, level: Double): this.type = js.native
    def use(fn: js.Function0[Middleware], options: Unit, level: Double): this.type = js.native
    def use(name: String, fn: js.Function0[Middleware]): this.type = js.native
    def use(name: String, fn: js.Function0[Middleware], options: js.Object): this.type = js.native
    def use(name: String, fn: js.Function0[Middleware], options: js.Object, level: Double): this.type = js.native
    def use(name: String, fn: js.Function0[Middleware], options: Unit, level: Double): this.type = js.native
    
    def write(data: Any): Unit = js.native
  }
  
  trait PrimusOptions extends StObject {
    
    var authorization: js.UndefOr[AuthorizationHandler] = js.undefined
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var credentials: js.UndefOr[Boolean] = js.undefined
    
    var exposed: js.UndefOr[Boolean] = js.undefined
    
    var global: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Boolean] = js.undefined
    
    var idGenerator: js.UndefOr[js.Function0[String]] = js.undefined
    
    var maxAge: js.UndefOr[String] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var methods: js.UndefOr[String] = js.undefined
    
    // Cors
    var origins: js.UndefOr[String] = js.undefined
    
    var parser: js.UndefOr[String | Parser] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var pingInterval: js.UndefOr[Double] = js.undefined
    
    var plugin: js.UndefOr[String | js.Object] = js.undefined
    
    var transformer: js.UndefOr[websockets | engineDotio | browserchannel | sockjs | faye | uws] = js.undefined
    
    var transport: js.UndefOr[js.Object] = js.undefined
  }
  object PrimusOptions {
    
    inline def apply(): PrimusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimusOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimusOptions] (val x: Self) extends AnyVal {
      
      inline def setAuthorization(
        value: (/* req */ IncomingMessage, /* done */ js.Function1[/* err */ js.UndefOr[String | js.Error | Authenticate], Unit]) => Unit
      ): Self = StObject.set(x, "authorization", js.Any.fromFunction2(value))
      
      inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
      
      inline def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setCredentials(value: Boolean): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setExposed(value: Boolean): Self = StObject.set(x, "exposed", value.asInstanceOf[js.Any])
      
      inline def setExposedUndefined: Self = StObject.set(x, "exposed", js.undefined)
      
      inline def setGlobal(value: String): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setHeaders(value: Boolean): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIdGenerator(value: () => String): Self = StObject.set(x, "idGenerator", js.Any.fromFunction0(value))
      
      inline def setIdGeneratorUndefined: Self = StObject.set(x, "idGenerator", js.undefined)
      
      inline def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMethods(value: String): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setOrigins(value: String): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      inline def setParser(value: String | Parser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
      
      inline def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
      
      inline def setPlugin(value: String | js.Object): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setTransformer(value: websockets | engineDotio | browserchannel | sockjs | faye | uws): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
      
      inline def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
      
      inline def setTransport(value: js.Object): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  trait PrimusPacket extends StObject {
    
    var data: Any
  }
  object PrimusPacket {
    
    inline def apply(data: Any): PrimusPacket = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrimusPacket]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimusPacket] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Required<primus.primus.ReconnectOpts> */
  trait ReconnectEventOpts extends StObject {
    
    var attempt: Double
    
    var backoff: Boolean
    
    var duration: Double
    
    var factor: Double
    
    var max: Double
    
    var min: Double
    
    var `reconnect timeout`: Double
    
    var retries: Double
    
    var scheduled: Double
    
    var start: Double
  }
  object ReconnectEventOpts {
    
    inline def apply(
      attempt: Double,
      backoff: Boolean,
      duration: Double,
      factor: Double,
      max: Double,
      min: Double,
      `reconnect timeout`: Double,
      retries: Double,
      scheduled: Double,
      start: Double
    ): ReconnectEventOpts = {
      val __obj = js.Dynamic.literal(attempt = attempt.asInstanceOf[js.Any], backoff = backoff.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("reconnect timeout")((`reconnect timeout`).asInstanceOf[js.Any])
      __obj.asInstanceOf[ReconnectEventOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReconnectEventOpts] (val x: Self) extends AnyVal {
      
      inline def setAttempt(value: Double): Self = StObject.set(x, "attempt", value.asInstanceOf[js.Any])
      
      inline def setBackoff(value: Boolean): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def `setReconnect timeout`(value: Double): Self = StObject.set(x, "reconnect timeout", value.asInstanceOf[js.Any])
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setScheduled(value: Double): Self = StObject.set(x, "scheduled", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReconnectOpts extends StObject {
    
    var factor: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var `reconnect timeout`: js.UndefOr[Double] = js.undefined
    
    var retries: js.UndefOr[Double | Null] = js.undefined
  }
  object ReconnectOpts {
    
    inline def apply(): ReconnectOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReconnectOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReconnectOpts] (val x: Self) extends AnyVal {
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def `setReconnect timeout`(value: Double): Self = StObject.set(x, "reconnect timeout", value.asInstanceOf[js.Any])
      
      inline def `setReconnect timeoutUndefined`: Self = StObject.set(x, "reconnect timeout", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesNull: Self = StObject.set(x, "retries", null)
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    }
  }
  
  trait SocketOptions extends StObject {
    
    var manual: js.UndefOr[Boolean] = js.undefined
    
    var network: js.UndefOr[Boolean] = js.undefined
    
    var parser: js.UndefOr[String | Parser] = js.undefined
    
    var pingTimeout: js.UndefOr[Double] = js.undefined
    
    var plugin: js.UndefOr[String | js.Object] = js.undefined
    
    var queueSize: js.UndefOr[Double] = js.undefined
    
    // https://github.com/unshiftio/recovery
    var reconnect: js.UndefOr[Factor] = js.undefined
    
    var strategy: js.UndefOr[String | (js.Array[disconnect | online | timeout])] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    // https://www.npmjs.com/package/primus#connecting-from-the-server
    var transformer: js.UndefOr[websockets | engineDotio | browserchannel | sockjs | faye | uws] = js.undefined
    
    var transport: js.UndefOr[js.Object] = js.undefined
    
    var websockets: js.UndefOr[Boolean] = js.undefined
  }
  object SocketOptions {
    
    inline def apply(): SocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SocketOptions] (val x: Self) extends AnyVal {
      
      inline def setManual(value: Boolean): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
      
      inline def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
      
      inline def setNetwork(value: Boolean): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      inline def setParser(value: String | Parser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
      
      inline def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
      
      inline def setPlugin(value: String | js.Object): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setQueueSize(value: Double): Self = StObject.set(x, "queueSize", value.asInstanceOf[js.Any])
      
      inline def setQueueSizeUndefined: Self = StObject.set(x, "queueSize", js.undefined)
      
      inline def setReconnect(value: Factor): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      inline def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      inline def setStrategy(value: String | (js.Array[disconnect | online | timeout])): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setStrategyVarargs(value: (disconnect | online | timeout)*): Self = StObject.set(x, "strategy", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTransformer(value: websockets | engineDotio | browserchannel | sockjs | faye | uws): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
      
      inline def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
      
      inline def setTransport(value: js.Object): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      inline def setWebsockets(value: Boolean): Self = StObject.set(x, "websockets", value.asInstanceOf[js.Any])
      
      inline def setWebsocketsUndefined: Self = StObject.set(x, "websockets", js.undefined)
    }
  }
  
  @js.native
  trait Spark extends Stream {
    
    var address: Ip = js.native
    
    def emits(event: String, arg1: Any, parser: parser): fn = js.native
    def emits(event: String, args: Any*): fn = js.native
    def emits(event: String, parser: parser): fn = js.native
    @JSName("emits")
    var emits_Original: emits = js.native
    
    def end(): Unit = js.native
    def end(data: Any): Unit = js.native
    def end(data: Any, options: Reconnect): Unit = js.native
    def end(data: Unit, options: Reconnect): Unit = js.native
    
    var headers: IncomingHttpHeaders = js.native
    
    var id: String = js.native
    
    @JSName("on")
    def on_data(event: data, handler: js.Function1[/* message */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, handler: js.Function0[Unit]): this.type = js.native
    
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any = js.native
    
    var request: IncomingMessage = js.native
    
    var socket: Any = js.native
    
    def write(data: Any): Unit = js.native
  }
  
  // https://github.com/primus/emits
  // This can't be typed correctly
  //  - https://github.com/microsoft/TypeScript/issues/1360
  //  - https://stackoverflow.com/questions/22043041/typescript-rest-parameter-in-the-middle-of-arguments-list
  object emits {
    
    type done = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* arg */ Any, Unit]
    
    @js.native
    trait emits extends StObject {
      
      def apply(event: String, arg1: Any, parser: parser): fn = js.native
      def apply(event: String, args: Any*): fn = js.native
      def apply(event: String, parser: parser): fn = js.native
    }
    
    type fn = js.Function1[/* repeated */ Any, Boolean]
    
    type parser = js.Function2[/* done */ done, /* repeated */ Any, Unit]
  }
}
