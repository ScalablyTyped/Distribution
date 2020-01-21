package typings.sqlite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForce extends js.Object {
  var force: js.UndefOr[String] = js.undefined
  var migrationsPath: js.UndefOr[String] = js.undefined
  var table: js.UndefOr[String] = js.undefined
}

object AnonForce {
  @scala.inline
  def apply(force: String = null, migrationsPath: String = null, table: String = null): AnonForce = {
    val __obj = js.Dynamic.literal()
    if (force != null) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (migrationsPath != null) __obj.updateDynamic("migrationsPath")(migrationsPath.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForce]
  }
}

