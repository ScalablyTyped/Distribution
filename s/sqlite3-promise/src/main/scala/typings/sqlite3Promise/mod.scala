package typings.sqlite3Promise

import typings.sqlite3.mod.sqlite3
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqlite3-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sqlite3-promise", "Database")
  @js.native
  class Database protected ()
    extends typings.sqlite3.mod.Database {
    def this(filename: String) = this()
    def this(filename: String, callback: js.Function1[/* err */ Error | Null, Unit]) = this()
    def this(filename: String, mode: Double) = this()
    def this(filename: String, mode: Double, callback: js.Function1[/* err */ Error | Null, Unit]) = this()
    def this(filename: String, mode: Unit, callback: js.Function1[/* err */ Error | Null, Unit]) = this()
  }
  
  @JSImport("sqlite3-promise", "OPEN_CREATE")
  @js.native
  val OPEN_CREATE: Double = js.native
  
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
  
  @JSImport("sqlite3-promise", "Statement")
  @js.native
  class Statement ()
    extends typings.sqlite3.mod.Statement
  
  object cached {
    
    @JSImport("sqlite3-promise", "cached")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def Database(filename: String): typings.sqlite3.mod.Database = ^.asInstanceOf[js.Dynamic].applyDynamic("Database")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.sqlite3.mod.Database]
    @scala.inline
    def Database(
      filename: String,
      callback: js.ThisFunction1[/* this */ typings.sqlite3.mod.Database, /* err */ Error | Null, Unit]
    ): typings.sqlite3.mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("Database")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.sqlite3.mod.Database]
    @scala.inline
    def Database(filename: String, mode: Double): typings.sqlite3.mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("Database")(filename.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.sqlite3.mod.Database]
    @scala.inline
    def Database(
      filename: String,
      mode: Double,
      callback: js.ThisFunction1[/* this */ typings.sqlite3.mod.Database, /* err */ Error | Null, Unit]
    ): typings.sqlite3.mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("Database")(filename.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.sqlite3.mod.Database]
    @scala.inline
    def Database(
      filename: String,
      mode: Unit,
      callback: js.ThisFunction1[/* this */ typings.sqlite3.mod.Database, /* err */ Error | Null, Unit]
    ): typings.sqlite3.mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("Database")(filename.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.sqlite3.mod.Database]
  }
  
  @scala.inline
  def verbose(): sqlite3 = ^.asInstanceOf[js.Dynamic].applyDynamic("verbose")().asInstanceOf[sqlite3]
  
  /* augmented module */
  object sqlite3AugmentingMod {
    
    @js.native
    trait Database extends StObject {
      
      def allAsync(sql: String): js.Promise[js.Array[js.Any]] = js.native
      
      def closeAsync(): js.Promise[Unit] = js.native
      
      def eachAsync(sql: String): js.Promise[Double] = js.native
      def eachAsync(
        sql: String,
        cb: js.ThisFunction2[
              /* this */ typings.sqlite3.mod.Statement, 
              /* err */ Error | Null, 
              /* row */ js.Any, 
              Unit
            ]
      ): js.Promise[Double] = js.native
      def eachAsync(sql: String, params: js.Any): js.Promise[Double] = js.native
      def eachAsync(
        sql: String,
        params: js.Any,
        cb: js.ThisFunction2[
              /* this */ typings.sqlite3.mod.Statement, 
              /* err */ Error | Null, 
              /* row */ js.Any, 
              Unit
            ]
      ): js.Promise[Double] = js.native
      
      def execAsync(sql: String): js.Promise[typings.sqlite3.mod.Statement] = js.native
      
      def getAsync(sql: String): js.Promise[js.Any] = js.native
      
      def runAsync(sql: String): js.Promise[Unit] = js.native
    }
  }
}
