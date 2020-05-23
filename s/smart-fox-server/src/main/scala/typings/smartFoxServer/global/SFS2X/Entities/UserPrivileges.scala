package typings.smartFoxServer.global.SFS2X.Entities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.UserPrivileges")
@js.native
class UserPrivileges ()
  extends typings.smartFoxServer.SFS2X.Entities.UserPrivileges

/* static members */
@JSGlobal("SFS2X.Entities.UserPrivileges")
@js.native
object UserPrivileges extends js.Object {
  /** @type {number} The administrator user can send dedicated "administrator messages", kick and ban users. */
  var ADMINISTRATOR: Double = js.native
  /** @type {number} The Guest user is usually the lowest level in the privilege profiles scale. */
  var GUEST: Double = js.native
  /** @type {number} The moderator user can send dedicated "moderator messages", kick and ban users. */
  var MODERATOR: Double = js.native
  /** @type {number} The standard user is usually registered in the application custom login system; uses a unique name and password to login. */
  var STANDARD: Double = js.native
}

