package typings.primus

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
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
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("primus", JSImport.Namespace)
  @js.native
  class ^ protected () extends Primus {
    def this(server: Server) = this()
    def this(server: Server, options: PrimusOptions) = this()
  }
  @JSImport("primus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("primus", "Socket")
  @js.native
  class Socket () extends Stream {
    def this(options: SocketOptions) = this()
    def this(url: String) = this()
    def this(url: String, options: SocketOptions) = this()
    def this(url: Unit, options: SocketOptions) = this()
    
    def destroy(): Unit = js.native
    
    def emits(event: String, arg1: js.Any, parser: parser): fn = js.native
    def emits(event: String, args: js.Any*): fn = js.native
    def emits(event: String, parser: parser): fn = js.native
    @JSName("emits")
    var emits_Original: emits = js.native
    
    def end(): this.type = js.native
    def end(data: js.Any): this.type = js.native
    
    def id(fn: js.Function1[/* id */ String, Unit]): this.type = js.native
    
    @JSName("on")
    def on_data(event: data, handler: js.Function1[/* message */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, handler: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, handler: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_open(event: open, handler: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_reconnect(event: reconnect, handler: js.Function1[/* opts */ ReconnectEventOpts, Unit]): this.type = js.native
    @JSName("on")
    def on_reconnected(event: reconnected, handler: js.Function1[/* opts */ ReconnectEventOpts, Unit]): this.type = js.native
    @JSName("on")
    def on_reconnectfailed(
      event: `reconnect failed`,
      handler: js.Function2[/* err */ Error, /* opts */ ReconnectEventOpts, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_reconnectscheduled(event: `reconnect scheduled`, handler: js.Function1[/* opts */ ReconnectEventOpts, Unit]): this.type = js.native
    @JSName("on")
    def on_reconnecttimeout(
      event: `reconnect timeout`,
      handler: js.Function2[/* err */ Error, /* opts */ ReconnectEventOpts, Unit]
    ): this.type = js.native
    
    def open(): this.type = js.native
    
    def write(data: js.Any): this.type = js.native
  }
  
  @scala.inline
  def createServer(): Primus = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Primus]
  @scala.inline
  def createServer(fn: js.Function1[/* spark */ Spark, Unit]): Primus = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(fn.asInstanceOf[js.Any]).asInstanceOf[Primus]
  @scala.inline
  def createServer(fn: js.Function1[/* spark */ Spark, Unit], options: PrimusOptions): Primus = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Primus]
  @scala.inline
  def createServer(options: PrimusOptions): Primus = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Primus]
  
  @scala.inline
  def createSocket(): Instantiable1[/* options */ js.UndefOr[SocketOptions], Socket] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")().asInstanceOf[Instantiable1[/* options */ js.UndefOr[SocketOptions], Socket]]
  @scala.inline
  def createSocket(options: PrimusOptions): Instantiable1[/* options */ js.UndefOr[SocketOptions], Socket] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(options.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* options */ js.UndefOr[SocketOptions], Socket]]
  
  type AuthorizationHandler = js.Function2[
    /* req */ IncomingMessage, 
    /* done */ js.Function1[/* err */ js.UndefOr[String | Error | Authenticate], Unit], 
    Unit
  ]
  
  type Middleware = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Unit]
  
  trait Parser extends StObject {
    
    def decoder(data: js.Any, fn: js.Function2[/* error */ Error, /* response */ js.Any, Unit]): Unit
    
    def encoder(data: js.Any, fn: js.Function2[/* error */ Error, /* response */ js.Any, Unit]): Unit
  }
  object Parser {
    
    @scala.inline
    def apply(
      decoder: (js.Any, js.Function2[/* error */ Error, /* response */ js.Any, Unit]) => Unit,
      encoder: (js.Any, js.Function2[/* error */ Error, /* response */ js.Any, Unit]) => Unit
    ): Parser = {
      val __obj = js.Dynamic.literal(decoder = js.Any.fromFunction2(decoder), encoder = js.Any.fromFunction2(encoder))
      __obj.asInstanceOf[Parser]
    }
    
    @scala.inline
    implicit class ParserMutableBuilder[Self <: Parser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecoder(value: (js.Any, js.Function2[/* error */ Error, /* response */ js.Any, Unit]) => Unit): Self = StObject.set(x, "decoder", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEncoder(value: (js.Any, js.Function2[/* error */ Error, /* response */ js.Any, Unit]) => Unit): Self = StObject.set(x, "encoder", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Primus extends EventEmitter {
    
    var Socket: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Primus.Socket */ js.Any = js.native
    
    def authorize(fn: AuthorizationHandler): this.type = js.native
    
    def destroy(options: Close, fn: js.Function0[Unit]): this.type = js.native
    
    def disable(name: String): this.type = js.native
    
    def emits(event: String, arg1: js.Any, parser: parser): fn = js.native
    def emits(event: String, args: js.Any*): fn = js.native
    def emits(event: String, parser: parser): fn = js.native
    @JSName("emits")
    var emits_Original: emits = js.native
    
    def enable(name: String): this.type = js.native
    
    def end(): Unit = js.native
    def end(data: js.Any): Unit = js.native
    def end(data: js.Any, options: Reconnect): Unit = js.native
    def end(data: Unit, options: Reconnect): Unit = js.native
    
    def forEach(cb: js.Function1[/* spark */ Spark, Boolean]): this.type = js.native
    def forEach(
      cb: js.Function2[
          /* spark */ Spark, 
          /* next */ js.Function2[/* err */ Error | Null, /* forward */ Boolean, Unit], 
          Unit
        ],
      done: js.Function1[/* err */ Error | Null, Unit]
    ): this.type = js.native
    
    def library(): String = js.native
    
    @JSName("on")
    def on_connection(event: connection, cb: js.Function1[/* spark */ Spark, Unit]): this.type = js.native
    @JSName("on")
    def on_disconnection(event: disconnection, cb: js.Function1[/* spark */ Spark, Unit]): this.type = js.native
    @JSName("on")
    def on_plugin(event: plugin, cb: js.Function2[/* name */ String, /* energon */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_plugout(event: plugout, cb: js.Function2[/* name */ String, /* energon */ js.Any, Unit]): this.type = js.native
    
    def plugin(): js.Any = js.native
    def plugin(energon: Name): this.type = js.native
    def plugin(name: String): js.Any = js.native
    def plugin(name: String, energon: String): this.type = js.native
    def plugin(name: String, energon: Name): this.type = js.native
    // This has a lot of variations and can be improved
    @JSName("plugin")
    def plugin_StringDictionary(): StringDictionary[js.Any] = js.native
    
    def plugout(name: String): this.type = js.native
    
    def remove(name: String): this.type = js.native
    
    def reserved(name: String): Boolean = js.native
    
    // This is marked as private in the source code, but documented in the readme
    def spark(id: String): Spark = js.native
    
    @JSName("transform")
    def transform_incoming(`type`: incoming, fn: js.Function1[/* packet */ PrimusPacket, Unit]): this.type = js.native
    @JSName("transform")
    def transform_outgoing(`type`: outgoing, fn: js.Function1[/* packet */ PrimusPacket, Unit]): this.type = js.native
    
    def use(fn: js.Function0[Middleware]): this.type = js.native
    def use(fn: js.Function0[Middleware], options: js.Object): this.type = js.native
    def use(fn: js.Function0[Middleware], options: js.Object, level: Double): this.type = js.native
    def use(fn: js.Function0[Middleware], options: Unit, level: Double): this.type = js.native
    def use(name: String, fn: js.Function0[Middleware]): this.type = js.native
    def use(name: String, fn: js.Function0[Middleware], options: js.Object): this.type = js.native
    def use(name: String, fn: js.Function0[Middleware], options: js.Object, level: Double): this.type = js.native
    def use(name: String, fn: js.Function0[Middleware], options: Unit, level: Double): this.type = js.native
    
    def write(data: js.Any): Unit = js.native
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
    
    @scala.inline
    def apply(): PrimusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimusOptions]
    }
    
    @scala.inline
    implicit class PrimusOptionsMutableBuilder[Self <: PrimusOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorization(
        value: (/* req */ IncomingMessage, /* done */ js.Function1[/* err */ js.UndefOr[String | Error | Authenticate], Unit]) => Unit
      ): Self = StObject.set(x, "authorization", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
      
      @scala.inline
      def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setCredentials(value: Boolean): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setExposed(value: Boolean): Self = StObject.set(x, "exposed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposedUndefined: Self = StObject.set(x, "exposed", js.undefined)
      
      @scala.inline
      def setGlobal(value: String): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setHeaders(value: Boolean): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIdGenerator(value: () => String): Self = StObject.set(x, "idGenerator", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIdGeneratorUndefined: Self = StObject.set(x, "idGenerator", js.undefined)
      
      @scala.inline
      def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMethods(value: String): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setOrigins(value: String): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      @scala.inline
      def setParser(value: String | Parser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      @scala.inline
      def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
      
      @scala.inline
      def setPlugin(value: String | js.Object): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      @scala.inline
      def setTransformer(value: websockets | engineDotio | browserchannel | sockjs | faye | uws): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
      
      @scala.inline
      def setTransport(value: js.Object): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  trait PrimusPacket extends StObject {
    
    var data: js.Any
  }
  object PrimusPacket {
    
    @scala.inline
    def apply(data: js.Any): PrimusPacket = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrimusPacket]
    }
    
    @scala.inline
    implicit class PrimusPacketMutableBuilder[Self <: PrimusPacket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
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
    implicit class ReconnectEventOptsMutableBuilder[Self <: ReconnectEventOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttempt(value: Double): Self = StObject.set(x, "attempt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoff(value: Boolean): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setReconnect timeout`(value: Double): Self = StObject.set(x, "reconnect timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduled(value: Double): Self = StObject.set(x, "scheduled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): ReconnectOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReconnectOpts]
    }
    
    @scala.inline
    implicit class ReconnectOptsMutableBuilder[Self <: ReconnectOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def `setReconnect timeout`(value: Double): Self = StObject.set(x, "reconnect timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setReconnect timeoutUndefined`: Self = StObject.set(x, "reconnect timeout", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesNull: Self = StObject.set(x, "retries", null)
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    }
  }
  
  trait SocketOptions extends StObject {
    
    var manual: js.UndefOr[Boolean] = js.undefined
    
    var network: js.UndefOr[Boolean] = js.undefined
    
    var pingTimeout: js.UndefOr[Double] = js.undefined
    
    var queueSize: js.UndefOr[Double] = js.undefined
    
    // https://github.com/unshiftio/recovery
    var reconnect: js.UndefOr[Factor] = js.undefined
    
    var strategy: js.UndefOr[String | (js.Array[disconnect | online | timeout])] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var transport: js.UndefOr[js.Object] = js.undefined
    
    var websockets: js.UndefOr[Boolean] = js.undefined
  }
  object SocketOptions {
    
    @scala.inline
    def apply(): SocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketOptions]
    }
    
    @scala.inline
    implicit class SocketOptionsMutableBuilder[Self <: SocketOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setManual(value: Boolean): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
      
      @scala.inline
      def setNetwork(value: Boolean): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      @scala.inline
      def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
      
      @scala.inline
      def setQueueSize(value: Double): Self = StObject.set(x, "queueSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueSizeUndefined: Self = StObject.set(x, "queueSize", js.undefined)
      
      @scala.inline
      def setReconnect(value: Factor): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      @scala.inline
      def setStrategy(value: String | (js.Array[disconnect | online | timeout])): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      @scala.inline
      def setStrategyVarargs(value: (disconnect | online | timeout)*): Self = StObject.set(x, "strategy", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTransport(value: js.Object): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      @scala.inline
      def setWebsockets(value: Boolean): Self = StObject.set(x, "websockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsocketsUndefined: Self = StObject.set(x, "websockets", js.undefined)
    }
  }
  
  @js.native
  trait Spark extends Stream {
    
    var address: Ip = js.native
    
    def emits(event: String, arg1: js.Any, parser: parser): fn = js.native
    def emits(event: String, args: js.Any*): fn = js.native
    def emits(event: String, parser: parser): fn = js.native
    @JSName("emits")
    var emits_Original: emits = js.native
    
    def end(): Unit = js.native
    def end(data: js.Any): Unit = js.native
    def end(data: js.Any, options: Reconnect): Unit = js.native
    def end(data: Unit, options: Reconnect): Unit = js.native
    
    var headers: IncomingHttpHeaders = js.native
    
    var id: String = js.native
    
    @JSName("on")
    def on_data(event: data, handler: js.Function1[/* message */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, handler: js.Function0[Unit]): this.type = js.native
    
    var query: ParsedUrlQuery = js.native
    
    var request: IncomingMessage = js.native
    
    var socket: js.Any = js.native
    
    def write(data: js.Any): Unit = js.native
  }
  
  // https://github.com/primus/emits
  // This can't be typed correctly
  //  - https://github.com/microsoft/TypeScript/issues/1360
  //  - https://stackoverflow.com/questions/22043041/typescript-rest-parameter-in-the-middle-of-arguments-list
  object emits {
    
    type done = js.Function2[/* err */ js.UndefOr[Error | Null], /* arg */ js.Any, Unit]
    
    @js.native
    trait emits extends StObject {
      
      def apply(event: String, arg1: js.Any, parser: parser): fn = js.native
      def apply(event: String, args: js.Any*): fn = js.native
      def apply(event: String, parser: parser): fn = js.native
    }
    
    type fn = js.Function1[/* repeated */ js.Any, Boolean]
    
    type parser = js.Function2[/* done */ done, /* repeated */ js.Any, Unit]
  }
}
