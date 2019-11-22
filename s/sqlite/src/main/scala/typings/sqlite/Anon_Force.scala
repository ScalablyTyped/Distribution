package typings.sqlite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Force extends js.Object {
  var force: js.UndefOr[String] = js.undefined
  var migrationsPath: js.UndefOr[String] = js.undefined
  var table: js.UndefOr[String] = js.undefined
}

object Anon_Force {
  @scala.inline
  def apply(force: String = null, migrationsPath: String = null, table: String = null): Anon_Force = {
    val __obj = js.Dynamic.literal()
    if (force != null) __obj.updateDynamic("force")(force)
    if (migrationsPath != null) __obj.updateDynamic("migrationsPath")(migrationsPath)
    if (table != null) __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[Anon_Force]
  }
}

