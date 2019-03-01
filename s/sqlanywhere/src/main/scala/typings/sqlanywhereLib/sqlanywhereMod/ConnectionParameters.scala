package typings
package sqlanywhereLib.sqlanywhereMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionParameters extends js.Object {
  var AutoStart: js.UndefOr[java.lang.String] = js.undefined
  var DatabaseFile: js.UndefOr[java.lang.String] = js.undefined
  var Host: js.UndefOr[java.lang.String] = js.undefined
  var Password: java.lang.String
  var Server: java.lang.String
  var UserId: java.lang.String
}

object ConnectionParameters {
  @scala.inline
  def apply(
    Password: java.lang.String,
    Server: java.lang.String,
    UserId: java.lang.String,
    AutoStart: java.lang.String = null,
    DatabaseFile: java.lang.String = null,
    Host: java.lang.String = null
  ): ConnectionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Password")(Password)
    __obj.updateDynamic("Server")(Server)
    __obj.updateDynamic("UserId")(UserId)
    if (AutoStart != null) __obj.updateDynamic("AutoStart")(AutoStart)
    if (DatabaseFile != null) __obj.updateDynamic("DatabaseFile")(DatabaseFile)
    if (Host != null) __obj.updateDynamic("Host")(Host)
    __obj.asInstanceOf[ConnectionParameters]
  }
}

