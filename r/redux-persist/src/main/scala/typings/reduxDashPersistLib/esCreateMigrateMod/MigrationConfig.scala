package typings
package reduxDashPersistLib.esCreateMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationConfig extends js.Object {
  var debug: scala.Boolean
}

object MigrationConfig {
  @scala.inline
  def apply(debug: scala.Boolean): MigrationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug)
    __obj.asInstanceOf[MigrationConfig]
  }
}

