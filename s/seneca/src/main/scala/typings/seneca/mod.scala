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
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("seneca", JSImport.Namespace)
  @js.native
  def apply(): Instance = js.native
  @JSImport("seneca", JSImport.Namespace)
  @js.native
  def apply(options: Options): Instance = js.native
  
  type ActCallback = js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  
  type AddCallback[T] = js.Function2[
    /* msg */ MessagePayload[T], 
    /* respond */ js.Function2[/* error */ Error | Null, /* msg */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  
  @js.native
  trait ClientOptions extends StObject
  
  type CloseCallback = js.Function2[/* optional */ js.Any, /* done */ js.Function1[/* error */ Error, Unit], Unit]
  
  type DatabaseID = String
  
  // NOTE: senecas documented use of:
  //    var product = seneca.make('product')
  //    product.name = 'Apple'
  // causes this error: error TS2339: Property 'name' does not exist on type 'Entity'.
  // Change such references to: product['name']
  @js.native
  trait Entity
    extends /* plugin_name */ StringDictionary[js.Any] {
    
    def apply(canon: js.Any, seneca: js.Any): Unit = js.native
    
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
  
  @js.native
  trait EntityDataWithQuery
    extends /* plugin_name */ StringDictionary[js.Any] {
    
    var id: js.UndefOr[String] = js.native
    
    @JSName("sort$")
    var sort$: js.UndefOr[js.Any] = js.native
  }
  object EntityDataWithQuery {
    
    @scala.inline
    def apply(): EntityDataWithQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EntityDataWithQuery]
    }
    
    @scala.inline
    implicit class EntityDataWithQueryMutableBuilder[Self <: EntityDataWithQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setSort$(value: js.Any): Self = StObject.set(x, "sort$", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSort$Undefined: Self = StObject.set(x, "sort$", js.undefined)
    }
  }
  
  type EntityListCallback = js.Function2[/* error */ Error, /* result */ js.Array[js.Any], Unit]
  
  type EntityLoadCallback = js.Function2[/* error */ Error, /* result */ js.Any, Unit]
  
  type EntityRemoveCallback = js.Function1[/* error */ Error, Unit]
  
  type EntitySaveCallback = js.Function2[/* error */ Error, /* result */ js.Any, Unit]
  
  @js.native
  trait Executor extends StObject {
    
    def cb(err: Error, result: js.Any): Unit = js.native
    @JSName("cb")
    var cb_Original: ExecutorCallback = js.native
    
    var desc: String = js.native
    
    var execute: UnknownType = js.native
    
    def fn(callback: js.Any): Unit = js.native
    @JSName("fn")
    var fn_Original: ExecutorWorker = js.native
    
    var gate: Boolean = js.native
    
    var id: String = js.native
    
    var ungate: Boolean = js.native
  }
  
  type ExecutorCallback = js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  
  type ExecutorWorker = js.Function1[/* callback */ js.Any, Unit]
  
  type GlobalErrorHandler = js.Function1[/* error */ Error, Unit]
  
  @js.native
  trait Instance extends StObject {
    
    def act[PatternWithArgs](pattern: PatternWithArgs, msg: js.Any, respond: ActCallback): Unit = js.native
    def act[PatternWithArgs](pattern: PatternWithArgs, respond: ActCallback): Unit = js.native
    
    def add[PatternType, CallBackParams](pattern: PatternType, action: AddCallback[PatternType with CallBackParams]): this.type = js.native
    def add[PatternType, CallbackParams](pattern: PatternType, paramspec: js.Any, action: AddCallback[PatternType with CallbackParams]): this.type = js.native
    
    def client(): this.type = js.native
    def client(options: ClientOptions): this.type = js.native
    
    def close(callback: CloseCallback): Unit = js.native
    
    def error(handler: GlobalErrorHandler): Unit = js.native
    
    // @param name reference to plugin provided object
    def export(name: String): PluginModule = js.native
    
    def listen(): this.type = js.native
    def listen(options: ListenOptions): this.type = js.native
    
    def make(base: String, entity_canon: String): Entity = js.native
    def make(base: String, entity_canon: String, properties: js.Any): Entity = js.native
    def make(entity_canon: String): Entity = js.native
    def make(entity_canon: String, properties: js.Any): Entity = js.native
    def make(zone: String, base: String, entity_canon: String): Entity = js.native
    def make(zone: String, base: String, entity_canon: String, properties: js.Any): Entity = js.native
    
    def on(eventName: String, callback: js.Function1[/* error */ Error, Unit]): js.Any = js.native
    
    def options(options: Options): Unit = js.native
    
    def pin(pattern: Pattern): Unit = js.native
    
    def ready(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    def use(module: PluginModule): this.type = js.native
    def use(module: PluginModule, options: PluginOptions): this.type = js.native
    def use(name: String): this.type = js.native
    def use(name: String, options: PluginOptions): this.type = js.native
    
    var version: String = js.native
  }
  
  @js.native
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
    
    @scala.inline
    def debugPlussign: typings.seneca.senecaStrings.debugPlussign = "debug+".asInstanceOf[typings.seneca.senecaStrings.debugPlussign]
    
    @scala.inline
    def infoPlussign: typings.seneca.senecaStrings.infoPlussign = "info+".asInstanceOf[typings.seneca.senecaStrings.infoPlussign]
    
    @scala.inline
    def none: typings.seneca.senecaStrings.none = "none".asInstanceOf[typings.seneca.senecaStrings.none]
    
    @scala.inline
    def warnPlussign: typings.seneca.senecaStrings.warnPlussign = "warn+".asInstanceOf[typings.seneca.senecaStrings.warnPlussign]
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
    
    @scala.inline
    def all: typings.seneca.senecaStrings.all = "all".asInstanceOf[typings.seneca.senecaStrings.all]
    
    @scala.inline
    def any: typings.seneca.senecaStrings.any = "any".asInstanceOf[typings.seneca.senecaStrings.any]
    
    @scala.inline
    def print: typings.seneca.senecaStrings.print = "print".asInstanceOf[typings.seneca.senecaStrings.print]
    
    @scala.inline
    def quiet: typings.seneca.senecaStrings.quiet = "quiet".asInstanceOf[typings.seneca.senecaStrings.quiet]
    
    @scala.inline
    def silent: typings.seneca.senecaStrings.silent = "silent".asInstanceOf[typings.seneca.senecaStrings.silent]
    
    @scala.inline
    def standard: typings.seneca.senecaStrings.standard = "standard".asInstanceOf[typings.seneca.senecaStrings.standard]
    
    @scala.inline
    def test: typings.seneca.senecaStrings.test = "test".asInstanceOf[typings.seneca.senecaStrings.test]
  }
  
  type MessagePayload[T] = PartialMessagePayload with T
  
  @js.native
  trait MinimalPattern extends StObject
  
  @js.native
  trait Optioner extends StObject {
    
    def get(): Options = js.native
    
    def set(input: String): Options = js.native
    def set(input: Options): Options = js.native
  }
  
  @js.native
  trait Options
    extends /* plugin_name */ StringDictionary[js.Any] {
    
    // Action cache. Makes inbound messages idempotent.
    var actcache: js.UndefOr[Active] = js.native
    
    // Default seneca-admin settings.
    // TODO: move to seneca-admin!
    var admin: js.UndefOr[Local] = js.native
    
    // Wait time for plugins to close gracefully.
    var deathdelay: js.UndefOr[Double] = js.native
    
    // Debug settings.
    var debug: js.UndefOr[Actcaller] = js.native
    
    // milliseconds
    // Register (true) default plugins. Set false to not register when
    // using custom versions.
    var default_plugins: js.UndefOr[Basic] = js.native
    
    var errhandler: js.UndefOr[GlobalErrorHandler] = js.native
    
    // Standard length of identifiers for actions.
    var idlen: js.UndefOr[Double] = js.native
    
    // Internal settings.
    var internal: js.UndefOr[Actrouter] = js.native
    
    var log: js.UndefOr[LogSpec | Level] = js.native
    
    // Plugin settings
    var plugin: js.UndefOr[js.Any] = js.native
    
    // Settings for network REPL.
    var repl: js.UndefOr[Host] = js.native
    
    // Action statistics settings. See rolling-stats module.
    var stats: js.UndefOr[Interval] = js.native
    
    // Log status at periodic intervals.
    var status: js.UndefOr[Running] = js.native
    
    // Enforce strict behaviours. Relax when backwards compatibility needed.
    var strict: js.UndefOr[Add] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    // Standard timeout for actions.
    var timeout: js.UndefOr[Double] = js.native
    
    // Action executor tracing. See gate-executor module.
    var trace: js.UndefOr[Act] = js.native
    
    // zig module settings for seneca.start() chaining.
    var zig: js.UndefOr[js.Any] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActcache(value: Active): Self = StObject.set(x, "actcache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActcacheUndefined: Self = StObject.set(x, "actcache", js.undefined)
      
      @scala.inline
      def setAdmin(value: Local): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
      
      @scala.inline
      def setDeathdelay(value: Double): Self = StObject.set(x, "deathdelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeathdelayUndefined: Self = StObject.set(x, "deathdelay", js.undefined)
      
      @scala.inline
      def setDebug(value: Actcaller): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDefault_plugins(value: Basic): Self = StObject.set(x, "default_plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_pluginsUndefined: Self = StObject.set(x, "default_plugins", js.undefined)
      
      @scala.inline
      def setErrhandler(value: /* error */ Error => Unit): Self = StObject.set(x, "errhandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrhandlerUndefined: Self = StObject.set(x, "errhandler", js.undefined)
      
      @scala.inline
      def setIdlen(value: Double): Self = StObject.set(x, "idlen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdlenUndefined: Self = StObject.set(x, "idlen", js.undefined)
      
      @scala.inline
      def setInternal(value: Actrouter): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
      
      @scala.inline
      def setLog(value: LogSpec | Level): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setPlugin(value: js.Any): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      @scala.inline
      def setRepl(value: Host): Self = StObject.set(x, "repl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplUndefined: Self = StObject.set(x, "repl", js.undefined)
      
      @scala.inline
      def setStats(value: Interval): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      @scala.inline
      def setStatus(value: Running): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStrict(value: Add): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTrace(value: Act): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      @scala.inline
      def setZig(value: js.Any): Self = StObject.set(x, "zig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZigUndefined: Self = StObject.set(x, "zig", js.undefined)
    }
  }
  
  @js.native
  trait PartialMessagePayload extends StObject {
    
    @JSName("fatal$")
    var fatal$: Boolean = js.native
    
    @JSName("plugin$")
    var plugin$: js.Any = js.native
    
    @JSName("transport$")
    var transport$: js.Object = js.native
    
    @JSName("tx$")
    var tx$: String = js.native
  }
  object PartialMessagePayload {
    
    @scala.inline
    def apply(fatal$: Boolean, plugin$: js.Any, transport$: js.Object, tx$: String): PartialMessagePayload = {
      val __obj = js.Dynamic.literal(fatal$ = fatal$.asInstanceOf[js.Any], plugin$ = plugin$.asInstanceOf[js.Any], transport$ = transport$.asInstanceOf[js.Any], tx$ = tx$.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialMessagePayload]
    }
    
    @scala.inline
    implicit class PartialMessagePayloadMutableBuilder[Self <: PartialMessagePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFatal$(value: Boolean): Self = StObject.set(x, "fatal$", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugin$(value: js.Any): Self = StObject.set(x, "plugin$", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransport$(value: js.Object): Self = StObject.set(x, "transport$", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTx$(value: String): Self = StObject.set(x, "tx$", value.asInstanceOf[js.Any])
    }
  }
  
  type Pattern = String | MinimalPattern
  
  type PluginModule = js.Function1[/* options */ js.Any, Unit]
  
  @js.native
  trait PluginOptions extends StObject
  
  type UnknownType = js.Any
}
