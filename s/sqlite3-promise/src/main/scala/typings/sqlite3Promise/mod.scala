package typings.sqlite3Promise

import typings.node.eventsMod.EventEmitterOptions
import typings.sqlite3.mod.sqlite3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqlite3-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sqlite3-promise", "ABORT")
  @js.native
  val ABORT: Double = js.native
  
  @JSImport("sqlite3-promise", "AUTH")
  @js.native
  val AUTH: Double = js.native
  
  @JSImport("sqlite3-promise", "BUSY")
  @js.native
  val BUSY: Double = js.native
  
  @JSImport("sqlite3-promise", "CANTOPEN")
  @js.native
  val CANTOPEN: Double = js.native
  
  @JSImport("sqlite3-promise", "CONSTRAINT")
  @js.native
  val CONSTRAINT: Double = js.native
  
  @JSImport("sqlite3-promise", "CORRUPT")
  @js.native
  val CORRUPT: Double = js.native
  
  @JSImport("sqlite3-promise", "Database")
  @js.native
  open class Database protected ()
    extends typings.sqlite3.mod.Database {
    def this(filename: String) = this()
    def this(filename: String, callback: js.Function1[/* err */ js.Error | Null, Unit]) = this()
    def this(filename: String, mode: Double) = this()
    def this(filename: String, mode: Double, callback: js.Function1[/* err */ js.Error | Null, Unit]) = this()
    def this(filename: String, mode: Unit, callback: js.Function1[/* err */ js.Error | Null, Unit]) = this()
  }
  
  @JSImport("sqlite3-promise", "EMPTY")
  @js.native
  val EMPTY: Double = js.native
  
  @JSImport("sqlite3-promise", "ERROR")
  @js.native
  val ERROR: Double = js.native
  
  @JSImport("sqlite3-promise", "FORMAT")
  @js.native
  val FORMAT: Double = js.native
  
  @JSImport("sqlite3-promise", "FULL")
  @js.native
  val FULL: Double = js.native
  
  @JSImport("sqlite3-promise", "INTERNAL")
  @js.native
  val INTERNAL: Double = js.native
  
  @JSImport("sqlite3-promise", "INTERRUPT")
  @js.native
  val INTERRUPT: Double = js.native
  
  @JSImport("sqlite3-promise", "IOERR")
  @js.native
  val IOERR: Double = js.native
  
  @JSImport("sqlite3-promise", "LIMIT_ATTACHED")
  @js.native
  val LIMIT_ATTACHED: Double = js.native
  
  @JSImport("sqlite3-promise", "LIMIT_COLUMN")
  @js.native
  val LIMIT_COLUMN: Double = js.native
  
  @JSImport("sqlite3-promise", "LIMIT_COMPOUND_SELECT")
  @js.native
  val LIMIT_COMPOUND_SELECT: Double = js.native
  
  @JSImport("sqlite3-promise", "LIMIT_EXPR_DEPTH")
  @js.native
  val LIMIT_EXPR_DEPTH: Double = js.native
  
  @JSImport("sqlite3-promise", "LIMIT_FUNCTION_ARG")
  @js.native
  val LIMIT_FUNCTION_ARG: Double = js.native
  
  @JSImport("sqlite3-promise", "LIMIT_LENGTH")
  @js.native
  val LIMIT_LENGTH: Double = js.native
  
  @JSImport("sqlite3-promise", "LIMIT_LIKE_PATTERN_LENGTH")
  @js.native
  val LIMIT_LIKE_PATTERN_LENGTH: Double = js.native
  
  @JSImport("sqlite3-promise", "LIMIT_SQL_LENGTH")
  @js.native
  val LIMIT_SQL_LENGTH: Double = js.native
  
  @JSImport("sqlite3-promise", "LIMIT_TRIGGER_DEPTH")
  @js.native
  val LIMIT_TRIGGER_DEPTH: Double = js.native
  
  @JSImport("sqlite3-promise", "LIMIT_VARIABLE_NUMBER")
  @js.native
  val LIMIT_VARIABLE_NUMBER: Double = js.native
  
  @JSImport("sqlite3-promise", "LIMIT_VDBE_OP")
  @js.native
  val LIMIT_VDBE_OP: Double = js.native
  
  @JSImport("sqlite3-promise", "LIMIT_WORKER_THREADS")
  @js.native
  val LIMIT_WORKER_THREADS: Double = js.native
  
  @JSImport("sqlite3-promise", "LOCKED")
  @js.native
  val LOCKED: Double = js.native
  
  @JSImport("sqlite3-promise", "MISMATCH")
  @js.native
  val MISMATCH: Double = js.native
  
  @JSImport("sqlite3-promise", "MISUSE")
  @js.native
  val MISUSE: Double = js.native
  
  @JSImport("sqlite3-promise", "NOLFS")
  @js.native
  val NOLFS: Double = js.native
  
  @JSImport("sqlite3-promise", "NOMEM")
  @js.native
  val NOMEM: Double = js.native
  
  @JSImport("sqlite3-promise", "NOTADB")
  @js.native
  val NOTADB: Double = js.native
  
  @JSImport("sqlite3-promise", "NOTFOUND")
  @js.native
  val NOTFOUND: Double = js.native
  
  @JSImport("sqlite3-promise", "OK")
  @js.native
  val OK: Double = js.native
  
  @JSImport("sqlite3-promise", "OPEN_CREATE")
  @js.native
  val OPEN_CREATE: Double = js.native
  
  @JSImport("sqlite3-promise", "OPEN_FULLMUTEX")
  @js.native
  val OPEN_FULLMUTEX: Double = js.native
  
  @JSImport("sqlite3-promise", "OPEN_PRIVATECACHE")
  @js.native
  val OPEN_PRIVATECACHE: Double = js.native
  
  @JSImport("sqlite3-promise", "OPEN_READONLY")
  @js.native
  val OPEN_READONLY: Double = js.native
  
  @JSImport("sqlite3-promise", "OPEN_READWRITE")
  @js.native
  val OPEN_READWRITE: Double = js.native
  
  @JSImport("sqlite3-promise", "OPEN_SHAREDCACHE")
  @js.native
  val OPEN_SHAREDCACHE: Double = js.native
  
  @JSImport("sqlite3-promise", "OPEN_URI")
  @js.native
  val OPEN_URI: Double = js.native
  
  @JSImport("sqlite3-promise", "PERM")
  @js.native
  val PERM: Double = js.native
  
  @JSImport("sqlite3-promise", "PROTOCOL")
  @js.native
  val PROTOCOL: Double = js.native
  
  @JSImport("sqlite3-promise", "RANGE")
  @js.native
  val RANGE: Double = js.native
  
  @JSImport("sqlite3-promise", "READONLY")
  @js.native
  val READONLY: Double = js.native
  
  @JSImport("sqlite3-promise", "SCHEMA")
  @js.native
  val SCHEMA: Double = js.native
  
  @JSImport("sqlite3-promise", "SOURCE_ID")
  @js.native
  val SOURCE_ID: String = js.native
  
  @JSImport("sqlite3-promise", "Statement")
  @js.native
  open class Statement ()
    extends typings.sqlite3.mod.Statement {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("sqlite3-promise", "TOOBIG")
  @js.native
  val TOOBIG: Double = js.native
  
  @JSImport("sqlite3-promise", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("sqlite3-promise", "VERSION_NUMBER")
  @js.native
  val VERSION_NUMBER: Double = js.native
  
  object cached {
    
    @JSImport("sqlite3-promise", "cached")
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
  
  inline def verbose(): sqlite3 = ^.asInstanceOf[js.Dynamic].applyDynamic("verbose")().asInstanceOf[sqlite3]
  
  /* augmented module */
  object sqlite3AugmentingMod {
    
    @js.native
    trait Database extends StObject {
      
      def allAsync(sql: String): js.Promise[js.Array[Any]] = js.native
      
      def closeAsync(): js.Promise[Unit] = js.native
      
      def eachAsync(sql: String): js.Promise[Double] = js.native
      def eachAsync(
        sql: String,
        cb: js.ThisFunction2[
              /* this */ typings.sqlite3.mod.Statement, 
              /* err */ js.Error | Null, 
              /* row */ Any, 
              Unit
            ]
      ): js.Promise[Double] = js.native
      def eachAsync(sql: String, params: Any): js.Promise[Double] = js.native
      def eachAsync(
        sql: String,
        params: Any,
        cb: js.ThisFunction2[
              /* this */ typings.sqlite3.mod.Statement, 
              /* err */ js.Error | Null, 
              /* row */ Any, 
              Unit
            ]
      ): js.Promise[Double] = js.native
      
      def execAsync(sql: String): js.Promise[typings.sqlite3.mod.Statement] = js.native
      
      def getAsync(sql: String): js.Promise[Any] = js.native
      
      def runAsync(sql: String): js.Promise[Unit] = js.native
    }
  }
}
