package typings.sqlanywhere.sqlanywhereMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionParameters extends js.Object {
  var AutoStart: js.UndefOr[String] = js.undefined
  var DatabaseFile: js.UndefOr[String] = js.undefined
  var Host: js.UndefOr[String] = js.undefined
  var Password: String
  var Server: String
  var UserId: String
}

object ConnectionParameters {
  @scala.inline
  def apply(
    Password: String,
    Server: String,
    UserId: String,
    AutoStart: String = null,
    DatabaseFile: String = null,
    Host: String = null
  ): ConnectionParameters = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    if (AutoStart != null) __obj.updateDynamic("AutoStart")(AutoStart.asInstanceOf[js.Any])
    if (DatabaseFile != null) __obj.updateDynamic("DatabaseFile")(DatabaseFile.asInstanceOf[js.Any])
    if (Host != null) __obj.updateDynamic("Host")(Host.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionParameters]
  }
}

