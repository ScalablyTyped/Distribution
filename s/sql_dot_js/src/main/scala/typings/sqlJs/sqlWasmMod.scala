package typings.sqlJs

import typings.node.bufferMod.global.Buffer
import typings.sqlJs.mod.InitSqlJsStatic
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlWasmMod {
  
  @JSImport("sql.js/dist/sql-wasm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sql.js/dist/sql-wasm", JSImport.Default)
  @js.native
  def default: InitSqlJsStatic = js.native
  
  @JSImport("sql.js/dist/sql-wasm", "Database")
  @js.native
  /**
    * Represents an SQLite database
    * @see [https://sql.js.org/documentation/Database.html#Database](https://sql.js.org/documentation/Database.html#Database)
    *
    * @param data An array of bytes representing an SQLite database file
    */
  open class Database ()
    extends typings.sqlJs.mod.Database {
    def this(data: Buffer) = this()
    def this(data: ArrayLike[Double]) = this()
  }
  
  @JSImport("sql.js/dist/sql-wasm", "Statement")
  @js.native
  open class Statement ()
    extends typings.sqlJs.mod.Statement
  
  @JSImport("sql.js/dist/sql-wasm", "StatementIterator")
  @js.native
  open class StatementIterator ()
    extends typings.sqlJs.mod.StatementIterator
  
  inline def default_=(x: InitSqlJsStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
