package typings.spatialite.spatialiteMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spatialite", "Database")
@js.native
class Database ()
  extends typings.sqlite3.sqlite3Mod.Database {
  def spatialite(cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

