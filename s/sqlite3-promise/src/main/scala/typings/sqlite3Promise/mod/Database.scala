package typings.sqlite3Promise.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqlite3-promise", "Database")
@js.native
class Database protected ()
  extends typings.sqlite3.mod.Database {
  def this(filename: String) = this()
  def this(filename: String, callback: js.Function1[/* err */ Error | Null, Unit]) = this()
  def this(filename: String, mode: Double) = this()
  def this(filename: String, mode: Double, callback: js.Function1[/* err */ Error | Null, Unit]) = this()
}

