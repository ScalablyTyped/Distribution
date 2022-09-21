package typings.sqlite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Database extends StObject {
    
    def Database(filename: String): typings.sqlite.sqlite3Mod.Database = js.native
    def Database(
      filename: String,
      callback: js.ThisFunction1[/* this */ typings.sqlite.sqlite3Mod.Database, /* err */ js.Error | Null, Unit]
    ): typings.sqlite.sqlite3Mod.Database = js.native
    def Database(filename: String, mode: Double): typings.sqlite.sqlite3Mod.Database = js.native
    def Database(
      filename: String,
      mode: Double,
      callback: js.ThisFunction1[/* this */ typings.sqlite.sqlite3Mod.Database, /* err */ js.Error | Null, Unit]
    ): typings.sqlite.sqlite3Mod.Database = js.native
    def Database(
      filename: String,
      mode: Unit,
      callback: js.ThisFunction1[/* this */ typings.sqlite.sqlite3Mod.Database, /* err */ js.Error | Null, Unit]
    ): typings.sqlite.sqlite3Mod.Database = js.native
  }
}
