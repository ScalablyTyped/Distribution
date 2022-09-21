package typings.spatialite

import typings.node.eventsMod.EventEmitterOptions
import typings.sqlite3.mod.sqlite3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spatialite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("spatialite", "Database")
  @js.native
  open class Database protected ()
    extends typings.sqlite3.mod.Database {
    def this(filename: String) = this()
    def this(filename: String, callback: js.Function1[/* err */ js.Error | Null, Unit]) = this()
    def this(filename: String, mode: Double) = this()
    def this(filename: String, mode: Double, callback: js.Function1[/* err */ js.Error | Null, Unit]) = this()
    def this(filename: String, mode: Unit, callback: js.Function1[/* err */ js.Error | Null, Unit]) = this()
    
    def spatialite(cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  }
  
  @JSImport("spatialite", "OPEN_CREATE")
  @js.native
  val OPEN_CREATE: Double = js.native
  
  @JSImport("spatialite", "OPEN_READONLY")
  @js.native
  val OPEN_READONLY: Double = js.native
  
  @JSImport("spatialite", "OPEN_READWRITE")
  @js.native
  val OPEN_READWRITE: Double = js.native
  
  @JSImport("spatialite", "Statement")
  @js.native
  open class Statement ()
    extends typings.sqlite3.mod.Statement {
    def this(options: EventEmitterOptions) = this()
  }
  
  object cached {
    
    @JSImport("spatialite", "cached")
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
}
