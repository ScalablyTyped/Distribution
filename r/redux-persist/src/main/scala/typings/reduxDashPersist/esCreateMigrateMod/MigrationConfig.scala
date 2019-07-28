package typings.reduxDashPersist.esCreateMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationConfig extends js.Object {
  var debug: Boolean
}

object MigrationConfig {
  @scala.inline
  def apply(debug: Boolean): MigrationConfig = {
    val __obj = js.Dynamic.literal(debug = debug)
  
    __obj.asInstanceOf[MigrationConfig]
  }
}

