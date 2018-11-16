package typings
package spatialiteLib.spatialiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spatialite", "Database")
@js.native
class Database ()
  extends sqlite3Lib.sqlite3Mod.Database {
  def spatialite(cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
}

