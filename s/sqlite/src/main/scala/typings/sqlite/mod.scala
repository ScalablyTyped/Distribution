package typings.sqlite

import typings.sqlite.buildInterfacesMod.ISqlite.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqlite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sqlite", "Database")
  @js.native
  open class Database[Driver /* <: typings.sqlite.sqlite3Mod.Database */, Stmt /* <: typings.sqlite.sqlite3Mod.Statement */] protected ()
    extends typings.sqlite.buildDatabaseMod.Database[Driver, Stmt] {
    def this(config: Config) = this()
  }
  
  @JSImport("sqlite", "Statement")
  @js.native
  open class Statement[S /* <: typings.sqlite.sqlite3Mod.Statement */] protected ()
    extends typings.sqlite.buildStatementMod.Statement[S] {
    def this(stmt: S) = this()
  }
  
  /**
    * Opens a database for manipulation. Most users will call this to get started.
    */
  inline def open[Driver /* <: typings.sqlite.sqlite3Mod.Database */, Stmt /* <: typings.sqlite.sqlite3Mod.Statement */](config: Config): js.Promise[
    typings.sqlite.buildDatabaseMod.Database[typings.sqlite.sqlite3Mod.Database, typings.sqlite.sqlite3Mod.Statement]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.sqlite.buildDatabaseMod.Database[typings.sqlite.sqlite3Mod.Database, typings.sqlite.sqlite3Mod.Statement]
  ]]
}
