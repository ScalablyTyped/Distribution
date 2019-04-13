package typings
package sqlite3Lib.sqlite3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqlite3", "cached")
@js.native
object cached extends js.Object {
  def Database(filename: java.lang.String): sqlite3Lib.sqlite3Mod.Database = js.native
  def Database(
    filename: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ sqlite3Lib.sqlite3Mod.Database, 
      /* err */ stdLib.Error | scala.Null, 
      scala.Unit
    ]
  ): sqlite3Lib.sqlite3Mod.Database = js.native
  def Database(filename: java.lang.String, mode: scala.Double): sqlite3Lib.sqlite3Mod.Database = js.native
  def Database(
    filename: java.lang.String,
    mode: scala.Double,
    callback: js.ThisFunction1[
      /* this */ sqlite3Lib.sqlite3Mod.Database, 
      /* err */ stdLib.Error | scala.Null, 
      scala.Unit
    ]
  ): sqlite3Lib.sqlite3Mod.Database = js.native
}

