package typings.sqlite

import typings.sqlite.interfacesMod.ISqlite.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqlite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Database[Driver /* <: typings.sqlite.sqlite3Mod.Database */, Stmt /* <: typings.sqlite.sqlite3Mod.Statement */] protected ()
    extends typings.sqlite.databaseMod.Database[Driver, Stmt] {
    def this(config: Config) = this()
  }
  
  @js.native
  class Statement[S /* <: typings.sqlite.sqlite3Mod.Statement */] protected ()
    extends typings.sqlite.statementMod.Statement[S] {
    def this(stmt: S) = this()
  }
  
  /**
    * Opens a database for manipulation. Most users will call this to get started.
    */
  def open[Driver /* <: typings.sqlite.sqlite3Mod.Database */, Stmt /* <: typings.sqlite.sqlite3Mod.Statement */](config: Config): js.Promise[
    typings.sqlite.databaseMod.Database[typings.sqlite.sqlite3Mod.Database, typings.sqlite.sqlite3Mod.Statement]
  ] = js.native
}

