package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  var id: java.lang.String
  var isAdmin: scala.Boolean
}

object UserInfo {
  @scala.inline
  def apply(id: java.lang.String, isAdmin: scala.Boolean): UserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isAdmin")(isAdmin)
    __obj.asInstanceOf[UserInfo]
  }
}

