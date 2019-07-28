package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Database extends js.Object {
  var database: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String | Double] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Anon_Database {
  @scala.inline
  def apply(
    database: String = null,
    host: String = null,
    password: String = null,
    port: String | Double = null,
    username: String = null
  ): Anon_Database = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database)
    if (host != null) __obj.updateDynamic("host")(host)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Database]
  }
}

