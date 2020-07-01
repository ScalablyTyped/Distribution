package typings.sqlite

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Database extends js.Object {
    def Database(filename: String): typings.sqlite.sqlite3Mod.Database = js.native
    def Database(
      filename: String,
      callback: js.ThisFunction1[/* this */ typings.sqlite.sqlite3Mod.Database, /* err */ Error | Null, Unit]
    ): typings.sqlite.sqlite3Mod.Database = js.native
    def Database(filename: String, mode: Double): typings.sqlite.sqlite3Mod.Database = js.native
    def Database(
      filename: String,
      mode: Double,
      callback: js.ThisFunction1[/* this */ typings.sqlite.sqlite3Mod.Database, /* err */ Error | Null, Unit]
    ): typings.sqlite.sqlite3Mod.Database = js.native
  }
  
}

