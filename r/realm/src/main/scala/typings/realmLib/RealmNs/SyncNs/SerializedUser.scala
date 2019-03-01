package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedUser extends js.Object {
  var identity: java.lang.String
  var isAdmin: scala.Boolean
  var refreshToken: java.lang.String
  var server: java.lang.String
}

object SerializedUser {
  @scala.inline
  def apply(
    identity: java.lang.String,
    isAdmin: scala.Boolean,
    refreshToken: java.lang.String,
    server: java.lang.String
  ): SerializedUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identity")(identity)
    __obj.updateDynamic("isAdmin")(isAdmin)
    __obj.updateDynamic("refreshToken")(refreshToken)
    __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[SerializedUser]
  }
}

