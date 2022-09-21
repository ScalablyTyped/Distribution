package typings.sqlite3

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.sqlite3.sqlite3Strings.busyTimeout
import typings.sqlite3.sqlite3Strings.change
import typings.sqlite3.sqlite3Strings.close
import typings.sqlite3.sqlite3Strings.error
import typings.sqlite3.sqlite3Strings.limit
import typings.sqlite3.sqlite3Strings.open
import typings.sqlite3.sqlite3Strings.profile
import typings.sqlite3.sqlite3Strings.trace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqlite3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sqlite3", "ABORT")
  @js.native
  val ABORT: Double = js.native
  
  @JSImport("sqlite3", "AUTH")
  @js.native
  val AUTH: Double = js.native
  
  @JSImport("sqlite3", "BUSY")
  @js.native
  val BUSY: Double = js.native
  
  @JSImport("sqlite3", "CANTOPEN")
  @js.native
  val CANTOPEN: Double = js.native
  
  @JSImport("sqlite3", "CONSTRAINT")
  @js.native
  val CONSTRAINT: Double = js.native
  
  @JSImport("sqlite3", "CORRUPT")
  @js.native
  val CORRUPT: Double = js.native
  
  @JSImport("sqlite3", "Database")
  @js.native
  open class Database protected () extends EventEmitter {
    def this(filename: String) = this()
    def this(filename: String, callback: js.Function1[/* err */ js.Error | Null, Unit]) = this()
    def this(filename: String, mode: Double) = this()
    def this(filename: String, mode: Double, callback: js.Function1[/* err */ js.Error | Null, Unit]) = this()
    def this(filename: String, mode: Unit, callback: js.Function1[/* err */ js.Error | Null, Unit]) = this()
    
    def all(sql: String): this.type = js.native
    def all(
      sql: String,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* rows */ js.Array[Any], Unit]
    ): this.type = js.native
    def all(sql: String, params: Any*): this.type = js.native
    def all(sql: String, params: Any): this.type = js.native
    def all(
      sql: String,
      params: Any,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* rows */ js.Array[Any], Unit]
    ): this.type = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    
    @JSName("configure")
    def configure_busyTimeout(option: busyTimeout, value: Double): Unit = js.native
    @JSName("configure")
    def configure_limit(option: limit, id: Double, value: Double): Unit = js.native
    
    def each(sql: String): this.type = js.native
    def each(
      sql: String,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* row */ Any, Unit]
    ): this.type = js.native
    def each(
      sql: String,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* row */ Any, Unit],
      complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(
      sql: String,
      callback: Unit,
      complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(sql: String, params: Any*): this.type = js.native
    def each(sql: String, params: Any): this.type = js.native
    def each(
      sql: String,
      params: Any,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* row */ Any, Unit]
    ): this.type = js.native
    def each(
      sql: String,
      params: Any,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* row */ Any, Unit],
      complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(
      sql: String,
      params: Any,
      callback: Unit,
      complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    
    def exec(sql: String): this.type = js.native
    def exec(sql: String, callback: js.ThisFunction1[/* this */ Statement, /* err */ js.Error | Null, Unit]): this.type = js.native
    
    def get(sql: String): this.type = js.native
    def get(
      sql: String,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* row */ Any, Unit]
    ): this.type = js.native
    def get(sql: String, params: Any*): this.type = js.native
    def get(sql: String, params: Any): this.type = js.native
    def get(
      sql: String,
      params: Any,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* row */ Any, Unit]
    ): this.type = js.native
    
    def interrupt(): Unit = js.native
    
    def loadExtension(filename: String): this.type = js.native
    def loadExtension(filename: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): this.type = js.native
    
    def on(event: open | close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_change(
      event: change,
      listener: js.Function4[/* type */ String, /* database */ String, /* table */ String, /* rowid */ Double, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_profile(event: profile, listener: js.Function2[/* sql */ String, /* time */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_trace(event: trace, listener: js.Function1[/* sql */ String, Unit]): this.type = js.native
    
    def parallelize(): Unit = js.native
    def parallelize(callback: js.Function0[Unit]): Unit = js.native
    
    def prepare(sql: String): Statement = js.native
    def prepare(sql: String, callback: js.ThisFunction1[/* this */ Statement, /* err */ js.Error | Null, Unit]): Statement = js.native
    def prepare(sql: String, params: Any*): Statement = js.native
    def prepare(sql: String, params: Any): Statement = js.native
    def prepare(
      sql: String,
      params: Any,
      callback: js.ThisFunction1[/* this */ Statement, /* err */ js.Error | Null, Unit]
    ): Statement = js.native
    
    def run(sql: String): this.type = js.native
    def run(sql: String, callback: js.ThisFunction1[/* this */ RunResult, /* err */ js.Error | Null, Unit]): this.type = js.native
    def run(sql: String, params: Any*): this.type = js.native
    def run(sql: String, params: Any): this.type = js.native
    def run(
      sql: String,
      params: Any,
      callback: js.ThisFunction1[/* this */ RunResult, /* err */ js.Error | Null, Unit]
    ): this.type = js.native
    
    def serialize(): Unit = js.native
    def serialize(callback: js.Function0[Unit]): Unit = js.native
    
    def wait(callback: js.Function1[/* param */ Null, Unit]): this.type = js.native
  }
  
  @JSImport("sqlite3", "EMPTY")
  @js.native
  val EMPTY: Double = js.native
  
  @JSImport("sqlite3", "ERROR")
  @js.native
  val ERROR: Double = js.native
  
  @JSImport("sqlite3", "FORMAT")
  @js.native
  val FORMAT: Double = js.native
  
  @JSImport("sqlite3", "FULL")
  @js.native
  val FULL: Double = js.native
  
  @JSImport("sqlite3", "INTERNAL")
  @js.native
  val INTERNAL: Double = js.native
  
  @JSImport("sqlite3", "INTERRUPT")
  @js.native
  val INTERRUPT: Double = js.native
  
  @JSImport("sqlite3", "IOERR")
  @js.native
  val IOERR: Double = js.native
  
  @JSImport("sqlite3", "LIMIT_ATTACHED")
  @js.native
  val LIMIT_ATTACHED: Double = js.native
  
  @JSImport("sqlite3", "LIMIT_COLUMN")
  @js.native
  val LIMIT_COLUMN: Double = js.native
  
  @JSImport("sqlite3", "LIMIT_COMPOUND_SELECT")
  @js.native
  val LIMIT_COMPOUND_SELECT: Double = js.native
  
  @JSImport("sqlite3", "LIMIT_EXPR_DEPTH")
  @js.native
  val LIMIT_EXPR_DEPTH: Double = js.native
  
  @JSImport("sqlite3", "LIMIT_FUNCTION_ARG")
  @js.native
  val LIMIT_FUNCTION_ARG: Double = js.native
  
  @JSImport("sqlite3", "LIMIT_LENGTH")
  @js.native
  val LIMIT_LENGTH: Double = js.native
  
  @JSImport("sqlite3", "LIMIT_LIKE_PATTERN_LENGTH")
  @js.native
  val LIMIT_LIKE_PATTERN_LENGTH: Double = js.native
  
  @JSImport("sqlite3", "LIMIT_SQL_LENGTH")
  @js.native
  val LIMIT_SQL_LENGTH: Double = js.native
  
  @JSImport("sqlite3", "LIMIT_TRIGGER_DEPTH")
  @js.native
  val LIMIT_TRIGGER_DEPTH: Double = js.native
  
  @JSImport("sqlite3", "LIMIT_VARIABLE_NUMBER")
  @js.native
  val LIMIT_VARIABLE_NUMBER: Double = js.native
  
  @JSImport("sqlite3", "LIMIT_VDBE_OP")
  @js.native
  val LIMIT_VDBE_OP: Double = js.native
  
  @JSImport("sqlite3", "LIMIT_WORKER_THREADS")
  @js.native
  val LIMIT_WORKER_THREADS: Double = js.native
  
  @JSImport("sqlite3", "LOCKED")
  @js.native
  val LOCKED: Double = js.native
  
  @JSImport("sqlite3", "MISMATCH")
  @js.native
  val MISMATCH: Double = js.native
  
  @JSImport("sqlite3", "MISUSE")
  @js.native
  val MISUSE: Double = js.native
  
  @JSImport("sqlite3", "NOLFS")
  @js.native
  val NOLFS: Double = js.native
  
  @JSImport("sqlite3", "NOMEM")
  @js.native
  val NOMEM: Double = js.native
  
  @JSImport("sqlite3", "NOTADB")
  @js.native
  val NOTADB: Double = js.native
  
  @JSImport("sqlite3", "NOTFOUND")
  @js.native
  val NOTFOUND: Double = js.native
  
  @JSImport("sqlite3", "OK")
  @js.native
  val OK: Double = js.native
  
  @JSImport("sqlite3", "OPEN_CREATE")
  @js.native
  val OPEN_CREATE: Double = js.native
  
  @JSImport("sqlite3", "OPEN_FULLMUTEX")
  @js.native
  val OPEN_FULLMUTEX: Double = js.native
  
  @JSImport("sqlite3", "OPEN_PRIVATECACHE")
  @js.native
  val OPEN_PRIVATECACHE: Double = js.native
  
  @JSImport("sqlite3", "OPEN_READONLY")
  @js.native
  val OPEN_READONLY: Double = js.native
  
  @JSImport("sqlite3", "OPEN_READWRITE")
  @js.native
  val OPEN_READWRITE: Double = js.native
  
  @JSImport("sqlite3", "OPEN_SHAREDCACHE")
  @js.native
  val OPEN_SHAREDCACHE: Double = js.native
  
  @JSImport("sqlite3", "OPEN_URI")
  @js.native
  val OPEN_URI: Double = js.native
  
  @JSImport("sqlite3", "PERM")
  @js.native
  val PERM: Double = js.native
  
  @JSImport("sqlite3", "PROTOCOL")
  @js.native
  val PROTOCOL: Double = js.native
  
  @JSImport("sqlite3", "RANGE")
  @js.native
  val RANGE: Double = js.native
  
  @JSImport("sqlite3", "READONLY")
  @js.native
  val READONLY: Double = js.native
  
  @JSImport("sqlite3", "SCHEMA")
  @js.native
  val SCHEMA: Double = js.native
  
  @JSImport("sqlite3", "SOURCE_ID")
  @js.native
  val SOURCE_ID: String = js.native
  
  @JSImport("sqlite3", "Statement")
  @js.native
  open class Statement () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def all(): this.type = js.native
    def all(callback: js.Function2[/* err */ js.Error | Null, /* rows */ js.Array[Any], Unit]): this.type = js.native
    def all(params: Any*): this.type = js.native
    def all(params: Any): this.type = js.native
    def all(
      params: Any,
      callback: js.ThisFunction2[/* this */ RunResult, /* err */ js.Error | Null, /* rows */ js.Array[Any], Unit]
    ): this.type = js.native
    
    def bind(): this.type = js.native
    def bind(callback: js.Function1[/* err */ js.Error | Null, Unit]): this.type = js.native
    def bind(params: Any*): this.type = js.native
    
    def each(): this.type = js.native
    def each(callback: js.Function2[/* err */ js.Error | Null, /* row */ Any, Unit]): this.type = js.native
    def each(
      callback: js.Function2[/* err */ js.Error | Null, /* row */ Any, Unit],
      complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(callback: Unit, complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]): this.type = js.native
    def each(params: Any*): this.type = js.native
    def each(params: Any): this.type = js.native
    def each(
      params: Any,
      callback: js.ThisFunction2[/* this */ RunResult, /* err */ js.Error | Null, /* row */ Any, Unit]
    ): this.type = js.native
    def each(
      params: Any,
      callback: js.ThisFunction2[/* this */ RunResult, /* err */ js.Error | Null, /* row */ Any, Unit],
      complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(
      params: Any,
      callback: Unit,
      complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    
    def finalize(callback: js.Function1[/* err */ js.Error, Unit]): Database = js.native
    
    def get(): this.type = js.native
    def get(callback: js.Function2[/* err */ js.Error | Null, /* row */ js.UndefOr[Any], Unit]): this.type = js.native
    def get(params: Any*): this.type = js.native
    def get(params: Any): this.type = js.native
    def get(
      params: Any,
      callback: js.ThisFunction2[/* this */ RunResult, /* err */ js.Error | Null, /* row */ js.UndefOr[Any], Unit]
    ): this.type = js.native
    
    def reset(): this.type = js.native
    def reset(callback: js.Function1[/* err */ Null, Unit]): this.type = js.native
    
    def run(): this.type = js.native
    def run(callback: js.Function1[/* err */ js.Error | Null, Unit]): this.type = js.native
    def run(params: Any*): this.type = js.native
    def run(params: Any): this.type = js.native
    def run(params: Any, callback: js.ThisFunction1[/* this */ RunResult, /* err */ js.Error | Null, Unit]): this.type = js.native
  }
  
  @JSImport("sqlite3", "TOOBIG")
  @js.native
  val TOOBIG: Double = js.native
  
  @JSImport("sqlite3", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("sqlite3", "VERSION_NUMBER")
  @js.native
  val VERSION_NUMBER: Double = js.native
  
  object cached {
    
    @JSImport("sqlite3", "cached")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Database(filename: String): typings.sqlite3.mod.Database = ^.asInstanceOf[js.Dynamic].applyDynamic("Database")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.sqlite3.mod.Database]
    inline def Database(
      filename: String,
      callback: js.ThisFunction1[/* this */ typings.sqlite3.mod.Database, /* err */ js.Error | Null, Unit]
    ): typings.sqlite3.mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("Database")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.sqlite3.mod.Database]
    inline def Database(filename: String, mode: Double): typings.sqlite3.mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("Database")(filename.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.sqlite3.mod.Database]
    inline def Database(
      filename: String,
      mode: Double,
      callback: js.ThisFunction1[/* this */ typings.sqlite3.mod.Database, /* err */ js.Error | Null, Unit]
    ): typings.sqlite3.mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("Database")(filename.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.sqlite3.mod.Database]
    inline def Database(
      filename: String,
      mode: Unit,
      callback: js.ThisFunction1[/* this */ typings.sqlite3.mod.Database, /* err */ js.Error | Null, Unit]
    ): typings.sqlite3.mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("Database")(filename.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.sqlite3.mod.Database]
  }
  
  inline def verbose(): typings.sqlite3.mod.sqlite3 = ^.asInstanceOf[js.Dynamic].applyDynamic("verbose")().asInstanceOf[typings.sqlite3.mod.sqlite3]
  
  @js.native
  trait RunResult extends Statement {
    
    var changes: Double = js.native
    
    var lastID: Double = js.native
  }
  
  trait sqlite3 extends StObject {
    
    var ABORT: Double
    
    var AUTH: Double
    
    var BUSY: Double
    
    var CANTOPEN: Double
    
    var CONSTRAINT: Double
    
    var CORRUPT: Double
    
    var Database: Instantiable2[
        /* filename */ String, 
        /* callback */ js.UndefOr[js.Function1[/* err */ js.Error | Null, Unit]], 
        typings.sqlite3.mod.Database
      ]
    
    var EMPTY: Double
    
    var ERROR: Double
    
    var FORMAT: Double
    
    var FULL: Double
    
    var INTERNAL: Double
    
    var INTERRUPT: Double
    
    var IOERR: Double
    
    var LIMIT_ATTACHED: Double
    
    var LIMIT_COLUMN: Double
    
    var LIMIT_COMPOUND_SELECT: Double
    
    var LIMIT_EXPR_DEPTH: Double
    
    var LIMIT_FUNCTION_ARG: Double
    
    var LIMIT_LENGTH: Double
    
    var LIMIT_LIKE_PATTERN_LENGTH: Double
    
    var LIMIT_SQL_LENGTH: Double
    
    var LIMIT_TRIGGER_DEPTH: Double
    
    var LIMIT_VARIABLE_NUMBER: Double
    
    var LIMIT_VDBE_OP: Double
    
    var LIMIT_WORKER_THREADS: Double
    
    var LOCKED: Double
    
    var MISMATCH: Double
    
    var MISUSE: Double
    
    var NOLFS: Double
    
    var NOMEM: Double
    
    var NOTADB: Double
    
    var NOTFOUND: Double
    
    var OK: Double
    
    var OPEN_CREATE: Double
    
    var OPEN_FULLMUTEX: Double
    
    var OPEN_PRIVATECACHE: Double
    
    var OPEN_READONLY: Double
    
    var OPEN_READWRITE: Double
    
    var OPEN_SHAREDCACHE: Double
    
    var OPEN_URI: Double
    
    var PERM: Double
    
    var PROTOCOL: Double
    
    var RANGE: Double
    
    var READONLY: Double
    
    var RunResult: typings.sqlite3.mod.RunResult
    
    var SCHEMA: Double
    
    var SOURCE_ID: String
    
    var Statement: Instantiable0[typings.sqlite3.mod.Statement]
    
    var TOOBIG: Double
    
    var VERSION: String
    
    var VERSION_NUMBER: Double
    
    var cached: typings.sqlite3.anon.Database
    
    def verbose(): this.type
  }
  object sqlite3 {
    
    inline def apply(
      ABORT: Double,
      AUTH: Double,
      BUSY: Double,
      CANTOPEN: Double,
      CONSTRAINT: Double,
      CORRUPT: Double,
      Database: Instantiable2[
          /* filename */ String, 
          /* callback */ js.UndefOr[js.Function1[/* err */ js.Error | Null, Unit]], 
          Database
        ],
      EMPTY: Double,
      ERROR: Double,
      FORMAT: Double,
      FULL: Double,
      INTERNAL: Double,
      INTERRUPT: Double,
      IOERR: Double,
      LIMIT_ATTACHED: Double,
      LIMIT_COLUMN: Double,
      LIMIT_COMPOUND_SELECT: Double,
      LIMIT_EXPR_DEPTH: Double,
      LIMIT_FUNCTION_ARG: Double,
      LIMIT_LENGTH: Double,
      LIMIT_LIKE_PATTERN_LENGTH: Double,
      LIMIT_SQL_LENGTH: Double,
      LIMIT_TRIGGER_DEPTH: Double,
      LIMIT_VARIABLE_NUMBER: Double,
      LIMIT_VDBE_OP: Double,
      LIMIT_WORKER_THREADS: Double,
      LOCKED: Double,
      MISMATCH: Double,
      MISUSE: Double,
      NOLFS: Double,
      NOMEM: Double,
      NOTADB: Double,
      NOTFOUND: Double,
      OK: Double,
      OPEN_CREATE: Double,
      OPEN_FULLMUTEX: Double,
      OPEN_PRIVATECACHE: Double,
      OPEN_READONLY: Double,
      OPEN_READWRITE: Double,
      OPEN_SHAREDCACHE: Double,
      OPEN_URI: Double,
      PERM: Double,
      PROTOCOL: Double,
      RANGE: Double,
      READONLY: Double,
      RunResult: RunResult,
      SCHEMA: Double,
      SOURCE_ID: String,
      Statement: Instantiable0[Statement],
      TOOBIG: Double,
      VERSION: String,
      VERSION_NUMBER: Double,
      cached: typings.sqlite3.anon.Database,
      verbose: () => typings.sqlite3.mod.sqlite3
    ): typings.sqlite3.mod.sqlite3 = {
      val __obj = js.Dynamic.literal(ABORT = ABORT.asInstanceOf[js.Any], AUTH = AUTH.asInstanceOf[js.Any], BUSY = BUSY.asInstanceOf[js.Any], CANTOPEN = CANTOPEN.asInstanceOf[js.Any], CONSTRAINT = CONSTRAINT.asInstanceOf[js.Any], CORRUPT = CORRUPT.asInstanceOf[js.Any], Database = Database.asInstanceOf[js.Any], EMPTY = EMPTY.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FORMAT = FORMAT.asInstanceOf[js.Any], FULL = FULL.asInstanceOf[js.Any], INTERNAL = INTERNAL.asInstanceOf[js.Any], INTERRUPT = INTERRUPT.asInstanceOf[js.Any], IOERR = IOERR.asInstanceOf[js.Any], LIMIT_ATTACHED = LIMIT_ATTACHED.asInstanceOf[js.Any], LIMIT_COLUMN = LIMIT_COLUMN.asInstanceOf[js.Any], LIMIT_COMPOUND_SELECT = LIMIT_COMPOUND_SELECT.asInstanceOf[js.Any], LIMIT_EXPR_DEPTH = LIMIT_EXPR_DEPTH.asInstanceOf[js.Any], LIMIT_FUNCTION_ARG = LIMIT_FUNCTION_ARG.asInstanceOf[js.Any], LIMIT_LENGTH = LIMIT_LENGTH.asInstanceOf[js.Any], LIMIT_LIKE_PATTERN_LENGTH = LIMIT_LIKE_PATTERN_LENGTH.asInstanceOf[js.Any], LIMIT_SQL_LENGTH = LIMIT_SQL_LENGTH.asInstanceOf[js.Any], LIMIT_TRIGGER_DEPTH = LIMIT_TRIGGER_DEPTH.asInstanceOf[js.Any], LIMIT_VARIABLE_NUMBER = LIMIT_VARIABLE_NUMBER.asInstanceOf[js.Any], LIMIT_VDBE_OP = LIMIT_VDBE_OP.asInstanceOf[js.Any], LIMIT_WORKER_THREADS = LIMIT_WORKER_THREADS.asInstanceOf[js.Any], LOCKED = LOCKED.asInstanceOf[js.Any], MISMATCH = MISMATCH.asInstanceOf[js.Any], MISUSE = MISUSE.asInstanceOf[js.Any], NOLFS = NOLFS.asInstanceOf[js.Any], NOMEM = NOMEM.asInstanceOf[js.Any], NOTADB = NOTADB.asInstanceOf[js.Any], NOTFOUND = NOTFOUND.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any], OPEN_CREATE = OPEN_CREATE.asInstanceOf[js.Any], OPEN_FULLMUTEX = OPEN_FULLMUTEX.asInstanceOf[js.Any], OPEN_PRIVATECACHE = OPEN_PRIVATECACHE.asInstanceOf[js.Any], OPEN_READONLY = OPEN_READONLY.asInstanceOf[js.Any], OPEN_READWRITE = OPEN_READWRITE.asInstanceOf[js.Any], OPEN_SHAREDCACHE = OPEN_SHAREDCACHE.asInstanceOf[js.Any], OPEN_URI = OPEN_URI.asInstanceOf[js.Any], PERM = PERM.asInstanceOf[js.Any], PROTOCOL = PROTOCOL.asInstanceOf[js.Any], RANGE = RANGE.asInstanceOf[js.Any], READONLY = READONLY.asInstanceOf[js.Any], RunResult = RunResult.asInstanceOf[js.Any], SCHEMA = SCHEMA.asInstanceOf[js.Any], SOURCE_ID = SOURCE_ID.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], TOOBIG = TOOBIG.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any], VERSION_NUMBER = VERSION_NUMBER.asInstanceOf[js.Any], cached = cached.asInstanceOf[js.Any], verbose = js.Any.fromFunction0(verbose))
      __obj.asInstanceOf[typings.sqlite3.mod.sqlite3]
    }
    
    extension [Self <: typings.sqlite3.mod.sqlite3](x: Self) {
      
      inline def setABORT(value: Double): Self = StObject.set(x, "ABORT", value.asInstanceOf[js.Any])
      
      inline def setAUTH(value: Double): Self = StObject.set(x, "AUTH", value.asInstanceOf[js.Any])
      
      inline def setBUSY(value: Double): Self = StObject.set(x, "BUSY", value.asInstanceOf[js.Any])
      
      inline def setCANTOPEN(value: Double): Self = StObject.set(x, "CANTOPEN", value.asInstanceOf[js.Any])
      
      inline def setCONSTRAINT(value: Double): Self = StObject.set(x, "CONSTRAINT", value.asInstanceOf[js.Any])
      
      inline def setCORRUPT(value: Double): Self = StObject.set(x, "CORRUPT", value.asInstanceOf[js.Any])
      
      inline def setCached(value: typings.sqlite3.anon.Database): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
      
      inline def setDatabase(
        value: Instantiable2[
              /* filename */ String, 
              /* callback */ js.UndefOr[js.Function1[/* err */ js.Error | Null, Unit]], 
              Database
            ]
      ): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
      
      inline def setEMPTY(value: Double): Self = StObject.set(x, "EMPTY", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: Double): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setFORMAT(value: Double): Self = StObject.set(x, "FORMAT", value.asInstanceOf[js.Any])
      
      inline def setFULL(value: Double): Self = StObject.set(x, "FULL", value.asInstanceOf[js.Any])
      
      inline def setINTERNAL(value: Double): Self = StObject.set(x, "INTERNAL", value.asInstanceOf[js.Any])
      
      inline def setINTERRUPT(value: Double): Self = StObject.set(x, "INTERRUPT", value.asInstanceOf[js.Any])
      
      inline def setIOERR(value: Double): Self = StObject.set(x, "IOERR", value.asInstanceOf[js.Any])
      
      inline def setLIMIT_ATTACHED(value: Double): Self = StObject.set(x, "LIMIT_ATTACHED", value.asInstanceOf[js.Any])
      
      inline def setLIMIT_COLUMN(value: Double): Self = StObject.set(x, "LIMIT_COLUMN", value.asInstanceOf[js.Any])
      
      inline def setLIMIT_COMPOUND_SELECT(value: Double): Self = StObject.set(x, "LIMIT_COMPOUND_SELECT", value.asInstanceOf[js.Any])
      
      inline def setLIMIT_EXPR_DEPTH(value: Double): Self = StObject.set(x, "LIMIT_EXPR_DEPTH", value.asInstanceOf[js.Any])
      
      inline def setLIMIT_FUNCTION_ARG(value: Double): Self = StObject.set(x, "LIMIT_FUNCTION_ARG", value.asInstanceOf[js.Any])
      
      inline def setLIMIT_LENGTH(value: Double): Self = StObject.set(x, "LIMIT_LENGTH", value.asInstanceOf[js.Any])
      
      inline def setLIMIT_LIKE_PATTERN_LENGTH(value: Double): Self = StObject.set(x, "LIMIT_LIKE_PATTERN_LENGTH", value.asInstanceOf[js.Any])
      
      inline def setLIMIT_SQL_LENGTH(value: Double): Self = StObject.set(x, "LIMIT_SQL_LENGTH", value.asInstanceOf[js.Any])
      
      inline def setLIMIT_TRIGGER_DEPTH(value: Double): Self = StObject.set(x, "LIMIT_TRIGGER_DEPTH", value.asInstanceOf[js.Any])
      
      inline def setLIMIT_VARIABLE_NUMBER(value: Double): Self = StObject.set(x, "LIMIT_VARIABLE_NUMBER", value.asInstanceOf[js.Any])
      
      inline def setLIMIT_VDBE_OP(value: Double): Self = StObject.set(x, "LIMIT_VDBE_OP", value.asInstanceOf[js.Any])
      
      inline def setLIMIT_WORKER_THREADS(value: Double): Self = StObject.set(x, "LIMIT_WORKER_THREADS", value.asInstanceOf[js.Any])
      
      inline def setLOCKED(value: Double): Self = StObject.set(x, "LOCKED", value.asInstanceOf[js.Any])
      
      inline def setMISMATCH(value: Double): Self = StObject.set(x, "MISMATCH", value.asInstanceOf[js.Any])
      
      inline def setMISUSE(value: Double): Self = StObject.set(x, "MISUSE", value.asInstanceOf[js.Any])
      
      inline def setNOLFS(value: Double): Self = StObject.set(x, "NOLFS", value.asInstanceOf[js.Any])
      
      inline def setNOMEM(value: Double): Self = StObject.set(x, "NOMEM", value.asInstanceOf[js.Any])
      
      inline def setNOTADB(value: Double): Self = StObject.set(x, "NOTADB", value.asInstanceOf[js.Any])
      
      inline def setNOTFOUND(value: Double): Self = StObject.set(x, "NOTFOUND", value.asInstanceOf[js.Any])
      
      inline def setOK(value: Double): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
      
      inline def setOPEN_CREATE(value: Double): Self = StObject.set(x, "OPEN_CREATE", value.asInstanceOf[js.Any])
      
      inline def setOPEN_FULLMUTEX(value: Double): Self = StObject.set(x, "OPEN_FULLMUTEX", value.asInstanceOf[js.Any])
      
      inline def setOPEN_PRIVATECACHE(value: Double): Self = StObject.set(x, "OPEN_PRIVATECACHE", value.asInstanceOf[js.Any])
      
      inline def setOPEN_READONLY(value: Double): Self = StObject.set(x, "OPEN_READONLY", value.asInstanceOf[js.Any])
      
      inline def setOPEN_READWRITE(value: Double): Self = StObject.set(x, "OPEN_READWRITE", value.asInstanceOf[js.Any])
      
      inline def setOPEN_SHAREDCACHE(value: Double): Self = StObject.set(x, "OPEN_SHAREDCACHE", value.asInstanceOf[js.Any])
      
      inline def setOPEN_URI(value: Double): Self = StObject.set(x, "OPEN_URI", value.asInstanceOf[js.Any])
      
      inline def setPERM(value: Double): Self = StObject.set(x, "PERM", value.asInstanceOf[js.Any])
      
      inline def setPROTOCOL(value: Double): Self = StObject.set(x, "PROTOCOL", value.asInstanceOf[js.Any])
      
      inline def setRANGE(value: Double): Self = StObject.set(x, "RANGE", value.asInstanceOf[js.Any])
      
      inline def setREADONLY(value: Double): Self = StObject.set(x, "READONLY", value.asInstanceOf[js.Any])
      
      inline def setRunResult(value: RunResult): Self = StObject.set(x, "RunResult", value.asInstanceOf[js.Any])
      
      inline def setSCHEMA(value: Double): Self = StObject.set(x, "SCHEMA", value.asInstanceOf[js.Any])
      
      inline def setSOURCE_ID(value: String): Self = StObject.set(x, "SOURCE_ID", value.asInstanceOf[js.Any])
      
      inline def setStatement(value: Instantiable0[Statement]): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
      
      inline def setTOOBIG(value: Double): Self = StObject.set(x, "TOOBIG", value.asInstanceOf[js.Any])
      
      inline def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
      
      inline def setVERSION_NUMBER(value: Double): Self = StObject.set(x, "VERSION_NUMBER", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: () => typings.sqlite3.mod.sqlite3): Self = StObject.set(x, "verbose", js.Any.fromFunction0(value))
    }
  }
}
