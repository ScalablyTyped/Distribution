package typings.sqlite

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.node.eventsMod.EventEmitter
import typings.sqlite.sqliteStrings.busyTimeout
import typings.sqlite.sqliteStrings.close
import typings.sqlite.sqliteStrings.error
import typings.sqlite.sqliteStrings.open
import typings.sqlite.sqliteStrings.profile
import typings.sqlite.sqliteStrings.trace
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlite3Mod {
  
  @JSImport("sqlite3", "Database")
  @js.native
  class Database protected () extends EventEmitter {
    def this(filename: String) = this()
    def this(filename: String, callback: js.Function1[/* err */ Error | Null, Unit]) = this()
    def this(filename: String, mode: Double) = this()
    def this(
      filename: String,
      mode: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ Error | Null, Unit]
    ) = this()
    def this(filename: String, mode: Double, callback: js.Function1[/* err */ Error | Null, Unit]) = this()
    
    def all(sql: String): this.type = js.native
    def all(
      sql: String,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* rows */ js.Array[_], Unit]
    ): this.type = js.native
    def all(sql: String, params: js.Any*): this.type = js.native
    def all(sql: String, params: js.Any): this.type = js.native
    def all(
      sql: String,
      params: js.Any,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* rows */ js.Array[_], Unit]
    ): this.type = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    
    @JSName("configure")
    def configure_busyTimeout(option: busyTimeout, value: Double): Unit = js.native
    
    def each(sql: String): this.type = js.native
    def each(
      sql: String,
      callback: js.UndefOr[scala.Nothing],
      complete: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(
      sql: String,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* row */ js.Any, Unit]
    ): this.type = js.native
    def each(
      sql: String,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* row */ js.Any, Unit],
      complete: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(sql: String, params: js.Any*): this.type = js.native
    def each(sql: String, params: js.Any): this.type = js.native
    def each(
      sql: String,
      params: js.Any,
      callback: js.UndefOr[scala.Nothing],
      complete: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(
      sql: String,
      params: js.Any,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* row */ js.Any, Unit]
    ): this.type = js.native
    def each(
      sql: String,
      params: js.Any,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* row */ js.Any, Unit],
      complete: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    
    def exec(sql: String): this.type = js.native
    def exec(sql: String, callback: js.ThisFunction1[/* this */ Statement, /* err */ Error | Null, Unit]): this.type = js.native
    
    def get(sql: String): this.type = js.native
    def get(
      sql: String,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* row */ js.Any, Unit]
    ): this.type = js.native
    def get(sql: String, params: js.Any*): this.type = js.native
    def get(sql: String, params: js.Any): this.type = js.native
    def get(
      sql: String,
      params: js.Any,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* row */ js.Any, Unit]
    ): this.type = js.native
    
    def interrupt(): Unit = js.native
    
    def loadExtension(path: String): Unit = js.native
    def loadExtension(path: String, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_open(event: open, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_profile(event: profile, listener: js.Function2[/* sql */ String, /* time */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_trace(event: trace, listener: js.Function1[/* sql */ String, Unit]): this.type = js.native
    
    def parallelize(): Unit = js.native
    def parallelize(callback: js.Function0[Unit]): Unit = js.native
    
    def prepare(sql: String): Statement = js.native
    def prepare(sql: String, callback: js.ThisFunction1[/* this */ Statement, /* err */ Error | Null, Unit]): Statement = js.native
    def prepare(sql: String, params: js.Any*): Statement = js.native
    def prepare(sql: String, params: js.Any): Statement = js.native
    def prepare(
      sql: String,
      params: js.Any,
      callback: js.ThisFunction1[/* this */ Statement, /* err */ Error | Null, Unit]
    ): Statement = js.native
    
    def run(sql: String): this.type = js.native
    def run(sql: String, callback: js.ThisFunction1[/* this */ RunResult, /* err */ Error | Null, Unit]): this.type = js.native
    def run(sql: String, params: js.Any*): this.type = js.native
    def run(sql: String, params: js.Any): this.type = js.native
    def run(
      sql: String,
      params: js.Any,
      callback: js.ThisFunction1[/* this */ RunResult, /* err */ Error | Null, Unit]
    ): this.type = js.native
    
    def serialize(): Unit = js.native
    def serialize(callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("sqlite3", "OPEN_CREATE")
  @js.native
  val OPEN_CREATE: Double = js.native
  
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
  
  @JSImport("sqlite3", "Statement")
  @js.native
  class Statement () extends StObject {
    
    def all(): this.type = js.native
    def all(callback: js.Function2[/* err */ Error | Null, /* rows */ js.Array[_], Unit]): this.type = js.native
    def all(params: js.Any*): this.type = js.native
    def all(params: js.Any): this.type = js.native
    def all(
      params: js.Any,
      callback: js.ThisFunction2[/* this */ RunResult, /* err */ Error | Null, /* rows */ js.Array[_], Unit]
    ): this.type = js.native
    
    def bind(): this.type = js.native
    def bind(callback: js.Function1[/* err */ Error | Null, Unit]): this.type = js.native
    def bind(params: js.Any*): this.type = js.native
    
    def each(): this.type = js.native
    def each(
      callback: js.UndefOr[scala.Nothing],
      complete: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(callback: js.Function2[/* err */ Error | Null, /* row */ js.Any, Unit]): this.type = js.native
    def each(
      callback: js.Function2[/* err */ Error | Null, /* row */ js.Any, Unit],
      complete: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(params: js.Any*): this.type = js.native
    def each(params: js.Any): this.type = js.native
    def each(
      params: js.Any,
      callback: js.UndefOr[scala.Nothing],
      complete: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(
      params: js.Any,
      callback: js.ThisFunction2[/* this */ RunResult, /* err */ Error | Null, /* row */ js.Any, Unit]
    ): this.type = js.native
    def each(
      params: js.Any,
      callback: js.ThisFunction2[/* this */ RunResult, /* err */ Error | Null, /* row */ js.Any, Unit],
      complete: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    
    def finalize(callback: js.Function1[/* err */ Error, Unit]): Database = js.native
    
    def get(): this.type = js.native
    def get(callback: js.Function2[/* err */ Error | Null, /* row */ js.UndefOr[js.Any], Unit]): this.type = js.native
    def get(params: js.Any*): this.type = js.native
    def get(params: js.Any): this.type = js.native
    def get(
      params: js.Any,
      callback: js.ThisFunction2[/* this */ RunResult, /* err */ Error | Null, /* row */ js.UndefOr[js.Any], Unit]
    ): this.type = js.native
    
    def reset(): this.type = js.native
    def reset(callback: js.Function1[/* err */ Null, Unit]): this.type = js.native
    
    def run(): this.type = js.native
    def run(callback: js.Function1[/* err */ Error | Null, Unit]): this.type = js.native
    def run(params: js.Any*): this.type = js.native
    def run(params: js.Any): this.type = js.native
    def run(params: js.Any, callback: js.ThisFunction1[/* this */ RunResult, /* err */ Error | Null, Unit]): this.type = js.native
  }
  
  object cached {
    
    @JSImport("sqlite3", "cached.Database")
    @js.native
    def Database(filename: String): typings.sqlite.sqlite3Mod.Database = js.native
    @JSImport("sqlite3", "cached.Database")
    @js.native
    def Database(
      filename: String,
      callback: js.ThisFunction1[/* this */ typings.sqlite.sqlite3Mod.Database, /* err */ Error | Null, Unit]
    ): typings.sqlite.sqlite3Mod.Database = js.native
    @JSImport("sqlite3", "cached.Database")
    @js.native
    def Database(
      filename: String,
      mode: js.UndefOr[scala.Nothing],
      callback: js.ThisFunction1[/* this */ typings.sqlite.sqlite3Mod.Database, /* err */ Error | Null, Unit]
    ): typings.sqlite.sqlite3Mod.Database = js.native
    @JSImport("sqlite3", "cached.Database")
    @js.native
    def Database(filename: String, mode: Double): typings.sqlite.sqlite3Mod.Database = js.native
    @JSImport("sqlite3", "cached.Database")
    @js.native
    def Database(
      filename: String,
      mode: Double,
      callback: js.ThisFunction1[/* this */ typings.sqlite.sqlite3Mod.Database, /* err */ Error | Null, Unit]
    ): typings.sqlite.sqlite3Mod.Database = js.native
  }
  
  @JSImport("sqlite3", "verbose")
  @js.native
  def verbose(): sqlite3 = js.native
  
  @js.native
  trait RunResult extends Statement {
    
    var changes: Double = js.native
    
    var lastID: Double = js.native
  }
  
  @js.native
  trait sqlite3 extends StObject {
    
    var Database: Instantiable2[
        /* filename */ String, 
        /* callback */ js.UndefOr[js.Function1[/* err */ Error | Null, Unit]], 
        typings.sqlite.sqlite3Mod.Database
      ] = js.native
    
    var OPEN_CREATE: Double = js.native
    
    var OPEN_PRIVATECACHE: Double = js.native
    
    var OPEN_READONLY: Double = js.native
    
    var OPEN_READWRITE: Double = js.native
    
    var OPEN_SHAREDCACHE: Double = js.native
    
    var OPEN_URI: Double = js.native
    
    var RunResult: typings.sqlite.sqlite3Mod.RunResult = js.native
    
    var Statement: Instantiable0[typings.sqlite.sqlite3Mod.Statement] = js.native
    
    var cached: typings.sqlite.anon.Database = js.native
    
    def verbose(): this.type = js.native
  }
  object sqlite3 {
    
    @scala.inline
    def apply(
      Database: Instantiable2[
          /* filename */ String, 
          /* callback */ js.UndefOr[js.Function1[/* err */ Error | Null, Unit]], 
          Database
        ],
      OPEN_CREATE: Double,
      OPEN_PRIVATECACHE: Double,
      OPEN_READONLY: Double,
      OPEN_READWRITE: Double,
      OPEN_SHAREDCACHE: Double,
      OPEN_URI: Double,
      RunResult: RunResult,
      Statement: Instantiable0[Statement],
      cached: typings.sqlite.anon.Database,
      verbose: () => sqlite3
    ): sqlite3 = {
      val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], OPEN_CREATE = OPEN_CREATE.asInstanceOf[js.Any], OPEN_PRIVATECACHE = OPEN_PRIVATECACHE.asInstanceOf[js.Any], OPEN_READONLY = OPEN_READONLY.asInstanceOf[js.Any], OPEN_READWRITE = OPEN_READWRITE.asInstanceOf[js.Any], OPEN_SHAREDCACHE = OPEN_SHAREDCACHE.asInstanceOf[js.Any], OPEN_URI = OPEN_URI.asInstanceOf[js.Any], RunResult = RunResult.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], cached = cached.asInstanceOf[js.Any], verbose = js.Any.fromFunction0(verbose))
      __obj.asInstanceOf[sqlite3]
    }
    
    @scala.inline
    implicit class sqlite3MutableBuilder[Self <: sqlite3] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCached(value: typings.sqlite.anon.Database): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabase(
        value: Instantiable2[
              /* filename */ String, 
              /* callback */ js.UndefOr[js.Function1[/* err */ Error | Null, Unit]], 
              Database
            ]
      ): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPEN_CREATE(value: Double): Self = StObject.set(x, "OPEN_CREATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPEN_PRIVATECACHE(value: Double): Self = StObject.set(x, "OPEN_PRIVATECACHE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPEN_READONLY(value: Double): Self = StObject.set(x, "OPEN_READONLY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPEN_READWRITE(value: Double): Self = StObject.set(x, "OPEN_READWRITE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPEN_SHAREDCACHE(value: Double): Self = StObject.set(x, "OPEN_SHAREDCACHE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPEN_URI(value: Double): Self = StObject.set(x, "OPEN_URI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunResult(value: RunResult): Self = StObject.set(x, "RunResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement(value: Instantiable0[Statement]): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbose(value: () => sqlite3): Self = StObject.set(x, "verbose", js.Any.fromFunction0(value))
    }
  }
}
