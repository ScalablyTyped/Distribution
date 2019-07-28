package typings.slonik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Database extends js.Object {
  var database: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var idleTimeoutMillis: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object Anon_Database {
  @scala.inline
  def apply(
    database: String = null,
    host: String = null,
    idleTimeoutMillis: Int | Double = null,
    max: Int | Double = null,
    password: String = null,
    port: Int | Double = null,
    user: String = null
  ): Anon_Database = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database)
    if (host != null) __obj.updateDynamic("host")(host)
    if (idleTimeoutMillis != null) __obj.updateDynamic("idleTimeoutMillis")(idleTimeoutMillis.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Anon_Database]
  }
}

