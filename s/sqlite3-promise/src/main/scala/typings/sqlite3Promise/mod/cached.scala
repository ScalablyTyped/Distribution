package typings.sqlite3Promise.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqlite3-promise", "cached")
@js.native
object cached extends js.Object {
  def Database(filename: String): typings.sqlite3.mod.Database = js.native
  def Database(
    filename: String,
    callback: js.ThisFunction1[/* this */ typings.sqlite3.mod.Database, /* err */ Error | Null, Unit]
  ): typings.sqlite3.mod.Database = js.native
  def Database(
    filename: String,
    mode: js.UndefOr[scala.Nothing],
    callback: js.ThisFunction1[/* this */ typings.sqlite3.mod.Database, /* err */ Error | Null, Unit]
  ): typings.sqlite3.mod.Database = js.native
  def Database(filename: String, mode: Double): typings.sqlite3.mod.Database = js.native
  def Database(
    filename: String,
    mode: Double,
    callback: js.ThisFunction1[/* this */ typings.sqlite3.mod.Database, /* err */ Error | Null, Unit]
  ): typings.sqlite3.mod.Database = js.native
}

