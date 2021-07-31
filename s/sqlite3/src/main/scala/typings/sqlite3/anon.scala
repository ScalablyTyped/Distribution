package typings.sqlite3

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Database extends StObject {
    
    def Database(filename: String): typings.sqlite3.mod.Database = js.native
    def Database(
      filename: String,
      callback: js.ThisFunction1[/* this */ typings.sqlite3.mod.Database, /* err */ Error | Null, Unit]
    ): typings.sqlite3.mod.Database = js.native
    def Database(filename: String, mode: Double): typings.sqlite3.mod.Database = js.native
    def Database(
      filename: String,
      mode: Double,
      callback: js.ThisFunction1[/* this */ typings.sqlite3.mod.Database, /* err */ Error | Null, Unit]
    ): typings.sqlite3.mod.Database = js.native
    def Database(
      filename: String,
      mode: Unit,
      callback: js.ThisFunction1[/* this */ typings.sqlite3.mod.Database, /* err */ Error | Null, Unit]
    ): typings.sqlite3.mod.Database = js.native
  }
}
