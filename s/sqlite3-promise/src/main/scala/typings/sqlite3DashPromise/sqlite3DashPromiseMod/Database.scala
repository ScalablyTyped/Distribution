package typings.sqlite3DashPromise.sqlite3DashPromiseMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqlite3-promise", "Database")
@js.native
class Database protected ()
  extends typings.sqlite3.sqlite3Mod.Database {
  def this(filename: String) = this()
  def this(filename: String, callback: js.Function1[/* err */ Error | Null, Unit]) = this()
  def this(filename: String, mode: Double) = this()
  def this(filename: String, mode: Double, callback: js.Function1[/* err */ Error | Null, Unit]) = this()
}

