package typings.sqlite3

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  def Database(filename: String): typings.sqlite3.sqlite3Mod.Database = js.native
  def Database(
    filename: String,
    callback: js.ThisFunction1[/* this */ typings.sqlite3.sqlite3Mod.Database, /* err */ Error | Null, Unit]
  ): typings.sqlite3.sqlite3Mod.Database = js.native
  def Database(filename: String, mode: Double): typings.sqlite3.sqlite3Mod.Database = js.native
  def Database(
    filename: String,
    mode: Double,
    callback: js.ThisFunction1[/* this */ typings.sqlite3.sqlite3Mod.Database, /* err */ Error | Null, Unit]
  ): typings.sqlite3.sqlite3Mod.Database = js.native
}

