package typings.sqlite.interfacesMod.IMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationFile extends js.Object {
  var down: js.UndefOr[String] = js.undefined
  var filename: String
  var id: Double
  var name: String
  var up: js.UndefOr[String] = js.undefined
}

object MigrationFile {
  @scala.inline
  def apply(filename: String, id: Double, name: String, down: String = null, up: String = null): MigrationFile = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationFile]
  }
}

