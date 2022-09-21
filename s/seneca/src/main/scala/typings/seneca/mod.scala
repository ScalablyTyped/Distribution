package typings.seneca

import org.scalablytyped.runtime.StringDictionary
import typings.seneca.anon.Act
import typings.seneca.anon.Actcaller
import typings.seneca.anon.Active
import typings.seneca.anon.Actrouter
import typings.seneca.anon.Add
import typings.seneca.anon.Basic
import typings.seneca.anon.Host
import typings.seneca.anon.Interval
import typings.seneca.anon.Level
import typings.seneca.anon.Local
import typings.seneca.anon.Running
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Instance = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Instance]
  inline def apply(options: Options): Instance = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Instance]
  
  @JSImport("seneca", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ActCallback = js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[Any], Unit]
  
  type AddCallback[T] = js.Function2[
    /* msg */ MessagePayload[T], 
    /* respond */ js.Function2[/* error */ js.Error | Null, /* msg */ js.UndefOr[Any], Unit], 
    Unit
  ]
  
  trait ClientOptions extends StObject
  
  type CloseCallback = js.Function2[/* optional */ Any, /* done */ js.Function1[/* error */ js.Error, Unit], Unit]
  
  type DatabaseID = String
  
  // NOTE: senecas documented use of:
  //    var product = seneca.make('product')
  //    product.name = 'Apple'
  // causes this error: error TS2339: Property 'name' does not exist on type 'Entity'.
  // Change such references to: product['name']
  @js.native
  trait Entity
    extends StObject
       with /* plugin_name */ StringDictionary[Any] {
    
    def apply(canon: Any, seneca: Any): Unit = js.native
    
    @JSName("list$")
    def list$(query: EntityDataWithQuery, callback: EntityListCallback): Unit = js.native
    
    @JSName("load$")
    def load$(id: DatabaseID, callback: EntityLoadCallback): Unit = js.native
    @JSName("load$")
    def load$(id: EntityDataWithQuery, callback: EntityLoadCallback): Unit = js.native
    
    // there appear to be many more variants of make$(), but its unclear that they are intended for the public API
    @JSName("make$")
    def make$(): Entity = js.native
    @JSName("make$")
    def make$(base: String, name: String): Entity = js.native
    @JSName("make$")
    def make$(name: String): Entity = js.native
    @JSName("make$")
    def make$(zone: String, base: String, name: String): Entity = js.native
    
    @JSName("remove$")
    def remove$(id: DatabaseID, callback: EntityRemoveCallback): Unit = js.native
    @JSName("remove$")
    def remove$(id: EntityDataWithQuery, callback: EntityRemoveCallback): Unit = js.native
    
    @JSName("save$")
    def save$(callback: EntitySaveCallback): Unit = js.native
    @JSName("save$")
    def save$(props: EntityDataWithQuery, callback: EntitySaveCallback): Unit = js.native
  }
  
  trait EntityDataWithQuery
    extends StObject
       with /* plugin_name */ StringDictionary[Any] {
    
    var id: js.UndefOr[String] = js.undefined
    
    @JSName("sort$")
    var sort$: js.UndefOr[Any] = js.undefined
  }
  object EntityDataWithQuery {
    
    inline def apply(): EntityDataWithQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EntityDataWithQuery]
    }
    
    extension [Self <: EntityDataWithQuery](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setSort$(value: Any): Self = StObject.set(x, "sort$", value.asInstanceOf[js.Any])
      
      inline def setSort$Undefined: Self = StObject.set(x, "sort$", js.undefined)
    }
  }
  
  type EntityListCallback = js.Function2[/* error */ js.Error, /* result */ js.Array[Any], Unit]
  
  type EntityLoadCallback = js.Function2[/* error */ js.Error, /* result */ Any, Unit]
  
  type EntityRemoveCallback = js.Function1[/* error */ js.Error, Unit]
  
  type EntitySaveCallback = js.Function2[/* error */ js.Error, /* result */ Any, Unit]
  
  trait Executor extends StObject {
    
    def cb(err: js.Error, result: Any): Unit
    @JSName("cb")
    var cb_Original: ExecutorCallback
    
    var desc: String
    
    var execute: UnknownType
    
    def fn(callback: Any): Unit
    @JSName("fn")
    var fn_Original: ExecutorWorker
    
    var gate: Boolean
    
    var id: String
    
    var ungate: Boolean
  }
  object Executor {
    
    inline def apply(
      cb: (/* err */ js.Error, /* result */ Any) => Unit,
      desc: String,
      execute: UnknownType,
      fn: /* callback */ Any => Unit,
      gate: Boolean,
      id: String,
      ungate: Boolean
    ): Executor = {
      val __obj = js.Dynamic.literal(cb = js.Any.fromFunction2(cb), desc = desc.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), gate = gate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ungate = ungate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Executor]
    }
    
    extension [Self <: Executor](x: Self) {
      
      inline def setCb(value: (/* err */ js.Error, /* result */ Any) => Unit): Self = StObject.set(x, "cb", js.Any.fromFunction2(value))
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setExecute(value: UnknownType): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
      
      inline def setFn(value: /* callback */ Any => Unit): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
      
      inline def setGate(value: Boolean): Self = StObject.set(x, "gate", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setUngate(value: Boolean): Self = StObject.set(x, "ungate", value.asInstanceOf[js.Any])
    }
  }
  
  type ExecutorCallback = js.Function2[/* err */ js.Error, /* result */ Any, Unit]
  
  type ExecutorWorker = js.Function1[/* callback */ Any, Unit]
  
  type GlobalErrorHandler = js.Function1[/* error */ js.Error, Unit]
  
  @js.native
  trait Instance extends StObject {
    
    def act[PatternWithArgs](pattern: PatternWithArgs, msg: Any, respond: ActCallback): Unit = js.native
    def act[PatternWithArgs](pattern: PatternWithArgs, respond: ActCallback): Unit = js.native
    
    def add[PatternType, CallBackParams](pattern: PatternType, action: AddCallback[PatternType & CallBackParams]): this.type = js.native
    def add[PatternType, CallbackParams](pattern: PatternType, paramspec: Any, action: AddCallback[PatternType & CallbackParams]): this.type = js.native
    
    def client(): this.type = js.native
    def client(options: ClientOptions): this.type = js.native
    
    def close(callback: CloseCallback): Unit = js.native
    
    def error(handler: GlobalErrorHandler): Unit = js.native
    
    // @param name reference to plugin provided object
    def `export`(name: String): PluginModule = js.native
    
    def listen(): this.type = js.native
    def listen(options: ListenOptions): this.type = js.native
    
    def make(base: String, entity_canon: String): Entity = js.native
    def make(base: String, entity_canon: String, properties: Any): Entity = js.native
    def make(entity_canon: String): Entity = js.native
    def make(entity_canon: String, properties: Any): Entity = js.native
    def make(zone: String, base: String, entity_canon: String): Entity = js.native
    def make(zone: String, base: String, entity_canon: String, properties: Any): Entity = js.native
    
    def on(eventName: String, callback: js.Function1[/* error */ js.Error, Unit]): Any = js.native
    
    def options(options: Options): Unit = js.native
    
    def pin(pattern: Pattern): Unit = js.native
    
    def ready(callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    def use(module: PluginModule): this.type = js.native
    def use(module: PluginModule, options: PluginOptions): this.type = js.native
    def use(name: String): this.type = js.native
    def use(name: String, options: PluginOptions): this.type = js.native
    
    var version: String = js.native
  }
  
  trait ListenOptions extends StObject
  
  // { level: 'warn+' }
  /* Rewritten from type alias, can be one of: 
    - typings.seneca.senecaStrings.none
    - typings.seneca.senecaStrings.debugPlussign
    - typings.seneca.senecaStrings.infoPlussign
    - typings.seneca.senecaStrings.warnPlussign
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def debugPlussign: typings.seneca.senecaStrings.debugPlussign = "debug+".asInstanceOf[typings.seneca.senecaStrings.debugPlussign]
    
    inline def infoPlussign: typings.seneca.senecaStrings.infoPlussign = "info+".asInstanceOf[typings.seneca.senecaStrings.infoPlussign]
    
    inline def none: typings.seneca.senecaStrings.none = "none".asInstanceOf[typings.seneca.senecaStrings.none]
    
    inline def warnPlussign: typings.seneca.senecaStrings.warnPlussign = "warn+".asInstanceOf[typings.seneca.senecaStrings.warnPlussign]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.seneca.senecaStrings.quiet
    - typings.seneca.senecaStrings.silent
    - typings.seneca.senecaStrings.any
    - typings.seneca.senecaStrings.all
    - typings.seneca.senecaStrings.print
    - typings.seneca.senecaStrings.standard
    - typings.seneca.senecaStrings.test
  */
  trait LogSpec extends StObject
  object LogSpec {
    
    inline def all: typings.seneca.senecaStrings.all = "all".asInstanceOf[typings.seneca.senecaStrings.all]
    
    inline def any: typings.seneca.senecaStrings.any = "any".asInstanceOf[typings.seneca.senecaStrings.any]
    
    inline def print: typings.seneca.senecaStrings.print = "print".asInstanceOf[typings.seneca.senecaStrings.print]
    
    inline def quiet: typings.seneca.senecaStrings.quiet = "quiet".asInstanceOf[typings.seneca.senecaStrings.quiet]
    
    inline def silent: typings.seneca.senecaStrings.silent = "silent".asInstanceOf[typings.seneca.senecaStrings.silent]
    
    inline def standard: typings.seneca.senecaStrings.standard = "standard".asInstanceOf[typings.seneca.senecaStrings.standard]
    
    inline def test: typings.seneca.senecaStrings.test = "test".asInstanceOf[typings.seneca.senecaStrings.test]
  }
  
  type MessagePayload[T] = PartialMessagePayload & T
  
  trait MinimalPattern extends StObject
  
  @js.native
  trait Optioner extends StObject {
    
    def get(): Options = js.native
    
    def set(input: String): Options = js.native
    def set(input: Options): Options = js.native
  }
  
  trait Options
    extends StObject
       with /* plugin_name */ StringDictionary[Any] {
    
    // Action cache. Makes inbound messages idempotent.
    var actcache: js.UndefOr[Active] = js.undefined
    
    // Default seneca-admin settings.
    // TODO: move to seneca-admin!
    var admin: js.UndefOr[Local] = js.undefined
    
    // Wait time for plugins to close gracefully.
    var deathdelay: js.UndefOr[Double] = js.undefined
    
    // Debug settings.
    var debug: js.UndefOr[Actcaller] = js.undefined
    
    // milliseconds
    // Register (true) default plugins. Set false to not register when
    // using custom versions.
    var default_plugins: js.UndefOr[Basic] = js.undefined
    
    var errhandler: js.UndefOr[GlobalErrorHandler] = js.undefined
    
    // Standard length of identifiers for actions.
    var idlen: js.UndefOr[Double] = js.undefined
    
    // Internal settings.
    var internal: js.UndefOr[Actrouter] = js.undefined
    
    var log: js.UndefOr[LogSpec | Level] = js.undefined
    
    // Plugin settings
    var plugin: js.UndefOr[Any] = js.undefined
    
    // Settings for network REPL.
    var repl: js.UndefOr[Host] = js.undefined
    
    // Action statistics settings. See rolling-stats module.
    var stats: js.UndefOr[Interval] = js.undefined
    
    // Log status at periodic intervals.
    var status: js.UndefOr[Running] = js.undefined
    
    // Enforce strict behaviours. Relax when backwards compatibility needed.
    var strict: js.UndefOr[Add] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    // Standard timeout for actions.
    var timeout: js.UndefOr[Double] = js.undefined
    
    // Action executor tracing. See gate-executor module.
    var trace: js.UndefOr[Act] = js.undefined
    
    // zig module settings for seneca.start() chaining.
    var zig: js.UndefOr[Any] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setActcache(value: Active): Self = StObject.set(x, "actcache", value.asInstanceOf[js.Any])
      
      inline def setActcacheUndefined: Self = StObject.set(x, "actcache", js.undefined)
      
      inline def setAdmin(value: Local): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      inline def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
      
      inline def setDeathdelay(value: Double): Self = StObject.set(x, "deathdelay", value.asInstanceOf[js.Any])
      
      inline def setDeathdelayUndefined: Self = StObject.set(x, "deathdelay", js.undefined)
      
      inline def setDebug(value: Actcaller): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDefault_plugins(value: Basic): Self = StObject.set(x, "default_plugins", value.asInstanceOf[js.Any])
      
      inline def setDefault_pluginsUndefined: Self = StObject.set(x, "default_plugins", js.undefined)
      
      inline def setErrhandler(value: /* error */ js.Error => Unit): Self = StObject.set(x, "errhandler", js.Any.fromFunction1(value))
      
      inline def setErrhandlerUndefined: Self = StObject.set(x, "errhandler", js.undefined)
      
      inline def setIdlen(value: Double): Self = StObject.set(x, "idlen", value.asInstanceOf[js.Any])
      
      inline def setIdlenUndefined: Self = StObject.set(x, "idlen", js.undefined)
      
      inline def setInternal(value: Actrouter): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
      
      inline def setLog(value: LogSpec | Level): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setPlugin(value: Any): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setRepl(value: Host): Self = StObject.set(x, "repl", value.asInstanceOf[js.Any])
      
      inline def setReplUndefined: Self = StObject.set(x, "repl", js.undefined)
      
      inline def setStats(value: Interval): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setStatus(value: Running): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStrict(value: Add): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTrace(value: Act): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      inline def setZig(value: Any): Self = StObject.set(x, "zig", value.asInstanceOf[js.Any])
      
      inline def setZigUndefined: Self = StObject.set(x, "zig", js.undefined)
    }
  }
  
  trait PartialMessagePayload extends StObject {
    
    @JSName("fatal$")
    var fatal$: Boolean
    
    @JSName("plugin$")
    var plugin$: Any
    
    @JSName("transport$")
    var transport$: js.Object
    
    @JSName("tx$")
    var tx$: String
  }
  object PartialMessagePayload {
    
    inline def apply(fatal$: Boolean, plugin$: Any, transport$: js.Object, tx$: String): PartialMessagePayload = {
      val __obj = js.Dynamic.literal(fatal$ = fatal$.asInstanceOf[js.Any], plugin$ = plugin$.asInstanceOf[js.Any], transport$ = transport$.asInstanceOf[js.Any], tx$ = tx$.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialMessagePayload]
    }
    
    extension [Self <: PartialMessagePayload](x: Self) {
      
      inline def setFatal$(value: Boolean): Self = StObject.set(x, "fatal$", value.asInstanceOf[js.Any])
      
      inline def setPlugin$(value: Any): Self = StObject.set(x, "plugin$", value.asInstanceOf[js.Any])
      
      inline def setTransport$(value: js.Object): Self = StObject.set(x, "transport$", value.asInstanceOf[js.Any])
      
      inline def setTx$(value: String): Self = StObject.set(x, "tx$", value.asInstanceOf[js.Any])
    }
  }
  
  type Pattern = String | MinimalPattern
  
  type PluginModule = js.Function1[/* options */ Any, Unit]
  
  trait PluginOptions extends StObject
  
  type UnknownType = Any
}
